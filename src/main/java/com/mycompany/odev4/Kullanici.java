/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev4;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Kullanici extends javax.swing.JFrame {
    public String kullaniciAdi;
    public String sifre;

    public Kullanici(String kullaniciAdi, String sifre){
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }
    
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }
    
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    
    public static ArrayList<Kullanici> kullaniciListesi = new ArrayList<>();
    
    
}
