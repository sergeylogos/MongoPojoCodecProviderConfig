package part.two;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PojoCodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = MongoClient.getDefaultCodecRegistry();
        CodecRegistry pojoRegistry = CodecRegistries
                .fromRegistries(codecRegistry, CodecRegistries.fromProviders(pojoCodecProvider));

//        MongoClient mongoClient = new MongoClient("localhost",
//                MongoClientOptions.builder().codecRegistry(pojoRegistry).build());
//
//        MongoDatabase database = mongoClient.getDatabase("qweqwe");
//        database.getCollection("persons");

//        MongoClient mongoClient = new MongoClient();
//        MongoDatabase database = mongoClient.getDatabase("qweqwe").withCodecRegistry(pojoRegistry);
//        MongoCollection<Document> collection = database.getCollection("persons");


        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("qweqwe");
        MongoCollection<Person> persons = database.getCollection("persons", Person.class).withCodecRegistry(pojoRegistry);
        persons.insertOne(new Person("poipoi", new Adress("lviv", "kn Sviatoslava" , 5)));

        persons.find().into(new ArrayList<>()).forEach(System.out::println);

    }
}
