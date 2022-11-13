package org.example;

import org.example.models.Steps;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String action = "";


        Boolean quitApp = true;
        try {
            Steps.greeting();
            while (quitApp) {
                action = Steps.menu();
                quitApp = Steps.actions(action);
                action = "";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
}