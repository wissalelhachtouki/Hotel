/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
    private static String login = "root";
	private static String password = "root";
	private static String  url = "jdbc:mysql://localhost/hotel?serverTimezone=UTC";
	private Connection connection = null;
	private static Connexion instane;
	
	private Connexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver introvable");
		} catch (SQLException e) {
			System.out.println("Connexion errror");
			System.out.println(e.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static Connexion getInstane() {
		if(instane == null)
			instane = new Connexion();
		return instane;
	}
}
