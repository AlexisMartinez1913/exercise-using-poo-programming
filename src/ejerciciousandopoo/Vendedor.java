package ejercicioUsandoPoo;

import java.util.Scanner;


public class Vendedor {
	
	private long documento;   //atributos
	private String nombre;
	private int tipo;
	private double ventas;
	
	//constructor de la clase
	public Vendedor(long documento, String nombre, int tipo, double ventas){
		
		this.documento = documento;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ventas = ventas;
		
	}
	
	// metodos get y set para atributos -> get para retornar y set para asignar
	
	public long getDocumento() {
		return documento;
	}
	
	public void setDocumento(long documento) {
		this.documento = documento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getVentas() {
		return ventas;
	}
	
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	//metodos

	public double liquidar_comision() {
		double comision = 0;
		if (tipo == 1) {
			comision = ventas * 0.25;
		}
		
		else {
			comision = ventas * 0.2;
		}
		
		return comision;
	}
	
	
	
	//------------------------------------------------------------------
	
	/* metodo principal, llamada de metodos a traves de objetos de la clase
	 * 
	 */
	
	public static void main(String[] ar) {
		
		long documento;
		String nombre;
		int tipo;
		double ventas;
		double comision;
		
		Scanner consola = new Scanner(System.in);
		//consola.useDelimiter("\n");  //delimitador para strings
		System.out.println("Documento: ");
		documento = consola.nextLong();
		System.out.println("Nombre: ");
		nombre = consola.next();
		System.out.println("Tipo (1: Puerta a Puerta |  2: telemercadeo):  ");
		tipo = consola.nextInt();
		System.out.println("Ventas del mes: ");
		ventas = consola.nextDouble();
		
		
		
		//creacion del objeto de la clase
		Vendedor vendedor1 = new Vendedor(documento, nombre, tipo, ventas);
                //llamada del metodo a traves de objetos
		comision = vendedor1.liquidar_comision();
                //accedo al metodo getNombre, usado en poo
		System.out.println("Nombre : " + vendedor1.getNombre());  
		System.out.println("La comision es: " + comision);
			
		
	}

}
