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
public class Doctor extends Person{
    static Scanner sc = new Scanner(System.in);
    protected String designation;
    protected String dept;
    protected int visit;
    protected String chamber;
    
    protected String schedule[];
    protected String scheduleTime[];
    static Controller cn = new Controller();
    

    //==Inheritance
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }
    

    public void setSchedule(String[] preSchedule) {
        //.schedule = schedule;
        for (int i = 0; i < preSchedule.length; i++) {
            this.schedule[i]=preSchedule[i];
        }
    }

    public void setScheduleTime(String[] preScheduleTime) {
        //this.scheduleTime = scheduleTime;
        for (int i = 0; i < preScheduleTime.length; i++) {
            this.scheduleTime[i]=preScheduleTime[i];
        }
    }
    
    public String getDesignation() {
        return designation;
    }

    public String getDept() {
        return dept;
    }

    public int getVisit() {
        return visit;
    }

    public String getChamber() {
        return chamber;
    }
    

    public String[] getSchedule() {
        return schedule;
    }

    public String[] getScheduleTime() {
        return scheduleTime;
    }
    //==Inheritance
    
    public Doctor[] doclist(){
        Doctor[] doc = new Doctor[50];
        String[] dis = {"Professor","Assistant Professor","Consultant","Assistant Consultant"};
        
        doc[0] = new Doctor();
        doc[0].setName("Dr. Mamunur Rashid");
        doc[0].setDept("Medicine");
        doc[0].setDesignation("Professor");
        doc[0].setVisit(800);
        doc[0].setChamber("Room No: 311, 3rd floor.");
        
        doc[1] = new Doctor();
        doc[1].setName("Dr. Kartik Majumder");
        doc[1].setDept("Cardiology");
        doc[1].setDesignation("Consultant");
        doc[1].setVisit(1000);
        doc[1].setChamber("Room No: 304, 3rd floor.");
        
        doc[2] = new Doctor();
        doc[2].setName("Dr. Selina Hosen");
        doc[2].setDept("Gynaecology");
        doc[2].setDesignation("Assistant Professor");
        doc[2].setVisit(1200);
        doc[2].setChamber("Room No: 502, 5th floor.");
        
        return doc;
    }
    
    void prescribeMadicine(){
        int  tablets, capsules;
        String[] tab, cap;
        System.out.print("Enter the number of Tablets: ");
        tablets = sc.nextInt();
        
        tab = new String[tablets];
        sc.nextLine();
        for (int i = 0; i < tablets; i++) {
            System.out.print("Enter the tablet name: ");
            
            tab[i] = sc.nextLine();
        }
        System.out.print("Enter the number of Capsules: ");
        capsules = sc.nextInt();
        cap = new String[capsules];
        sc.nextLine();
        for (int i = 0; i < capsules; i++) {
            System.out.print("Enter the capsule name: ");
            
            cap[i] = sc.nextLine();
        }
        System.out.println("#####Prescribtion for Medicine#####");
        System.out.println(" _Tables: ");
        for (int i = 0; i < tablets; i++) {
            System.out.println("\t"+tab[i]);
        }
        System.out.println(" _Capsules: ");
        for (int i = 0; i < capsules; i++) {
            System.out.println("\t"+cap[i]);
        }
        System.out.println(" ❣❣❣Get Well Soon❣❣❣ \n\n");
    }
    
//  ================   Sir ekhne    ============================================  
    void prescribeTest(){

        Billing billing = cn.bill();
        System.out.println("\nInsert the number of text...");
        
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
        
        System.out.println("Finish...\n\n");
        System.out.println("#####Prescribtion for TEST is ready..#####");
        System.out.println("\t______________________________");
        if (billing.getNumXray()==0 && billing.getNumEcg()==0 && billing.getNumCtScan()==0 && billing.getNumEco()==0 && billing.getNumBlood()==0 && billing.getNumUrine()==0) {
            System.out.println("\t|  Doctor don't suggest any test...   |");
        }
        else{
            if (billing.getNumXray()!=0) {
                System.out.println("\t| Number of X-RAY test   ->"+billing.getNumXray()+" |");
            }
            if (billing.getNumEcg()!=0) {
                System.out.println("\t| Number of ECG test     ->"+billing.getNumEcg()+" |");
            }
            if (billing.getNumCtScan()!=0) {
                System.out.println("\t| Number of CT-SCAN test ->"+billing.getNumCtScan()+" |");
            }
            if (billing.getNumEco()!=0) {
                System.out.println("\t| Number of ECO test     ->"+billing.getNumEco()+" |");
            } 
            if (billing.getNumBlood()!=0) {
                System.out.println("\t| Number of BLOOD test   ->"+billing.getNumBlood()+" |");
            }
            if (billing.getNumUrine()!=0) {
                System.out.println("\t| Number of URINE test   ->"+billing.getNumUrine()+" |");
            }
        }
        System.out.println("\t______________________________");
        System.out.println(" _Contact with Receptionist for detail\n\t❣❣❣See You Soon❣❣❣ \n\n");
    }

//==============================================================================
    void makeShedule(){
//        Doctor dr = new Doctor();
        int Df,f;
//        Doctor[] doc = new Doctor[50];
//               doc = dr.doclist();
//        System.out.println("Please select one: ");
//        for (int i = 0; i < doc.length-1; i++) {
//            System.out.println((i+1)+". "+doc[i].getName());
//        }
//        
//        Df = sc.nextInt();
        
        System.out.print("Please set up frequency first: ");
        f = sc.nextInt();
        schedule = new String[f];
        scheduleTime = new String[f];
        sc.nextLine();
        for (int i = 0; i < f; i++) {
            System.out.print("Enter your job type: ");
            schedule[i]=sc.nextLine();
            System.out.print("Enter time: ");
            scheduleTime[i]=sc.nextLine();
        }
        setSchedule(schedule);
        setScheduleTime(scheduleTime);
//        doc[Df].setSchedule(schedule);
//        doc[Df].setSchedule(scheduleTime);
        
    }
    
    void checkShedule(){
        if (schedule==null) {
            System.out.println("You don't set up your work schedule today\n _Set-up your schudel first...");
        }
        else{
            System.out.println("Your work schedule are:");
            for (int i = 0; i < schedule.length; i++) {
                System.out.println(getSchedule()[i]+"-"+getScheduleTime()[i]);
            }
        }
    }

    
    
}
