package com.example.sharingapp;

import android.content.Context;

public class AddContactCommand extends Command{
    private Context context;
    private Contact contact;
    private ContactList contact_list;
    public AddContactCommand(ContactList contact_list, Contact contact, Context context){
        this.contact_list = contact_list;
        this.contact = contact;
        this.context = context;
    }
    @Override
    public void execute() {
        contact_list.addContact(contact);
        setIsExecuted(contact_list.saveContacts(context));
    }
}
