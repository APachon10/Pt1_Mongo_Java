package Ejecucion;

import java.util.Scanner;

import org.w3c.dom.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Modelos.Consolas;
import Conexionm.Conexion;

public class Main {
	public static void main(String[] args) {
		Conexion c= new Conexion();
		
		MongoClient cliente = c.abrirConexionAtlas();
		Menu(cliente);
	}
	public static void Menu(MongoClient cliente) {
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
				MongoCollection<org.bson.Document> collection = null;
				do {
					System.out.println("En que Coleccion quieres hacer el insert ? "
							+ "\n 1 - Consolas"
							+ "\n 2 - Juegos"
							+ "\n 0 - Salir ");
					System.out.println("=============================");
					System.out.print("Opcion:");
					opcion2 = scan.nextInt();
					switch (opcion2) {
					case 1:
						break;
					case 2:
						
						break;
					}
				} while (opcion2 !=0 );
				break;
			case 2:
				int opcion3 = 0 ;
				do {			
					System.out.println("En que Coleccion quieres hacer el Update ? "
							+ "\n 1 - Consolas"
							+ "\n 2 - Juegos"
							+ "\n 0 - Salir ");
					System.out.println("=============================");
					System.out.print("Opcion:");
					opcion3 = scan.nextInt();
					switch (opcion3) {
					case 1:
						
						break;
					case 2:
						
						break;
					}
				} while (opcion3 !=0 );
				break;
			case 3:
				int opcion4 = 0 ;
				do {
					System.out.println("En que Coleccion quieres hacer el Delete ? "
							+ "\n 1 - Consolas"
							+ "\n 2 - Juegos"
							+ "\n 0 - Salir ");
					System.out.println("=============================");
					System.out.print("Opcion:");
					opcion4 = scan.nextInt();
					switch (opcion4) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 0:
						break;
					}
				} while (opcion4 !=0 );
				break;
			case 4:		
				System.out.println("Selecciona la Coleccion:");
				break;    
			}
			
		} while (opcion!=0);
	}
}
