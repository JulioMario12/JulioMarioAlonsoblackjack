package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

 public class Panel1 extends JPanel {

	public JButton pedir;
	public JButton quedarse;
	public JTextField cartasjugador1;
	public JTextField cartasjugador2;
	public JTextField cartasjugador3;
	public JTextField cartasjugador4;
	public JTextField cartascasa1;
	public JTextField cartascasa2;
	public JTextField cartascasa3;
	public JTextField cartascasa4;

	public Panel1() {
		setLayout(null);
		setBackground(Color.GREEN);
		
		
		
       inicializarComponentes();
     
      
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0),
		        new TitledBorder("")));
	}
 
	private void inicializarComponentes() {
		
		pedir = new JButton("pedir");
		pedir.setBounds(370, 280, 120, 25);
		add(pedir);
	
		quedarse = new JButton("quedarse");
		quedarse.setBounds(370, 320, 120, 25);
		add(quedarse);

		cartasjugador1 = new JTextField("");
		cartasjugador1.setBounds(50,320,100,25);
		cartasjugador1.setEditable(false);
		add(cartasjugador1);
		
		cartasjugador2 = new JTextField("");
		cartasjugador2.setBounds(100,290,100,25);
		cartasjugador2.setEditable(false);
		add(cartasjugador2);
		
		cartasjugador3 = new JTextField("");
		cartasjugador3.setBounds(170,320,100,25);
		cartasjugador3.setEditable(false);
		add(cartasjugador3);
		
		cartasjugador4 = new JTextField("");
		cartasjugador4.setBounds(220,290,100,25);
		cartasjugador4.setEditable(false);
		add(cartasjugador4);
		
        cartascasa1 = new JTextField("");
		cartascasa1.setBounds(35,35,100,25);
		cartascasa1.setEditable(false);
		add(cartascasa1);
		
		cartascasa2 = new JTextField("");
		cartascasa2.setBounds(65,65,100,25);
		cartascasa2.setEditable(false);
		add(cartascasa2);
		
		cartascasa3 = new JTextField("");
		cartascasa3.setBounds(150,35,100,25);
		cartascasa3.setEditable(false);
		add(cartascasa3);
		
		cartascasa4 = new JTextField("");
		cartascasa4.setBounds(215,65,100,25);
		cartascasa4.setEditable(false);
		add(cartascasa4);
		
		
		
		
	}
}
	
	

