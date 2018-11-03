package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN;

public class ProductoMN {

	private String proveedor;
	private String moneda;
	private float monto;
	private boolean ivaIncluido;
	private String detalles;
	
	public String getProveedor() {
		return proveedor;
	}
	
	public ProductoMN(String proveedor, String moneda, float monto, boolean ivaIncluido, String detalles) {
		super();
		this.proveedor = proveedor;
		this.moneda = moneda;
		this.monto = monto;
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
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
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