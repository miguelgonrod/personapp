package co.edu.javeriana.fdb.personaApp.view;

import personaApp.PersonaInterfaz;

public class Main {

	 public static void main(String[] args) {
	java.awt.EventQueue.invokeLater(() -> {
	PersonaInterfaz personaInterfaz = new PersonaInterfaz();
	 personaInterfaz.setVisible(true);
	 personaInterfaz.setLocationRelativeTo(null);
    });
	 }
}
