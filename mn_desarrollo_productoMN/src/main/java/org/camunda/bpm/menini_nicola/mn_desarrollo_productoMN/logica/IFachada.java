package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.logica;

import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMNProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProveedorMN;

public interface IFachada {

	int insertarProveedorMN(VOProveedorMN voProveedorMN);

	int insertarProductoMN(VOProductoMN voProductoMN);

	int insertarProductoMNProveedorMN(VOProductoMNProveedorMN voProductoMNproveedorMN);

}