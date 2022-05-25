package co.edu.javeriana.fdb.personapp.controller.logic;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.javeriana.fdb.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dao.impl.TelefonoDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dto.PersonaDTO;
import co.edu.javeriana.fdb.personapp.model.dto.TelefonoDTO;

public class TelefonoBO {
	public static void insertar(JTextField jTextField, JComboBox jcomboUno,JComboBox jcomboDos ) {
		TelefonoDTO telefonoDTO= new TelefonoDTO(jTextField.getText(),jcomboUno.getSelectedItem().toString(),jcomboDos.getSelectedItem().toString());
		TelefonoDAOImpl telefonoDAOImpl= new TelefonoDAOImpl();
		telefonoDAOImpl.create(telefonoDTO);
	}
	public static void edit(JTextField jTextField, JComboBox jcomboUno,JComboBox jcomboDos ) {
		TelefonoDTO telefonoDTO= new TelefonoDTO(jTextField.getText(),jcomboUno.getSelectedItem().toString(),jcomboDos.getSelectedItem().toString());
		TelefonoDAOImpl telefonoDAOImpl= new TelefonoDAOImpl();
		telefonoDAOImpl.edit(jTextField.getText(),telefonoDTO);
	}
	public static void refresh(JTextArea jTextArea) {
		jTextArea.setText("");
		TelefonoDAOImpl telefonoDAOImpl= new TelefonoDAOImpl();
		for(TelefonoDTO telefono : telefonoDAOImpl.findAll()) {
			jTextArea.append(telefono.toString()+"\n");
		}
	}
	public static void eliminar(String numero_valor) {
		//logica para que elimine
		
		TelefonoDAOImpl personaDAOImpl= new TelefonoDAOImpl();
		personaDAOImpl.delete(numero_valor);
	}
	public static void contar(JTextArea jTextArea) {
		jTextArea.setText("");
		int i=0;
		TelefonoDAOImpl telefonoDAOImpl= new TelefonoDAOImpl();
		for(TelefonoDTO telefono : telefonoDAOImpl.findAll()) {	
		  i++;
		}
		if(i==1) {
		 jTextArea.append("Hay "+i+" numero en la base de datos"+"\n");
		}
		if(i!=1) {
			 jTextArea.append("Hay "+i+" numeros en la base de datos"+"\n");
		}
		
	}
	public static void buscarID(JTextArea jTextArea, JTextField numero_valor) {
		jTextArea.setText("");
		TelefonoDAOImpl telefonoDAOImpl= new TelefonoDAOImpl();
		for(TelefonoDTO telefono : telefonoDAOImpl.findAll()) {
			
			if(numero_valor.getText().equals(telefono.getNumero())) {
				jTextArea.append("NOMBRE: " +telefono.getDuenio()+" TELEFONO:"+telefono.getNumero()+" OPERADOR: "+telefono.getOperador()+"\n");
			}
				
		}
	}
	
}
