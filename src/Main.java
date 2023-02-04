import ClassesAndObjects.*; //Vælger alle filer fra ClassesAndObjects
import Methods.*; //Vælger alle filer fra "Methods" package. Så kan Main bruger de klasser

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner chooseMethods = new Scanner(System.in);
        System.out.println("Indtast den metode opgave nr. du vil se");
        int input = chooseMethods.nextInt();

        //Vælg metode opgave nr. du gerne vil se (emne "methods")
        if (input == 1) {
            System.out.println("Du valgte opgave: metode 1");
            MethodsExercises.method1();
        } else if (input == 2) {
            System.out.println("Du valgte opgave: metode 2");
            MethodsExercises.method2();
        } else if (input == 3) {
            System.out.println("Du valgte opgave: metode 3");
            MethodsExercises.method3();
        } else if (input == 4) {
            System.out.println("Du valgte opgave: metode 4");
            MethodsExercises.method4();
        } else if (input == 5) {//Car
            ClassesAndObjectsExercises.carExercise();
        } else if (input == 6) {//Driver
            ClassesAndObjectsExercises.driverExercise();
        } else if (input == 7) {//Employee
            ClassesAndObjectsExercises.employeeExercise();
        } else {
            System.out.println("Du valgte en ikke-eksisterende opgave, ups");
        }
    }
}