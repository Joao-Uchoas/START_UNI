package exercicio4.classe;

public class ICMS implements Imposto{
    @Override
    public double calculaImposto(double valor){
        return valor * 0.3;
    }
}
