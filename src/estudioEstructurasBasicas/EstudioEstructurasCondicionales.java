package estudioEstructurasBasicas;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {
    public EstudioEstructurasCondicionales(){

        int edad=20;
        boolean esBisiesto=false;

        if(esBisiesto){
            System.out.println("El año es bisiesto.");
        }else{
            System.out.println("El año NO es bisiesto.");
        }

        boolean esMayorEdad= edad>=18;

        if(esMayorEdad){
            System.out.println("MAYOR DE EDAD");
        }else{
            System.out.println("MENOR DE EDAD");
        }
    /*
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuál es la capital de Kiribati?");
        String respuesta = leer.next();
        respuesta = respuesta.toLowerCase();

        if(respuesta.equals("tarawa")){
            System.out.println("La respuesta es correcta.");
        }else System.out.println("La respuesta es incorrecta.");
//EJERCICIOS CONDICIONALES
/*
        // PEDIR NUMERO Y QUE TE DEVUELVA SI ES NEGATIVO O POSITIVO.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero para saber si es positivo o negativo");
        int num = sc.nextInt();

        boolean esPositivo = num > 0;

        if (num == 0) {
            System.out.println("El número 0 no es positivo ni negativo.");
        }else if(esPositivo){
            System.out.println("El número: " + num + " es positivo.");
        }else{
            System.out.println("El número " + num + " es negativo.");
        }

        // PEDIR EDAD DE PEDRO Y LUIS Y COMPROBAR SI PUEDEN VOTAR.

        int edadPedro, edadLuis;

        System.out.println("Introduce la edad de Pedro");
        edadPedro = sc.nextInt();
        System.out.println("Introduce la edad de Luis");
        edadLuis = sc.nextInt();

        if(edadPedro < 0 || edadLuis < 0){
            System.out.println("Las edades no pueden ser negativas.");
        }
    
        if(edadPedro >= 18 && edadLuis < 18) System.out.println("Pedro puede votar pero Luis no.");
        if(edadPedro < 18 && edadLuis >= 18) System.out.println("Luis puede votar pero Pedro no.");
        if(edadPedro < 18 && edadLuis < 18) System.out.println("Ni Pedro ni Luis puede votar.");
        if(edadPedro >= 18 && edadLuis >= 18) System.out.println("Tanto Pedro como Luis pueden votar.");
        

        if(edadPedro >= 18 && edadLuis < 18) System.out.println("Pedro puede votar pero Luis no.");
         else if(edadPedro < 18 && edadLuis >= 18) System.out.println("Luis puede votar pero Pedro no.");
         else if(edadPedro < 18 && edadLuis < 18) System.out.println("Ni Pedro ni Luis puede votar.");
         else(edadPedro >= 18 && edadLuis >= 18) System.out.println("Tanto Pedro como Luis pueden votar.");
*/


        // Estudio switch
        /*
        System.out.println("-- MENÚ --");
        System.out.println("1. Sumar dos numeros.\n2. Restar dos numeros.\n3. Multiplicar dos numeros");
        System.out.println("4. Dividir dos numeros.\n5. Salir");

        Scanner sc = new Scanner(System.in);
        
        int menuNum = sc.nextInt();
        sc.close();
        switch (menuNum) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");        
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;            
            case 4:
                System.out.println("Divison");
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Introduce una opción correcta");
                break;
        }
        */
        /*
        System.out.println("Introduce un valor númerico (1-12) que pertenezca a un mes");
        
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch (mes) {
            case 1: 
                System.out.println("Enero"); 
                break;
            case 2: 
                System.out.println("Febrero"); 
                break; 
            case 3: 
                System.out.println("Marzo"); 
                break;
            case 4: 
                System.out.println("Abril"); 
                break;
            case 5:
                System.out.println("Mayo"); 
                break;
            case 6:
                System.out.println("Junio"); 
                break;
            case 7: 
                System.out.println("Julio"); 
                break;
            case 8: 
                System.out.println("Agosto"); 
                break; 
            case 9: 
                System.out.println("Septiembre"); 
                break;
            case 10: 
                System.out.println("Octubre"); 
                break;
            case 11: 
                System.out.println("Noviembre"); 
                break; 
            case 12: 
                System.out.println("Diciembre"); 
                break;
            default:
                System.out.println("Mes incorrecto");
                break;
        }
    */
    // -------------------------------------------------------------------------------------
    // EJERCICIO CALCULAR AREAS FIGURAS GEOMETRICAS

        boolean bucleOn = true;
        while (bucleOn) {
            Scanner sc = new Scanner(System.in);
            int numMenu;

            System.out.println("""
                    ******************MENU******************
                    * 1. CALCULAR EL AREA DE UN CUADRADO.  *
                    * 2. CALCULAR EL AREA DE UN TRIANGULO. *
                    * 3. CALCULAR EL AREA DE UN CIRCULO.   *
                    * 4. SALIR.                            *
                    ****************************************
                    """);
            System.out.println("Escoja un número válido del indice del menú:");
            numMenu = sc.nextInt();

            switch (numMenu) {
                case 1:
                    sc = new Scanner(System.in);
                    double ladoCuadrado;

                    System.out.println("Introduce el lado del cuadrado:");
                    ladoCuadrado = sc.nextDouble();
                    sc = null;
                    System.out.println("El area del cuadrado es: " + Math.pow(ladoCuadrado, 2));
                    break;
                case 2:
                    sc = new Scanner(System.in);
                    double baseTriangulo;
                    double alturaTriangulo;

                    System.out.println("Introduce la base del triangulo:");
                    baseTriangulo = sc.nextDouble();
                    System.out.println("Introduce la altura del triangulo:");
                    alturaTriangulo = sc.nextDouble();
                    sc = null;
                    System.out.println("El area del triagulo es: " + ((baseTriangulo * alturaTriangulo) /2.0));
                    break;

                case 3:
                    sc = new Scanner(System.in);
                    double radioCirculo;

                    System.out.println("Introduce el radio del circulo:");
                    radioCirculo = sc.nextDouble();
                    sc = null;

                    System.out.println("El area del circulo es: " + (Math.PI * Math.pow(radioCirculo, 2)));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    bucleOn = false;
                    break;
                default:
                    System.out.println("El número introducido no es válido (debe ser un número entero del 1 al 4)");
                    /*
                    Si el ejercicio estuviera en una función se podria llamar a si misma para volver a mostrar
                    el menú y preguntar.
                    */
                    break;
            }
        }
        
    // -------------------------------------------------------------------------------------
    // EJERCICIO DEVOLVER LETRA DE DNI
        int numDni;
        Scanner leer = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int restoDivisionDni;
        
        System.out.println("Introduce tu DNI (Sin la letra):");
        numDni = leer.nextInt();
        restoDivisionDni = numDni%23;
        // String letraDni = letras.substring(restoDivisionDni, restoDivisionDni +1);
        char letra = letras.charAt(restoDivisionDni);
        System.out.println("La letra de tu DNI es: " + letra);
    }
}
