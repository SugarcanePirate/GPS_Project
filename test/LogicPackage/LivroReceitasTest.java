
package LogicPackage;

import LogicPackage.TipoAlimentos.Peixe;
import static LogicPackage.Variables.TIPO_CARNE;
import static LogicPackage.Variables.TIPO_PEIXE;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.junit.Test;
import static org.junit.Assert.*;

public class LivroReceitasTest {
    
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Receita> receitas;
    private LivroReceitas livro;
    private Receita rec;
    private Peixe ing;
   
    public void inicializaLivroReceitas(){
        ingredientes = new ArrayList<>();
        receitas  = new ArrayList<>();
        rec = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        ing = new Peixe("Salmão", 100, 2);
        receitas.add(rec);
        ingredientes.add(ing);
        livro = new LivroReceitas();
        livro.setReceitas(receitas);
        livro.setIngredientes(ingredientes);
    }
    
    /**
     * Test of adicionaReceitas method, of class LivroReceitas.
     */
    @Test
    public void testAdicionaReceita() {
        inicializaLivroReceitas();
        assertEquals(livro.adicionaReceita("Nome", ingredientes, 2, "Iniciar Receita"), false);
        assertEquals(livro.adicionaReceita("Nome2", ingredientes, 2, "Iniciar Receita"), true);
    }

    /**
     * Test of pesquisaReceitas method, of class LivroReceitas.
     */
    @Test
    public void testPesquisaReceitas() {
        inicializaLivroReceitas();
        ArrayList<ReceitaCompativel> receitasCompativeis = new ArrayList<>();
        ArrayList<String> ing = new ArrayList<>();
        ing.add("Salmão");
        ing.add("Maçã");
        receitasCompativeis = livro.pesquisaReceitas(ing);
        assertEquals(receitasCompativeis.size(), 1);
    }

    /**
     * Test of adicionaIngrediente method, of class LivroReceitas.
     */
    @Test
    public void testAdicionaIngrediente() {
        inicializaLivroReceitas();
        assertEquals(livro.adicionaIngrediente(TIPO_CARNE, "Vaca", 100), true);
        assertEquals(livro.adicionaIngrediente("nome", "Vaca", 100), false);
    }

    /**
     * Test of returnNomeIngredientes method, of class LivroReceitas.
     */
    @Test
    public void testReturnNomeIngredientes() {
        inicializaLivroReceitas();
        DefaultListModel<String> ingAux;
        ingAux = livro.returnNomeIngredientes(TIPO_PEIXE);
        assertEquals(ingAux.size(), 1);
        ingAux = livro.returnNomeIngredientes(TIPO_CARNE);
        assertEquals(ingAux.size(), 0);
    }

    /**
     * Test of editaReceita method, of class LivroReceitas.
     */
    @Test
    public void testEditaReceita() {
        inicializaLivroReceitas();
        Receita recAux = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        receitas.add(recAux);
        Boolean aux = livro.editaReceita(2, "Salmão", ingredientes, 2, "1ºPasso");
        Boolean aux1 = livro.editaReceita(1, "Massa à bolonhesa", ingredientes, 2, "1ºPasso");
        assertEquals(aux, false);
        assertEquals(aux1, true);
    }

    /**
     * Test of eliminaReceita method, of class LivroReceitas.
     */
    @Test
    public void testEliminaReceita() {
        inicializaLivroReceitas();
        Receita recAux = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        receitas.add(recAux);
        Boolean aux = livro.eliminaReceita(-1);
        Boolean aux1 = livro.eliminaReceita(3);
        Boolean aux2 = livro.eliminaReceita(1);
        assertEquals(aux, false);
        assertEquals(aux1, false);
        assertEquals(aux2, true);
    }

    /**
     * Test of getIngrediente method, of class LivroReceitas.
     */
    @Test
    public void testGetIngrediente() {
        inicializaLivroReceitas();
        Ingrediente p;
        p = livro.getIngrediente("Salmão");
        assertEquals(p, ing);
        p = livro.getIngrediente("Ingrediente");
        assertEquals(p, null);
    }

    /**
     * Test of getReceitas method, of class LivroReceitas.
     */
    @Test
    public void testGetReceitas() {
        inicializaLivroReceitas();
        ArrayList<Receita> aux;
        aux = livro.getReceitas();
        assertEquals(aux, receitas);
    }

    /**
     * Test of getIngredientes method, of class LivroReceitas.
     */
    @Test
    public void testGetIngredientes() {
        inicializaLivroReceitas();
        ArrayList<Ingrediente> aux;
        aux = livro.getIngredientes();
        assertEquals(aux, ingredientes);
    }

    /**
     * Test of setReceitas method, of class LivroReceitas.
     */
    @Test
    public void testSetReceitas() {
        inicializaLivroReceitas();
        livro.setReceitas(receitas);
        assertEquals(livro.getReceitas(), receitas);
    }
    
    /**
     * Test of setIngredientes method, of class LivroReceitas.
     */
    @Test
    public void testSetIngredientes() {
        inicializaLivroReceitas();
        livro.setIngredientes(ingredientes);
        assertEquals(livro.getIngredientes(), ingredientes);
    }
    
}
