package exercicio1.classe;

public class Caixa extends Quantidade {
   
    public Caixa(String nome, double valor, int tipo, int qtd) {
        super(nome, valor, tipo, qtd);
    }

    public double calculaValorFinal(double valor,int tipo, int qtd){
        if(tipo == 1 || tipo > 2){
            double res = (valor * qtd);
            double resFinal = res - (res*0.1);
            return resFinal;
        }
        else if(tipo == 2){
            double res = (valor * qtd);
            double resFinal = res - (res*0.2);
            return resFinal;
        }
        return 0;
    }

   
}
