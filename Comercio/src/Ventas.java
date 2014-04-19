
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Ventas {
       private HashMap<Producto,Integer> genero;
       private int codigo;
       
 public Ventas(int code) {
	 genero = new HashMap<Producto,Integer>();
	 this.codigo=code;
 }
 
 public double getBalance() {
	double balance = 0.00;
	Iterator<Entry<Producto, Integer>> it = genero.entrySet().iterator();
	while (it.hasNext()) {
		Producto key = it.next().getKey();
		balance += key.getPrecio()*genero.get(key);
	}
	return balance;
 }
	
 public void addArticulo(Producto articulo,int numero) {
	 genero.put(articulo,numero);
 }
 
 public void removeArticulo(Producto articulo) {
	 genero.remove(articulo);
 }
 
 public int getNumeroArticulos() {
	return genero.size();
 }
	
 public void empty() {
	 genero.clear();
 }   
 public void mostrarVenta(){
	 	System.out.println("Codigo de la Venta: "+codigo);
		System.out.println("-------------------------------------");
	 	Iterator<Entry<Producto, Integer>> it = genero.entrySet().iterator();
		while (it.hasNext()) {
			Producto key = it.next().getKey();
			System.out.print("Unidades :"+genero.get(key)+"  ");
			key.mostrarProductoVenta();
		}
 }
 
}
