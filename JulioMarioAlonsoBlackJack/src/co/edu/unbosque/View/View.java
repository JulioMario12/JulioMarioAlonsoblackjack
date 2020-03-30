package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame {
	
public Panel1 panel1 ;
	
	public View() {
		
		getContentPane().setLayout(null);
		setSize(600, 450);
		setTitle("Blacjack");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
			
		inicializarComponentes();
			
			
		
		setLocationRelativeTo(null);
		setVisible(true);
			
		}

	private void inicializarComponentes() {
		 
	    panel1 = new Panel1();
		panel1.setBounds(25, 25, 535, 350);
		getContentPane().add(panel1);
		
		
	}

}
