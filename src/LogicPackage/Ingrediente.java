package LogicPackage;

import java.io.Serializable;

/*
*Classe abstracta Ingrediente que serve de base para os diferentes tipos
*de ingrediente
*Implementa Serializable para ser possivel guardar as receitas em ficheiro binário
 */
public abstract class Ingrediente implements Serializable {

    private String nome; //nome do ingrediente
    private int calorias; //calorias do ingrediente por 100 gramas
    private int quantidade; //quantidade de alimento usado na receita

    /*
    *Construtor da classe abstracta Ingrediente
     */
    public Ingrediente(String nome, int calorias, int quantidade) {
        this.nome = nome;
        this.calorias = calorias;
        this.quantidade = quantidade;
    }
    
    public Ingrediente(Ingrediente i, int g){
        this.calorias = i.calorias;
        this.nome = i.nome;
        this.quantidade = g;
    }

    /*
    *Getters para as propriedades dos ingredientes
     */
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCalorias() {
        return calorias;
    }

    /*
    *Setters paras as propriedades dos ingredientes
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
