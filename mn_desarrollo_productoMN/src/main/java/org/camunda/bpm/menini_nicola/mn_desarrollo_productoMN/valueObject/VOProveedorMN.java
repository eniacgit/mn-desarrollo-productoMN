package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject;

public class VOProveedorMN {
	
	private int idProveedorMN;
	private String tipoProveedor;
	private String moneda;
	private double precio;
	private String ivaProveedor;
	private String detalles;
	private int idProductoMNProveedor;
	
	public VOProveedorMN(int idProveedorMN, String tipoProveedor, String moneda, double precio, String ivaProveedor,
			String detalles, int idProductoMNProveedor) {
		super();
		this.idProveedorMN = idProveedorMN;
		this.tipoProveedor = tipoProveedor;
		this.moneda = moneda;
		this.precio = precio;
		this.ivaProveedor = ivaProveedor;
		this.detalles = detalles;
		this.idProductoMNProveedor = idProductoMNProveedor;
	}

	public VOProveedorMN() {
		super();
	}

	public int getIdProveedorMN() {
		return idProveedorMN;
	}

	public void setIdProveedorMN(int idProveedorMN) {
		this.idProveedorMN = idProveedorMN;
	}

	public String getTipoProveedor() {
		return tipoProveedor;
	}

	public void setTipoProveedor(String tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIvaProveedor() {
		return ivaProveedor;
	}

	public void setIvaProveedor(String ivaProveedor) {
		this.ivaProveedor = ivaProveedor;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public int getIdProductoMNProveedor() {
		return idProductoMNProveedor;
	}

	public void setIdProductoMNProveedor(int idProductoMNProveedor) {
		this.idProductoMNProveedor = idProductoMNProveedor;
	}

}
