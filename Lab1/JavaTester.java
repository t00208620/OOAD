package Lab1;

public class JavaTester {

    public int counter = 0;
    public static int staticCounter = 0;

    //constructor
    public JavaTester(){
        counter ++;
        staticCounter ++;
    }

    public static void main(String[] args){

        JavaTester tester = new JavaTester();
        JavaTester tester2 = new JavaTester();
        JavaTester tester3 = new JavaTester();
        System.out.println("Counter: " + tester2.counter);
        System.out.println("Static counter: " + tester2.staticCounter);
    }
}
