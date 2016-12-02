package LogicPackage;

import LogicPackage.TipoAlimentos.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

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
        
        geraIngredientes();
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
    
    private void geraIngredientes(){
        //Carne
        adicionaIngrediente(TIPO_CARNE,"Salsicha",301);
        adicionaIngrediente(TIPO_CARNE,"Bife",271);
        adicionaIngrediente(TIPO_CARNE,"Costeleta",231);
        adicionaIngrediente(TIPO_CARNE,"Carne picada",251);
        adicionaIngrediente(TIPO_CARNE,"Frango",239);
        adicionaIngrediente(TIPO_CARNE,"Presunto",145);
        adicionaIngrediente(TIPO_CARNE,"Chourico",455);
        adicionaIngrediente(TIPO_CARNE,"Fiambre",150);
        adicionaIngrediente(TIPO_CARNE,"Bacon",541);
        adicionaIngrediente(TIPO_CARNE,"Peru",187);
        
        //Laticinios
        adicionaIngrediente(TIPO_LACTICINIOS,"Leite",42);
        adicionaIngrediente(TIPO_LACTICINIOS,"Queijo",380);
        adicionaIngrediente(TIPO_LACTICINIOS,"Iogurte",59);
        adicionaIngrediente(TIPO_LACTICINIOS,"Manteiga",717);
        adicionaIngrediente(TIPO_LACTICINIOS,"Leite condensado",321);
        adicionaIngrediente(TIPO_LACTICINIOS,"Nata culinária",206);
        adicionaIngrediente(TIPO_LACTICINIOS,"Ovos",147);
        
        //Peixe
        adicionaIngrediente(TIPO_PEIXE,"Atum",116);
        adicionaIngrediente(TIPO_PEIXE,"Bacalhau",82);
        adicionaIngrediente(TIPO_PEIXE,"Camarão",144);
        adicionaIngrediente(TIPO_PEIXE,"Cavala",167);
        adicionaIngrediente(TIPO_PEIXE,"Lulas",92);
        adicionaIngrediente(TIPO_PEIXE,"Salmão",146);
        adicionaIngrediente(TIPO_PEIXE,"Polvo",82);
        adicionaIngrediente(TIPO_PEIXE,"Sardinhas",217);
        adicionaIngrediente(TIPO_PEIXE,"Pescada",84);
        
        //Fruta
        adicionaIngrediente(TIPO_FRUTA,"Banana",89);
        adicionaIngrediente(TIPO_FRUTA,"Cereja",63);
        adicionaIngrediente(TIPO_FRUTA,"Figo",74);
        adicionaIngrediente(TIPO_FRUTA,"Framboesa",52);
        adicionaIngrediente(TIPO_FRUTA,"Laranja",47);
        adicionaIngrediente(TIPO_FRUTA,"Kiwi",61);
        adicionaIngrediente(TIPO_FRUTA,"Maçã",52);
        adicionaIngrediente(TIPO_FRUTA,"Manga",65);
        adicionaIngrediente(TIPO_FRUTA,"Morango",32);
        adicionaIngrediente(TIPO_FRUTA,"Pêra",58);
        adicionaIngrediente(TIPO_FRUTA,"Pêssego",39);
        
        //Leguminosas
        adicionaIngrediente(TIPO_LEGUMINOSAS,"Feijão",50);
        adicionaIngrediente(TIPO_LEGUMINOSAS,"Grão de Bico",180);
        adicionaIngrediente(TIPO_LEGUMINOSAS,"Lentilhas",353);
        
        //Lemgumes
        adicionaIngrediente(TIPO_VEGETAL,"Abóbora",26);
        adicionaIngrediente(TIPO_VEGETAL,"Batata",70);
        adicionaIngrediente(TIPO_VEGETAL,"Alface",14);
        adicionaIngrediente(TIPO_VEGETAL,"Azeitona",117);
        adicionaIngrediente(TIPO_VEGETAL,"Alho",149);
        adicionaIngrediente(TIPO_VEGETAL,"Brócolo",34);
        adicionaIngrediente(TIPO_VEGETAL,"Cebola",42);
        adicionaIngrediente(TIPO_VEGETAL,"Cenoura",41);
        adicionaIngrediente(TIPO_VEGETAL,"Cogumelo",22);
        adicionaIngrediente(TIPO_VEGETAL,"Couve",24);
        adicionaIngrediente(TIPO_VEGETAL,"Ervilha",81);
        adicionaIngrediente(TIPO_VEGETAL,"Espargo",20);
        adicionaIngrediente(TIPO_VEGETAL,"Milho",86);
        adicionaIngrediente(TIPO_VEGETAL,"Tomate",18);
        
        //Cereais
        adicionaIngrediente(TIPO_CEREAL,"Pão",259);
        adicionaIngrediente(TIPO_CEREAL,"Aveia",389);
        adicionaIngrediente(TIPO_CEREAL,"Arroz",129);
        adicionaIngrediente(TIPO_CEREAL,"Massa",157);
        
        //Oleos
        adicionaIngrediente(TIPO_OLEOS,"Azeite",884);
        adicionaIngrediente(TIPO_OLEOS,"Oleo vegetal",884);
        
        
        
        
        
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
    
    public ArrayList<Ingrediente> returnIngredientes(String tipo){
        ArrayList ingAux = new ArrayList<>();
        for(Ingrediente i: ingredientes){
            if(i.getClass().toString().equalsIgnoreCase(tipo)){
                ingAux.add(i);
            }
        }
        return ingAux;
    }
    
    public DefaultListModel<String> returnNomeIngredientes(String tipo){
        DefaultListModel<String> ingAux = new DefaultListModel<>();
        for(int i = 0; i < ingredientes.size(); i++){
            if(ingredientes.get(i).getClass().toString().equalsIgnoreCase("class LogicPackage.TipoAlimentos."+tipo)){
                ingAux.addElement(ingredientes.get(i).getNome());
            }
        }
        return ingAux;
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
