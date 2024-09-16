package principal;
import interfaces.Interfaz1;
import java.util.ArrayList;
import clases.Deportistas;

public class Menu implements Interfaz1{

	public static void main(String[] args) {
		Integer op = 0;
		ArrayList<Deportistas> grupo = new ArrayList<Deportistas>();
		
		do {
			 System.out.println("Bienvenido al menu para obtener su IMC, porfavor ingresa un numero");
	            System.out.println("-------------------");
	            System.out.println("1) Ingrese datos.");
	            System.out.println("2) Calcular IMC.");
	            System.out.println("3) Determinar mayora de edad.");
	            System.out.println("4) Mostrar datos.");
	            System.out.println("5) Salir.");
	            System.out.println("-------------------");
	            System.out.println("Ingrese su opcion: ");
	            op = leer.nextInt();
	            leer.nextLine();
	            switch (op) {
                case 1:
                	//Ingreso de nuevos datos al ArrayList
                    Deportistas d = new Deportistas();
                    d.setNombre();
                    d.setEdad();
                    d.setPeso();
                    d.setAltura();
                    d.setImc();
                    d.setCategoria();
                    grupo.add(d);
                    break;
                case 2:    
                for(Deportistas aux : grupo){
                	System.out.println("-------------------");
                    System.out.println(aux.getImc());
                    System.out.println("-------------------");
                }
                break;
                case 3:
                for(Deportistas aux : grupo){
                	System.out.println("-------------------");
                    aux.calcularMayoriaEdad();
                    System.out.println("-------------------");
                }
                break;
                case 4:
                    for(Deportistas aux : grupo){
                    	System.out.println("-------------------");
                        System.out.println(aux.toString());
                        System.out.println("-------------------");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicacion...");
                    break;
	            }
		}
		while (op != 5);
	}

}
