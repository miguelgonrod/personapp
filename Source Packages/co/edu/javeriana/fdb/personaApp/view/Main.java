package co.edu.javeriana.fdb.personaApp.view;

import personaApp.personaInterfaz2;
import personaApp.telefonoInterfaz;

public class Main {

	 public static void main(String[] args) {
	java.awt.EventQueue.invokeLater(() -> {
	personaInterfaz2 personaInterfaz = new personaInterfaz2();
	 personaInterfaz.setVisible(true);
	 personaInterfaz.setLocationRelativeTo(null);
    });
	 }
}
