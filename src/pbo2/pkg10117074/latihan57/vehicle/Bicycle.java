/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan57.vehicle;

/**
 *
 * @author MY PC
 */
public class Bicycle extends vehicle{
    private int myGearCount;

    public Bicycle(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
