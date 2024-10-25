package ejercicios;

import java.util.Scanner;

public class EjerciciosRepaso {
    public EjerciciosRepaso(){
        /*EJERCICIO 1: 
        Introducir un número entero por teclado que se supone que es un año. Indicar si es 
        bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.: 
        “Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”). int num = 15;
        */
        
        //ejercicio1();
        
        /*EJERCICIO 2:
        Calcular la suma : 1 + 2 + 3 +.....+ 20. 
        Luego, la suma : 1 + 3 +5 +  + 51.
        Y, por último, la suma : 1 - 2 + 3 -   + 19 - 20.
        */

        //ejercicio2();

        /*EJERCICIO 3: 
        Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo neto 
        mensual, y obtener y visualizar el nombre y sueldo de la persona que más cobra y de la que menos. 
        Si hay varias con el mismo sueldo (máximo o mínimo) se presentará la primera que aparezca en la 
        secuencia de entrada.   
        */

        //ejercicio3();

        /*EJERCICIO 4:
        Dados dos números enteros positivos, hallar el mínimo común múltiplo. Método a usar: Se van 
        hallando los sucesivos múltiplos del mayor de ellos hasta encontrar uno que sea divisible por el más 
        pequeño.
        */

        //ejercicio4();

        /*EJERCICIO 5
        Diseña un programa que pase un en decimal a binario, utilizando el algoritmo de la división ente 2.
        */

        ejercicio5();

    }

    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año para saber si es bisiesto o no:");
        int anio = sc.nextInt();
        sc = null;

        String resultado = "";

        boolean multiploDe4 = anio%4 == 0;
        boolean divisibleEntre100 = anio%100 == 0;
        boolean divisibleEntre400 = anio%400 == 0;

        boolean esBisiesto = ((multiploDe4 && !divisibleEntre100) || (divisibleEntre400));
       
        resultado = (esBisiesto) 
        ? "El año " + anio + " es bisiesto"
        : "El año " + anio + " no es bisiesto";
    

        System.out.println(resultado);
        /* 
        if (anio%4 == 0) {
           if (anio%100 == 0) {
            resultado = (anio%400 == 0) 
            ? "El año " + anio + " es bisiesto porque es divisible entre 4 y 100 pero también pero también entre 400" 
            : "El año " + anio + " no bisiesto porque es divisible entre 4 y entre 100 pero no entre 400";
         }else{
             resultado = "El año no es bisiesto porque no es múltiplo de 4";
         }
        }
        */
        
        
    }

    public void ejercicio2(){
        int suma= 0;


        for (int i = 1; i <= 20; i++) {
            suma += i;
        }
        System.out.println("Suma 1 = " + suma);
        suma = 0;

        for(int i = 1; i <= 51; i+=2){
            System.out.println(i);
            suma += i;
            System.out.println(suma);
        }
        System.out.println("Suma 2 = " + suma);
        suma = 0;
        
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
            if (i%2 == 0) suma-=i;
            else suma += i;
        }
        System.out.println("Suma 3 = " + suma);
    }
    
    public void ejercicio3(){
        Scanner sc;

        String nombreMasCobra = "";
        String nombreMenosCobra = ""; 

        String nombre = "";
        int sueldo = 0;

        int masCobra = 0;
        int menosCobra = 99999999;
        
        for(int i = 1; i < 5; i++){
            sc = new Scanner(System.in);

            System.out.println("Introduce el nombre:");
            nombre = sc.nextLine();
            sc = null;

            sc = new Scanner(System.in);
            System.out.println("Introduce su sueldo:");
            sueldo = sc.nextInt();

            sc = null;

            if (sueldo < menosCobra) {
                menosCobra = sueldo;
                nombreMenosCobra = nombre;
            }
            if (sueldo > masCobra) {
                masCobra = sueldo;
                nombreMasCobra = nombre;
            }
        }
        System.out.printf("%s, es la persona que mas cobra (%d)", nombreMasCobra, masCobra);
        System.out.printf("%s, es la persona que mas cobra (%d)", nombreMenosCobra, menosCobra);
        
        
        

    }
    
    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, mcm, i = 1;

        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();
    
        if(num1 < num2){
            int cambio = num1;
            num1 = num2;
            num2 = cambio;
        }
        while (true) {
            if ((num1*i)%num2 == 0) {               
                mcm = num1*i;
                break;
            }
            i++;
        }
        System.out.println(mcm);
    }
    
    public void ejercicio5(){
        int num =12;
        int numDividido = num;
        String resto = "", coc = "", binario="";


        while (numDividido > 2) {
            resto += numDividido % 2;
            if (numDividido/2 == 1 || numDividido/2 == 0) coc += numDividido/2;                          
            numDividido /= 2;
        }
        binario = resto + coc;
        System.out.println(binario);

    }


}
