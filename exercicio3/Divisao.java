package exercicio3;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        if(numero %7 == 0 && numero %6 == 0 && numero %7 == 0)
            System.out.println("Divisivel por 3,6,7");
        else if(numero %3 == 0 && numero %6 == 0)
            System.out.println("Divisivel por 3,6");
        else if(numero %3 == 0 && numero %7 == 0)
            System.out.println("Divisivel por 3,7");
        else if(numero %7 == 0 && numero %6 == 0)
            System.out.println("Divisivel por 6,7");
        else if(numero %3 == 0)
            System.out.println("Divisivel por 3");
        else if(numero %6 == 0)
            System.out.println("Divisivel por 6");
        else if(numero %7 == 0)
            System.out.println("Divisivel por 7");
        else
            System.out.println("Esse numero não é divisivel por 3,6,7");
        input.close();
    }
}
