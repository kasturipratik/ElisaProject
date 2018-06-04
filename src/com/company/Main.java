package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //variable for user input
        String name,question ="";
        //random number generator
        Random r = new Random();

        Scanner input = new Scanner(System.in);
        //array of the hedges and qualifiers answers
        String[] hedges = {"Why do you say that","You seem to think that ", "So, you are concerned that"};
        String[] qualifiers = {"Why do you say that","You seem to that that", "So, you are concerned that"};

 // random number generator for hedges
        int hedg = 0 + r.nextInt(hedges.length-1);
        int qualifier = 0 + r.nextInt(qualifiers.length-1);

       // user input for name
        System.out.println("Welcome to the Chat-bot systeml. \nPlease Enter Your Name ");
        name = input.nextLine();
// user input for questions
        System.out.println("Hello, "+ upperCase(name)+ "\nI am Bot, How can I help you? or Enter \"quit\" to exit");
        question = input.nextLine();

        while(!question.equals("quit")){

         String i =  question.replaceFirst("I","you");
         String me = i.replaceFirst("me", "you" );
         String my = me.replaceFirst("my","your");
         String am = my.replaceFirst("am","are");

         if(question.contains("I")|| question.contains("me")|| question.contains("am")||question.contains("my"))
         {
             System.out.println(hedges[hedg]+" "+am);
         }
         else {
             System.out.println(qualifiers[qualifier] );
         }
            System.out.println("Enter your response here  or \"quit\" to exit:");
            question = input.nextLine();

    }
        System.out.println("Thank You for running the system");
    }
    // method to create uppercase first letter of the name inputed

    public static String upperCase(String name){
        name =name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}
