
package LogicPackage;

import LogicPackage.TipoAlimentos.Peixe;
import static LogicPackage.Variables.TIPO_CARNE;
import static LogicPackage.Variables.TIPO_PEIXE;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class ModeloTest extends TestCase{
    
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Receita> receitas;
    private LivroReceitas livro;
    private Receita rec;
    private Peixe ing;
    private Modelo m;
   
    public void inicializaModelo(){
        ingredientes = new ArrayList<>();
        receitas  = new ArrayList<>();
        rec = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        ing = new Peixe("Salmão", 100, 2);
        receitas.add(rec);
        ingredientes.add(ing);
        livro = new LivroReceitas();
        livro.setReceitas(receitas);
        livro.setIngredientes(ingredientes);
        m = new Modelo();
        m.setLivroReceitas(livro);
    }
    
    /**
     * Test of adicionaIngrediente method, of class Modelo.
     */
    @Test
    public void testAdicionaIngrediente() {
        inicializaModelo();
        livro.adicionaIngrediente("Peixe", "sardinha", 100);
        ing = new Peixe("sardinha", 100, 2);
        assertEquals(livro.getIngrediente("sardinha"), ing);
    }

    /**
     * Test of adicionaReceitas method, of class Modelo.
     */
    @Test
    public void testAdicionaReceitas() {
        inicializaModelo();
        assertEquals(m.adicionaReceitas("bacalhau", ingredientes, 3, "Iniciar Receita"), true);
        assertEquals(m.adicionaReceitas("bacalhau", ingredientes, 3, "Iniciar Receita"), false);
    }
    /**
     * Test of pesquisaReceita method, of class Modelo.
     */
    @Test
    public void testPesquisaReceita() {
        inicializaModelo();
        ArrayList<ReceitaCompativel> receitasCompativeis;
        ArrayList<String> ing1 = new ArrayList<>();
        ing1.add("Salmão");
        ing1.add("Maçã");
        receitasCompativeis = m.pesquisaReceita(ing1);
        assertEquals(receitasCompativeis.size(), 1);
        
    }
    /**
     * Test of editaReceita method, of class Modelo.
     */
    @Test
    public void testEditaReceita() {
        inicializaModelo();
        Receita recAux = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        receitas.add(recAux);
        assertEquals(m.editaReceita(2, "Salmão", ingredientes, 2, "1ºPasso"), false);
        assertEquals(m.editaReceita(1, "Massa à bolonhesa", ingredientes, 2, "1ºPasso"), true);   
    }

    /**
     * Test of eliminaReceita method, of class Modelo.
     */
    @Test
    public void testEliminaReceita() {
        inicializaModelo();
        Receita recAux = new Receita("Nome", ingredientes, 2, "Iniciar Receita");
        receitas.add(recAux);
        assertEquals(livro.eliminaReceita(-1), false);
        assertEquals(livro.eliminaReceita(3), false);
        assertEquals(livro.eliminaReceita(1), true);
    }

    /**
     * Test of guardarReceitas method, of class Modelo.
     */
    @Test
    public void testGuardarReceitas() {
        inicializaModelo();
        assertEquals(m.guardarReceitas(), true);
    }

    /**
     * Test of recuperaReceitas method, of class Modelo.
     */
    @Test
    public void testRecuperaReceitas() {
        inicializaModelo();
        assertEquals(m.recuperaReceitas(), true);
    }

    /**
     * Test of criaPasta method, of class Modelo.
     */
    @Test
    public void testCriaPasta() {
        inicializaModelo();
        assertEquals(m.criaPasta(), 0);
    }

    /**
     * Test of getIngrediente method, of class Modelo.
     */
    @Test
    public void testGetIngrediente() {
        inicializaModelo();
        Ingrediente p;
        p = m.getIngrediente("Salmão");
        assertEquals(p, ing);
        p = m.getIngrediente("Ingrediente");
        assertEquals(p, null);
    }

    /**
     * Test of returnNomeIngredientes method, of class Modelo.
     */
    @Test
    public void testReturnNomeIngredientes() {
        inicializaModelo();
        DefaultListModel<String> ingAux;
        ingAux = m.returnNomeIngredientes(TIPO_PEIXE);
        assertEquals(ingAux.size(), 1);
        ingAux = m.returnNomeIngredientes(TIPO_CARNE);
        assertEquals(ingAux.size(), 0);
    }

    /**
     * Test of getLivroReceitas method, of class Modelo.
     */
    @Test
    public void testGetLivroReceitas() {
        inicializaModelo();
        Modelo m1;
        m1 = m;       
        assertEquals(m.getLivroReceitas(), m1.getLivroReceitas());
    }

    /**
     * Test of setLivroReceitas method, of class Modelo.
     */
    @Test
    public void testSetLivroReceitas() {
        inicializaModelo();
        m.setLivroReceitas(livro);
        assertEquals(m.getLivroReceitas(), livro);
    }
    
}
