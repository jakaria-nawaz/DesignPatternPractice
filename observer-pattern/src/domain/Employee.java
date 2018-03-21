package domain;

import java.util.Date;

public class Employee {
	private String name;
	private Date hireDate;
	private int salary;
	private int employeeID;
	private boolean status;
	
	private static int COUNTER;

	public Employee(String name, Date hireDate, int salary, int employeeID, boolean status) {
		super();
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.status = status;
		
		employeeID = ++COUNTER;
	}

	public String getName() {
		return this.name;
	}
	
	
	
}
