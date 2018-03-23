package clients;
import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	
	public static void main(String[] args) {
		Employee peggy = new Employee(1, "Peggy", "Accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(emp);
//		System.out.println("Employee hired");
	}
	
	public static void terminateEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(emp);
//		System.out.println("Employee terminated");
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formateType) {
//		System.out.println("Employee report printed");
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formateType);
		System.out.println(formatter.getFormattedEmployee());		
	}
}
