package com.fatihsevuk.java17.lesson5_Exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Arrays;

class MyResource implements AutoCloseable {

    private static int nextId = 0;
    private final int id = nextId++;

    {
        System.out.println("Initializing MyResource id= "+id);
    }

    @Override
    public void close() throws SQLException {
        System.out.println("Closing id= "+id);

        if(Math.random() > 0.5) {
            System.out.println(" -Failing close of :"+id);
            throw new SQLException("Closing failed id: "+id);
        }
        System.out.println(" - Closed "+id+" successfully!");
    }
}

public class CloseExamples {
    public static void main(String[] args) {
        System.out.println("Starting");
        try(
                MyResource mr1 = new MyResource();
                MyResource mr2 = new MyResource();
                MyResource mr3 = new MyResource();
        ) {
            System.out.println("Using resources...");

            if(Math.random() > 0.5) {
                System.out.println("Throwing fnfe in main try block!");
                throw new FileNotFoundException("fnfe!");
            }
            System.out.println("main try succeed!");

        } catch (SQLException e) {
            System.out.println("Problem closing. "+e.getMessage());
            System.out.println("Problem closing. "+ Arrays.toString(e.getSuppressed()));
        } catch (FileNotFoundException e) {
            System.out.println("Problem in try fnfe!");
            System.out.println("Problem closing. "+ Arrays.toString(e.getSuppressed()));
        }
        System.out.println("Ending ...");
    }
}
