package LogicPackage;

import java.io.Serializable;

/*
*Classe wrapper para a receita e a percentagem de compatibilidade com os ingredientes
*de pesquisa seleccionados
*Implementa comparable para possibilitar a ordenação da lista de receitas compativeis
*por ordem descendente
 */
public class ReceitaCompativel implements Comparable<ReceitaCompativel>, Serializable {

    private Receita receita;
    private int percentagem;
    private int id;

    public ReceitaCompativel(Receita receita, int percentagem, int id) {
        this.receita = receita;
        this.percentagem = percentagem;
        this.id = id;
    }

    /*
    *Getters
     */
    public Receita getReceita() {
        return receita;
    }

    public int getPercentagem() {
        return percentagem;
    }

    public int getId() {
        return id;
    }

    /*
    *Setters
     */
    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public void setPercentagem(int percentagem) {
        this.percentagem = percentagem;
    }

    @Override
    public int compareTo(ReceitaCompativel r) {

        int perc = r.getPercentagem();

        return perc - this.percentagem;
    }

}
