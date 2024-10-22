package ejercicios;

public class EjerciciosRepaso {
    public EjerciciosRepaso(){
        int num = 15;
        int numDividido = num;
        String numDecimalStr = "";

        while (numDividido > 2) {
            numDecimalStr += numDividido % 2;
            if (numDividido/2 == 1 || numDividido/2 == 0) {
                numDecimalStr += numDividido/2;
            }
            numDividido /= 2;
        }
        System.out.println(numDecimalStr);
    
    }

}
