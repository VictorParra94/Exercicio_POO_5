package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Student name = ");
        student.name = sc.nextLine();
        System.out.println("Notes:");
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();
        System.out.println(student);

    }
}
