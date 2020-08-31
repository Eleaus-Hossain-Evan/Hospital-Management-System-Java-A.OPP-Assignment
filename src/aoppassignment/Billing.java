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
public class Billing implements TEST{
    Scanner sc = new Scanner(System.in);
    protected int numXray;
    protected int numEcg;
    protected int numCtScan;
    protected int numEco;
    protected int numBlood;
    protected int numUrine;
    
    protected int Other;
    
    int total=1200;
    //==Inheritance

    
    public void setNumXray(int numXray) {
        this.numXray = numXray;
    }

    public void setNumEcg(int numEcg) {
        this.numEcg = numEcg;
    }

    public void setNumCtScan(int numCtScan) {
        this.numCtScan = numCtScan;
    }

    public void setNumEco(int numEco) {
        this.numEco = numEco;
    }

    public void setNumBlood(int numBlood) {
        this.numBlood = numBlood;
    }

    public void setNumUrine(int numUrine) {
        this.numUrine = numUrine;
    }

   

    public void setOther(int Other) {
        this.Other = Other;
    }

    public int getNumXray() {
        return numXray;
    }

    public int getNumEcg() {
        return numEcg;
    }

    public int getNumCtScan() {
        return numCtScan;
    }

    public int getNumEco() {
        return numEco;
    }

    public int getNumBlood() {
        return numBlood;
    }

    public int getNumUrine() {
        return numUrine;
    }

    public int getOther() {
        return Other;
    }
    
//==Inheritance====for interface

    public static int getXRAY() {
        return XRAY;
    }

    public static int getECG() {
        return ECG;
    }

    public static int getCTSCAN() {
        return CTSCAN;
    }

    public static int getECO() {
        return ECO;
    }

    public static int getBLOOD() {
        return BLOOD;
    }

    public static int getURINE() {
        return URINE;
    }

    @Override
    public int calculate() {
        this.total = (this.getXRAY()*this.getNumXray())+(this.getECG()*this.getNumEcg())+(this.getCTSCAN()*this.getNumCtScan())+(this.getECO()*this.getNumEco())+(this.getBLOOD()*this.getNumBlood())+(this.getURINE()*this.getNumUrine());
        return total;
    }
    public void paymentBcask(){
        System.out.println("HMS Hospital.LTD B-Cask Number: 01330099123");
        this.paymentCashLess();
    }
    public void paymentRocket(){
       System.out.println("HMS Hospital.LTD Rocket Number: 013300991234"); 
       this.paymentCashLess();
    }
    public void paymentCC(){
        System.out.println("To complete you payment please Enter your card number: ");
        String cardNumber = sc.nextLine();
        this.welcoming();
    }
    
    public void paymentCashLess(){
        System.out.println("Kindly complete you payment though this number\nEnter your Transection ID: ");
        String transectionID = sc.nextLine();
        this.welcoming();
    }
    public void welcoming(){
        System.out.println("$$$__*Transection Complete*__$$$\nThanks for your cooparetion");
        System.out.println("\t_❤Come Again❤_");
    }
    
}
