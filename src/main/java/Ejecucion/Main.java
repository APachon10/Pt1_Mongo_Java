package Ejecucion;

import java.util.Scanner;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import Modelos.Consolas;
import Conexionm.Conexion;

public class Main {
	public static void main(String[] args) {
		Conexion c= new Conexion();
		
		MongoClient cliente = c.abrirConexionAtlas();
		Menu(cliente);
	}
	public static void Menu(MongoClient cliente ) {
		Scanner scan = new Scanner("System.in");
		int opcion = 0;
		do {
			System.out.println("Que quieres hacer?"
					+ "\n 1 - Insert"
					+ "\n 2 - Update"
					+ "\n 3 - Delete "
					+ "\n 4 - Busqueda Simple"
					+ "\n 5 - Busqueda Compleja"
					+ "\n 0 - Salir"
					+ "\n--------------------------------");
			System.out.print("Opcion:");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int opcion2 = 0 ;
				do {
					System.out.println("En que Base de Datos quieres hacer el insert ? "
							+ "\n 1 - Consolas"
							+ "\n 2 - Juegos"
							+ "\n 0 - Salir ");
				} while (opcion2 !=0 );
				break;
			case 2:
				int opcion3 = 0 ;
				do {
					
				} while (opcion3 !=0 );
				break;
			case 3:
				int opcion4 = 0 ;
				do {
					
				} while (opcion4 !=0 );
				break;

			}
			
		} while (opcion!=0);
	}
}
