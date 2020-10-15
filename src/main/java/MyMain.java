import java.util.Scanner;

public class MyMain {

    public static void randomNumbers() {
        int a = (int) (Math.random() * 11 + 10);
        int b = (int) (Math.random() * 11 + 10);
        int c = (int) (Math.random() * 11 + 10);
        System.out.println("The three random numbers are " + a + ", " + b + ", and " + c);
        System.out.println("The largest number is " + Math.max(Math.max(a, b), c));
        System.out.println("The smallest number is " + Math.min(Math.min(a, b), c));
    }

    public static void main(String[] args) {
        randomNumbers();
    }

}


