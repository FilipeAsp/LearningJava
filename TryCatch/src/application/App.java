package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        method2();
        System.out.println("End Program");
    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }

    public static void method2() {
        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("*** METHOD2 END ***");
    }
}
