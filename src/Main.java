import ClassesAndObjects.*; //Vælger alle filer fra ClassesAndObjects
import Methods.*; //Vælger alle filer fra "Methods" package

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner chooseMethods = new Scanner(System.in);
        System.out.println("Indtast det opgave nr. du vil se");
        int input = chooseMethods.nextInt();

        //Vælg opgave nr. du gerne vil se
        if (input == 1) { //A person is elligible to vote if his/her age is greater than or equal to 18
            System.out.println("Du valgte opgave: metode 1");
            MethodsExercises.method1();
        } else if (input == 2) { //Define two methods to print the maximum and the minimum number respectively among three numbers
            System.out.println("Du valgte opgave: metode 2");
            MethodsExercises.method2();
        } else if (input == 3) { //Define a program to find out whether a given number is even or odd
            System.out.println("Du valgte opgave: metode 3");
            MethodsExercises.method3();
        } else if (input == 4) { //Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is
            System.out.println("Du valgte opgave: metode 4");
            MethodsExercises.method4();
        } else if (input == 5) {//Car - Just print something to the console
            System.out.println("Du valgte opgave: car - print ud i konsol");
            ClassesAndObjectsExercises.carExercise();
        } else if (input == 6) {//Driver - Just print something to the console
            System.out.println("Du valgte opgave: driver - print ud i konsol");
            ClassesAndObjectsExercises.driverExercise();
        } else if (input == 7) {//Employee - If the monthly salary is not positive, set it to 0.0, yearly salary and yearly salary with 10% raise
            System.out.println("Du valgte opgave: employee - løn");
            ClassesAndObjectsExercises.employeeExercise();
        } else {
            System.out.println("Du valgte en ikke-eksisterende opgave, ups");
        }
    }
}