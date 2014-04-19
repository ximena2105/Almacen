import junit.framework.TestCase;


public class ProveedoresTest extends TestCase {

	private Proveedores prov;
	protected void setUp() throws Exception {
		prov=new Proveedores("Pv1","Hermanos Torres","Mayorista de articulos de decoracion");
	}

	protected void tearDown() throws Exception {
		prov=null;
	}

	public void testGetCodigo() {
		System.out.println("Pv1");
        String expResult = "Pv1";
        String result = prov.getCodigo();
        assertEquals(expResult, result);
	}

	public void testGetNombre() {
		System.out.println("GetNombre");
        String expResult = "Hermanos Torres";
        String result = prov.getNombre();
        assertEquals(expResult, result);
	}


	public void testGetDetalles() {
		System.out.println("GetDetalles");
        String expResult = "Mayorista de articulos de decoracion";
        String result = prov.getDetalles();
        assertEquals(expResult, result);

	}
	public void testSetNombre() {
		prov.setNombre("Asociados OL");
	}

	public void testSetDetalles() {
	prov.setDetalles("Articulos de Decoracion");
	}

	public void testModificarProveedor() {
		prov.modificarProveedor("Asociados OL","Articulos de Decoracion");
	}

}
