/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author User
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Adit");
        siswa.setAge(16);
        siswa.getAddress("Malang");
        
        System.out.println("name : " +siswa.getName()+ ",absen : "+siswa.getAbsen()+ ",Address : " +siswa.getAddress(
        ));
    }
}
