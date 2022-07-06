
import java.util.Scanner;

public class JogoFibonassi {
    
  
    
 
    public static void main(String[] args) {
        
        
        
        int recebeNumero = 0;
        int numeroFibonassi = 0;
        System.out.println("Por favor digite um numero"); 
        Scanner  s = new Scanner(System.in); 
        recebeNumero = s.nextInt();
        
        
        
         do{
             if (recebeNumero >= Fibonacci.fibo(numeroFibonassi)){
            System.out.print(+ Fibonacci.fibo(numeroFibonassi) + "\t");
            numeroFibonassi++;
             }
           
            
         }while(Fibonacci.fibo(numeroFibonassi) <= recebeNumero);
        
            System.out.print(+ Fibonacci.fibo(numeroFibonassi) + "\t");
    }
    
}
