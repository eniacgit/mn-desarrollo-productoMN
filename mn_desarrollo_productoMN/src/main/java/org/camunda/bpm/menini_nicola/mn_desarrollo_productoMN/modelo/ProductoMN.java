package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo;

public class ProductoMN {

	private String proveedor;
	private String moneda;
	private float precio;
	private boolean ivaIncluido;
	private String detalles;
	
	public String getProveedor() {
		return proveedor;
	}
	
	public ProductoMN(String proveedor, String moneda, float precio, boolean ivaIncluido, String detalles) {
		super();
		this.proveedor = proveedor;
		this.moneda = moneda;
		this.precio = precio;
		this.ivaIncluido = ivaIncluido;
		this.detalles = detalles;
	}
	
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public float getprecio() {
		return precio;
	}
	public void setprecio(float precio) {
		this.precio = precio;
	}
	public boolean isIvaIncluido() {
		return ivaIncluido;
	}
	public void setIvaIncluido(boolean ivaIncluido) {
		this.ivaIncluido = ivaIncluido;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public ProductoMN() {
		super();
	}
	
}