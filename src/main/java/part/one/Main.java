package part.one;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //asdasd
        //users
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("asdasd");
        MongoCollection<Document> collection = database.getCollection("users");

//        System.out.println(collection.find().first().toString());

//        FindIterable<Document> findIterable = collection.find();
//        MongoCursor<Document> cursor = findIterable.iterator();
//        while (cursor.hasNext()) {
//            System.out.println(cursor.next().toString());
//        }

//        ArrayList<Document> list = collection.find().into(new ArrayList<>());
//        list.forEach(System.out::println);


//        Document document = new Document("name", "john").append("skill" , "javascript")
//                .append("age" , 14);
//        collection.insertOne(document);


//        Document filter = new Document("age" ,145);
//        collection.find(filter).into(new ArrayList<>()).forEach(System.out::println);


//        Document filter = new Document("name", "petya")
//                .append("age", new Document("$gt", 32));
//        System.out.println(filter);
//        collection.find(filter).into(new ArrayList<>()).forEach(System.out::println);

//        Bson gtAge = gt("age", 32);
//        collection.find(gtAge).into(new ArrayList<>()).forEach(System.out::println);

//        Bson nameFilter = Filters.eq("name", "petya");
//        Bson ageFilter = Filters.gt("age", 40);
//        Bson filter = Filters.and(ageFilter, nameFilter);

//        Bson eqName1 = Filters.eq("name", "vasya");
//        Bson eqName2 = Filters.eq("name", "petya");
//        Bson filter = Filters.or(eqName1, eqName2);
////        collection.find(filter).into(new ArrayList<>()).forEach(System.out::println);
//
////        Document projection = new Document("_id", 1);
//
//        Bson exclude = Projections.exclude("_id");
//        collection
//                .find(filter)
//                .sort(Sorts.ascending("name"))
//                .projection(exclude)
//                .skip(2)
//                .limit(3)
//                .into(new ArrayList<>()).forEach(System.out::println);


//        collection.replaceOne(
//                Filters.eq("koko", 23),
//                new Document("name", "koko").append("age", 23)
//        )
//        ;
        collection.find().into(new ArrayList<>()).forEach(System.out::println);
        System.out.println("**********");

        Bson eq = Filters.eq("name", "koko");
        collection.updateOne(eq, new Document("$set", new Document("name", "rokoko")));

        collection.find().into(new ArrayList<>()).forEach(System.out::println);

    }
}
