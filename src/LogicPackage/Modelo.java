package LogicPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


/*
*Classe responsável pela ligação entre o livro de receitas e a GUI
 */
public class Modelo implements Variables {

    private LivroReceitas livroReceitas;

    public Modelo() {
        livroReceitas = new LivroReceitas();
    }

    /*
    *Método para adicionar um novo ingrediente á lista de ingredientes disponiveis
     */
    public boolean adicionaIngrediente(String tipo, String nome, int calorias) {
        return livroReceitas.adicionaIngrediente(tipo, nome, calorias);
    }

    /*
    *Método para adicionar uma nova receita á lista de receitas
     */
    public boolean adicionaReceitas(String nome, ArrayList<Ingrediente> ingredientes, int pessoas, String passos) {
        return livroReceitas.adicionaReceita(nome, ingredientes, pessoas, passos);
    }

    /*
    *Método para pesquisa de receitas
     */
    public ArrayList<ReceitaCompativel> pesquisaReceita(String[] ingredientes) {
        return livroReceitas.pesquisaReceitas(ingredientes);
    }

    public boolean editaReceita(int id, String nome, ArrayList<Ingrediente> ingredientes, int pessoas, String passos) {
        return livroReceitas.editaReceita(id, nome, ingredientes, pessoas, passos);
    }

    /*
    *Método para eliminar receita
     */
    public boolean eliminaReceita(String nome) {
        return livroReceitas.eliminaReceita(nome);
    }


    /*
    *Método para guardar informação das receitas numa directoria
     */
    public boolean guardarReceitas() {
        File directoria = new File(System.getProperty("user.home") + File.separator + DIRECTORIA);
        FileOutputStream fout;
        ObjectOutputStream out;

        if (!directoria.exists()) {
            return false;
        }

        try {
            String filePath = directoria.getCanonicalPath() + File.separator + LIVRO_RECEITAS;
            fout = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fout);
            out.writeObject(livroReceitas);
            out.close();
        } catch (IOException ex) {
            return false;
        }

        return true;
    }

    /*
    *Método para importar livro de receitas de uma directoria
     */
    public boolean recuperaReceitas() {
        File directoria = new File(System.getProperty("user.home") + File.separator + DIRECTORIA);
        FileInputStream fin;
        ObjectInputStream in;

        if (!directoria.exists()) {
            return false;
        }

        try {
            String filePath = directoria.getCanonicalPath() + File.separator + LIVRO_RECEITAS;
            fin = new FileInputStream(filePath);
            in = new ObjectInputStream(fin);
            livroReceitas = (LivroReceitas) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return false;
        }

        return true;
    }

    /*
    *Cria uma pasta para guardar a informação do livro de receitas;
     */
    public int criaPasta() {
        String nomeDirectoria = System.getProperty("user.home");

        nomeDirectoria = nomeDirectoria + File.separator + DIRECTORIA;

        File directoria = new File(nomeDirectoria);

        if (!directoria.exists()) {
            try {
                directoria.mkdir();
            } catch (Exception e) {
                return -1;
            }
        } else {
            return 0;
        }

        return 1;
    }

    /*
    *Getters
     */
    public LivroReceitas getLivroReceitas() {
        return livroReceitas;
    }

    /*
    *Setters
     */
    public void setLivroReceitas(LivroReceitas livroReceitas) {
        this.livroReceitas = livroReceitas;
    }
    public DefaultListModel<String> returnNomeIngredientes(String tipo){
        return livroReceitas.returnNomeIngredientes(tipo);
    }
}
