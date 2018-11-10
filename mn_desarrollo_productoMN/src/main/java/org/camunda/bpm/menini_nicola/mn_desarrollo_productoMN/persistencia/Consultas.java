package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia;

public class Consultas {
	public String insertarProveedorMN()
	{
		String insert="INSERT INTO mn_proveedorMN(tipoProveedor,moneda,precio,ivaProveedor,detalles,idProductoMNProveedor)\n" + 
				"VALUES (?,?,?,?,?,?);";
		
		return insert;
	}
}
