package com.example.sharingapp;

import java.util.UUID;

public class ContactController {

    private Contact contact;
    public ContactController(Contact contact){
        this.contact = contact;
    }

    public String getId(){
        return this.contact.getId();
    }

    public void setId() {
        this.contact.setId();

    }

    public void updateId(String id){
        this.contact.updateId(id);
    }

    public String getUsername() {
        return contact.getUsername();

    }

    public void setUsername(String username) {
        this.contact.setUsername(username);

    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        this.contact.setEmail(email);

    }

}
