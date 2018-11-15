package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.controlador;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProductoMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProveedorMN;

public class IngresarProveedorDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//extraer valores desde 'ingresarProveedor-from.html' y mapear a objeto Java 
		//ProductoMN dataProductoMN = new ProductoMN();
		//dataProductoMN= (ProductoMN)execution.getVariable("dataProductoMN");
		
		ProveedorMN dataProveedor = new ProveedorMN();
		dataProveedor= (ProveedorMN)execution.getVariable("dataProveedor");
		
		
	}

}
