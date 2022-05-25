package co.edu.javeriana.fdb.personapp.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import co.edu.javeriana.fdb.personapp.controller.logic.PersonaBO;
import co.edu.javeriana.fdb.personapp.controller.logic.TelefonoBO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class TelefonoInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelefonoInterfaz frame = new TelefonoInterfaz();
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
	public TelefonoInterfaz() {
		setTitle("Telefono");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
			
		JButton btnNewButton_6 = new JButton("Salir");
		btnNewButton_6.setBounds(27, 317, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Ir a persona");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonaInterfaz personaInterfaz = new PersonaInterfaz();
				 personaInterfaz.setVisible(true);
				 personaInterfaz.setLocationRelativeTo(null);
			}
		});
		btnNewButton_7.setBounds(256, 317, 110, 23);
		contentPane.add(btnNewButton_7);
		
		JTextArea panelInfo = new JTextArea();
		panelInfo.setBounds(61, 20, 230, 70);
		panelInfo.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(panelInfo);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		scrollPane.setBounds(61, 20, 230, 70);
		
		JLabel lblNewLabel = new JLabel("Telefono: ");
		lblNewLabel.setBounds(85, 134, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operador: ");
		lblNewLabel_1.setBounds(85, 163, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dueño: ");
		lblNewLabel_2.setBounds(85, 188, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextField numero_valor = new JTextField();
		numero_valor.setBounds(168, 131, 86, 20);
		contentPane.add(numero_valor);
		numero_valor.setColumns(10);
		
		JComboBox<String> boxOperadores = new JComboBox<>();
        boxOperadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Movistar", "Tigo", "Virgin", "Wom", "Movil Exito" }));
        boxOperadores.setBounds(168, 162, 90, 20);
        contentPane.add(boxOperadores);
        
        JComboBox<String> boxDuenios = new JComboBox<>();
        boxDuenios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        PersonaBO.refreshBox(boxDuenios);
        boxDuenios.setBounds(169, 190, 90, 20);
        contentPane.add(boxDuenios);
        
        JButton btnNewButton = new JButton("Insert");	
        btnNewButton.setBounds(42, 227, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.insertar(numero_valor, boxOperadores, boxDuenios);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Modificar");
		btnNewButton_4.setBounds(142, 259, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.edit(numero_valor, boxOperadores, boxDuenios);
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Eliminar");
		btnNewButton_5.setBounds(256, 261, 89, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.eliminar(numero_valor.getText());
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.setBounds(256, 227, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.refresh(panelInfo);
			}
		});
		contentPane.add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("Contar");
		btnNewButton_3.setBounds(42, 259, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.contar(panelInfo);
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(142, 227, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefonoBO.buscarID(panelInfo,numero_valor);
			}
		});
		contentPane.add(btnNewButton_1);
		
	}
}
