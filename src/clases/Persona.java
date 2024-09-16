package clases;
import interfaces.Interfaz1;
// Implementamos el interfaz//
public class Persona implements Interfaz1{
	
	// Atributos protegidos de la clase Persona
	protected String nombre;
	protected Integer edad;
	protected Double peso, altura;
	
	// Constructor por defecto que inicializa los valores de los atributos
	public Persona(){
	      nombre = "";
	      edad = 0;
	      peso = 0.0;
	      altura = 0.0;
	    }
	
	// Selectores y Mutadores
	public String getNombre() {
		return nombre;
	}
	public void setNombre() {
		System.out.println("Ingresa su nombre: ");
		nombre = leer.nextLine();
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad() {
		 System.out.println("Ingrese su edad (ejemplo: 20)");
	     edad = leer.nextInt();
	     leer.nextLine();
	}
	
	// Método para determinar si la persona es mayor de edad según la edad ingresada
	public void calcularMayoriaEdad(){
		if(edad >= 18){
			System.out.println("Hola " + nombre + ". Usted es mayor de edad, porque tiene " + edad + " años.");
			}else{
	        	System.out.println("Hola " + nombre + ". Usted es menor de edad, porque tiene " + edad + " años.");
			}
	    }

	public Double getPeso() {
		return peso;
	}
	
	public void setPeso() {
		System.out.println("Ingrese su peso (ejemplo: 100,0)");
        peso = leer.nextDouble();
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura() {
		System.out.println("Ingrese su altura (ejemplo: 1,70)");
        altura = leer.nextDouble();
	}
}
