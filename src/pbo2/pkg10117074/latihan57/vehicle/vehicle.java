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
public class vehicle {
    private String myBrand;
    private String myMOdel;

    public vehicle(String myBrand, String myMOdel) {
        this.myBrand = myBrand;
        this.myMOdel = myMOdel;
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyMOdel() {
        return myMOdel;
    }

    public void setMyMOdel(String myMOdel) {
        this.myMOdel = myMOdel;
    }
}
