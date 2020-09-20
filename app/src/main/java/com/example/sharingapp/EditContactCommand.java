package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command{
    private Contact updated_contact;
    private Context context;
    private Contact contact;
    private ContactList contact_list;

    public EditContactCommand(ContactList contact_list, Contact contact, Contact updated_contact,Context context){
        this.contact_list = contact_list;
        this.contact = contact;
        this.updated_contact = updated_contact;
        this.context = context;
    }
    @Override
    public void execute() {
        contact_list.deleteContact(contact);
        contact_list.addContact(updated_contact);
        contact_list.saveContacts(context);
    }
}
