package estudioEstructurasBasicas;

public class EstudioMetodos {
    public EstudioMetodos(){
        int numMayor = 20;
        int numMenor = 5;

        if (numMayor < numMenor) {
            int c = numMayor;
            numMayor = numMenor;
            numMenor = c;
        }
        
        for(int i = numMenor; i <= numMayor; i++){
            if (esPrimo(i)) System.out.print(i + " - "); 
            }
        }
    
        boolean esPrimo(int num){       
            for(int i = 2; i < num - 1; i++){
                if (num%i == 0) return false; 
            }        
            return true;
        }
    }

    
    


