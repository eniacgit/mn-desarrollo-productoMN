package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia;

public class Consultas {
	
	//CONSULTAS TABLA: mn_productoMN
	public String insertarProductoMN()
	{
		String insert="INSERT INTO mn_productoMN(trabajoRealizado,cantidad,nombre,moneda,total,ivaProducto,idClientePresupuesto,idProductoMNProveedorMN)\n" + 
				"VALUES (?,?,?,?,?,?,?,?);";
		return insert;
	}
	
	//CONSULTAS TABLA: mn_productoMN_proveedorMN
	public String insertarProductoMNProveedorMN()
	{
		String insert="INSERT INTO mn_productoMN_proveedorMN(idProductoMN,idProveedorMN) VALUES (?,?)";
		return insert;
	}
	//CONSULTAS TABLA: mn_proveedorMN
	public String insertarProveedorMN()
	{
		String insert="INSERT INTO mn_proveedorMN(tipoProveedor,moneda,precio,ivaProveedor,detalles,idProductoMNProveedorMN)\n" + 
				"VALUES (?,?,?,?,?,?);";
		
		return insert;
	}
	
}
