package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellphoneServiceApp {
    public static void main(String[] args) {

        // create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner myscanner = new Scanner(System.in);

        /*
        What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
       Who is the carrier? Verizon
       What is the phone number? 888-555-1234
       Who is the owner of the phone?
         */

        //newPhoneWhoDis.dial("2146040957");


        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(myscanner, "What is the serial number?")));
        newPhoneWhoDis.setModel((askQuestion(myscanner, "What is the model?")));
        newPhoneWhoDis.setCarrier((askQuestion(myscanner, "Who is the carrier?")));
        newPhoneWhoDis.setPhoneNumber((askQuestion(myscanner, "What is the phone number?")));
        newPhoneWhoDis.setOwner((askQuestion(myscanner, "Who is the owner of the phone?")));

        display(newPhoneWhoDis);
        display(newPhoneWhoDis);
        newPhoneWhoDis.dial("2146040957");

        // create a new phone
        CellPhone cellPhonePart2 = new CellPhone();

        // hard code values instead of asking user
        // set the serial number on cellphonepart2
        cellPhonePart2.setSerialNumber(6767);
        // set the model
        cellPhonePart2.setModel("nokia");
        cellPhonePart2.setCarrier("verizon");
        cellPhonePart2.setOwner("Hamere");
        cellPhonePart2.setPhoneNumber("214-543-1234");

        // have newPhoneWhoDis to call cellPhonePart2
        newPhoneWhoDis.dial(cellPhonePart2.getPhoneNumber());






        /*
        // print values
        System.out.println("Serial number: " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + newPhoneWhoDis.getModel());
        System.out.println("Carrier: " + newPhoneWhoDis.getCarrier());
        System.out.println("Phone number: " + newPhoneWhoDis.getPhoneNumber());
        System.out.println("Owner: " + newPhoneWhoDis.getOwner());

         */

    }

    public static String askQuestion(Scanner myscanner, String question) {
        System.out.println(question + ": ");
        return myscanner.nextLine().trim();
    }

    public static void display(CellPhone newPhoneWhoDis) {
        // print values
        System.out.println("Serial number: " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + newPhoneWhoDis.getModel());
        System.out.println("Carrier: " + newPhoneWhoDis.getCarrier());
        System.out.println("Phone number: " + newPhoneWhoDis.getPhoneNumber());
        System.out.println("Owner: " + newPhoneWhoDis.getOwner());
    }





}
