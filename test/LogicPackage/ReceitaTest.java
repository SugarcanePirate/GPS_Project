
package LogicPackage;

import LogicPackage.TipoAlimentos.Carne;
import LogicPackage.TipoAlimentos.Peixe;

import java.util.ArrayList;
import org.junit.Test;
import junit.framework.TestCase;

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
        Carne carne = new Carne("Vaca", 100, 2);
        Peixe peixe = new Peixe("Salmão", 100, 2);
        ArrayList<Ingrediente> aux = new ArrayList<>();
        aux.add(carne);
        aux.add(peixe);
      assertEquals(aux, r.getIngredientes());
    }

    /**
     * Test of nPessoas method, of class Receita.
     */
    @Test
    public void testNPessoas() {
        inicializaReceita();
        int aux = 2;
        
        assertEquals(r.nPessoas(), aux);
    }

    /**
     * Test of getCalorias method, of class Receita.
     */
    @Test
    public void testGetCalorias() {
        inicializaReceita();
        int aux = 4;
        
        assertEquals(r.getCalorias(), aux);
    }

    /**
     * Test of getPassos method, of class Receita.
     */
    @Test
    public void testGetPassos() {
        inicializaReceita();
        
        assertEquals(r.getPassos(), "fazer primeiro refogado");
    }

    /**
     * Test of setNome method, of class Receita.
     */
    @Test
    public void testSetNome() {
        inicializaReceita();
        
        r.setNome("Carne Alentejana");
        
        assertEquals(r.getNome(), "Carne Alentejana");
    }

    /**
     * Test of setIngredientes method, of class Receita.
     */
    @Test
    public void testSetIngredientes() {
        inicializaReceita();
        Carne carne = new Carne("Lombo", 100, 2);
        Peixe peixe = new Peixe("Dourada", 100, 2);
        ArrayList<Ingrediente> aux1 = new ArrayList<>();
        aux1.add(carne);
        aux1.add(peixe);
        r.setIngredientes(aux1);
        
        assertEquals(r.getIngredientes(), aux1);
    }

    /**
     * Test of setNPessoas method, of class Receita.
     */
    @Test
    public void testSetNPessoas() {
        inicializaReceita();
        r.setNPessoas(8);
        
        assertEquals(r.nPessoas(), 8);
    }

    /**
     * Test of setcalorias method, of class Receita.
     */
    @Test
    public void testSetcalorias() {
        inicializaReceita();
        Carne carne = new Carne("Lombo", 100, 2);
        Peixe peixe = new Peixe("Dourada", 100, 2);
        ArrayList<Ingrediente> aux1 = new ArrayList<>();
        aux1.add(carne);
        aux1.add(peixe);
        Receita r1 = new Receita("Mista", ingredientes, 2, "fazer primeiro refogado");
        
        r1.setcalorias();
        assertEquals(r.getCalorias(), r1.getCalorias());
    }

    /**
     * Test of setPassos method, of class Receita.
     */
    @Test
    public void testSetPassos() {
        inicializaReceita();
        r.setPassos("nunca fazer refogado sem azeite");
        
        assertEquals(r.getPassos(), "nunca fazer refogado sem azeite");
    }
    
}
