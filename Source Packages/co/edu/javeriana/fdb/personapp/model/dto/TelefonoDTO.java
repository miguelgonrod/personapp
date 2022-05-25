package co.edu.javeriana.fdb.personapp.model.dto;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.javeriana.fdb.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dao.impl.TelefonoDAOImpl;

public class TelefonoDTO {

	private String numero;
	private  String operador;
	private PersonaDTO duenio;
	private String dunio;
	public TelefonoDTO(String numero, String operador, String dunio) {
		super();
		this.numero = numero;
		this.operador = operador;
		this.dunio = dunio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public  String getDuenio() {
		return dunio;
	}
	
	public void setDunio(String dunio) {
		this.dunio = dunio;
	}
	public void setDuenio(PersonaDTO duenio) {
		this.duenio = duenio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duenio == null) ? 0 : duenio.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((operador == null) ? 0 : operador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelefonoDTO other = (TelefonoDTO) obj;
		if (duenio == null) {
			if (other.duenio != null)
				return false;
		} else if (!duenio.equals(other.duenio))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (operador == null) {
			if (other.operador != null)
				return false;
		} else if (!operador.equals(other.operador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TelefonoDTO [numero=" + numero + ", operador=" + operador + ", duenio=" + dunio + "]";
	}
	
	
}
