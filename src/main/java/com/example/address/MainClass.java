package com.example.address;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner scan = new Scanner(System.in);
        Person newPerson;
        String answer;

ArrayList<Person> persons=new ArrayList<>();
        do {
            newPerson= new Person();
            System.out.println("Address Book");
            System.out.print("Enter your First Name:");
            newPerson.setFirstname(scan.nextLine());
            System.out.print("Enter your Last Name:");
            newPerson.setLastname(scan.nextLine());
            System.out.print("Enter your Address:");
            newPerson.setAddress(scan.nextLine());
            System.out.print("Enter your PhoneNumber:");
            newPerson.setPhonenumber(scan.nextLine());
            System.out.print("Enter your Email:");
            newPerson.setEmail(scan.nextLine());

            persons.add(newPerson);

            System.out.println("Do you want Enter Another contact?");
            answer=scan.nextLine();

            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                condition = true;
            } else {
                condition = false;
            }
        }while (!condition) ;

           for(Person eachperson:persons ){
               System.out.println(eachperson.getFirstname());
               System.out.println(eachperson.getLastname());
               System.out.println(eachperson.getAddress());
               System.out.println(eachperson.getPhonenumber());
               System.out.println(eachperson.getEmail());
           }


    }
}
