package exercicio4.teste;

import java.util.Scanner;

import exercicio4.classe.COFINS;
import exercicio4.classe.ICMS;
import exercicio4.classe.IPI;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble(); 
        COFINS cofins = new COFINS();
        IPI ipi = new IPI();
        ICMS icms = new ICMS();
        
        System.out.printf("ICMS: %.1f\n",icms.calculaImposto(valor));
        System.out.printf("IPI: %.1f\n", ipi.calculaImposto(valor));
        System.out.printf("COFINS: %.1f\n", cofins.calculaImposto(valor));

        double valorFinal = valor + icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor);
        System.out.printf("Valot Final: %.1f\n", valorFinal);
        input.close();
    }
}
