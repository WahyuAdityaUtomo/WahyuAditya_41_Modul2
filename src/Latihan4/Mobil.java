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
public class Mobil {
    private int penumpang;
    private String password;
    
    public String getPassword(){
        return password;
        
        }
    public int getPenumpang(){
        return penumpang;
    }
    public void setPassword(String newPassword){
        password = newPassword;
    }
    public void setpenumpang(int newPenumpang){
        penumpang = newPenumpang;
    }
}
