package ejercicios;

import java.util.Scanner;

public class EjerciciosConBucles {
    public EjerciciosConBucles(){
    //1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while
    
    //ejercicio1();
    
    //2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
    
    //ejercicio2();
    
    //3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
    //la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
    //acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
    //caja fuerte.
    
    //ejercicio3();
    
    //4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es
    //equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos
    //como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en   
    //el número de dígitos la establece el tipo de dato que se utilice (int o long).
    
    //ejercicio4();
    
    //5.- Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori,
    //el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
    //cuando meta un número negativo.
    
    //ejercicio5();
    
    //6.- Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
    //Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos
    //son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

    ejercicio6();

    //7.- Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
    //sólo es divisible entre él mismo y la unidad.

    //ejercicio7();

    //8.- Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
    //y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
    //de 7 en 7.

    //ejercicio8();

    //9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
    //números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
    //indicar el final de la introducción de datos pero no se incluye en el cómputo.
    
    //ejercicio9();

    //10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

    //ejercicio10();

    //11.- Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
    //(o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.

    //ejercicio11();

    //12.- Escribe un programa que calcule el factorial de un número entero leído por
    //teclado.
    //Ejemplo:
    //Por favor, introduzca un número entero: 6
    //6! = 720

    //ejercicio12();
    }

    public void ejercicio1(){
        //BUCLE FOR:
        for(int i = 0; i <= 100; i+=5){
            System.out.println(i);
        }

        System.out.println("----------------------------");

        //BUCLE WHILE
        int num = 0;
        
        while (num <= 100) {
            System.out.println(num);
            num+=5;
        }

        System.out.println("----------------------------");
        // BUCLE DO WHILE
        num = 0;
        do {           
            System.out.println(num);
            num +=5;
        } while (num <= 100);
    }

    public void ejercicio2(){
        int countdown = 320;
        while (countdown >= 160) {
            System.out.println(countdown);
            countdown -= 20;
        }
    }

    public void ejercicio3(){
        int password = 1909;
        int intentos = 4;

        while (intentos > 0) {
            
            Scanner sc = new Scanner(System.in);
            System.out.printf("Introduce la clave de la caja fuerte te quedan %d intentos\n", intentos);
            int claveIntroducida = sc.nextInt();

            intentos--;
            if (claveIntroducida == password) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else System.out.println("Lo siento, esa no es la combinación");

            if(intentos == 0) System.out.println("La caja se ha bloqueado");

        }
    }

    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para saber cuantos digitos tiene:");
        long num = sc.nextLong();
        int contadorDigitos = 1;

        for (long i = num; i > 10; i/=10){
            contadorDigitos++;
        }

        System.out.printf("El número tiene %d dígitos.", contadorDigitos);
    }

    public void ejercicio5(){
        System.out.println("Introduce números para calcular la media de la suma de ellos.");
        int total = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();

            if (num < 0) {

                System.out.printf("La suma de todos los numeros es: %d. Su media da: %d.\n", total, total/2);

                System.out.println("Saliendo del programa...");
                break;
            }
            total += num;
        }
    }

    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para realizar la serie de Fibonacci esa cantidad de veces.");
        int num = sc.nextInt();
        /* 
        int puntero = 0;
        int puntero2 = 1;
        */
        int ant = 0;
        int sig = 1;
        int fib = 0;
        for(int i = num; i > 0; i--){
        System.out.println(ant);
        fib = ant + sig;

        ant = sig;
        sig = fib;
        /*
            System.out.println(puntero2 + " ," + puntero);
            puntero2 += puntero;
            puntero += puntero2;
        */
        }
    }

    public void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para saber si es primo o no:");
        int num = sc.nextInt();
        boolean esPrimo = true;

        for(int i = 2; i <= num/2; i++) {
            System.out.println(num + "%" + i + " = " + num%i);
           if(num%i == 0){
            esPrimo = false;
            break;
           }
        }

        if (esPrimo) System.out.println(num + " es un número primo.");
        else System.out.println(num + " NO es un número primo");
    }

    public void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        boolean sonIguales = false;

        do {
            System.out.println("Introduce el primer número:");
            num1 = sc.nextInt();
            System.out.println("Introduce el segundo número:");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Error. Los números no pueden ser iguales.");
                sonIguales = true;
            }else sonIguales = false;
            
            if (num1 < num2) {
                int cambio = num1;
                num1 = num2;
                num2 = cambio;           
            }
        } while (sonIguales);

        System.out.println("Incremento:");

        for(int i = num2; i < num1; i+=7){
            System.out.println(i);
        }

    }

    public void ejercicio9(){
        Scanner sc = new Scanner(System.in);
        int sumaImpares = 0;
        int mayorPar = 0;
        int contadorNumeros = 0;

        do{
            System.out.println("Introduzca un número (si el número es negativo saldrá del programa).");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("El mayor par introducido es: " + mayorPar + ".");
                System.out.println("La suma de los impares es de: " + sumaImpares + " y su media es de: " + sumaImpares/2);

                System.out.println("Saliendo del programa...");
                break;                
            }

            contadorNumeros++;

            if (num % 2 == 0){
                mayorPar = (num > mayorPar) ? num : mayorPar; 
            }else{
                sumaImpares += num;
            }
        
        }while(true);
    }

    public void ejercicio10(){
        Scanner sc =  new Scanner(System.in);

        String numStringVolteado = "";
        String numString = "";

        System.out.println("Introduce el número que desea voltear");
        int num = sc.nextInt();
        numString += num; 
        int numReducido= num;

        do {
            numStringVolteado += numReducido % 10;
            numReducido /= 10;
        } while (numReducido > 0);

   
        System.out.println(num + " es: " + numStringVolteado + " al revés.");
  
    }

    public void ejercicio11(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        System.out.println("Ahora introduzca un dígito de ese número:");
        int digito = sc.nextInt();

        int digitosNum = 0;
        int posicionDigito = 0;
        int posicionActual = 0;

        int digitoActual = 0;
        int numRecortado = num;

        while (numRecortado > 0) {
            numRecortado = numRecortado/10;
            digitosNum++;
        }
        
        numRecortado = num;
        while (numRecortado > 0) {
            digitoActual = numRecortado%10;
            numRecortado = numRecortado/10;
            posicionActual++;

            if (digitoActual == digito) {
                System.out.println("La posición del digito es la: " + (digitosNum - posicionActual+1));
            }
        }
    }

    public void ejercicio12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero:");
        int num = sc.nextInt();

        for(int i = num-1; i > 1; i--){
            System.out.println(num+"*"+ i + "= " + num*i);
            num*=i;
        }
    }
}
