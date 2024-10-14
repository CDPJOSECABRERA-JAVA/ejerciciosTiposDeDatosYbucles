package estudioEstructurasBasicas;

public class EstudioOperadoresAritmeticos {

    public EstudioOperadoresAritmeticos(){
        System.out.println("\n---------------------------------------------");
        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println("---------------------------------------------\n");

        int suma, c = -5, d = 3, multi;
        double sumaDouble, num1 = 5.5, num2 = 2.3;

        suma = c - d;
        multi = c * d;
        System.out.println("Suma = " + suma);
        System.out.println("Multiplicación " + multi);

        sumaDouble = num1 + num2;
        suma = (int) sumaDouble;

        int divEntera, divid = 7, div = 3;
        double divReal, div2 = 3;
        divEntera = divid / div;

        System.out.println("División entera: " + divEntera);

        divReal = divid / (double)div;
        System.out.println("DivReal = " + divReal);

        divReal = divid / div2;

        System.out.println("DiviReal 2 = " + divReal);

        System.out.println("---------------");
        System.out.println("Resto");
        int resto;
        
        divid = 8;
        div = 3;
        resto = divid % div;
        System.out.println(resto);

        int num = 5;

        //CONTADORES

        // "i" es un contador

        for(int i=10; i >= 0; i--){
            System.out.println(String.valueOf(num) + " * " + i + " = " + num*i );
        }
        System.out.println("\n");
        for(int i=0; i <= 10; i++){
            System.out.println(String.valueOf(num) + " * " + i + " = " + num*i );
        }
        System.out.println("\n");

        int cont = 10;
        cont++;
        System.out.println("cont = " + cont); // cont = 11

        int y = cont++; // y = 11  ,  cont = 12
        System.out.println("count = " + cont);
        System.out.println("---------------");
        System.out.println("y = " + y);
        y = ++cont;
        System.out.println(cont);
        System.out.println("y = " + y);

        cont +=2;
        cont *=4; // cont = cont * 4
        cont /=4;


        //ACUMULADORES 

        int acum = 4;
        acum *= 2;
        System.out.println(acum);
        acum += 4;
        System.out.println(acum);
        acum += 6;
        System.out.println(acum);
    
        System.out.println("-----------------------------------------");
        //OPERACIONES DE RELACION

        int z = 3,  r = 4;
        boolean sw = false, sw1, sw2;

        sw = z == r; // Preguntamos si z es igual que r
        System.out.println(sw);
        sw = z != r; // Preguntamos si z es diferente de r
        System.out.println(sw);
        sw = z >= r; //preguntamos si z es mayor o igual que r;
        System.out.println(sw);

        //operador ternario

        int resultado = (z < r) ? z : r;
        System.out.println(resultado);

        // operadores lógicos
        sw1 = false;
        sw2 = false;

        boolean a = true, b = false;

        System.out.println(!sw1);
        System.out.println(sw1 || sw2);
        System.out.println(sw1 && sw2);
        System.out.println(sw1 ^ sw2); // devuelve verdadero si uno de ellos es verdadero
        
        System.out.println("------------------");
        System.out.println((a || (6 > 10)));
        System.out.println((b || (0 > 1)));

        System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));


        //PROBLEMA

        double mp,ex1,ex2;
        mp = 7.1;
        ex1 = 5;
        ex2 = (mp - 0.4*ex1)/0.6;

        System.out.println("La nota del segundo examen es: " + ex2);
    }
}

