package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/*
*Classe LivroReceitas, que guarda as receitas do programa
*Implementa os métodos de pesquisa de receitas e de adicionar receitas
*Implementa Serializable para ser possivel guardar as receitas em ficheiro binário
 */
public class LivroReceitas implements Serializable {

    private ArrayList<Receita> receitas; //ArrayList com receitas do programa

    public LivroReceitas() {
        receitas = new ArrayList<>();
    }

    /*
    *Método para adicionar uma receita nova no Livro de receitas
    *Retorna false caso já exista uma receita com o mesmo nome, ou true caso
    *a receita seja adicionada
     */
    public boolean adicionaReceita(String nome, ArrayList<Ingrediente> ingredientes, int nPessoas, String passos) {

        for (Receita r : receitas) {
            if (r.getNome().equals(nome)) {
                return false;
            }
        }

        Receita r = new Receita(nome, ingredientes, nPessoas, passos);
        receitas.add(r);

        return true;
    }

    /*
    *Método para procurar receitas de acordo com os ingredientes escolhidos pelo
    *utilizador
     */
    public ArrayList<ReceitaCompativel> pesquisaReceitas(String[] ingredientes) {
        ArrayList<ReceitaCompativel> receitasCompativeis = new ArrayList<>();
        for (Receita r : receitas) {
            int percentagem = r.comparaIngredientes(ingredientes);
            if (percentagem > 0) {
                ReceitaCompativel x = new ReceitaCompativel(r, percentagem);
                receitasCompativeis.add(x);
            }
        }

        Collections.sort(receitasCompativeis);

        return receitasCompativeis;
    }

    /*
    *Getters para as informações do LivroReceitas
     */
    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    /*
    *Setters para as propriedades do Livro de Receitas
     */
    public void setReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }

}
