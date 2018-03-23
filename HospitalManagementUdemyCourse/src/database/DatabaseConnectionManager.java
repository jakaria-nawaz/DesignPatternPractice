package database;

public class DatabaseConnectionManager {
	
	// here is it not proper implementation of the class not also according to the diagram
	// proper implementation example is given in tutorial lecture 16
	public static DatabaseConnectionManager getManagerInstance() {
		System.out.println("Get database manager");
		return null;
	}
	
	public void connect() {
		System.out.println("Database connected");
	}
	
	public void getConnectionObject() {
		System.out.println("Database connection object");
	}
	
	public void disconnect() {
		System.out.println("Database disconnected");
	}
}
