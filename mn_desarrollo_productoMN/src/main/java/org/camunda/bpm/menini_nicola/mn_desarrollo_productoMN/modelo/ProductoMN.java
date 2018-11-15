package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo;

import java.util.List;

public class ProductoMN {

	protected Integer idProductoMN;
	protected String trabajoRealizado; //ej. 'Fabricacion'-'Retapizado' 
	protected Integer cantidad; 
	protected String nombre; //ej. 'silla BE' 
	protected String moneda;
	protected Double total;
	protected String ivaProducto;
	protected List<ProveedorMN> proveedoresMN;
	protected Integer idClientePresupuesto;
	//private Integer idProductoMNProveedorMN;
	
	public ProductoMN() {
		super();
	}
	
	public ProductoMN(Integer idProductoMN, String trabajoRealizado, Integer cantidad, String nombre, String moneda,
			Double total, String ivaProducto, List<ProveedorMN> proveedoresMN, Integer idClientePresupuesto) {//,
			//Integer idProductoMNProveedorMN) {
		super();
		this.idProductoMN = idProductoMN;
		this.trabajoRealizado = trabajoRealizado;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.moneda = moneda;
		this.total = total;
		this.ivaProducto = ivaProducto;
		this.proveedoresMN = proveedoresMN;
		this.idClientePresupuesto = idClientePresupuesto;
		//this.idProductoMNProveedorMN = idProductoMNProveedorMN;
	}
	
	public Integer getIdProductoMN() {
		return idProductoMN;
	}

	public void setIdProductoMN(Integer idProductoMN) {
		this.idProductoMN = idProductoMN;
	}

	public String getTrabajoRealizado() {
		return trabajoRealizado;
	}

	public void setTrabajoRealizado(String trabajoRealizado) {
		this.trabajoRealizado = trabajoRealizado;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
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

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getIvaProducto() {
		return ivaProducto;
	}

	public void setIvaProducto(String ivaProducto) {
		this.ivaProducto = ivaProducto;
	}

	public List<ProveedorMN> getProveedoresMN() {
		return proveedoresMN;
	}

	public void setProveedoresMN(List<ProveedorMN> proveedoresMN) {
		this.proveedoresMN = proveedoresMN;
	}

	public Integer getIdClientePresupuesto() {
		return idClientePresupuesto;
	}

	public void setIdClientePresupuesto(Integer idClientePresupuesto) {
		this.idClientePresupuesto = idClientePresupuesto;
	}

	/*public Integer getIdProductoMNProveedorMN() {
		return idProductoMNProveedorMN;
	}

	public void setIdProductoMNProveedorMN(Integer idProductoMNProveedorMN) {
		this.idProductoMNProveedorMN = idProductoMNProveedorMN;
	}*/
		
}
