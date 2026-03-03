package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();
        Person vect[] = new Person[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Data for person "+ (i+1) +":");
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        double sum_Height = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum_Height += vect[i].getHeight();
        }
        
        double avg_Height = sum_Height/vect.length; 

        System.out.printf("\nAverage height: %.2f\n", avg_Height);

        int menores = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getAge() < 16){
                menores++;
            }
        }
        
        System.out.printf("People under 16 years old: %.1f%%\n", (menores*100.0/vect.length));
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}