/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.http.examples.client;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluei
 */

public class Tester extends Thread{
    int n=100;
    long[] times = new long[n];
    long time0 = 0;
    long time1 = 0;
    
    
    public Tester(){
        
    }
    
    @Override
    public void run(){
        for(int i=0; i<n; i++){
            try { 
                time0 = System.currentTimeMillis();
                long threadId = Thread.currentThread().getId();
                Client.response((int) threadId);  
                time1 = System.currentTimeMillis(); 
                times[i] = time1-time0;
            } catch (Exception ex) {
                Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(Arrays.toString(times));
    }
    
    public static void main(String[] args) {
            Thread t1 = new Tester(); 
            Thread t2 = new Tester(); 
            Thread t3 = new Tester(); 
            Thread t4 = new Tester(); 
            Thread t5 = new Tester();
            Thread t6 = new Tester(); 
            Thread t7 = new Tester(); 
            Thread t8 = new Tester(); 
            Thread t9 = new Tester(); 
            Thread t10 = new Tester();
            t1.start(); 
            t2.start(); 
            t3.start();
            t4.start();
            t5.start();
            t6.start(); 
            t7.start(); 
            t8.start();
            t9.start();
            t10.start();
    }
}
