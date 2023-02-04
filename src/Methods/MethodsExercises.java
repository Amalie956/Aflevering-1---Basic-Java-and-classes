package Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MethodsExercises {

    public static void method1() {
        Scanner checkInputIsOver18 = new Scanner(System.in);
        System.out.println("Please enter your age");

        int ageOver18 = checkInputIsOver18.nextInt();

        if (ageOver18 >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void method2() {
        int max = maxNumber(1, 18, 8); //argumenter
        System.out.println("Maximum number is " + max);

        int min = minNumber(1, 18, -8);
        System.out.println("Minimum number is " + min);
    }

    public static int maxNumber(int num1, int num2, int num3) { //parameter
        List<Integer> list = new ArrayList<Integer>(); //arraylist
        list.add(num1); //tilføjer elementerne
        list.add(num2);
        list.add(num3);
        return Collections.max(list);
    }

    public static int minNumber(int num1, int num2, int num3) {
        List<Integer> list = new ArrayList<Integer>(); //arraylist
        list.add(num1);
        list.add(num2);
        list.add(num3);
        return Collections.min(list);
    }

    public static boolean method3() {
        Scanner numberIsEvenOrNot = new Scanner(System.in);
        System.out.println("Indtast et tal for at se om det et lige eller et ulige tal");
        int inputNumber = numberIsEvenOrNot.nextInt();

        boolean evenNumber = inputNumber % 2 == 0; //sådan regner med ud om et tal er lige el. ej

        if (evenNumber == true) {
            System.out.println(evenNumber + ". Dette er et lige tal");
        } else {
            System.out.println(evenNumber + ". Dette er et ulige tal");
        }

        return evenNumber;
    }

    public static void method4() {
        String initials = "";

        Scanner scannerInputFullName = new Scanner(System.in);
        System.out.println("Indtast dit fuldenavn");

        String initialName = scannerInputFullName.nextLine();

        String listOfnames[] = initialName.split(" ");

        for (int i = 0; i < listOfnames.length; i++) {

            if (i == listOfnames.length - 1) {
                initials = initials + listOfnames[i].substring(0, 1).toUpperCase() + listOfnames[i].substring(1).toLowerCase(); //Tager det første bogstav i efternavn og gør det stort og dernæst laver de andre bogstaver i efternavnet til små bogstaver
            } else {
                initials = initials + listOfnames[i].toUpperCase().charAt(0) + ". ";
            }
        }
        System.out.println("Dine initialer er: " + initials);
    }
}
