/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author User
 */
public class Bus{
    private int penumpang;
    private int maxPenumpang;
    
    public Bus(int maxPenumpang){
        this.maxPenumpang = penumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kouta");
        }else{
            this.penumpang = temp;
        }
        
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang Adalah "+ penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah "+ maxPenumpang);
    }
}
