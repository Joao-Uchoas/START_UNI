package exercicio2;

import java.util.Scanner;

public class Cubo {
    public static void main(String[] args) {
        
        int parando = 0;
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Início do intervalo: ");
            int intervaloInicial= input.nextInt();

            System.out.print("Fim do intervalo: ");
            int intervaloFinal = input.nextInt();

            if(intervaloFinal + intervaloInicial < 15)
                for(int x = intervaloInicial; x <= intervaloFinal; x++){
                    int res = x*x*x;
                    System.out.println("cubo de " + x + ":" + res);
                }
            else
                parando = 1;
                
            input.close();
        }while(parando != 1);
       
    }
}
