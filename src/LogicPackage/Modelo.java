package LogicPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Modelo implements Variables {

    private LivroReceitas livroReceitas;

    public Modelo() {
        livroReceitas = new LivroReceitas();
    }

    /*
    *Método para adicionar um novo ingrediente á lista de ingredientes disponiveis
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

        return livroReceitas.adicionaIngrediente(obj);
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
}
