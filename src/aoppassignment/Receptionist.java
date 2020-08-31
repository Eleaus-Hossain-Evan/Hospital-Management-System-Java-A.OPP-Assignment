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
public class Receptionist extends Person{
    protected String contactNo;
    
    static Scanner sc = new Scanner(System.in);
    static Controller cn = new Controller();
    //==Inheritance
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getContactNo() {
        return contactNo;
    }
    //==Inheritance
    void giveAppointment(){
        System.out.println("****Welcome to Doctor's Appointment****");
        Doctor[] docList = cn.cnDoclist();
        System.out.print("Enter patient ID: ");
        int pid = sc.nextInt();
        
        System.out.print("Enter patient Name: ");
        sc.nextLine();
        String pname = sc.nextLine();
        
        System.out.println("Doctors List:");
        for(int i=0; i<3; i++){
            System.out.println(" "+(i+1)+". "+docList[i].getName()+", "+docList[i].getDesignation()+" of "+docList[i].getDept()+" Department");
        }
        System.out.print("Select one: ");
        int docInput = sc.nextInt();

        System.out.print("Enter Date: ");
        
        sc.nextLine();
        String date = sc.nextLine();

        System.out.print("Enter check up time: ");
        String time = sc.nextLine();

        System.out.println("\n\n####Appointment created####\n" +
                               "Patient ID:"+ pid +"\n" +
                               "Patient Name:"+ pname +"\n" +
                               "Doctor’s Name: "+ docList[docInput].getName() +"\n" +
                               "Doctor’s Designation: "+ docList[docInput].getDesignation()+"\n" +
                               "Doctor’s Department: "+ docList[docInput].getDept()+"\n" +
                               "Doctor’s Visit: "+ docList[docInput].getVisit()+"\n" +
                               "Date: "+ date +"\n" +
                               "Time: "+ time+"\n"+
                               "Doctor's Chambar: "+ docList[docInput].getChamber());
        System.out.println(" _❣❣ See Your Soon ❣❣\n\n");
    }
    void generateBill(){
        Doctor[] docList = cn.cnDoclist();
        Billing billing = cn.bill();
        int totalAmount= 0;

        System.out.println("Patient ID:");
        int pid = sc.nextInt();
        
        System.out.println("Doctors List:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" "+(i+1)+". "+ docList[i].getName());
        }
        System.out.print("Select one: ");
        int doc = sc.nextInt();
        System.out.println("Insert the number of text...\n");
        
        System.out.print("Number of X_RAY:");
        int xray = sc.nextInt();
        billing.setNumXray(xray);
        
        System.out.print("Number of ECG:");
        int ecg = sc.nextInt();
        billing.setNumEcg(ecg);
        
        System.out.print("Number of CT-SCAN:");
        int ctscan = sc.nextInt();
        billing.setNumCtScan(ctscan);
        
        System.out.print("Number of ECO:");
        int eco = sc.nextInt();
        billing.setNumEco(eco);
        
        System.out.print("Number of BLOOD:");
        int blood = sc.nextInt();
        billing.setNumBlood(blood);
        
        System.out.print("Number of URINE:");
        int urine = sc.nextInt();
        billing.setNumUrine(urine);
        
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Insert other amount: ");
        int other = sc.nextInt();
        billing.setOther(other);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
        
        totalAmount += billing.calculate();
//        System.out.println(totalAmount);


        System.out.println("\n\t:::::Bill Invoice::::\n" +
                           " Patient ID : "+pid+"\n" +
                           " Doctor’s Bill:\n" +
                           docList[doc].getName()+" = "+ docList[doc].getVisit()+" Tk\n");
        System.out.println("Test Bill: ");
        System.out.println("\t_______________________________________");
        if (billing.getNumXray()==0 && billing.getNumEcg()==0 && billing.getNumCtScan()==0 && billing.getNumEco()==0 && billing.getNumBlood()==0 && billing.getNumUrine()==0) {
            System.out.println("\t|  Doctor don't suggest any test...   |");
        }
        else{
            if (billing.getNumXray()!=0) {
                System.out.println("\t| Number of X-RAY test-"+billing.getNumXray()+"    = "+ billing.XRAY*billing.getNumXray()+" TK |");
            }
            if (billing.getNumEcg()!=0) {
                System.out.println("\t| Number of ECG test-"+billing.getNumEcg()+"      = "+ billing.ECG*billing.getNumEco()+" TK |");
            }
            if (billing.getNumCtScan()!=0) {
                System.out.println("\t| Number of CT-SCAN test-"+billing.getNumCtScan()+"  = "+ billing.CTSCAN*billing.getNumCtScan()+" TK |");
            }
            if (billing.getNumEco()!=0) {
                System.out.println("\t| Number of ECO test-"+billing.getNumEco()+"      = "+ billing.ECO*billing.getNumEcg()+" TK |");
            }
            if (billing.getNumBlood()!=0) {
                System.out.println("\t| Number of BLOOD test-"+billing.getNumBlood()+"    = "+ billing.BLOOD*billing.getNumBlood()+" TK |");
            }
            if (billing.getNumUrine()!=0) {
                System.out.println("\t| Number of URINE test-"+billing.getNumUrine()+"    = "+ billing.URINE*billing.getNumUrine()+" TK |");
            }
        }
        System.out.println("\t_______________________________________");
        System.out.println("----------------------------");
        System.out.println("| Total Test Bill: "+totalAmount+" Tk |");
        System.out.println("----------------------------");
        System.out.println("| Other Bill: "+billing.getOther()+" Tk  |");
        System.out.println("----------------------------");
        System.out.println("| Total Bill: "+(totalAmount+docList[doc].getVisit()+billing.getOther())+" TK |");
        System.out.println("----------------------------");
        System.out.println("Are you want to pay now?\n1. Yes\n2. Later");
        int choice = sc.nextInt();
        switch(choice){
            case 1:cn.payment();
            break;
            case 2: billing.total=(totalAmount+docList[doc].getVisit()+billing.getOther());
                return;
        }
    }
}
