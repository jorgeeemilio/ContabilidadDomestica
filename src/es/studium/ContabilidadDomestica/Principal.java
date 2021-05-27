package es.studium.ContabilidadDomestica;

public class Principal
{
	public static void main(String[] args)
	{
		new Controlador(new DashBoard(), new Modelo());
	}
}