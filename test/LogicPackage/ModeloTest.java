/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPackage;

import LogicPackage.TipoAlimentos.Peixe;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joaom
 */
public class ModeloTest extends TestCase{
    /**
     * Test of adicionaIngrediente method, of class Modelo.
     */
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
        
    }

    /**
     * Test of getLivroReceitas method, of class Modelo.
     */
    @Test
    public void testGetLivroReceitas() {
        inicializaModelo();
        Modelo m1 = new Modelo();
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
