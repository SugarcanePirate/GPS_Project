
package LogicPackage.TipoAlimentos;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrutaTest extends TestCase{
    
    private Fruta f;
    
    public void inicializaIngrediente(){
        f = new Fruta("Maçã", 45, 1);
    }
    
    @Test
    public void testEquals() {
        Fruta a = new Fruta("Maçã", 52, 2);
        inicializaIngrediente();
        assertEquals(f.equals(a), true);
    }

    
}
