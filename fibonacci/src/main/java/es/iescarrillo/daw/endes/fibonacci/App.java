package es.iescarrillo.daw.endes.fibonacci;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros terminos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
