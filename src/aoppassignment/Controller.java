/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoppassignment;

/**
 *
 * @author User
 */
public class Controller {
    private int choice;
    static View view = new View();
    static Patient patient = new Patient();
    static Receptionist receptionist = new Receptionist();
    static Doctor doctor = new Doctor();
    static Billing billing = new Billing();
    
    void cnFirstPage(){
        choice = view.viewFirstPage();
        switch(choice){
            case 1: this.cnPatientPage();
            break;
            case 2: this.cnReceptionistPage();
            break;
            case 3: this.cnDoctorPage();
            break;
            default : return;
        }
        this.cnFirstPage();
    }
//================================
//#########   Patient  ###########
//================================
    void cnPatientPage(){
        choice = view.viewPatientOption();
        switch(choice){
            case 1: patient.inserPatientInfo();
            break;
            case 2: patient.payBill();
            default : return;
        }
        this.cnPatientPage();
        
    }
//================================
//#######   Receptionist  ########
//================================
    void cnReceptionistPage(){
        choice = view.viewReceptionistOption();
        switch(choice){
            case 1: receptionist.giveAppointment();
            break;
            case 2: receptionist.generateBill();
            break;
            default : return;
        }
        this.cnReceptionistPage();
    }
//================================
//##########   Doctor  ###########
//================================
    void cnDoctorPage(){
        choice = view.viewDoctorOption();
        switch(choice){
            case 1: this.prescribe();
            break;
            case 2: doctor.checkShedule();
            break;
            case 3: doctor.makeShedule();
            break;
            default : return;
        }
        this.cnDoctorPage();
    }
    public Doctor[] cnDoclist(){
        Doctor[] doc = doctor.doclist();
        return doc;
    }
    void prescribe(){
        choice = view.prescribe();
        
        switch(choice){
            case 1: doctor.prescribeMadicine();
            break;
            case 2: doctor.prescribeTest();
            break;
        }
    }
//================================
//#########   Billing  ###########
//================================

    Billing bill(){
        return this.billing;
    }
    void payment(){
        choice = view.paymentMethod();
        switch(choice){
            case 1: billing.paymentBcask();
            break;
            case 2: billing.paymentRocket();
            break;
            case 3: billing.paymentCC();
            break;
            default : return;
        }
    }
}
