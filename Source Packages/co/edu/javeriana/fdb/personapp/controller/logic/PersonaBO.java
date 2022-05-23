package co.edu.javeriana.fdb.personapp.controller.logic;

import java.util.List;

import co.edu.javeriana.fdb.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.fdb.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dto.*;
public class PersonaBO {
	
	private	PersonaDAO pdao;
	
	public PersonaBO() {
		this.pdao = new PersonaDAOImpl();
	}
	public List<PersonaDTO> mostrar(){
		return pdao.findAll();
	}

}
