package hello;

import java.sql.ResultSet;

/**
 * Class that selects from the database
 * @author Zach Panzarino
 * @version 1.0.0
 */
public class Inserter extends Worker {
    /**
     * Creates a new Inserter with a database connection
     * @param url The database URL
     * @param username The database username
     * @param password The database password
     */
    public Inserter(String url, String username, String password){
        super(url, username, password);
    }
    /**
     * Inserts into the database
     * @param into What table and/or columns to use
     * @param value What to be inserted
     * @return Results of executed query
     */
    public ResultSet select(String into, String value){
        String query = "INSERT INTO "+into+" VALUES "+value;
        return execute(query);
    }
}