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
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.QueryBuilder;

/**
 *
 * @author user
 */
public class ConnectionDBM {
    public DB getcon() throws Exception{
        //MongoClient mongo = new MongoClient("localhost", 27017);
        MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://root:root@ds127888.mlab.com:27888/minidb"));
	//DB db = mongo.getDB("minidb");
        DB db = mongo.getDB(new MongoClientURI("mongodb://root:root@ds127888.mlab.com:27888/minidb").getDatabase());
        return db;
    }
}
