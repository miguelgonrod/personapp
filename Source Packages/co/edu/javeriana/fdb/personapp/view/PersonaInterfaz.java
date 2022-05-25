package co.edu.javeriana.fdb.personapp.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.javeriana.fdb.personapp.controller.logic.PersonaBO;
import co.edu.javeriana.fdb.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.fdb.personapp.model.dto.PersonaDTO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PersonaInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonaInterfaz frame = new PersonaInterfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public PersonaInterfaz() {
		setTitle("Persona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(61, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(61, 126, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setBounds(61, 151, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextField nombre_caja = new JTextField();
		nombre_caja.setBounds(145, 101, 113, 20);
		contentPane.add(nombre_caja);		
		nombre_caja.setColumns(10);
		
		JTextField apellido_caja = new JTextField();
		apellido_caja.setBounds(145, 123, 113, 20);
		contentPane.add(apellido_caja);
		apellido_caja.setColumns(10);
		
		JTextField edad_caja = new JTextField();
		edad_caja.setBounds(145, 148, 113, 20);
		contentPane.add(edad_caja);
		edad_caja.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Genero");
		lblNewLabel_3.setBounds(61, 176, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton sexoM = new JRadioButton("M");
		sexoM.setBounds(145, 175, 38, 23);		
		contentPane.add(sexoM);
		
		JRadioButton sexoF = new JRadioButton("F");
		sexoF.setBounds(185, 175, 38, 23);		
		contentPane.add(sexoF);
		
		JRadioButton sexoO = new JRadioButton("O");
		sexoO.setBounds(220, 175, 38, 23);
		contentPane.add(sexoO);
		if(sexoM.isSelected()==true)
		{
		 System.out.println("hola");
		 sexoO.setSelected(false);
		 sexoF.setSelected(false);
		}
		if(sexoF.isSelected()==true)
		{
		 sexoO.setSelected(false);
		 sexoM.setSelected(false);
		}
		if(sexoO.isSelected()==true)
		{
		 sexoM.setSelected(false);
		 sexoF.setSelected(false);
		}
		JLabel lblNewLabel_4 = new JLabel("C.C");
		lblNewLabel_4.setBounds(61, 201, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JTextField cedula_caja = new JTextField();
		cedula_caja.setBounds(145, 198, 113, 20);
		contentPane.add(cedula_caja);
		cedula_caja.setColumns(10);
		
		JTextArea panelInfo = new JTextArea();
		panelInfo.setBounds(61, 20, 230, 70);
		panelInfo.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(panelInfo);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		contentPane.add(scrollPane);
		scrollPane.setBounds(61, 20, 230, 70);
		PersonaDAOImpl personaDAOImpl= new PersonaDAOImpl();
		for(PersonaDTO persona : personaDAOImpl.findAll()) {
			panelInfo.append(persona.toString()+"\n");
		}
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.insertar(cedula_caja, edad_caja, nombre_caja, apellido_caja, sexoM, sexoF, sexoO);
			}
		});
		btnNewButton.setBounds(42, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(142, 227, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.buscarID(panelInfo, cedula_caja);
			}
			});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.refresh(panelInfo);
			}
			});
		btnNewButton_2.setBounds(256, 227, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Contar");
		btnNewButton_3.setBounds(42, 259, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.contar(panelInfo);
			}
			});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modificar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.modificar(cedula_caja, edad_caja, nombre_caja, apellido_caja, sexoM, sexoF, sexoO);
			}
		});
		btnNewButton_4.setBounds(142, 259, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Eliminar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaBO.eliminar(cedula_caja.getText());
			}
		});
		btnNewButton_5.setBounds(256, 261, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Salir");
		btnNewButton_6.setBounds(27, 317, 89, 23);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Ir al telefono");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoInterfaz telefonoInterfaz = new TelefonoInterfaz();
				telefonoInterfaz.setVisible(true);
				telefonoInterfaz.setLocationRelativeTo(null);
			}
		});
		btnNewButton_7.setBounds(256, 317, 110, 23);
		contentPane.add(btnNewButton_7);
		
		
	}
}
