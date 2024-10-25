package ejercicios;

import java.util.Scanner;

public class EjerciciosRepasoDos {
    public EjerciciosRepasoDos(){
        /* EJERCICIO 1
            Realiza un programa para jugar a “adivina el numero”.
        */
        ejercicio1();
        /* EJERCICIO 2
            Diseña un programa que resuelva ecuaciones de segundo grado.
        */
        //ejercicio2();
        /* EJERCICIO 3
            Diseña un programa que me diga los números elegantes que hay entre dos dados.
        */
        //ejercicio3();
        /* EJERCICIO 4
            Diseña un programa que me diga los números primos sexis que hay entre dos dados.
        */
        //ejercicio4();

    }
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce el mínimo para el número aleatorio:");
        int numMinimo = sc.nextInt();
        System.out.println("Introduce el máximo para un número aleatorio: ");
        int numMaximo = sc.nextInt();
        System.out.println("Introduce cuantos intentos quieres tener:");
        int intentos = sc.nextInt();

        sc = null;
        sc = new Scanner(System.in);
        
        if (numMaximo < numMinimo) {
            int c = numMaximo;
            numMaximo = numMinimo;
            numMinimo = numMaximo;
        }

        int numRandom = (int)(Math.random()*numMaximo+numMinimo);

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Introduzca un número:");
            num = sc.nextInt();

            if (num == numRandom) {
                System.out.printf("Felicidades, has acertado en %d intentos!", i);
            }else{
                if (num < numRandom) System.out.println("El número aleatorio es mayor al introducido.");
                else System.out.println("El número aleatorio es menor al introducido.");
                System.out.println("Te quedan " + (intentos-i) + " intentos.");
            }
        }
    }

    public void ejercicio2(){
        System.out.println("Ejercicio2");
    }

    public void ejercicio3(){
        System.out.println("Ejercicio3");
    }

    public void ejercicio4(){
        System.out.println("Ejercicio4");
    }
}
