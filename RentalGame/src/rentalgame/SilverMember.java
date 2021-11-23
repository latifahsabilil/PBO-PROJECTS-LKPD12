/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author Lenovo
 */
public class SilverMember{
    public int Diskon ,Harga;
    public int bonusPoin, bonusCashback, bonusPulsa;
    public int nDay;
    
    int totalPoin(){
        int totalPoin = bonusPoin*nDay;
        return totalPoin;
    }
    
    int totalHarga(){
        int harga = ((Harga*(100-Diskon))/100)*nDay;
        return harga; 
    }
}
