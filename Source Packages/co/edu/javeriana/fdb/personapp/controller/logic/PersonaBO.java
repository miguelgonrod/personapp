package co.edu.javeriana.fdb.personapp.controller.logic;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.javeriana.fdb.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.fdb.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dto.*;
public class PersonaBO {
	
	private	PersonaDAO pdao;
	
	/*public PersonaBO() {
		this.pdao = new PersonaDAOImpl();
	}*/
	public List<PersonaDTO> mostrar(){
		return pdao.findAll();
	}
	public static void insertar(JTextField cedula_caja, JTextField edad_caja,JTextField nombre_caja,JTextField apellido_caja,JRadioButton sexoM, JRadioButton sexoF, JRadioButton sexoO ) {
		int cedula_valor = Integer.parseInt(cedula_caja.getText());
		int edad_valor = Integer.parseInt(edad_caja.getText());
		PersonaDTO p1	 =null;
		if(sexoM.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'m');
		}
		else if(sexoF.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'f');
		}
		else if(sexoO.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'o');
		}
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		personaDAOImpl.create(p1);
	}
	public static void eliminar(String cedula_nom) {
		//logica para que elimine
		int cedula_valor = Integer.parseInt(cedula_nom);
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		personaDAOImpl.delete((long)cedula_valor);
	}
	public static void buscarID(JTextArea jTextArea, JTextField cedula_caja) {
		jTextArea.setText("");
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		int cedula_valor = Integer.parseInt(cedula_caja.getText());
		for(PersonaDTO persona : personaDAOImpl.findAll()) {
			if(((long)cedula_valor)==persona.getCedula())
				jTextArea.append("NOMBRE: "+persona.getNombre()+" "+persona.getApellido()+" C.C:"+persona.getCedula()+" SEXO:"+persona.getGenero()+"\n");
		}
	}
	public static void refresh(JTextArea jTextArea) {
		jTextArea.setText("");
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		for(PersonaDTO persona : personaDAOImpl.findAll()) {
			jTextArea.append(persona.toString()+"\n");
		}
	}
	public static void refreshBox(JComboBox jComboBox) {
		jComboBox.setToolTipText("");
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		for(PersonaDTO persona : personaDAOImpl.findAll()) {
			jComboBox.addItem(persona.getCedula()+"\n");
		}
	}
	public static void contar(JTextArea jTextArea) {
		jTextArea.setText("");
		int i=0;
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		for(PersonaDTO persona : personaDAOImpl.findAll()) {	
		  i++;
		}
		if(i==1) {
		 jTextArea.append("Hay "+i+" persona en la base de datos"+"\n");
		}
		if(i!=1) {
			 jTextArea.append("Hay "+i+" personas en la base de datos"+"\n");
		}
	}
	public static void modificar(JTextField cedula_caja, JTextField edad_caja,JTextField nombre_caja,JTextField apellido_caja,JRadioButton sexoM, JRadioButton sexoF, JRadioButton sexoO ) {
		int cedula_valor = Integer.parseInt(cedula_caja.getText());
		int edad_valor = Integer.parseInt(edad_caja.getText());
		PersonaDTO p1 = null;
		if(sexoM.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'m');
		}
		else if(sexoF.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'f');
		}
		else if(sexoO.isSelected()) {
			 p1	 = new PersonaDTO((long)cedula_valor,nombre_caja.getText(),apellido_caja.getText(),(short)edad_valor,'o');
		}
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		
		personaDAOImpl.edit((long)cedula_valor,p1);
	}

}
