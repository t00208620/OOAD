package Lab1;

public class DiceGame {

    public static void main(String[]args){

        Dice die1 = new Dice();
        die1.roll();

        Dice die2 = new Dice();
        die2.roll();

        System.out.println("Value of dice 1 is: " + die1.faceValue);
        System.out.println("Value of dice 2 is: " + die2.faceValue);
        System.out.println();

        //check if win or loose

        if(die1.faceValue + die2.faceValue == 7 || die1.faceValue + die2.faceValue == 12 )
            System.out.println("You won");
        else
            System.out.println("You loose");

    }

}
