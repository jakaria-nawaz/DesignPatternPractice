package domain.dao;
import domain.Employee;

public class EmployeeDAO {
//	DatabaseConnectionManager connectionManager;
	
	public void saveEmployee(Employee emp) {
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//		System.out.println("Employee saved");
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("");
//		connectionManager.disconnect();
		System.out.println("Employee saved: "+ emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Employee deleted: "+ emp);
	}
}
