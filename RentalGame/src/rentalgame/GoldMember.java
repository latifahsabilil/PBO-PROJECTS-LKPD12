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
public class GoldMember extends SilverMember{
    int bonusCashback(){
        int nCashback = bonusCashback*nDay;
        return nCashback;
    }
}
