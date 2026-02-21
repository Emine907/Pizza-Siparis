/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev4;

/**
 *
 * @author pc
 */
public class Fiyatlar {
    public static int klasikHamur = 15;
    public static int inceHamur = 10;
    public static int dubleksCiftKatPeynir = 20;
   
    
    public static int extravaganza = 150;
    public static int karisik = 150;
    public static int pizzaMexicano = 135;
    public static int TurkishPizza = 140;
    public static int favoriteThree = 130;
    public static int diger = 150;
    
    public static int kücük4Dilim = 20;
    public static int orta6Dilim = 25;
    public static int buyuk8Dilim = 30;
    
    public static int zaferGazoz = 20;
    public static int kola = 30;
    public static int ayran = 15;
    public static int su = 10;
    public static int fanta = 30;
    public static int sufle = 60;
    public static int firindaSutlac = 80;
    public static int revani = 80;
    public static int tulumba = 50;
    public static int dondurma = 50;
    public static int patatesKizartmasi = 50;
    public static int soganHalkasi = 60;
    
    public static int ucretHesapla(String urunAdi){
        int toplamUcret = 0;
        switch (urunAdi) {
            case "Klasik Hamur":
                toplamUcret+= 15;
                break;
            case "İnce Hamur":
                toplamUcret+= 10;
                break;
            case "Dubleks Çift Kat Peynir":
                toplamUcret += 20;
                break;
            case "Diğer":
                toplamUcret += 20;
                break;
        }
        switch (urunAdi){
            case "Extravaganza":
                toplamUcret += 150;
                break;
            case "Karışık":
                toplamUcret += 150;
                break;
            case "Pizza Mexicano":
                toplamUcret += 135;
                break;
            case "Turkish Pizza": 
                toplamUcret += 140;
                break;
            case "Favorite Three":
                toplamUcret += 130;
                break;
        }
        switch (urunAdi){
            case "Küçük (4 Dilim)":
                toplamUcret += 20;
                break;
            case "Orta (6 Dilim)": 
                toplamUcret += 25;
                break;
            case "Büyük (8 Dilim)": 
                toplamUcret += 30;
                break;
        }
        switch(urunAdi){
            case "Zafer Gazoz":
                toplamUcret += 20;
            case "Kola": 
                toplamUcret += 30;
            case "Ayran": 
                toplamUcret += 15;
            case "Su": 
                toplamUcret += 10;
            case "Fanta": 
                toplamUcret += 30;

            case "Sufle": 
                toplamUcret += 60;
            case "Fırında Sütlaç": 
                toplamUcret += 80;
            case "Revani": 
                toplamUcret +=80;
            case "Tulumba": 
                toplamUcret += 50;
            case "Dondurma": 
                toplamUcret += 50;

            case "Patates Kızartması": 
                toplamUcret += 50;
            case "Soğan Halkası":
                toplamUcret +=60;
        }
        
            return toplamUcret;
        }
    
    
}
