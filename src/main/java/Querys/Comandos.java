package Querys;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Modelos.Consolas;
import Modelos.Juegos;

public class Comandos {
	public void insertarConsolas(MongoDatabase db ,Consolas c,Document doc) {
		//Seleccionamos la coleccion
		MongoCollection<Document> collection = db.getCollection("Consolas");	
		collection.insertOne(doc);

	}
	public void insertarJuegos(MongoDatabase db,Juegos j,Document doc) {
		
	}
}