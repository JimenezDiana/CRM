package org.example.models;

public class Contact extends Leads{

    private static final String ID_STR = "CT-0";
    private static int idCounter = 1;
    private String id;


    public Contact() {
    }
    public Contact(String name, String phone, String email, String companyName) {
        super(name, phone, email, companyName);
        setId(ID_STR + idCounter++);
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Contact.idCounter = idCounter;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "id= " + id +
                ", name=' " + this.getName() + '\"' +
                ", phone' " + this.getPhone() + '\"' +
                ", email' " + this.getEmail() + '\"' +
                ", companyName' " + this.getCompanyName() + '\"' +
                '}';
    }
}