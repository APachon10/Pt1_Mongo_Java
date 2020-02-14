package Conexionm;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Conexion {
	public MongoClient abrirConexionAtlas() {
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://Alberto:Deadzone95@cluster1-yhavo.gcp.mongodb.net/test?retryWrites=true&w=majority");
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("Tienda");
		return mongoClient;
	}
	public void cerrarConexion(MongoClient cliente) {
		cliente.close();
	}
}
