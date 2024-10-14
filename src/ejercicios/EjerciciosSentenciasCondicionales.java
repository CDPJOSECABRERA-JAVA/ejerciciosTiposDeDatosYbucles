package ejercicios;

import java.util.Scanner;

public class EjerciciosSentenciasCondicionales {
    public EjerciciosSentenciasCondicionales(){
        //PROGRAMA QUE PIDA POR TECLADO UN DIA DE LA SEMANA Y DEVUELVA QUE ASIGNATURA TOCA A PRIMERA.
        //ejercicio1();
        
        //PROGRAMA QUE PIDE LA HORA Y RESPONDE BUENOS DÍAS, TARDES O NOCHES.
        //ejercicio2();

        //PROGRAMA QUE CALCULE EL SALARIO SEMANAL 12€/H LAS PRIMERAS 40H Y A PARTIR DE LA HORA 41, 16€/H
        //ejercicio3();
        
        //PROGRAMA QUE COMPRUEBE LA FECHA Y DIGA A QUE HOROSCOPO PERTENECE
        //ejercicio4();

        //PROGRAMA QUE CALCULE LOS SEGUNDOS QUE FALTAN PARA MEDIA NOCHE
        //ejercicio5();

        //PROGRAMA QUE PIDA 3 NUMEROS Y LOS ORDENE
        //ejercicio6();

        //PROGRAMA QUE DIGA CUAL ES LA ULTIMA CIFRA DE UN NUMERO ENTERO INTRODUCIDO POR TECLADO;
        //ejercicio7();

        // PROGRAMA QUE DIGA CUAL ES LA PRIMERA CIFRA DE UN ENTERO DE HASTA 5 CIFRAS;
        //ejercicio8();

        //PROGRAMA UN NUMERO QUE DIGA CUANTOS DIGITOS TIENE UN NUMERO ENTERO NEGATIVO O POSITIVO DE HASTA 5 CIFRAS.
        //ejercicio9();

        //REALIZA UN PROGRAMA QUE DIGA SI UN NUMERO ENTERO POSITIVO DE HASTA 5 CIFRAS INTRODUCIDO POR TECLADO ES CAPICUA
        //ejercicio10();

        // EJERCICIO 11
        //ejercicio11();
    }
    // EJERCICIOS
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un día de la semana para saber que asignatura toca a primera hora:");
        String dia = sc.nextLine().toLowerCase();
        
