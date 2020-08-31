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
public interface TEST {
    public static final int XRAY = 500;
    public static final int ECG = 1000;
    public static final int CTSCAN = 3000;
    public static final int ECO = 1500;
    public static final int BLOOD = 600;
    public static final int URINE = 800;
    
    
    int calculate();
}
