package exercicio1.teste;

import exercicio1.classe.Caixa;

public class Mian {
    public static void main(String[] args) {
        Caixa banana = new Caixa("Banana", 0.99, 2, 3);
        Caixa energetico = new Caixa("Energético", 5.49, 3, 7);
        Caixa arroz = new Caixa("Arroz", 20.00, 1, 1);
        Caixa chocolate = new Caixa("Chocolate", 4.5, 1, 20);
        Caixa leite = new Caixa("Leite", 3.73, 3, 3);
        Caixa abacaxi = new Caixa("Abacaxi", 2.4, 2, 4);

        System.out.println("O valor final é de: "+banana.calculaValorFinal(banana.getValor(), banana.getTipo(), banana.getQtd()) + " reais.");
        System.out.println("O valor final é de: "+energetico.calculaValorFinal(energetico.getValor(), energetico.getTipo(), energetico.getQtd()) + " reais.");
        System.out.println("O valor final é de: "+arroz.calculaValorFinal(arroz.getValor(), arroz.getTipo(), arroz.getQtd()) + " reais.");
        System.out.println("O valor final é de: "+chocolate.calculaValorFinal(chocolate.getValor(), chocolate.getTipo(), chocolate.getQtd()) + " reais.");
        System.out.println("O valor final é de: "+leite.calculaValorFinal(leite.getValor(), leite.getTipo(), leite.getQtd()) + " reais.");
        System.out.println("O valor final é de: "+abacaxi.calculaValorFinal(abacaxi.getValor(), abacaxi.getTipo(), abacaxi.getQtd()) + " reais.");
    }
}
