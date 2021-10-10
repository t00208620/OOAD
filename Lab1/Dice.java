package Lab1;

public class Dice {

    int faceValue;

    public Dice() {

        faceValue = 1;

    }
    public void roll(){

        this.faceValue = (int)(Math.random()*6+1);


    }
}
