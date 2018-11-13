package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.logica;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.Cliente;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.Presupuesto;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProductoMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProductoMNProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia.DAOCliente;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia.DAOPresupuesto;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia.DAOProductoMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia.DAOProductoMNProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia.DAOProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOCliente;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOPresupuesto;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMNProveedorMN;
import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProveedorMN;

public class Fachada implements IFachada {

    private static IFachada fachada;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Fachada() {
      
    }

    public static IFachada getInstanciaSingleton() {
        if (fachada == null){
            fachada = new Fachada();
        } 
        return fachada;
    }
    
    /* (non-Javadoc)
	 * @see org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.logica.IFachada#insertarProveedorMN(org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProveedorMN)
	 */
    @Override
	public int insertarProveedorMN(VOProveedorMN voProveedorMN)
    {
    	int rowCount=0;
    	ProveedorMN proveedorMN= new ProveedorMN();
    	DAOProveedorMN daoProveedorMN= new DAOProveedorMN();
    	
    	//desenvolver objeto value object
    	proveedorMN.setIdProveedorMN(voProveedorMN.getIdProveedorMN());
    	proveedorMN.setTipoProveedor(voProveedorMN.getTipoProveedor());
    	proveedorMN.setMoneda(voProveedorMN.getMoneda());
    	proveedorMN.setPrecio(voProveedorMN.getPrecio());
    	proveedorMN.setIvaProveedor(voProveedorMN.getIvaProveedor());
    	proveedorMN.setDetalles(voProveedorMN.getDetalles());
    	proveedorMN.setIdProductoMNProveedorMN(voProveedorMN.getIdProductoMNProveedorMN());
    	
    	//persistir a BD
    	rowCount=daoProveedorMN.insertarProveedorMN(proveedorMN);
    	
    	return rowCount;
    }
    
    /* (non-Javadoc)
	 * @see org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.logica.IFachada#insertarProductoMN(org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMN)
	 */
    @Override
	public int insertarProductoMN(VOProductoMN voProductoMN)
    {
    	int rowCount=0;
    	ProductoMN productoMN= new ProductoMN();
    	DAOProductoMN daoProductoMN= new DAOProductoMN();
     	
     	//desenvolver objeto value object
     	productoMN.setIdProductoMN(voProductoMN.getIdProductoMN());
     	productoMN.setTrabajoRealizado(voProductoMN.getTrabajoRealizado());
     	productoMN.setCantidad(voProductoMN.getCantidad());
     	productoMN.setNombre(voProductoMN.getNombre());
     	productoMN.setMoneda(voProductoMN.getMoneda());
     	productoMN.setTotal(voProductoMN.getTotal());
     	productoMN.setIvaProducto(voProductoMN.getIvaProducto());
     	productoMN.setProveedoresMN(voProductoMN.getProveedoresMN());
     	productoMN.setIdClientePresupuesto(voProductoMN.getIdClientePresupuesto());
     	productoMN.setIdProductoMNProveedorMN(voProductoMN.getIdProductoMNProveedorMN());
    	
     	//persistir a BD
     	rowCount= daoProductoMN.insertarProductoMN(productoMN);
    	
     	return rowCount;
    }
    
    /* (non-Javadoc)
	 * @see org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.logica.IFachada#insertarProductoMNProveedorMN(org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.valueObject.VOProductoMNProveedorMN)
	 */
    @Override
	public int insertarProductoMNProveedorMN(VOProductoMNProveedorMN voProductoMNproveedorMN)
    {
    	int rowCount=0;
    	ProductoMNProveedorMN productoMNProveedorMN= new ProductoMNProveedorMN();
    	DAOProductoMNProveedorMN daoProductoMNProveedorMN= new DAOProductoMNProveedorMN();
    	
    	//desenvolver objeto value object
    	productoMNProveedorMN.setIdProductoMNProveedorMN(voProductoMNproveedorMN.getIdProductoMNProveedorMN());
    	productoMNProveedorMN.setIdProductoMN(voProductoMNproveedorMN.getIdProductoMN());
    	productoMNProveedorMN.setIdProveedorMN(voProductoMNproveedorMN.getIdProveedorMN());
    	
    	//persistir a BD
    	rowCount= daoProductoMNProveedorMN.insertarProductoMNProveedorMN(productoMNProveedorMN);
    	
    	return rowCount;
    }
    
    public Cliente selectClientePresupuestoAprobado(VOPresupuesto voPresupuesto)
    {
    	Cliente cliente= new Cliente();
    	DAOCliente daoCliente= new DAOCliente();
    	
    	Integer idPresupuesto= voPresupuesto.getIdPresupuesto();
    	cliente= daoCliente.selectClientePresupuestoAprobado(idPresupuesto);
    	
    	return cliente;
    }
    
    public List<Presupuesto> selectPresupuestosAprobados()
    {
    	List<Presupuesto> presupuestosAprobados= new ArrayList<Presupuesto>();
    	DAOPresupuesto daoPresupuesto = new DAOPresupuesto();
    	
    	presupuestosAprobados= daoPresupuesto.selectPresupuestosAprobados();
    	
    	return presupuestosAprobados;
    }
    
}