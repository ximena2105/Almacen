// Clase proveedor con los detalles de cada uno de ellos
public class Proveedores {
	private String codigo;
    private String nombre;
    private String detalles;
    
    public Proveedores(String code, String title, String description) {
        this.codigo = code;
        this.nombre = title;
        this.detalles = description;
    }
    
    public String getCodigo() {
	return codigo;
    }
    
    public String getNombre() {
	return nombre;
    }
    public String getDetalles() {
      return detalles;
    }
  
    public void setNombre(String nomb) {
	this.nombre=nomb;
    }
    public void setDetalles(String detalle) {
      this.detalles=detalle;
    }
    public void modificarProveedor(String nomb,String detalle) {
    	this.nombre=nomb;
        this.detalles=detalle;
    }
    
	public void mostrarProveedor(){
		System.out.println("Codigo :"+codigo+" Nombre :"+nombre+" Detalles: "+detalles);
		System.out.println();
	}
	
}
