

public class Numeros
{
   
    private Numeros()
    {
        
    }

    public static boolean esPrimo(int numero){
        int numeroInicial = 2;
        while(numeroInicial < numero){
            if(numero % numeroInicial == 0){
                return false;
            }
            numeroInicial++;
        }
        return true;
    }
}
