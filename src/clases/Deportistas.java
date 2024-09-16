package clases;
import java.text.DecimalFormat;

// La clase Deportistas hereda de Persona e incluye atributos adicionales para el IMC y la categoría
public class Deportistas extends Persona{
	
	// Atributos específicos de la clase Deportistas
	private Double imc;
    private String categoria;
	
    public Deportistas() {
		super();
		imc = 0.0;
		categoria = "";
	}
    
	public String getImc() {
		  DecimalFormat df = new DecimalFormat("#.##");
	        return "El de masa corporal (IMC) de " + nombre + " es: " + df.format(imc);
	}
	
	public void setImc() {
		 imc = peso / (altura * altura);
	}
	
	public String getCategoria() {
        return categoria;
    }
	
	public void setCategoria() {
		if(imc < 18.5){
            categoria = "Bajo peso";
        }else if(imc >= 18.5 && imc <= 24.9){
            categoria = "Peso saludable";
        }else if(imc >= 25.0 && imc <= 29.9){
            categoria = "Sobrepeso";
        }else{
            categoria = "Obesidad";
        }
	}

	// Sobrescribe el método toString para mostrar los datos del deportista de manera formateada
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
	    builder.append("===== Datos del Deportista =====\n");
	    builder.append("Nombre: ").append(nombre).append("\n"); 
	    builder.append("Edad: ").append(edad).append(" años\n");
	    builder.append("Peso: ").append(peso).append(" kg\n");
	    builder.append("Altura: ").append(altura).append(" m\n");
	    builder.append("IMC: ").append(String.format("%.2f", imc)).append("\n");
	    builder.append("Categoría: ").append(categoria).append("\n");
	    builder.append("===============================");
		return builder.toString();
	}
    
}
