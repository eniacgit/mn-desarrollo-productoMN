package org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.camunda.bpm.menini_nicola.mn_desarrollo_productoMN.modelo.ProveedorMN;
import org.jfree.util.Log;

public class DAOProveedorMN {
	
	public DAOProveedorMN() {}
	
	public boolean existeProveedorMN(String tipoProveedor)
	{
		boolean existe= false;
		
		AccesoBD accesoBD= new AccesoBD();
		Connection con= accesoBD.conectarBD();
		Consultas consultas= new Consultas();
			
		return existe;
	}
	
	public void insertarProveedorMN(ProveedorMN proveedorProductoMN)
	{
		AccesoBD accesoBD= new AccesoBD();
		Connection con= accesoBD.conectarBD();
		Consultas consultas= new Consultas();
		String insert= consultas.insertarProveedorMN();
		try {
			PreparedStatement pstmt= con.prepareStatement(insert);
			pstmt.setString(1, proveedorProductoMN.getTipoProveedor());
			pstmt.setString(2, proveedorProductoMN.getMoneda());
			pstmt.setDouble(3, proveedorProductoMN.getPrecio());
			pstmt.setString(4, proveedorProductoMN.getIvaProveedor());
			pstmt.setString(5, proveedorProductoMN.getDetalles());
			pstmt.setInt(6, proveedorProductoMN.getIdProductoMNProveedor());
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e);
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Log.error(e);
				e.printStackTrace();
			}
		}
		
	}

}
