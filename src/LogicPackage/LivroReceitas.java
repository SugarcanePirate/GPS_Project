package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/*
*Classe LivroReceitas, que guarda as receitas do programa
*Implementa os métodos de pesquisa de receitas e de adicionar receitas
*Implementa Serializable para ser possivel guardar as receitas em ficheiro binário
 */
public class LivroReceitas implements Serializable, Variables {

    private ArrayList<Receita> receitas; //ArrayList com receitas do programa
    private ArrayList<Ingrediente> ingredientes; //ArrayList com ingredientes

    public LivroReceitas() {
        receitas = new ArrayList<>();
        ingredientes = new ArrayList<>();
    }

    /*
    *Método para adicionar uma receita nova no Livro de receitas
    *Retorna false caso já exista uma receita com o mesmo nome, ou true caso
    *a receita seja adicionada
     */
    public boolean adicionaReceita(Receita receita) {

        for (Receita r : receitas) {
            if (r.getNome().equals(receita.getNome())) {
                return false;
            }
        }

        receitas.add(receita);

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
    *Método para adicionar ingredientes á lista de ingredientes disponiveis
     */
    public boolean adicionaIngrediente(Ingrediente ingrediente) {
        for (Ingrediente i : ingredientes) {
            if (i.equals(ingrediente)) {
                return false;
            }
        }

        ingredientes.add(ingrediente);

        return true;
    }

    /*
    *Getters para as informações do LivroReceitas
     */
    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /*
    *Setters para as propriedades do Livro de Receitas
     */
    public void setReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }

}
