import java.util.ArrayList;

//Clase principal del programa, desde donde se controlaran todas las clases
public class Comercio {

  
	 public static void main(String [ ] args)
	 {
		 //Creamos una serie de elementos para probar todos los metodos de las clases
		 Ventas productosVendidos = new Ventas(1);
		 Almacen genero= new Almacen();
		 ArrayList<Proveedores> proveedor= new ArrayList<Proveedores>();
		 
		 Proveedores prov = new Proveedores("1","Hermanos Lopez","Mayoristas de articulos de cocina");
	     Producto prod1 = new Producto("12","Cuberteria Plata",3,"Cuberteria de 40 piezas de plata",25,prov);
	     Producto prod2 = new Producto("13","Copas de Cristal",4,"Cuatro copas de cristal fino",8,prov);
	       
	     proveedor.add(prov);
	     genero.addArticulo(prod1);
	     genero.addArticulo(prod2);
	     productosVendidos.addArticulo(prod1, 1);
	     productosVendidos.addArticulo(prod2, 2);
	     
	     //Metodos del Almacen
	     genero.consultaProductos( );
	     genero.modificarProducto(prod2.getCodigo(), prod2.getNombre(),7, prod2.getDetalles(),7);
	     genero.getNumeroArticulos();
	     genero.getNumeroStock(prod2.getCodigo());
	     genero.setNumeroStock(prod2.getCodigo(), 6);	
	     genero.empty(); 
	     
	     //Metodos Proveedor
	     Proveedores p=proveedor.get(0);

         System.out.println("Los datos del Proveedor :");
	     p.mostrarProveedor();
	     p.modificarProveedor("ASOCIADOS Lopez", "Mayorista de mobiliario y articulos de cocina");
	     proveedor.remove(0);
	     
	     //Metodos Ventas
         productosVendidos.addArticulo(prod1,2);
         productosVendidos.addArticulo(prod2,2);
         productosVendidos.mostrarVenta();
         double num= productosVendidos.getBalance();
         System.out.println("El balance de la Venta es :"+num);
         productosVendidos.removeArticulo(prod1);

         productosVendidos.mostrarVenta();
         num=productosVendidos.getBalance();
         System.out.println("El balance de la Venta es :"+num);	 
         productosVendidos.empty();

	 }
 
 
}
