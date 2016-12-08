/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPackage;

import LogicPackage.Receita;
import LogicPackage.Ingrediente;
import LogicPackage.TipoAlimentos.Carne;
import LogicPackage.TipoAlimentos.Peixe;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
/**
 *
 * @author joaom
 */
public class ReceitaTest extends TestCase{
       
    private Receita r;
    private ArrayList<Ingrediente> ingredientes;
        
    public void inicializaReceita(){
        Carne carne = new Carne("Vaca", 100, 2);
        Peixe peixe = new Peixe("Salmão", 100, 2);
        ingredientes = new ArrayList<>();
        ingredientes.add(carne);
        ingredientes.add(peixe);
        r = new Receita("Mista", ingredientes, 2, "fazer primeiro refogado");
    }
    /**
     * Test of comparaIngredientes method, of class Receita.
     */
    @Test
    public void testComparaIngredientes() {
        inicializaReceita();
        
        ArrayList<String> s = new ArrayList<>();
        s.add("Vaca");
        s.add("Porco");
        
        int aux = r.comparaIngredientes(s);
        
        assertEquals(aux, 50);
    }

    /**
     * Test of getNome method, of class Receita.
     */
    @Test
    public void testGetNome() {
        inicializaReceita();
        String s = r.getNome();
        assertEquals("Mista", s);
    }

    /**
     * Test of getIngredientes method, of class Receita.
     */
    @Test
    public void testGetIngredientes() {
        inicializaReceita();
        
    }

    /**
     * Test of nPessoas method, of class Receita.
     */
    @Test
    public void testNPessoas() {
        System.out.println("nPessoas");
        Receita instance = null;
        int expResult = 0;
        int result = instance.nPessoas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalorias method, of class Receita.
     */
    @Test
    public void testGetCalorias() {
        System.out.println("getCalorias");
        Receita instance = null;
        int expResult = 0;
        int result = instance.getCalorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassos method, of class Receita.
     */
    @Test
    public void testGetPassos() {
        System.out.println("getPassos");
        Receita instance = null;
        String expResult = "";
        String result = instance.getPassos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Receita.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Receita instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredientes method, of class Receita.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        ArrayList<Ingrediente> ingredientes = null;
        Receita instance = null;
        instance.setIngredientes(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNPessoas method, of class Receita.
     */
    @Test
    public void testSetNPessoas() {
        System.out.println("setNPessoas");
        int nPessoas = 0;
        Receita instance = null;
        instance.setNPessoas(nPessoas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcalorias method, of class Receita.
     */
    @Test
    public void testSetcalorias() {
        System.out.println("setcalorias");
        Receita instance = null;
        instance.setcalorias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassos method, of class Receita.
     */
    @Test
    public void testSetPassos() {
        System.out.println("setPassos");
        String passos = "";
        Receita instance = null;
        instance.setPassos(passos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
