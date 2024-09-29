package interviewpreparation.java8;

import java.util.ArrayList;

public class ClientCode {
	public static void main(String[] args) {
		ArrayList<Employee> employeData = new ArrayList<>();
		employeData.add(new Employee(123, "chandu", 42343.43, "31", "2023-11-21", "HR", "Hyderabad", "male"));
		employeData.add(new Employee(23, "chandu", 42343.43, "29", "2022-10-1", "Java", "Bang", "female"));
		employeData.add(new Employee(13, "chandu", 42343.43, "19", "2018-09-13", "c", "pune", "male"));
		employeData.add(new Employee(31, "chandu", 42343.43, "22", "2017-01-01", "HR", "delhi", "male"));
		employeData.add(new Employee(32, "chandu", 42343.43, "16", "2024-08-23", "python", "Hyderabad", "female"));
		employeData.add(new Employee(131, "chandu", 42343.43, "09", "2019-01-01", "HR", "pune", "female"));
		employeData.add(new Employee(132, "chandu", 42343.43, "4", "2015-6-09", "db", "Hyderabad", "male"));
		employeData.add(new Employee(111, "chandu", 42343.43, "23", "2008-01-01", "security", "noida", "female"));
		employeData.add(new Employee(133, "chandu", 42343.43, "13", "2014-01-01", "UI", "Hyderabad", "trans"));
		employeData.add(new Employee(122, "chandu", 42343.43, "21", "2024-01-01", "Angular", "chennai", "female"));
		employeData.add(new Employee(113, "chandu", 42343.43, "21", "2009-01-01", "HR", "Hyderabad", "male"));

		employeData.forEach(System.out::println);

		// get above 30 age male employees.who are working in Hyderabad location
		// employeData.stream().filter(age->age.getEmpId()>30 )

	}
}
