import java.util.HashMap;
import java.util.Map.Entry;


import junit.framework.TestCase;


public class VentasTest extends TestCase {
	  private HashMap<Producto,Integer> articulos;
	  private Producto prod1;
	  private Proveedores prov;
	
	  protected void setUp() throws Exception {
		articulos = new HashMap<Producto,Integer>();
		prod1 = new Producto("P1", "Juego de Sartenes",2,"Juego de dos sartenes antiaderentes",15.21,prov);

	  }

	protected void tearDown() throws Exception {
		articulos=null;
		prod1=null;
	}

	public void testGetBalance() {
		double balance = 15.21;
		java.util.Iterator<Entry<Producto, Integer>> it = ( articulos).entrySet().iterator();
		while (it.hasNext()) {
		    Producto item = (Producto)it.next();
		    balance += item.getPrecio()*articulos.get(item);
		}
		
	}

	public void testAddArticulo() {
		articulos.put(prod1, 1);
	}

	public void testRemoveArticulo() {
		articulos.remove(0);
	}

	public void testGetNumeroArticulos() {
		System.out.println("GetNumeroArticulos");
        int expResult = 0;
        int result = articulos.size();
        assertEquals(expResult, result);
	}

	public void testEmpty() {
		articulos.clear();
	}

}
