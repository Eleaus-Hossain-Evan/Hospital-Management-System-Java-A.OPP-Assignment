/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoppassignment;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class View {
    private int choice;
    static Scanner sc = new Scanner(System.in);
    int viewFirstPage(){
        System.out.println("How do you want to enter the system?\n" +
                            "1. As Patient\n" +
                            "2. As Receptionist\n" +
                            "3. As Doctor\n" +
                            "4. Exit");
        choice = sc.nextInt();
        return choice;
    }
//================================
//#########   Patient  ###########
//================================
    int viewPatientOption(){
        System.out.println("Choose any one:\n" +
                            "1. Insert info\n" +
                            "2. Pay bill\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }
//================================
//#######   Receptionist  ########
//================================
    int viewReceptionistOption(){
        System.out.println("1. Give Appointment\n" +
                            "2. Generate Bill\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }
    
//================================
//##########   Doctor  ###########
//================================
    int viewDoctorOption(){
        System.out.println("1. Prescription\n" +
                            "2. Check today's Schedule\n" +
                            "3. Create today's Schedule\n" +
                            "4. Return");
        choice = sc.nextInt();
        return choice;
    }
    int prescribe(){
        System.out.println("Patient ID: ");
        int pid=sc.nextInt();
        System.out.println("Patient Name: ");
        sc.nextLine();
        String pname=sc.nextLine();
        System.out.println("Choose any one:\n" +
                            "1. Prescribe Medicine\n" +
                            "2. Prescribe Test\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }
//================================
//#########   Billing  ###########
//================================
    int paymentMethod(){
        System.out.println("How do you want to pay bill?\n" +
                            "1. B-Cash\n" +
                            "2. Rocket\n" +
                            "3. Credit Card/Debit Card\n" +
                            "4. Return");
        choice = sc.nextInt();
        return choice;
    }
}
