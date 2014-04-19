
//Clase Producto donde se detalla las propiedades de cada uno de los articulos.

public class Producto {
	    private String codigo;
	    private String nombre;
	    private int unidades;
	    private String detalles;
	    private double precio;
	    private Proveedores proveedor;
	    
	    public Producto(String code, String title,int unidad, String description, double price,Proveedores proveedores) {
	        this.codigo = code;
	        this.nombre = title;
	        this.unidades=unidad;
	        this.detalles = description;
	        this.precio = price;
	        this.proveedor=proveedores;
	    }
	    
	    public String getCodigo() {
	    	return codigo;
	    }
	    
	    public String getNombre() {
	    	return nombre;
	    }
	    public int getUnidades(){
	    	return unidades;
	    }
	    public String getDetalles() {
	      return detalles;
	    }
	    public double getPrecio() {
		return precio;
	    }
	    public Proveedores getProveedor() {
			return proveedor;
		}
	    
	    
	    public void setNombre(String nom) {
		    this.nombre=nom;
	    }
		public void setUnidades(int unidad){
		    	this.unidades=unidad;
		}
		public void setDetalles(String detalle) {
		      this.detalles=detalle;
		}
		public void setPrecio(double prec) {
			this.precio=prec;
		}
		public void setProveedor(Proveedores prov) {
				this.proveedor=prov;
		}
		
		public void mostrarProductoVenta(){
			System.out.println("Codigo :"+codigo+" Nombre :"+nombre+" Precio: "+precio);
			System.out.println();
		}
		public void mostrarProducto(){
			System.out.println("Codigo :"+codigo+" Nombre :"+nombre+" Detalles: "+detalles+" Unidades :"+unidades+" Precio :"+precio);
		}
}
