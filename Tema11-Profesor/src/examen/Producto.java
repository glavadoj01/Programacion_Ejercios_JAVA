package examen;

public class Producto {

	private String codigoProducto;
	private String nombreProducto;
	private String categoriaProducto;
	private String escala;
	private String vendedor;
	private String descripcion;
	private int unidadesStock;
	private double precioCompra;
	private double precioVenta;

	public Producto(String codigoProducto, String nombreProducto, String categoriaProducto, String escala,
			String vendedor, String descripcion, int unidadesStock, double precioCompra, double prcioVenta) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.categoriaProducto = categoriaProducto;
		this.escala = escala;
		this.vendedor = vendedor;
		this.descripcion = descripcion;
		this.unidadesStock = unidadesStock;
		this.precioCompra = precioCompra;
		this.precioVenta = prcioVenta;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidadesStock() {
		return unidadesStock;
	}

	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return codigoProducto + ", " + nombreProducto
				+ ", " + categoriaProducto + ", " + escala + ", " + vendedor
				+ ", " + descripcion + ", " + unidadesStock + ", " + precioCompra
				+ ", " + precioVenta;
	}

}
