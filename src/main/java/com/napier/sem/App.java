package com.napier.sem;

import java.sql.Connection;

/**
 * Project Authors: Colin, Cameron, Luke, Del
 * Date last modified: 19/02/2021
 * Purpose of program: To run SQL queries to satisfy the given requirements
 */

public class App
{
    public static void main(String[] args)
    {

        // Create new db object from class
        DbConnection dbc = new DbConnection();

        // Connect to database
        dbc.connect();

        // Gets connection value
        Connection con = dbc.getConnection();

        // Disconnect from database
        dbc.disconnect();

    }
}