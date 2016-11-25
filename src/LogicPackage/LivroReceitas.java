package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;

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
     */
    public void adicionaReceita(Receita receita) {
        receitas.add(receita);
    }

}
