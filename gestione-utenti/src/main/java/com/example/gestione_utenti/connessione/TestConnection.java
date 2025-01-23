package com.example.gestione_utenti.connessione;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gestione-utenti";
        String username = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connessione al database riuscita!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
