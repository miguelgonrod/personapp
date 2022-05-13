package co.edu.javeriana.fdb.personaApp.model.dao;

import java.util.List;

import co.edu.javeriana.fdb.personaApp.model.dto.PersonaDTO;

public interface PersonaDAO {

	public PersonaDTO create(PersonaDTO persona);
	
	public PersonaDTO edit(Long cedula,PersonaDTO persona);
	
	public Boolean delete(Long cedula);
	
	public PersonaDTO findById(Long cedula);
	
	public List<PersonaDTO> findAll();
	
	public Integer count();
}
