package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class IngresarProveedorDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//extraer valores desde 'ingresarProveedor-from.html' y mapear a objeto Java 
		ProductoMN dataProducto = new ProductoMN();
		dataProducto= (ProductoMN)execution.getVariable("dataProduct");
		
	}

}
