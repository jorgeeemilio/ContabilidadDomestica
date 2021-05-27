package es.studium.ContabilidadDomestica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class VistaAlta extends Frame
{

	private static final long serialVersionUID = 1L;
	
	Label lblfecha = new Label ("Fecha");
	TextField txtfecha = new TextField (20);
	Label lblimporte = new Label ("Importe");
	TextField txtimporte = new TextField (20);
	Label lblconcepto = new Label ();
	TextField txtconcepto = new TextField (20);
		

	public VistaAlta ()
	{
		setLayout (new FlowLayout());
		setBackground(Color.getHSBColor(255, 204, 255));
		add(lblfecha);
		add(txtfecha);
		add(lblimporte);
		add(txtimporte);
		add(lblconcepto);
		add(txtconcepto);
		
		setSize(270,170);
		setResizable(true);
		setLocationRelativeTo(null);
		requestFocus();
	}
}
