package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;

/*
*Classe Receita que serve para guardar a informação relativa ás receitas
*Implementa Serialzable para ser possivel guardar as receitas em ficheiro binário
 */
public class Receita implements Serializable {

    private String nome;
    private ArrayList<Ingrediente> ingredientes; //ingredientes usados na receita
    private int nPessoas; //nº de pessoas que a receita serve
    private int calorias; //nº de calorias da receita
    private String passos; //passos a seguir da receita
    private String camImg;

    public int getnPessoas() {
        return nPessoas;
    }

    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    public String getCamImg() {
        return camImg;
    }

    public void setCamImg(String camImg) {
        this.camImg = camImg;
    }

    /*
    *Constructor da classe Receita
     */
    public Receita(String nome, ArrayList<Ingrediente> ingredientes, int nPessoas, String passos, String camImg) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.nPessoas = nPessoas;
        this.passos = passos;
        this.camImg = camImg;

        for (Ingrediente ingrediente : ingredientes) {
            calorias += ingrediente.getCalorias() * ingrediente.getQuantidade() / 100;
        }
    }

    /*
    *Método para comparar uma lista de ingredientes (usado na pesqusa de receitas)
    *com os ingredientes da receita
     */
    public int comparaIngredientes(ArrayList<String> ing) {
        int x = 0;
        for (Ingrediente i : ingredientes) {
            for (String s : ing) {
                if (i.getNome().equals(s)) {
                    x++;
                }
            }
        }

        int percentagem;
        if (x == 0) {
            percentagem = 0;
        } else if (x == ingredientes.size() && ing.size() == ingredientes.size()) {
            percentagem = 100;
        } else if (ing.size() < ingredientes.size()) {
            percentagem = (x * 100) / ingredientes.size();
        } else {
            percentagem = (x * 100) / ing.size();
        }

        return percentagem;
    }

    /*
    *Getters para as propriedades da receita
     */
    public String getNome() {
        return nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public int nPessoas() {
        return nPessoas;
    }

    public int getCalorias() {
        return calorias;
    }

    public String getPassos() {
        return passos;
    }

    /*
    *Setters para as propriedades da receita
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setNPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    public void setcalorias() {
        calorias = 0;
        for (Ingrediente ingrediente : ingredientes) {
            calorias += ingrediente.getCalorias() * ingrediente.getQuantidade() / 100;
        }
    }

    public void setPassos(String passos) {
        this.passos = passos;
    }

}
