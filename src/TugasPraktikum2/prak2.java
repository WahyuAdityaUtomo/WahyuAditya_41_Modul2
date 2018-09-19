/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author User
 */
public class prak2 {
    private double jarijari = 14;
    private double diameter;
    private double luas;
    private double volume;
    
    public void setJari(double jarijari){
        this.jarijari=jarijari;
    }
    public void showdiameter(){
        this.diameter=2*jarijari;
    }
    public void showluas(){
        this.luas=4*Math.PI*jarijari*jarijari;
    }
    public void showvolume(){
        this.volume=(4*Math.PI*jarijari*jarijari*jarijari)/3;
    }
    public void cetak(){
        System.out.println("Jari jari : "+jarijari+" cm  ");
        System.out.println("_____________________________");
        System.out.println("Diamaeter : "+diameter+" cm  ");
        System.out.println("Luas : "+luas+" cm kuadrat   ");
        System.out.println("Volume : "+volume+" cm kubik ");
        
    }
}
