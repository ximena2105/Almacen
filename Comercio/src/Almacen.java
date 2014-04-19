import java.util.ArrayList;
import java.util.Iterator;

//Detalles del almacen, numero de productos, cantidad de un producto....
public class Almacen {
    private ArrayList<Producto> genero;
    
 public Almacen() {
	 genero = new ArrayList<Producto>();
 }
 

 public void addArticulo(Producto articulo) {
	 genero.add(articulo);
 }
 
 public void removeArticulo(Producto articulo) {
	 genero.remove(articulo);
 }
 public void consultaProductos(){
	 System.out.println("Los productos que se encuentran en el almacen son:");
		for (Iterator<Producto> i = genero.iterator(); i.hasNext();) {
		    Producto articulo = i.next();
		    articulo.mostrarProducto();
		}
 }
 public void modificarProducto(String Codigo, String nombre, int unidades, String detalles, double precio){
	
		for (Iterator<Producto> i = genero.iterator(); i.hasNext();) {
		    Producto articulo = (Producto)i.next();
		    if(articulo.getCodigo().equals(Codigo)){
		    	articulo.setDetalles(detalles);
		    	articulo.setNombre(nombre);
		    	articulo.setPrecio(precio);
		    	articulo.setUnidades(unidades);		    	
		    }
		}
 }
 public int getNumeroArticulos() {
	return genero.size();
 }
 
 public int getNumeroStock(String codigo) {
		int numero = 0;
		for (Iterator<Producto> i = genero.iterator(); i.hasNext();) {
		    Producto articulo = (Producto)i.next();
		    if(articulo.getCodigo().equals(codigo)){return articulo.getUnidades();};
		}
	return numero;
 }	
 
 public void setNumeroStock(String codigo, int unidad) {
		for (Iterator<Producto> i = genero.iterator(); i.hasNext();) {
		    Producto articulo = (Producto)i.next();
		    if(articulo.getCodigo().equals(codigo)){articulo.setUnidades(unidad);};
		}
}	
 
 public void empty() {
	 genero.clear();
 } 
}
