package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener {
	
	public View v;
	public Mundo m;
	
	Controller(){
	
	v = new View();	
	m = new Mundo();
	v.panel1.pedir.addActionListener(this);
	v.panel1.quedarse.addActionListener(this);
	
		
	}
		
		public void actionPerformed(ActionEvent e) {
			 if(e.getActionCommand().equals("pedir")) {	
	}
		}
}
