import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;


public class AlmacenTest extends TestCase {
	private Producto prod1;
	private Proveedores prov;
	private ArrayList<Producto> genero;
	
	protected void setUp() throws Exception {
		prod1 = new Producto("P1", "Juego de Sartenes",2,"Juego de dos sartenes antiaderentes",15.21,prov);
		genero=new ArrayList();
	}

	protected void tearDown() throws Exception {
		prod1=null;
		genero=null;
	}

	public void testAddArticulo() {
		genero.add(prod1);
	}

	public void testGetNumeroArticulos() {
		System.out.println("GetNumeroArticulos");
        int expResult = 0;
        int result = genero.size();
        assertEquals(expResult, result);
	}

	public void testGetNumeroStock() {
		int numero = 0;
		 int result=0;
		for (Iterator<Producto> i = genero.iterator(); i.hasNext();) {
		    Producto articulo = (Producto)i.next();
		    result=articulo.getUnidades();
		}
		assertEquals(numero, result);
	}

	public void testEmpty() {
		genero.clear();
	}
}
