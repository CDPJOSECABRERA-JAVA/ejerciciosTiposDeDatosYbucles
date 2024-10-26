package ejercicios;

import java.util.Scanner;

public class EjerciciosRepasoDos {
    public EjerciciosRepasoDos(){
        /* EJERCICIO 1
            Realiza un programa para jugar a “adivina el numero”.
        */

        //ejercicio1();

        /* EJERCICIO 2
            Diseña un programa que resuelva ecuaciones de segundo grado.
        */

        //ejercicio2();

        /* EJERCICIO 3
            Diseña un programa que me diga los números elegantes que hay entre dos dados.
        */

        ejercicio3();

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
        //((-b +- Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2*a))
        Scanner sc = new Scanner(System.in);
        System.out.println("Para solucionar una ecuación de segundo grado introduce el primer coeficiente (a):");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();

        double raiz = (Math.sqrt((Math.pow(b,2) - (4*a*c))));

        if (raiz < 0) {
            System.out.println("Esta ecuación no tiene solución en números reales ya que su discriminante da un valor negativo.");
            return;
        }
        double solucion1, solucion2;

        solucion1 = (-b + raiz)/(2*a);
        solucion2 = (-b - raiz)/(2*a);

        String solucion1str = "" + solucion1, solucion2str = "" + solucion2;

        if(solucion1str.equals("NaN") || solucion1str.equals("Infinity")){
            System.out.println("La ecuación no tiene solucion en los números reales.");
            return;
        } 


        System.out.printf("Solución 1: %.2f %n", solucion1);
        System.out.printf("Solución 2: %.2f", solucion2);
    }

    public void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor menor para obtener los números elegantes entre dos números.");
        int numMenor = sc.nextInt();
        System.out.println("Ahora el mayor:");
        int numMayor = sc.nextInt();

        if (numMayor < numMenor) {
            int c = numMenor;
            numMenor = numMayor;
            numMayor = c;
        }

        for(int i = numMenor; i <= numMayor; i++){
            if (comprobarNumeroElegante(i)) System.out.println(i);
        }
    }

    public void ejercicio4(){
        System.out.println("Ejercicio4");
    }
    
    // -------------------------------------------------------------------------------------------------
    boolean comprobarNumeroElegante(int i){
    return true;
    }

}

