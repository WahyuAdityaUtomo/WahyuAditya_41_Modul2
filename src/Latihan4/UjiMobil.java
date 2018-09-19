/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author User
 */
public class UjiMobil {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setPassword("maaf password anda salah");
        mobil.setpenumpang(1);
        
        System.out.println("Jika Password benar maka penumpang ditambahkan " + mobil.getPenumpang()+ " JIka password salah "+ mobil.getPassword());
    }
}
