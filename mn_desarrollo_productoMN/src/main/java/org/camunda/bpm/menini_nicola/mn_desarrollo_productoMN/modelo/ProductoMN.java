package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo;

import java.util.List;

public class ProductoMN {

	private String trabajoRealizado; //ej. 'Fabricacion'-'Retapizado' 
	private int cantidad; 
	private String nombre; //ej. 'silla BE'
	private List<ProveedorProductoMN> proveedores; 
	private String moneda;
	private double subtotal;
	private String ivaProducto;
	
}
