package co.edu.javeriana.fdb.personapp.model.dao.impl;


import co.edu.javeriana.fdb.personapp.model.dao.TelefonoDAO;
import co.edu.javeriana.fdb.personapp.model.dto.PersonaDTO;
import co.edu.javeriana.fdb.personapp.model.dto.TelefonoDTO;
import co.edu.javeriana.fdb.personapp.util.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class TelefonoDAOImpl implements TelefonoDAO{

	private final MySQL mysql;

    public TelefonoDAOImpl() {
        this.mysql = new MySQL();
    }
    @Override
    public TelefonoDTO create(TelefonoDTO telefono) {
    	try {
            this.mysql.conectar();
            String query = "INSERT INTO telefono(numero,operador,duenio) VALUES("
                    + "'" + telefono.getNumero() + "',"
                    + "'" + telefono.getOperador()+ "',"
                    + "'" + telefono.getDuenio() +"');";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            switch (code) {
                case 1:
                	JOptionPane.showMessageDialog(null,"Se creo el telefono");
                    System.out.println("Se creo el telefono");
                    
                default:
                    return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public TelefonoDTO edit(String numero, TelefonoDTO telefono) {
    	try {
            this.mysql.conectar();
            String query =  "UPDATE persona SET "
                    + "numero = '" + telefono.getNumero() + "',"
                    + "operador ='" + telefono.getOperador()+ "',"
                    + "duenio ='" + telefono.getDuenio() +"'" + " where cedula =" + numero;
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            switch (code) {
                case 1:
                	JOptionPane.showMessageDialog(null,"Se edito el telefono");
                    System.out.println("Se edito el telefono");
                    return findById(telefono.getNumero());
                default:
                    return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Boolean delete(String numero) {
    	try {
            this.mysql.conectar();
            String query = "DELETE FROM telefono where numero =" + numero;
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            switch (code) {
                case 1:
                	JOptionPane.showMessageDialog(null,"Se elimino la fila");
                    System.out.println("Se elimo la fila donde numero ="+numero);
                default:
                    return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        
    }
    }
     @Override
    public TelefonoDTO findById(String numero) {
    	try {
            this.mysql.conectar();
            String query = "SELECT * FROM telefono WHERE numero = '" + numero + "';";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
                    if (rs.first()) {
                TelefonoDTO telefono = new TelefonoDTO(
                        rs.getString("numero"),
                        rs.getString("operador"),
                        rs.getString("dunio"));
                rs.close();
                stmt.close();
                return telefono;
            } else {
                rs.close();
                stmt.close();
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
	@Override
	public List<TelefonoDTO> findByDuenio(Long cedulaDuenio) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<TelefonoDTO> findAll() {
        List<TelefonoDTO> telefonos= new ArrayList<>();
        TelefonoDTO telefono=null;
        try {
        	String query="SELECT * FROM telefono;";
        	System.out.println(query);
        	this.mysql.conectar();
        	Statement stmt= this.mysql.getConnection().createStatement();
        	ResultSet rs =stmt.executeQuery(query);
        	while(rs.next()) {
        		telefono= new TelefonoDTO(
        				 rs.getString("numero"),
                         rs.getString("operador"),
                         rs.getString("duenio"));
        		telefonos.add(telefono);
        	}
        	rs.close();
        	stmt.close();
        	this.mysql.desconectar();
        	System.out.println("Se obtuvieron las personas");
        	JOptionPane.showMessageDialog(null,"Se obtuvieron las personas");
       }catch(SQLTimeoutException e) {
	telefonos=new ArrayList<>();
	System.out.println("no se obtuvieron las personas");
	JOptionPane.showMessageDialog(null,"No se obtuvieron las personas");
	System.out.println("Causas "+ e.getMessage());
}catch(SQLException e) {
	telefonos=new ArrayList<>();
	System.out.println("no se obtuvieron las personas");
	System.out.println("Causas "+ e.getMessage());
}
		return telefonos;
		
	}
	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

  
}