/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan46.tandanyakamu;

/**
 *
 * @author ASUS
 */
public class age {
    private int yearbirth,yearnow;
    private final String red ="\u001B[31m"; 

    public age(int yearnow) {
       this.yearnow=yearnow;
    }

    public int getYearbirth() {
        return yearbirth;
    }

    public void setYearbirth(int yearbirth) {
        this.yearbirth = yearbirth;
    }

    public int getYearnow() {
        return yearnow;
    }

    public void setYearnow(int yearnow) {
        this.yearnow = yearnow;
    }
    public int hitungumur(){
        return yearbirth-yearnow;
    }
    
    public String tandanyakamu(int umur){
        String tanda;
        if(0>umur&&umur<=5)tanda="LAGI LUCU-LUCUNYA";       
        else if(5>umur&&umur<=10)tanda="MASIH ANAK ANAK";
        else if (10>umur&&umur<=13)tanda="MASIH REMAJA";
        else if (13>umur&&umur<=19)tanda="ALAY";
        else if (19>umur&&umur<=29)tanda="LAGI GALAU NYARI JODOH";  
        else if (29>umur&&umur<=35)tanda="LAGI SIBUK NYARI UANG";
        else if (35>umur&&umur<=150)tanda="SUDAH TUA";
        else  tanda="TIDAK TERDETEKSI DIKEHIDUPAN";
           
           return red+tanda;
            }
        
    
}
