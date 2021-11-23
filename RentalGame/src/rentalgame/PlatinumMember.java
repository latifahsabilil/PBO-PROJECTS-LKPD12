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
public class PlatinumMember extends GoldMember {
    int bonusPulsa(){
        int nPulsa = bonusPulsa*nDay;
        return nPulsa;
    }
}
