package com.mycompany.finaloop;

import java.util.Scanner;

public class FinalOOP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        System.out.println("WELCOME TO COMPUTER ENGINEERING 2ND SEMESTER STARTER PACK!\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        
        
        while (choice != 4)
            System.out.println("\nWhat subject do you want to learn?\n"
                    + "1. ECE\n"
                    + "2. Advanced Mathematics\n"
                    + "3. Numerical Mathematics\n"
                    + "4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    ECE e = new ECE();
                    
                    e.LessonsInECE();
                    break;
            }
    }
}
