package Ejecucion;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Modelos.Consolas;
import Modelos.Juegos;
import Querys.Comandos;
import Conexionm.Conexion;

public class Main {
	public static void main(String[] args) {
		Conexion c= new Conexion();
		
		MongoClient cliente = c.abrirConexionAtlas();
		Menu(cliente);
	}
	public static void Menu(MongoClient cliente) {
		//	Objeto Scanner
		Scanner scan = new Scanner(System.in);
		//	Variable para seleccionar opciones del Menu
		int opcion = 0;
		//	Menu
		do {
			System.out.println("Que quieres hacer?"
					+ "\n 1 - Insert"
					+ "\n 2 - Update"
					+ "\n 3 - Delete "
					+ "\n 4 - Busqueda Simple"
					+ "\n 5 - Busqueda Compleja"
					+ "\n 0 - Salir"
					+ "\n--------------------------------");
			System.out.print("Opcion: ");
			
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				//	Objetos
				Conexion c= new Conexion();
				Comandos c2 = new Comandos();
				MongoCollection<org.bson.Document> collection = null;
				//	Variables
				int opcion2 = 0 ;
				//	Bucle
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
						String db_name = "Tienda";
						//	Nos conectamos a la base de Datos 
						MongoDatabase db =  c.obtenerBasedeDatos(cliente,db_name);
						
						//	Creamos el Objeto Consola
						Consolas c_new = new  Consolas();
						System.out.print("Introduce el Nombre de la consola: ");
						c_new.setNombre("PS5");
						c_new.setPrecio(500.50);
						//	Creamos el Documento con los datos 
						Document doc = new Document("nombre", c_new.getNombre()).append("precio", c_new.getPrecio());
						//	Insertamos 
						c2.insertarConsolas(db ,c_new,doc);
						c.cerrarConexion(cliente);
						break;
					case 2:
						String db_name2 = "Tienda";
//						Nos conectamos a la base de Datos 
						MongoDatabase db2 =  c.obtenerBasedeDatos(cliente,db_name2);
						
//						Creamos el Objeto Consola
						Juegos j_new = new  Juegos();
						j_new.setPlataforma("PS5");
						j_new.setPrecio(500.5);
						//	Creamos el Documento con los datos 
						Document doc = new Document("nombre", j_new.getNombre()).append("precio", j_new.getPrecio());
						//	Insertamos 
						c2.insertarConsolas(db ,c_new,doc);
						c.cerrarConexion(cliente);
						break;
					}
				} while (opcion2 !=0 );
				//	FInal
				break;
			case 2:
				//	Objetos
				Conexion c3= new Conexion();
				Comandos c4 = new Comandos();
				MongoCollection<org.bson.Document> collection2 = null;
				//	Variables
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
						String db_name = "Consolas";
						//	Nos conectamos a la base de Datos 
						MongoDatabase db =  c3.obtenerBasedeDatos(cliente,db_name);
						
						//Cerramos la Conexion
						c3.cerrarConexion(cliente);
						break;
					case 2:
						String db_name2 = "Juegos";
						MongoDatabase db2 =  c3.obtenerBasedeDatos(cliente,db_name2);
						
						c3.cerrarConexion(cliente);
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
