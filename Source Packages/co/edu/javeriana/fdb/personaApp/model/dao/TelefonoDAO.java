package co.edu.javeriana.fdb.personaApp.model.dao;

import java.util.List;

import co.edu.javeriana.fdb.personaApp.model.dto.PersonaDTO;
import co.edu.javeriana.fdb.personaApp.model.dto.TelefonoDTO;

public interface TelefonoDAO {

    public TelefonoDTO create(TelefonoDTO telefono);
	
	public TelefonoDTO edit(String numero,TelefonoDTO telefono);
	
	public Boolean delete(String numero);
	
	public TelefonoDTO findById(String numero);
	
	public List<TelefonoDTO> findByDuenio(Long cedulaDuenio);
	
	public List<TelefonoDTO> findAll();
	
	public Integer count();
}
