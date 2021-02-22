package exercicio4.classe;

public class COFINS implements Imposto{
    
    @Override
    public double calculaImposto(double valor){
        if(valor > 12000)
            return valor * 0.08;
        else 
            return valor;
    }
}
