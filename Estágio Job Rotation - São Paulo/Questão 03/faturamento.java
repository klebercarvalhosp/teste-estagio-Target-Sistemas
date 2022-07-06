

package com.mycompany.estagio3;

import java.util.Scanner;

public class faturamento {
         static double valorDiaMenor = 999999999L;
         static double valorDiaMaior = 0;
         static double valorMediaMes = 0;
         static int count = 0 ;
    public static void main(String[] args) {
            String [] aux; 
            String faturamentoTodosDias;
            
     System.out.println("Coloque o faturamento de todos os dias do mês ");
     Scanner  s = new Scanner(System.in); 
     faturamentoTodosDias = s.nextLine();
     aux = faturamentoTodosDias.split(" ");
       
           
       System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal " + armazenaEcalculaMaiorMenor(aux));
       System.out.println("Valor do dia Menor "+valorDiaMenor);
       System.out.println("Valor do dia Maior "+valorDiaMaior);
       
        
        
    } 
    
    public static int  armazenaEcalculaMaiorMenor(String [] aux){ 
      
          double [] faturamentoMes = null; 
          faturamentoMes = new double [29];
          
           while(count < 29){
        
       faturamentoMes[count] =  Double.parseDouble(aux[count]);
       
       valorMediaMes = valorMediaMes + faturamentoMes[count];

        if(faturamentoMes[count] < valorDiaMenor && faturamentoMes[count] > 0 ){ 
          valorDiaMenor = faturamentoMes[count];
        }
        if(faturamentoMes[count] > valorDiaMaior){ 
            
            valorDiaMaior = faturamentoMes[count];
        }
        
     count++;
    }
           double valorMedia = valorMediaMes / count;
           int diaMaiorMedia = 0;
         System.out.println("Media do mes "+ valorMedia);
           
          for (int i=0; i < count ; i++){ 
              
              if (faturamentoMes[i]> valorMedia){ 
                  diaMaiorMedia++;
              }
              
          }

           return diaMaiorMedia;
    }
    
}
