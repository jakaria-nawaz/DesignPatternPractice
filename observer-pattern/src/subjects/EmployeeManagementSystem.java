package subjects;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;
// import subjects.ISubject;

public class EmployeeManagementSystem implements ISubject {
	
	private Employee employee;
	
	private String msg;
	private EmployeeDAO employeeDAO;
	
	private List<IObserver> observers;
	private List<Employee> employees;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}
	
	public void hireNewEMployee(Employee emp) {
		employee = emp;
		msg = "We have a new hire";
		employees.add(emp);
		notifyObservers();
	}
	
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	public void removeObserver(IObserver o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for(IObserver departments : observers) {
			departments.callMe(employee, msg);
		}
	}
	
}
