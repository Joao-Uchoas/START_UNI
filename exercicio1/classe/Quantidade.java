package exercicio1.classe;

public class Quantidade extends Produto{
    private int qtd;

    public Quantidade(String nome, double valor, int tipo, int qtd) {
        super(nome, valor, tipo);
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd > 0)
            this.qtd = qtd;
    }

    
}
