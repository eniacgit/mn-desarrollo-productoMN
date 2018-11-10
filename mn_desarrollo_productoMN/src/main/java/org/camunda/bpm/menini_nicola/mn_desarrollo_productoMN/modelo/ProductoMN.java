package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo;

import java.util.List;

public class ProductoMN {

	private int idProductoMN;
	private String trabajoRealizado; //ej. 'Fabricacion'-'Retapizado' 
	private int cantidad; 
	private String nombre; //ej. 'silla BE' 
	private String moneda;
	private double total;
	private String ivaProducto;
	private List<ProveedorMN> proveedores;
	
	public ProductoMN() {
		super();
	}
	
	public ProductoMN(int idProductoMN, String trabajoRealizado, int cantidad, String nombre, String moneda,
			double total, String ivaProducto, List<ProveedorMN> proveedores) {
		super();
		this.idProductoMN = idProductoMN;
		this.trabajoRealizado = trabajoRealizado;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.moneda = moneda;
		this.total = total;
		this.ivaProducto = ivaProducto;
		this.proveedores = proveedores;
	}
	
	public int getIdProductoMN() {
		return idProductoMN;
	}
	public void setIdProductoMN(int idProductoMN) {
		this.idProductoMN = idProductoMN;
	}
	public String getTrabajoRealizado() {
		return trabajoRealizado;
	}
	public void setTrabajoRealizado(String trabajoRealizado) {
		this.trabajoRealizado = trabajoRealizado;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getIvaProducto() {
		return ivaProducto;
	}
	public void setIvaProducto(String ivaProducto) {
		this.ivaProducto = ivaProducto;
	}
	public List<ProveedorMN> getProveedores() {
		return proveedores;
	}
	public void setProveedores(List<ProveedorMN> proveedores) {
		this.proveedores = proveedores;
	}
	
}
