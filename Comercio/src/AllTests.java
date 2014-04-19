import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(AlmacenTest.class);
		suite.addTestSuite(ProductoTest.class);
		suite.addTestSuite(ProveedoresTest.class);
		suite.addTestSuite(VentasTest.class);
		//$JUnit-END$
		return suite;
	}

}
