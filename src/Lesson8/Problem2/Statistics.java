package Lesson8.Problem2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> employees) {
		//return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return
		double sum = 0.0;
		for(EmployeeData emp : employees) {
			sum += emp.getSalary();
		}
		return sum;
	}
}
