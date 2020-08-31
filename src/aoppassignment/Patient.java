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
public class Patient extends Person{
    private String BloodGroup;
    private String Disease;
    private String DiseaseInfo;
    
    static Scanner sc = new Scanner(System.in);
    
    static Controller cn = new Controller();
    static View vw = new View();
    
    
    //--Inheritance
    public void setBloodGroup(String BloodGroup){
        this.BloodGroup = BloodGroup;
        
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public void setDiseaseInfo(String DiseaseInfo) {
        this.DiseaseInfo = DiseaseInfo;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public String getDisease() {
        return Disease;
    }

    public String getDiseaseInfo() {
        return DiseaseInfo;
    }
    //==Inheritance
    void showPatientDetail(Patient p){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(":::::::Patient Bio Data:::::::\n" +
                            "\tID: "+ p.getId()+"\n" +
                            "\tName: "+ p.getName()+"\n" +
                            "\tAge: "+ p.getAge()+"\n" +
                            "\tPhone Number: "+ p.getPhoneNumber()+"\n" +
                            "\tEmail: "+ p.getEmail()+"\n" +
                            "\tUsername: "+ p.getUsername()+"\n" +
                            "\tPassword: "+ p.getPassword()+"\n" +
                            "\tAddress: "+ p.getAddress()+"\n" +
                            "\tBlood Group: "+ p.getBloodGroup()+"\n" +
                            "\tDisease: "+ p.getDisease()+"\n" +
                            "\tDisease Information: "+ p.getDiseaseInfo()+"\n");
        System.out.println(" ______________________________________\n| ❣❣❤ Welcome to HMS Hospital. LTD ❤❣❣ |\n ______________________________________\n\n");
    }
    void inserPatientInfo(){
        Patient p = new Patient();
        
        System.out.print("Enter patient ID: ");
        this.Id =sc.nextInt();
        p.setId(Id);
        
        
        System.out.print("Enter patient name: ");
        sc.nextLine();
        this.Name =sc.nextLine();
        p.setName(Name);
        
        System.out.print("Enter  age: ");
        this.Age=sc.nextInt();
        p.setAge(Age);
        
        System.out.print("Enter patient Phone Number: ");
        sc.nextLine();
        this.PhoneNumber =sc.nextLine();
        p.setPhoneNumber(PhoneNumber);
        
        System.out.print("Enter patient Email: ");
        this.Email =sc.nextLine();
        p.setEmail(Email);
        
        System.out.print("Enter patient Username: ");
        this.Username =sc.nextLine();
        p.setUsername(Username);
        
        System.out.print("Enter patient Password: ");sc.nextLine();
        this.Password ="**********";
        p.setPassword(Password);
        
        System.out.print("Enter patient Address: ");
        this.Address =sc.nextLine();
        p.setAddress(Address);
        
        System.out.print("Enter patient Blood Group: ");
        this.BloodGroup =sc.nextLine();
        p.setBloodGroup(BloodGroup);
        
        System.out.print("Enter disease name: ");
        this.Disease =sc.nextLine();
        p.setDisease(Disease);
        
        System.out.print("Enter Disease Info: ");
        this.DiseaseInfo=sc.nextLine();
        p.setDiseaseInfo(DiseaseInfo);
        
        System.out.println("\t_Thanks!!\nPatient Registration is successfully completed...\n");
        
        this.showPatientDetail(p);
    }
    void payBill(){
        Billing billing = cn.bill();
        System.out.println("Your bill is: "+ billing.total +" Tk..");
        cn.payment();
        System.out.println("\n\n");
    }
}
