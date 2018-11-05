package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main<Ejercicio5> {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc1 = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio se pediran dos numeros y el usuario elegira que ejercicios de los anteriores 5, 6, 7 o 8 hacer.");

        //Pedimos al usuario que introduzca el número del menú
        System.out.println("Introduzca el número de ejercicio a realizar (5,6,7 o 8)");
        //Guardamos en la variable el primer valor
        int numEjercicio = sc1.nextInt();

        if (numEjercicio==5) {
            // Abrimos la variable escaner para la introducción de datos mediante teclado.
            Scanner sc = new Scanner(System.in);

            //Información para el usuario
            System.out.println("En este ejercicio el usuario introducirá dos número y el programa dirá si son iguales o no");

            //Pedimos al usuario que introduzca el primer número
            System.out.println("Introduzca el primer número");
            //Guardamos en la variable el primer valor
            double num1 = sc.nextDouble();
            //Pedimos al usuario que introduzca el segundo número
            System.out.println("Introduzca el segundo número");
            // Guardamos en la variable num2 el valor introducido
            double num2 = sc.nextDouble();

            //Se hacen las comparaciones para indicar si es igual o no
            if (num1==num2) {
                System.out.println("Los números introducidos son iguales");
            } else
                System.out.println("Los números introducidos no son iguales");
        } else if (numEjercicio==6) {
            // Abrimos la variable escaner para la introducción de datos mediante teclado.
            Scanner sc = new Scanner(System.in);

            //Información para el usuario
            System.out.println("En este ejercicio el usuario introducirá dos números enteros y el programa dirá si son multipolos o no");

            //Pedimos al usuario que introduzca el primer número
            System.out.println("Introduzca el primer número entero");
            //Guardamos en la variable el primer valor
            int num1 = sc.nextInt();
            //Pedimos al usuario que introduzca el segundo número
            System.out.println("Introduzca el segundo número entero");
            // Guardamos en la variable num2 el valor introducido
            int num2 = sc.nextInt();

            //Se hacen las comparaciones para indicar si es multiplo o no
            if (num1%num2==0) {
                System.out.printf("El número %d es multiplo de %d",num1,num2);
            } else
                System.out.printf("El número %d no es multiplo de %d",num1,num2);
        }else if (numEjercicio==7) {
            // Abrimos la variable escaner para la introducción de datos mediante teclado.
            Scanner sc = new Scanner(System.in);

            //Información para el usuario
            System.out.println("En este ejercicio el usuario introducirá dos números y el programa dira cual es mayor o si son iguales");

            //Pedimos al usuario que introduzca el primer número
            System.out.println("Introduzca el primer número entero");
            //Guardamos en la variable el primer valor
            double num1 = sc.nextDouble();
            //Pedimos al usuario que introduzca el segundo número
            System.out.println("Introduzca el segundo número entero");
            // Guardamos en la variable num2 el valor introducido
            double num2 = sc.nextDouble();

            //Se hacen las comparaciones para indicar si es multiplo o no
            if (num1>num2) {
                System.out.println("El numero mayor es: "+num1);
            } else if (num2>num1) {
                System.out.println("El número mayor es: "+num2);
            } else if (num1==num2) {
                System.out.println("Los numeros son iguales");
            }
        }else if (numEjercicio==8) {
            // Abrimos la variable escaner para la introducción de datos mediante teclado.
            Scanner sc = new Scanner(System.in);

            //Información para el usuario
            System.out.println("En este ejercicio el usuario introducirá dos números y el programa lor ordenará de mayor a menor");

            //Pedimos al usuario que introduzca el primer número
            System.out.println("Introduzca el primer número");
            //Guardamos en la variable el primer valor
            double num1 = sc.nextDouble();
            //Pedimos al usuario que introduzca el segundo número
            System.out.println("Introduzca el segundo número");
            // Guardamos en la variable num2 el valor introducido
            double num2 = sc.nextDouble();

            //Se hacen las comparaciones para ordenarlos
            if (num1>num2) {
                System.out.println(num1 +" " + num2);
            } else if (num2>num1) {
                System.out.println(num2 + " "+ num1);
            } else if (num1==num2) {
                System.out.println("Los numeros son iguales");
            }
        }




    }

}