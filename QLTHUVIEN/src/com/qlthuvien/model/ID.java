/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.model;

/**
 *
 * @author Administrator
 */
public class ID {
    public static String getID(String truoc,int so,int ma){
        String kq = truoc;
        String sau = String.valueOf(ma);
        int tg = so-kq.length()-sau.length();
        for(int i=0;i<tg;i++){
            kq=kq+"0";
        }
        kq=kq+sau;
        return kq;
    }
    
    public static void main(String[] args) {
        System.out.println(getID("MS", 6, 123));
    }
}
