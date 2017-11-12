package Persistence;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class MongoConexion {

    private String ip = "192.168.1.67";
    private String database = "panapa";
    private int port = 27017;

    public MongoConexion() {
    }

    public MongoClient getConexion() {
        return new MongoClient(new ServerAddress(getIp(), getPort()));
    }

    public DB getDB() {
        return getConexion().getDB(getDatabase());
    }

    public String getIp() {
        return ip;
    }

    public String getDatabase() {
        return database;
    }

    public int getPort() {
        return port;
    }
}
