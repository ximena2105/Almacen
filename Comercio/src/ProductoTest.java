import junit.framework.TestCase;


public class ProductoTest extends TestCase {
    
	private Producto prod1;
	private Proveedores prov;
	
    public ProductoTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		prod1 = new Producto("P1", "Juego de Sartenes",2,"Juego de dos sartenes antiaderentes",15.21,prov);

	}

	protected void tearDown() throws Exception {
		prov=null;
		prod1=null;
	}

	public void testGetCodigo() {
		System.out.println("GetCodigo");
        String expResult = "P1";
        String result = prod1.getCodigo();
        assertEquals(expResult, result);
	}

	public void testGetNombre() {
		System.out.println("GetNombre");
        String expResult = "Juego de Sartenes";
        String result = prod1.getNombre();
        assertEquals(expResult, result);
	}

	public void testGetUnidades() {
		System.out.println("GetUnidades");
        int expResult = 2;
        int result = prod1.getUnidades();
        assertEquals(expResult, result);
	}

	public void testGetDetalles() {
		System.out.println("GetDetalles");
        String expResult = "Juego de dos sartenes antiaderentes";
        String result = prod1.getDetalles();
        assertEquals(expResult, result);

	}

	public void testGetPrecio() {
		System.out.println("GetPrecio");
        double expResult = 15.21;
        double result = prod1.getPrecio();
        assertEquals(expResult, result);
	}



	public void testSetNombre() {
		prod1.setNombre("Sarten");
	}

	public void testSetUnidades() {
		prod1.setUnidades(3);
	}

	public void testSetDetalles() {
		prod1.setDetalles("Sarten");
	}

	public void testSetPrecio() {
		prod1.setPrecio(12.2);
	}

}
