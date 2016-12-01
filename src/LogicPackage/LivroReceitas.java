package LogicPackage;

import LogicPackage.TipoAlimentos.*;
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
    public boolean adicionaReceita(String nome, ArrayList<Ingrediente> ingredientes, int pessoas, String passos) {

        Receita receita = new Receita(nome, ingredientes, pessoas, passos);

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
    public boolean adicionaIngrediente(String tipo, String nome, int calorias) {
        Ingrediente obj = null;

        if (tipo.equalsIgnoreCase(TIPO_CARNE)) {
            obj = new Carne(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_PEIXE)) {
            obj = new Peixe(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_VEGETAL)) {
            obj = new Vegetal(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_FRUTA)) {
            obj = new Fruta(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_CEREAL)) {
            obj = new Cereal(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_LACTICINIOS)) {
            obj = new Lacticinios(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_LEGUMINOSAS)) {
            obj = new Leguminosas(nome, calorias, 0);
        } else if (tipo.equalsIgnoreCase(TIPO_OLEOS)) {
            obj = new Oleos(nome, calorias, 0);
        }

        if (obj == null) {
            return false;
        }

        for (Ingrediente i : ingredientes) {
            if (i.equals(obj)) {
                return false;
            }
        }

        ingredientes.add(obj);

        return true;
    }

    /*
    *Método para editar receita
     */
    public boolean editaReceita(int id, String nome, ArrayList<Ingrediente> ingredientes, int pessoas, String passos) {
        if (id < 0 || id >= receitas.size()) {
            return false;
        }

        receitas.get(id).setNome(nome);
        receitas.get(id).setIngredientes(ingredientes);
        receitas.get(id).setNPessoas(pessoas);
        receitas.get(id).setcalorias(pessoas);

        return true;
    }

    /*
    *Metodo para eliminar receita
     */
    public boolean eliminaReceita(String nome) {
        for (int i = 0; i < receitas.size(); i++) {
            if (receitas.get(i).getNome().equals(nome)) {
                receitas.remove(i);
                return true;
            }
        }

        return false;
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
