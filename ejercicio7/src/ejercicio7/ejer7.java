package ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		// Definición y asignación de variables
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String[] nombre = { "Mexicano", "Alioli", "CheeseBurger", "Barbacoa"};
		String[] ingredientes = { "carne , tomate, picante, pimiento", "carne, lechuga, bacon, alioli", "carne,  cebolla, cheddar, lechuga, tomate, mahonesa", "carne, bacon, cebolla,cheddar, lechuga,tomate, mayonesa,barbacoa"};
		double[] precio = { 8.50, 11, 12.50, 14};
		int[] stock = { 12, 8, 23, 15};
		
		// Creación de programa
		// Se crea un bucle con switch case para hacer el menu
		do {
			// Se pide y recoge el valor de opcion
			System.out.println("\n---------------------------------------");
			System.out.println("Selecciona una opción: (Ej: 1)");
			System.out.println("1.PEDIDO");
			System.out.println("2.LA HAMBURGUESA MAS BARATA");
			System.out.println("3.INFORMACION HAMBURGUESA");
			System.out.println("4.BUSCAR INGREDIENTES");
			System.out.println("5.DISMINUIR STOCK");
			System.out.println("6.HAMBURGUESAS POR PERSONA");
			System.out.println("7.SALIR");
			System.out.println("---------------------------------------");
			opcion = sc.nextInt();
			switch (opcion){
			
			case 1: // Será necesario solicitar el nombre de la hamburguesa y las unidades a comer por pantalla al usuario y se calculará y visualizará el importe del pedido.
				
				System.out.println("Introduce el nombre de la hamburguesa: ");
				sc.nextLine(); // Limpiar el buffer después de nextInt()
				String nombrePedido = sc.nextLine();
				System.out.println("Introduce la cantidad de unidades que deseas: ");
				int numeroPedido = sc.nextInt();

				boolean encontrada = false;
				for (int i = 0; i < nombre.length; i++) {
					if (nombrePedido.equalsIgnoreCase(nombre[i])) {
						encontrada = true;
						if (numeroPedido > stock[i]) {
							System.out.println("\n¡No hay suficiente stock! Solo quedan " + stock[i] + " unidades.");
						} else {
							double importe = precio[i] * numeroPedido;
							System.out.println("\nTu pedido de " + numeroPedido + " hamburguesa(s) " + nombre[i] + " cuesta: " + importe + "€");
						}
						break;
					}
				}
				if (!encontrada) {
					System.out.println("\nNo se encuentra esa hamburguesa en el menú.");
				}
				break;
				
			case 2: // Será necesario visualizar el nombre y el importe de la hamburguesa más barata.
			    double min = precio[0];
			    int indiceMin = 0;
			    for (int i = 1; i < precio.length; i++) {
			        if (precio[i] < min) {
			            min = precio[i];
			            indiceMin = i;
			        }
			    }
			    System.out.println("\nLa hamburguesa más barata es " + nombre[indiceMin] + " y el importe es: " + min + "€");
			    break;
				
			case 3: // Opción 3: Será necesario solicitar el nombre de la hamburguesa por pantalla al usuario y se mostrarán todos sus ingredientes y el stock disponible.
				
				System.out.println("Introduce el nombre de la hamburguesa: ");
				sc.nextLine(); // Limpiar el buffer después de nextInt()
				nombrePedido = sc.nextLine();
				
				// Se verifica si la hamburguesa existe
				encontrada = false;
				for (int i = 0; i < nombre.length; i++) {
					if (nombrePedido.equalsIgnoreCase(nombre[i])) {
						encontrada = true;
						System.out.println("Los ingredientes de " + nombre[i] + " son " + ingredientes[i]);
						System.out.println("\nEl stock de la hamburguesa " + nombre[i] + " es de " + stock[i] + " unidades");
						break;
					}
				}
				
				if (!encontrada ) {
					System.out.println("\nNo se encuentra esa hamburguesa en el menú.");
				}
				
				break;
				
			case 4: // Opción 4: Será necesario solicitar el nombre del ingrediente por pantalla al usuario y se visualizará el texto "SI, hay hamburguesas con dicho ingrediente y son las siguientes:" + el nombre de las hamburguesas que tengan dicho ingrediente entre sus ingredientes. Es necesario hacer uso de una variable BOOLEAN. En caso contrario se visualizará: "NO, no hay hamburguesas con dicho ingrediente".
				// System.out.println("4.BUSCAR INGREDIENTES");
				String nombreIngrediente = "";
				System.out.println("Escribe un ingrediente para comprobar si alguna hamburguesa lo tiene: ");
				nombreIngrediente = sc.nextLine();
				if (nombreIngrediente.contains(ingredientes[i])){};

				break;
				
			case 5: // Opción 5: Será necesario solicitar el nombre de la hamburguesa y las unidades a comer por pantalla al usuario y se disminuirá el stock de dicha hamburguesa. Será necesario visualizar un mensaje con el nuevo stock de la hamburguesa "El nuevo stock de la hamburguesa x es de y unidades."
				System.out.println("5.DISMINUIR STOCK");
				break;
				
			case 6: // Opción 6: Será necesario solicitar el número de comensales y se calculará la media de hamburguesas que puede comer cada comensal teniendo en cuenta el stock existente.*/
				System.out.println("6.HAMBURGUESAS POR PERSONA");
				break;
				
			case 7: 
				System.out.println("7.SALIR");
				break;
				
			}
		}
		while (opcion != 7);
		
	}

}



