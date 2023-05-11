
public class ProductoElectronico {

	
	private String nombre;
	private double precio;
	private int Stock;
	private String Marca;
	
	public ProductoElectronico(String nombre, double precio, int stock, String marca) {
		
		this.nombre = nombre;
		this.precio = precio;
		Stock = stock;
		Marca = marca;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	public int getStock() {return Stock;}
	public void setStock(int stock) {Stock = stock;}
	
	public String getMarca() {return Marca;}
	public void setMarca(String marca) {Marca = marca;}
	
	public void Venta(int uVendidas) {
		int res=Stock-uVendidas;
		if(res>0) {
			Stock=res;
		}else{
			Stock=0;
			System.out.println("No queda Stock");
			if(res<0) {
				System.out.println("Faltaron "+Math.abs(res)+ " unidades por vender");
			}
		}
	}
}
