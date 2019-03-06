package com.example.addressbooklistview;

public class Contact {
    private int cid;
    private String name, phone, email;

    public Contact(){}

    public Contact(String name, String phone, String email)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Contact(int cid, String name, String phone, String email)
    {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getCid(){ return cid;}
    public String getName() { return name;}
    public String getPhone() { return phone;}
    public String getEmail() { return email;}

    public void setCid(int cid) { this.cid = cid;}
    public void setName(String name) { this.name = name;}
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email;}
}
