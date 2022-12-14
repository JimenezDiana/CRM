package org.example.models;

import org.example.enums.Product;
import org.example.enums.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Opportunity {

    private static final String ID_OPP = "OY-0";
    private static int idCounperOpp = 1;
    private String id;
    private String dm;
    private Status status;
    private Product product;
    private int quantity;

    private Contact contact;

    //---------------------------------------------
    static Scanner scanner = new Scanner(System.in);
    public static List<Opportunity> arrayOfOpps = new ArrayList<>();

    //Constructors--------------------------------
    public Opportunity() {
    }

    public Opportunity(String dm, Product product, int quantity, Status status, Contact contact) {
        setId(ID_OPP + idCounperOpp++);
        setDm(dm);
        setStatus(status);
        setProduct(product);
        setQuantity(quantity);
        setContact(contact);
    }

    public Opportunity(String dm, Product product, int quantity, Status status) {
        setId(ID_OPP + idCounperOpp++);
        setDm(dm);
        setStatus(status);
        setProduct(product);
        setQuantity(quantity);
    }

    public Opportunity(Contact contact) {
        setId(ID_OPP + idCounperOpp++);
        setContact(contact);
    }

    //Getters and Setters-------------------------
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        String dmTrim = dm.trim();
        if (dmTrim.split(" +").length >= 2) {
            this.dm = dmTrim;
        } else {
            throw new IllegalArgumentException("The name of Decision Maker should have Firs Name and Last Name");
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0 && quantity < 1000) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("The quantity needs to be between this rang: 1 to 999");
        }
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /* ______________________________________________________________________________________ */
    /* ___________________________________METHODS____________________________________________ */
    /* ______________________________________________________________________________________ */

    @Override
    public String toString() {
        return "Opportunity:\n" +
                "id:" + id +
                "\n dm:'" + dm + '\'' +
                "\n status:" + status +
                "\n product:" + product +
                "\n quantity:" + quantity;
    }


}