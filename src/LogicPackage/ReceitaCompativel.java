package LogicPackage;

public class ReceitaCompativel implements Comparable<ReceitaCompativel> {

    private Receita receita;
    private int percentagem;

    public ReceitaCompativel(Receita receita, int percentagem) {
        this.receita = receita;
        this.percentagem = percentagem;
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
