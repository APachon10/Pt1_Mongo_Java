package Conexionm;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Conexion {
	public MongoDatabase obtenerBasedeDatos(MongoClient cliente, String db_name) {
		cliente = abrirConexionAtlas();
		MongoDatabase database = null;
		try {
			database = cliente.getDatabase(db_name);
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println("================");
			e.printStackTrace();
		}		
		return database;
	}
	public MongoClient abrirConexionAtlas() {
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://Alberto:Deadzone95@cluster1-yhavo.gcp.mongodb.net/test?retryWrites=true&w=majority");
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		MongoClient mongoClient = new MongoClient(uri);
		return mongoClient;
	}
	public void cerrarConexion(MongoClient cliente) {
		cliente.close();
	}
}