        switch (dia) {
            case "lunes":
                System.out.println("El Lunes a primera hora toca programación");
                break;
            case "martes":
                System.out.println("El Martes a primera hora toca Sistemas Informáticos");
                break;
            case "miercoles":
                System.out.println("El Miércoles a primera hora toca Sostenibilidad");
                break;
            case "jueves":
                System.out.println("El Jueves a primera hora toca Digitalización");
                break;
            case "viernes":
                System.out.println("El Viernes a primera hora toca FOL");
                break;
            default:
                System.out.println("El día introducido no es correcto");
                break;
        }

    }

    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una hora:");
        int hora = sc.nextInt();

        if(hora >= 6 && hora <= 12) {
            System.out.println("Buenos días.");
        }else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        }else if (hora >= 21 && hora <= 23 || hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches.");
        }else{
            System.out.println("El número enviado no corresponde a ningúna hora");
        }
    }

    public void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de horas semanales trabajadas para calcular el salario:");
        int horas = sc.nextInt();

        if (horas < 41 && horas > 0) {
            System.out.println("Usted ha ganado " + (horas * 12) + " en " + horas + " horas");
        }else if (horas > 40) {
            System.out.println("Usted ha ganado " + ((40 * 12)+((horas - 40) * 16)) + " en " + horas + " horas");
        }else if(horas <= 0){
            System.out.println("Usted no ha trabajado nada");
        }
    }

    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Para saber que horoscopo es x fecha introduce el día:");
        int diaNum = sc.nextInt();
        
        sc = null;
        sc = new Scanner(System.in);
        
        System.out.println("Ahora introduce el mes(formato texto): ");
        String mes = sc.nextLine().toLowerCase();

        if ((diaNum <= 31 && diaNum >= 21 && mes.equals("marzo")) || (diaNum > 0 && diaNum <= 20 && mes.equals("abril"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Aries.");
        }else if ((diaNum <= 30 && diaNum >= 21 && mes.equals("abril")) || (diaNum > 0 && diaNum <= 20 && mes.equals("mayo"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Tauro.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("mayo")) || (diaNum > 0 && diaNum <= 20 && mes.equals("junio"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Géminis.");
        }else if ((diaNum <= 30 && diaNum >= 21 && mes.equals("junio")) || (diaNum > 0 && diaNum <= 20 && mes.equals("julio"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Cáncer.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("julio")) || (diaNum > 0 && diaNum <= 20 && mes.equals("agosto"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Leo.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("agosto")) || (diaNum > 0 && diaNum <= 20 && mes.equals("septiembre"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Virgo.");
        }else if ((diaNum <= 30 && diaNum >= 21 && mes.equals("septiembre")) || (diaNum > 0 && diaNum <= 20 && mes.equals("octubre"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Libra.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("octubre")) || (diaNum > 0 && diaNum <= 20 && mes.equals("noviembre"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Escorpio.");
        }else if ((diaNum <= 30 && diaNum >= 21 && mes.equals("noviembre")) || (diaNum > 0 && diaNum <= 20 && mes.equals("diciembre"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Sagitario.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("diciembre")) || (diaNum > 0 && diaNum <= 20 && mes.equals("enero"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Capricornio.");
        }else if ((diaNum <= 31 && diaNum >= 21 && mes.equals("enero")) || (diaNum > 0 && diaNum <= 19 && mes.equals("febrero"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Acuario.");
        }else if ((diaNum <= 29 && diaNum >= 20 && mes.equals("febrero")) || (diaNum > 0 && diaNum <= 20 && mes.equals("marzo"))) {
            System.out.println("El día " + diaNum + " de " + mes + " es Piscis.");
        }else{
            System.out.println("Error desconocido");
        }
    }

    public void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Para saber cuantos segundos quedan para medianoche, introduce la hora:");
        int hora = sc.nextInt();
        System.out.println("Ahora los minutos:");
        int minutos = sc.nextInt();

        int segundosHastaMedianoche = ((24 * 3600) - ((hora * 3600) + (minutos * 60)));
        System.out.println("Quedan " + segundosHastaMedianoche + " segundos hasta medianoche");
    }

    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE 3 NUMEROS PARA ORDENARLOS:");
        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = sc.nextInt();

        String ordenados = "";

        System.out.println(ordenados);
        /*
        if (num1 >= num2 && num1 >= num3) {
            ordenados = num1 + " > ";
            
            ordenados += (num2 >= num3) ? num2+" > "+num3 : num3+" > "+num2;
        }
        else if (num2 >= num1 && num2 >= num3) {
            ordenados = num2 + " > ";
            ordenados += (num1 >= num3) ? num1+" > "+num3 : num3+" > "+num1;
        }
        else{
            ordenados = num3 + " > ";
            ordenados += (num2 >= num3) ? num2+" > "+num1 : num1+" > "+num2;
        }
        */

        
    }

    public void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero para obtener su última cifra:");
        int num = sc.nextInt();

        if(num < 0) num = -num;
        System.out.println("La ultima cifra del número introducido es " + num%10);
        
        //System.out.println(Integer.toString(num).charAt(Integer.toString(num).length() - 1));
    }

    public void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de máximo 5 cifras");
        int num = sc.nextInt();
        
        if(num < 0) num = -num;
        if (num > 99999) {
            System.out.println("Error, el número introducido es de más de 5 cifras.");
            return;
        }
        int primeraCifra;
        
        //System.out.println("La primera cifra de " + num + " es " + Integer.toString(num).charAt(0));
        
        if (num >= 10000) {
            primeraCifra = num/10000;
        }else if(num >= 1000){
            primeraCifra = num/1000;
        }else if(num >= 100){
            primeraCifra = num/100;
        }else if(num >= 10){
            primeraCifra = num/10;
        }else{
            primeraCifra = num;
        }

        System.out.println("La primera cifra de " +  num + " es: " + primeraCifra);

    }

    public void ejercicio9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de máximo 5 cifras");
        int num = sc.nextInt();
        
        if(num < 0)num = -num;

        if (num > 99999) {
                System.out.println("Error, el número introducido es de más de 5 cifras.");
                return;
        }
        
        //System.out.println((num  + " tiene " + (Integer.toString(num).length()) + " cifras."));
        
        if(num >= 10000){
            System.out.println("El número: " + num + " tiene 5 cifras.");
        }else if(num >= 1000){
            System.out.println("El número: " + num + " tiene 4 cifras.");
        }else if(num >= 100){
            System.out.println("El número: " + num + " tiene 3 cifras.");
        }else if(num >= 10){
            System.out.println("El número: " + num + " tiene 2 cifras.");
        }else{
            System.out.println("El número: " + num + " tiene 1 cifras.");
        }




        
       
    }

    public void ejercicio10(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número de no mas de 5 cifras para saber si es capicúa o no.");
        int num = sc.nextInt();

        if(num < 0) num = -num;

        if(num > 99999){
            System.out.println("El número no puede tener mas de 5 cifras");
            return;
        }
        String numString = num + "";
        String numInversa = "";
        int primeraCifra;
        int ultimaCifra;
        int numCuatroCifras;
        int numTresCifras;
        int numDosCifras;

        String resultado = "";

        if(num >= 10000){
            numInversa += num%10;
            
            
            numCuatroCifras = num/10;
            numInversa+=numCuatroCifras%10;

            numTresCifras = numCuatroCifras/10;
            numInversa+=numTresCifras%10;

            numDosCifras = numTresCifras/10;
            numInversa+=numDosCifras%10;

            numInversa+= num/10000;

            resultado = (numString.equals(numInversa)) ? "El número " + num + " es capicúa." :  "El número " + num + " NO es capicúa.";
            System.out.println(resultado);

        }else if(num >= 1000){
            numInversa += num%10;
            
            numTresCifras = num/10;
            numInversa += numTresCifras%10;

            numDosCifras = numTresCifras/10;
            numInversa += numDosCifras%10;

            numInversa += num/1000;

            resultado = (numString.equals(numInversa)) ? "El número " + num + " es capicúa." :  "El número " + num + " NO es capicúa.";
            System.out.println(resultado);

        }else if(num >= 100){
            primeraCifra = num/100;
            ultimaCifra = num%10;

            resultado = (primeraCifra == ultimaCifra) ? "El número " + num + " es capicúa." :  "El número " + num + " NO es capicúa.";
            System.out.println(resultado);
        }else if(num >= 10){
            primeraCifra = num/10;
            ultimaCifra = num%10;

            resultado = (primeraCifra == ultimaCifra) ? "El número " + num + " es capicúa." :  "El número " + num + " NO es capicúa.";
            System.out.println(resultado);
        }else{
            System.out.println("Los números de una única cifra siempre son capicúa.\n" + num + ", es capicúa");
        }

        /*
        String numString = Integer.toString(num);
        String numStringInversa = "";
        String[] numStringArr = numString.split("");

        for(int i = numStringArr.length - 1; i >= 0; i--){
            numStringInversa += numStringArr[i];
        }
        
        if(numString.equals(numStringInversa)){
            System.out.println("El número " + num + " es un número capicúa.");
        }else{
            System.out.println(num + ", no es un número capicúa.");
        }
        */
    }

    public void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la base imponible para aplicarle el IVA y el código promocional.");
        double base = sc.nextDouble();   
        sc = null;

        int ivaGeneral = 21;
        int ivaReducido = 10;
        int ivaSuperreducido = 4;

        int ivaEscogido = 0;


        String codigoPromocional = "";
        double precioConIva;
        double descuentoPromocional = 0;

        double precioTotal;

        System.out.println("Introduce el tipo de IVA que quiere aplicar.\n1. IVA General.\n2. IVA Reducido.\n3. IVA Superreducido.");
        sc = new Scanner(System.in);
        int menuPointer = sc.nextInt();
        sc = null;

        switch (menuPointer) {
            case 1:
                System.out.println("Has seleccionado IVA General de " + ivaGeneral + "%.");
                precioConIva = base + ((base * ivaGeneral)/100);
                ivaEscogido = ivaGeneral;
                break;
            case 2:
                System.out.println("Has seleccionado IVA Reducido de " + ivaReducido + "%.");
                precioConIva = base + ((base * ivaReducido)/100);
                ivaEscogido = ivaReducido;
                break;
            case 3:
                System.out.println("Has seleccionado IVA Superreducido de " + ivaSuperreducido + "%.");
                precioConIva = base + ((base * ivaSuperreducido)/100);
                ivaEscogido = ivaSuperreducido;
                break;
            default:
                System.out.println("No se ha seleccionado ningun tipo de IVA.");
                precioConIva = base;
                break;
        }

        System.out.println("¿Quiere introducir un código promocional?\n1. Si.\n2. No.");
        sc = new Scanner(System.in);
        menuPointer = sc.nextInt();
        sc = null;

        switch (menuPointer) {
            case 1:
                System.out.println("Introduce el código promocional: ");
                sc = new Scanner(System.in);
                codigoPromocional = sc.next();
                sc = null;
                if(codigoPromocional.equals("mitad") || codigoPromocional.equals("meno5") || codigoPromocional.equals("5porc")){
                    System.out.println("Se ha seleccionado el código de promoción: " + codigoPromocional);

                    if (codigoPromocional.equals("mitad")) descuentoPromocional = precioConIva/2;
                    if (codigoPromocional.equals("meno5")) descuentoPromocional = 5;
                    if (codigoPromocional.equals("5porc")) descuentoPromocional = precioConIva * 0.05;
                    break;
                }
            default:
                System.out.println("No se ha seleccionado ningún código promocional.");
                codigoPromocional = "nopro";
                break;               
        }
        precioTotal = precioConIva - descuentoPromocional;

        System.out.println("Base imponible: " + base + ".");
        System.out.println(" Precio con IVA(" + ivaEscogido + "%): " + precioConIva + ".");
        System.out.println("Cód. promo. ("+codigoPromocional+"): -" + descuentoPromocional);


        System.out.println("PRECIO TOTAL: " + precioTotal);
    }
}
