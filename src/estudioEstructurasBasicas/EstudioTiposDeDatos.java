package estudioEstructurasBasicas;

import java.util.Scanner;


public class EstudioTiposDeDatos {
    
    public EstudioTiposDeDatos(){
        System.out.println("Estudio de tipos de datos de la clase EstudioTiposDeDatos");
        
        //Declaracion de variables
        byte tipoByte = 0;
        tipoByte = 16;

        System.out.println("tipoByte = " + tipoByte);

        int x;
        x = 250;
        System.out.println("el valor de x es: " + x);
        x = 7;
        System.out.println("el valor de x ahora es: " + x);

        //long tipoLong = 4523268937892789238L;

        char letra1 = 'C';
        char letra2 = 'g';
        char letra3 = 64;

        System.out.println("char 1: " + letra1+"\nchar 2: " + letra2 + "\nchar 3: " + letra3);


        //CASTING
        System.out.println("---------------------------------------------");
        System.out.println("CASTING");
        System.out.println("---------------------------------------------");

        int codigoAscii = letra1;
        System.out.println(codigoAscii);

        double valorDouble = 2.44;
        int y = (int) valorDouble;
        System.out.println(y);
        System.out.println("---------------------------------------------");

        float valorFloat = 23.57f;
        double valorFloatDouble = (double)valorFloat;

        System.out.println("Float: " + valorFloat + " - Double: " + valorFloatDouble);

        System.out.println("---------------------------------------------");
        int dividendo=7, divisor=3;
        int coc= dividendo/divisor;

        System.out.println("El cociente de la division es: " + coc);

        double cociente = dividendo/(double)divisor;
        System.out.println("El cociente de la division es: " + cociente);

        System.out.println("\n---------------------------------------------");
        System.out.println("BOOLEANS");
        System.out.println("---------------------------------------------\n");

        boolean sw= false;
        sw=dividendo>divisor;

        System.out.println(sw);

        System.out.println("\n---------------------------------------------");
        System.out.println("CADENAS");
        System.out.println("---------------------------------------------\n");

        String palabra = "Perro";
        String miCaracter = "C";
        System.out.println("Mi " + palabra + " " + miCaracter);

        Scanner sc = new Scanner(System.in);
        
        

        System.out.println("Introduce tu nombre:");
        String nombre=sc.next(); // next() admite solamente una cadena y nextLine una frase
        
        sc.close();
        sc = null; // Se elimina el puntero de referencia
        sc = new Scanner(System.in); 
        
        System.out.println("Introduce tu edad:");
        int edad=sc.nextInt();

        
        sc.close();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
    }
}
