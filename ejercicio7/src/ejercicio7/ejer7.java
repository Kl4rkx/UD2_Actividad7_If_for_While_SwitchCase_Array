package ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {

		// Definición y asignación de variables
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String[] nombre = { "Mexicano", "Alioli", "CheeseBurger", "Barbacoa" };
		String[] ingredientes = { "carne , tomate, picante, pimiento", "carne, lechuga, bacon, alioli",
				"carne,  cebolla, cheddar, lechuga, tomate, mahonesa",
				"carne, bacon, cebolla,cheddar, lechuga,tomate, mayonesa,barbacoa" };
		double[] precio = { 8.50, 11, 12.50, 14 };
		int[] stock = { 12, 8, 23, 15 };

		// Creación de programa
		// Se crea un bucle con do while y dentro un switch case para hacer el menu
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
			switch (opcion) {

			// Será necesario solicitar el nombre de la hamburguesa y las unidades a comer
			// por pantalla al usuario y se calculará y visualizará el importe del pedido.
			case 1:

				// Se imprimen todos los valores del Array, en este caso todas las hamburguesas
				System.out.println("Hamburguesas: " + Arrays.toString(nombre));

				System.out.println("Introduce el nombre de la hamburguesa: ");
				sc.nextLine(); // Se limpia el buffer
				String nombrePedido = sc.nextLine();

				System.out.println("Introduce la cantidad de unidades que deseas: ");
				int numeroPedido = sc.nextInt();

				// Se declara una variable booleana a false y se crea un bucle for para recorrer
				// todo el array de nombre
				boolean encontrada = false;
				for (int i = 0; i < nombre.length; i++) {

					// Se hace un if para comprobar si el valor introducido existe
					if (nombrePedido.equalsIgnoreCase(nombre[i])) {
						encontrada = true;

						// Se hace un if para comprobar que el valor no supere el stock actual
						if (numeroPedido > stock[i]) {
							System.out.println("\n¡No hay suficiente stock! Solo quedan " + stock[i] + " unidades.");
						} else {
							double importe = precio[i] * numeroPedido;
							System.out.println("\nTu pedido de " + numeroPedido + " hamburguesa(s) " + nombre[i]
									+ " cuesta: " + importe + "€");
						}
						break;
					}
				}

				// Se hace un if que realiza un print si no se encuentra el valor
				if (!encontrada) {
					System.out.println("\nNo se encuentra esa hamburguesa en el menú.");
				}
				break;

			/*
			 * Será necesario visualizar el nombre y el importe de la hamburguesa más
			 * barata.
			 */
			case 2:
				
				// Se crean dos variables, una para comparar el 0 en el for y la otra para guardar el valor de i fuera del for
				double min = precio[0];
				int indiceMin = 0;
				for (int i = 1; i < precio.length; i++) {
					if (precio[i] < min) {
						min = precio[i];
						indiceMin = i;
					}
				}
				System.out.println(
						"\nLa hamburguesa más barata es " + nombre[indiceMin] + " y el importe es: " + min + "€");
				break;

			/*Opción 3: Será necesario solicitar el nombre de la hamburguesa por pantalla
			al usuario y se mostrarán todos sus ingredientes y el stock disponible.*/
			case 3: 
				
				// Se imprimen todos los valores del Array, en este caso todas las hamburguesas
				System.out.println("Hamburguesas: " + Arrays.toString(nombre));

				System.out.println("Introduce el nombre de la hamburguesa: ");
				sc.nextLine(); // Se limpia el buffer
				nombrePedido = sc.nextLine();

				// Se verifica si la hamburguesa existe
				encontrada = false;
				for (int i = 0; i < nombre.length; i++) {
					if (nombrePedido.equalsIgnoreCase(nombre[i])) {
						encontrada = true;
						System.out.println("Los ingredientes de " + nombre[i] + " son " + ingredientes[i]);
						System.out.println(
								"\nEl stock de la hamburguesa " + nombre[i] + " es de " + stock[i] + " unidades");
						break;
					}
				}

				if (!encontrada) {
					System.out.println("\nNo se encuentra esa hamburguesa en el menú.");
				}

				break;

			/*
			 * Opción 4: Será necesario solicitar el nombre del ingrediente por pantalla al
			 * usuario y se visualizará el texto "SI, hay hamburguesas con dicho ingrediente
			 * y son las siguientes:" + el nombre de las hamburguesas que tengan dicho
			 * ingrediente entre sus ingredientes. Es necesario hacer uso de una variable
			 * BOOLEAN. En caso contrario se visualizará:
			 * "NO, no hay hamburguesas con dicho ingrediente".
			 */
			case 4:
				
				// Se pide y se recoge el valor de la variable sin espacios al inicio o final y todo en minusculas
				System.out.println("Escribe un ingrediente para comprobar si alguna hamburguesa lo tiene: ");
				sc.nextLine(); // Se limpia el buffer
				String nombreIngrediente = sc.nextLine().trim().toLowerCase();

				encontrada = false;

				/* Se hacen dos bucles for, el primero para separar los ingredientes y el
				 * segundo para comparar los valores*/
				for (int i = 0; i < ingredientes.length; i++) {
					
					// Se separan los ingredientes individualmente
					String[] individual = ingredientes[i].split(",");

					for (int j = 0; j < individual.length; j++) {

						// Se limpian los espacios del ingrediente para hacer la comparación
						if (nombreIngrediente.equals(individual[j].trim().toLowerCase())) {

							/* Se hace un if de encontrada que siempre será false para que el print solo se
							 * haga la primera vez*/
							if (!encontrada) {
								System.out.println("SI, hay hamburguesas con dicho ingrediente y son las siguientes:");
								encontrada = true;
							}
							System.out.println(nombre[i]);
							break;
						}
					}
				}
				if (!encontrada) {
					System.out.println("NO, no hay hamburguesas con dicho ingrediente");
				}
				break;
				
			/*
			 * Opción 5: Será necesario solicitar el nombre de la hamburguesa y las unidades
			 * a comer por pantalla al usuario y se disminuirá el stock de dicha
			 * hamburguesa. Será necesario visualizar un mensaje con el nuevo stock de la
			 * hamburguesa "El nuevo stock de la hamburguesa x es de y unidades."
			 */
			case 5: 
				
				// Se imprimen todos los valores del Array, en este caso todas las hamburguesas
				System.out.println("Hamburguesas: " + Arrays.toString(nombre));
				// Asignación de variables
				System.out.println("Introduce el nombre de la hamburguesa: ");
				sc.nextLine(); // Se limpia el buffer
				nombrePedido = sc.nextLine();
				System.out.println("Introduce la cantidad de unidades que deseas: ");
				numeroPedido = sc.nextInt();
				encontrada = false;

				// Se hace un bucle for que recorre todo el array de nombre
				for (int i = 0; i < nombre.length; i++) {
					if (nombrePedido.equalsIgnoreCase(nombre[i])) {
						encontrada = true;
						if (numeroPedido > stock[i]) {
							System.out.println("\n¡No hay suficiente stock! Solo quedan " + stock[i] + " unidades.");
						} else {
							System.out.println(numeroPedido);
							System.out.println("\nEl nuevo stock de la hamburguesa " + nombre[i] + " es de "
									+ (stock[i] - numeroPedido) + " unidades");
						}
						break;
					}
				}

				if (!encontrada) {
					System.out.println("\nNo se encuentra esa hamburguesa en el menú.");
				}

				break;
				
			/*
			 * Opción 6: Será necesario solicitar el número de comensales y se calculará la
			 * media de hamburguesas que puede comer cada comensal teniendo en cuenta el
			 * stock existente.
			 */
			case 6: 
				
				// Definición y asignación de variables
				int comensales = 0;
				double media = 0;
				double suma = 0;
				
				System.out.println("Introduce la cantidad de comensales: ");
				comensales = sc.nextInt();

				// Se hace un for para conseguir la suma total de las hamburguesas
				for (int numero : stock) {
					suma += numero;
				}

				for (int i = 0; i < nombre.length; i++) {
					media = suma / comensales;
				}

				System.out.println("Teniendo en cuenta que el stock de todas las hamburguesas es: " + suma + " y son "
						+ comensales + " comensales, pueden comerse " + media + " hamburguesas cada uno.");
				break;

			case 7:
				System.out.println("ADIÓS");
				break;

			}
		} while (opcion != 7);
		sc.close();

	}

}
