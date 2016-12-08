
package LogicPackage;

import LogicPackage.TipoAlimentos.Carne;
import LogicPackage.TipoAlimentos.Peixe;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.Test;

public class ReceitaCompativelTest extends TestCase{

    private ReceitaCompativel rcompativel;
    private Receita r;
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    
    public void inicializaReceitaCompativel(){
        Carne carne = new Carne("Vaca", 100, 2);
        Peixe peixe = new Peixe("Salmão", 100, 2);
        ingredientes.add(carne);
        ingredientes.add(peixe);
        r = new Receita("Mista", ingredientes, 2, "fazer primeiro refogado");
        rcompativel = new ReceitaCompativel(r, 50, 1);
    }
    
    /**
     * Test of getReceita method, of class ReceitaCompativel.
     */
    @Test
    public void testGetReceita() {
        inicializaReceitaCompativel();
        Receita aux;
        aux = rcompativel.getReceita();
        assertEquals(aux.getNome(), "Mista");
    }

    /**
     * Test of getPercentagem method, of class ReceitaCompativel.
     */
    @Test
    public void testGetPercentagem() {
        inicializaReceitaCompativel();
        int aux;
        aux = rcompativel.getPercentagem();
        assertEquals(aux, 50);
    }

    /**
     * Test of getId method, of class ReceitaCompativel.
     */
    @Test
    public void testGetId() {
        inicializaReceitaCompativel();
        int aux;
        aux = rcompativel.getId();
        assertEquals(aux, 1);
    }

    /**
     * Test of setReceita method, of class ReceitaCompativel.
     */
    @Test
    public void testSetReceita() {
        inicializaReceitaCompativel();
        rcompativel.setReceita(r);
        assertEquals(rcompativel.getReceita(), r);
    }

    /**
     * Test of setPercentagem method, of class ReceitaCompativel.
     */
    @Test
    public void testSetPercentagem() {
        inicializaReceitaCompativel();
        rcompativel.setPercentagem(20);
        assertEquals(rcompativel.getPercentagem(), 20);
    }

    /**
     * Test of compareTo method, of class ReceitaCompativel.
     */
    @Test
    public void testCompareTo() {
        inicializaReceitaCompativel();
        Receita r_aux = new Receita("Mista", ingredientes, 2, "fazer primeiro refogado");
        ReceitaCompativel rc_aux = new ReceitaCompativel(r, 70, 1);
        assertEquals(rcompativel.compareTo(rc_aux), 20); 
    }
    
}
