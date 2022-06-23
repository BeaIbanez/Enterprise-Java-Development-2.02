import java.io.IOException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.Date;


public class Start {

    public static void main(String[] args) throws IOException {

//EXERCICI 1
        String nameFilm = "El señor de los anillos";
        System.out.println("There are " + nameFilm.length() + " caracters in total");
//EXERCISE 2
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {//Quiere decir NO IGUAL(!=)
                System.out.println(i);
            }
        }
//EXERCISE 3
        int[] numberList = {3, 2, 7, 9, 10, 11, 12, 24, 1, 2, 10, 999, 28, 18, 89, 0, 98, 76};
        int numodd = 0;
        int numeven = 0;

        for (int i = 0; i < numberList.length; i++)

            if (numberList[i] % 2 == 0) {
                numodd++;
            } else if (numeven == numeven) {
                numeven++;
            }
        int counter = numberList.length;
        System.out.println("\nThe numbers are: " + Arrays.toString(numberList));
        System.out.println("\nThere are  : " + counter + " numbers");
        System.out.print("\nNumber of odd elements in the array: " + numodd);
        System.out.print("\nNumber of even elements in the array: " + numeven);

//EXERCISE 4
        int num1, num2, num3, result;
//object of the Scanner class
        Scanner scanner = new Scanner(System.in);
//reading input from the user
        System.out.println("\nWrite the first number:");
        num1 = scanner.nextInt();
        System.out.println("\nWrite the second number :");
        num2 = scanner.nextInt();
        System.out.println("\nWrite the third number :");
        num3 = scanner.nextInt();
        int i = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
        result = i;
        System.out.println("The largest number is: " + result);

//EXERCISE 5
        int data, wordWeek;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWrite de number of the day of this week(1-7)");
        data = sc.nextInt();
        wordWeek = data;
        System.out.println("You choose: " + data);
        int day = data;
        String dayString;

        // instrucción switch con tipo de datos int
        switch (day) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miercoles";
                break;
            case 4:
                dayString = "Jueves";
                break;
            case 5:
                dayString = "Viernes";
                break;
            case 6:
                dayString = "Sabado";
                break;
            case 7:
                dayString = "Domingo";
                break;
            default:
                dayString = "Dia inválido";
                break;
        }
        System.out.println(dayString);
//EXERCISE 6 (mirarlo)
//NOSE COMO HACERLO--> https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-9.php

//EXERCISE 7
        int numb;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWrite a number it can be less than 0, 0 or more than0");
        numb = scan.nextInt();

        System.out.println("You choose: " + numb);
        if (numb == 0) {
            System.out.println("The number is equal to 0");
        } else if (numb < 0) {
            System.out.println("The number is littler than 0");
        } else {
            System.out.println("The number is bigger than 0");
        }
//EXERCISE 8
        int numeroOne;
        int numeroTwo;
        int numeroThree;
        //First number
        Scanner scnrOne = new Scanner(System.in);
        System.out.println("\nWrite a first number");
        numeroOne = scnrOne.nextInt();
        //Second number
        Scanner scnrTwo = new Scanner(System.in);
        System.out.println("\nWrite a second number");
        numeroTwo = scnrTwo.nextInt();
        //Third number
        Scanner scnrThree = new Scanner(System.in);
        System.out.println("\nWrite a third number)");
        numeroThree = scnrThree.nextInt();
        System.out.println("You chose these three numbers" + numeroOne + " / " + numeroTwo + " / " + numeroThree);
        if (numeroOne < numeroTwo && numeroTwo < numeroThree) {
            System.out.println("The number is in Increasing order ");
        } else if (numeroOne > numeroTwo && numeroTwo > numeroThree) {
            System.out.println("The number is in Decreasing order");
        } else {
            System.out.println("The numbers don't have order");
        }

//EXERCISE 9 NO ENTIENDO -(mirarlo) SOLUCION : https://www.w3resource.com/java-exercises/string/java-string-exercise-27.php

//EXERCISE 10
        Date newdate = new Date();
        System.out.println("Date: " + newdate);

//EXERCISE 11
        String nameUpperCase = "Little Mermaid";
        System.out.println("There are all the caracters in capital letters\n" + nameUpperCase.toUpperCase());
//EXERCISE 12

        String ok = "Noelia";
        String reverse = "";
        char letras;

        for (int y = 0; y < ok.length(); y++) {
            letras = ok.charAt(y);
            reverse = letras + reverse;
        }

        System.out.println("Word in a good order: " + ok);
        System.out.println("Word in a reverse order: " + reverse);

//EXERCISE 13
        String changeToF = "dadaism dado";
        System.out.println("They all are replaced:\n" + changeToF.replace("d", "f"));

//EXERCICI 14 S'ha de crear un methode per a la funcio de eliminar caracter es de la seguent manera:
        //Elimina caracter de la posicion 7 en el metodo haces la funcion p=posicion +1 porq empieza por 0

        String str = "Alicia en el pais de las maravillas";
        System.out.println(charRemoveAt(str, 7));

//EXERCICI 15
        int [] plusNumb = {1,2123,3123,4123,5123,61,733,841,139,123110,1,2123,3123,4123,5123,61,733,841,139,123110,12};
        int pl= plusNumb.length;
        System.out.println("There are: "+pl+" numbers in this array");

//EXERCICI 16





    }// Cierra el methodo Main

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }


} // Cierra la classe Main












