/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addactionopoints;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.QueryBuilder;
import static java.lang.System.out;
import java.util.regex.Pattern;
import org.bson.types.ObjectId;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author user
 */
public class AvatarDAO {
    
    

    
   public void updatePAAll() throws Exception {
        ConnectionDBM mon = new ConnectionDBM();
        JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
    DBCursor cursor = null;
        try {
            
            DB db = mon.getcon();
            DBCollection table = db.getCollection("Avatar");
            BasicDBObject searchQuery = new BasicDBObject();
            BasicDBObject searchQuery1 = new BasicDBObject();
            DBObject query =null;
            String nom = "";
            cursor = table.find();
        while (cursor.hasNext()) {
            DBObject obje = cursor.next();
            nom = String.valueOf(obje.get("nom"));
            updatePA(nom);
            arr.put(obj);
            obj = new JSONObject();
        }
    } catch (Exception e) {
        e.getMessage();
    }

    }
   
   public Avatar findAvatarOne(String nm) throws Exception {
       ConnectionDBM mon = new ConnectionDBM();
        DBCursor cursor = null; DBCursor cursor1 = null;
        Avatar ct1=new Avatar();
        try {
            DB db = mon.getcon();
            DBCollection table = db.getCollection("Avatar");
            BasicDBObject searchQuery = new BasicDBObject();
            BasicDBObject searchQuery1 = new BasicDBObject();
             DBObject query =
            QueryBuilder.start().or(
                    QueryBuilder.start("nom").regex(Pattern.compile(nm)).get()
            ).get();

            
            cursor = table.find(query);
            
           int a=0;
          
            while (cursor.hasNext()) 
            {
                 DBObject obj = cursor.next();
                
                        ObjectId id  = (ObjectId)(obj.get("_id"));
                        String nom = String.valueOf(obj.get("nom"));
                        String user = String.valueOf(obj.get("user"));
                        String gout = String.valueOf(obj.get("gout"));
                        String caractere = String.valueOf(obj.get("caractere"));
                        String message = String.valueOf(obj.get("message"));
                        String requete = String.valueOf(obj.get("requete"));
                        Double humeur = Double.parseDouble(String.valueOf(obj.get("humeur")));
                        Double attention = Double.parseDouble(String.valueOf(obj.get("attention")));
                        Double pa = Double.parseDouble(String.valueOf(obj.get("pa")));
                        Double img = Double.parseDouble(String.valueOf(obj.get("img")));
                        
                        ct1=new Avatar(id, nom, user, gout, caractere, message, requete, humeur, attention, pa, img);
                        a++;
            }
            
            
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return ct1;
    }
   
   public void updatePA(String n) throws Exception {
        ConnectionDBM mon = new ConnectionDBM();
        Avatar aa=findAvatarOne(n);
        
        try {
            
            DB db = mon.getcon();
            DBCollection table = db.getCollection("Avatar");
            BasicDBObject document = new BasicDBObject();
            
            BasicDBObject document2 = new BasicDBObject();
            document2.put("nom", aa.getNom());
            document.put("nom", aa.getNom());
            document2.put("user", aa.getUser());            
            document.put("user", aa.getUser());
            document2.put("gout", aa.getGout());            
            document.put("gout", aa.getGout());
            document2.put("caractere", aa.getCaractere());            
            document.put("caractere", aa.getCaractere());
            document2.put("message", aa.getMessage());            
            document.put("message", aa.getMessage());
            document2.put("requete", aa.getRequete());            
            document.put("requete", aa.getRequete());
            document2.put("humeur", aa.getHumeur());
            document.put("humeur", aa.getHumeur());
            document2.put("attention", aa.getAttention());            
            document.put("attention", aa.getAttention());
            document2.put("pa", aa.getPa());
            if(aa.getPa()==10){
                document.put("pa", aa.getPa());
            }
            else{
                document.put("pa", aa.getPa()+1);
            }
            document.put("img", aa.getImg());
            document2.put("img", aa.getImg());
            
            table.update(document2, document);
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
    
    
}
