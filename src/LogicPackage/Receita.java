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

    /*
    *Constructor da classe Receita
     */
    public Receita(String nome, ArrayList<Ingrediente> ingredientes, int nPessoas, String passos) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.nPessoas = nPessoas;
        this.passos = passos;

        for (Ingrediente ingrediente : ingredientes) {
            calorias += ingrediente.getCalorias() * ingrediente.getQuantidade() / 100;
        }
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

    public void setcalorias(int calorias) {
        this.calorias = calorias;
    }

}
