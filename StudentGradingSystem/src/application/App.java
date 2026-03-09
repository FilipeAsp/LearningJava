package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
         

        System.out.print("Name Student:");
        student.name = sc.nextLine();
        System.out.println("Provide notes: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println(student);

        sc.close();
    }
}
