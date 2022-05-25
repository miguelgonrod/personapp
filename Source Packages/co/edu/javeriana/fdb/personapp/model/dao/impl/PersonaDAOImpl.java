
package co.edu.javeriana.fdb.personapp.model.dao.impl;

import co.edu.javeriana.fdb.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.fdb.personapp.model.dto.PersonaDTO;
import co.edu.javeriana.fdb.personapp.util.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAOImpl implements PersonaDAO {

    private final MySQL mysql;

    public PersonaDAOImpl() {
        this.mysql = new MySQL();
    }

    @Override
    public PersonaDTO create(PersonaDTO persona) {
        try {
            this.mysql.conectar();
            String query = "INSERT INTO persona(cedula,nombre,apellido,edad,genero) VALUES("
                    + "'" + persona.getCedula() + "',"
                    + "'" + persona.getNombre() + "',"
                    + "'" + persona.getApellido() + "',"
                    + "'" + persona.getEdad() + "',"
                    + "'" + persona.getGenero() + "');";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            switch (code) {
                case 1:
                    System.out.println("Se creo la persona");
                    return findById(persona.getCedula());
                default:
                    return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public PersonaDTO edit(Long cedula, PersonaDTO persona) {
    	 try {
             this.mysql.conectar();
             String query = "UPDATE persona SET "
             		
                     + "cedula = '" + persona.getCedula() + "',"
                     + "nombre = '" + persona.getNombre() + "',"
                     + "apellido = '" + persona.getApellido() + "',"
                     + "edad ='" + persona.getEdad() + "',"
                     + "genero ='" + persona.getGenero()+"'" + " where cedula =" + cedula;
             System.out.println(query);
             Statement stmt = this.mysql.getConnection().createStatement();
             int code = stmt.executeUpdate(query);
             stmt.close();
             this.mysql.desconectar();
             switch (code) {
                 case 1:
                     System.out.println("Se edito la persona");
                     return findById(persona.getCedula());
                 default:
                     return null;
             }
         } catch (SQLException ex) {
             Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }

    @Override
    public Boolean delete(Long cedula) {
    	 try {
             this.mysql.conectar();
             String query = "DELETE FROM persona where cedula =" + cedula;
             System.out.println(query);
             Statement stmt = this.mysql.getConnection().createStatement();
             int code = stmt.executeUpdate(query);
             stmt.close();
             this.mysql.desconectar();
             switch (code) {
                 case 1:
                     System.out.println("Se elimo la fila donde cedula ="+cedula);
                 default:
                     return null;
             }
         } catch (SQLException ex) {
             Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    
    }

    @Override
    public PersonaDTO findById(Long cedula) {
        try {
            this.mysql.conectar();
            String query = "SELECT * FROM persona WHERE cedula = '" + cedula + "';";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if (rs.first()) {
                PersonaDTO persona = new PersonaDTO(
                        rs.getLong("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getShort("edad"),
                        rs.getString("genero").charAt(0));
                rs.close();
                stmt.close();
                return persona;
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
    public List<PersonaDTO> findAll()  {
        List<PersonaDTO> personas= new ArrayList<>();
        PersonaDTO persona=null;
        try {
        	String query="SELECT * FROM persona;";
        	System.out.println(query);
        	this.mysql.conectar();
        	Statement stmt= this.mysql.getConnection().createStatement();
        	ResultSet rs =stmt.executeQuery(query);
        	while(rs.next()) {
        		persona= new PersonaDTO(
        				rs.getLong("cedula"),
        				rs.getString("nombre"),
        				rs.getString("apellido"),
        				rs.getShort("edad"),
        				rs.getString("genero").charAt(0));
        		personas.add(persona);
        	}
        	rs.close();
        	stmt.close();
        	this.mysql.desconectar();
        	System.out.println("Se obtuvieron las personas");
       }catch(SQLTimeoutException e) {
	personas=new ArrayList<>();
	System.out.println("no se obtuvieron las personas");
	System.out.println("Causas "+ e.getMessage());
}catch(SQLException e) {
	personas=new ArrayList<>();
	System.out.println("no se obtuvieron las personas");
	System.out.println("Causas "+ e.getMessage());
}
		return personas;
    }

    @Override
    public Integer count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
