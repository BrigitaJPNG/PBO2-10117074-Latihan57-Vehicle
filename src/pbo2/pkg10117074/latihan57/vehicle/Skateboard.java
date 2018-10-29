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
public class Skateboard extends vehicle{
    private double myBoardLenght;

    public Skateboard(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
    
}
