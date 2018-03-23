package reporting;
import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
	
	public EmployeeReportFormatter(Object object, FormatType formatType) {
		super(object, formatType);
	}
	Employee anEmployee;
//	FormateType formateType;

	public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
		super(anEmployee, formatType);
		this.anEmployee = anEmployee;
	}
	public String getFormattedEmployee() {
		return getFormatedValue();
	}
}
