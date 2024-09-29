package interviewpreparation.java8;

import java.util.Date;
import java.util.Objects;

public class Employee {
	private Integer empId;
	private String empName;
	private Double empSlary;
	private String dateofBirth;
	private String dateofJoining;
	private String department;
	private String location;
	private String gender;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSlary() {
		return empSlary;
	}

	public void setEmpSlary(Double empSlary) {
		this.empSlary = empSlary;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, Double empSlary, String string, String string2,
			String department, String location, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSlary = empSlary;
		this.dateofBirth = string;
		this.dateofJoining = string2;
		this.department = department;
		this.location = location;
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateofBirth, dateofJoining, department, empId, empName, empSlary, gender, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateofBirth, other.dateofBirth) && Objects.equals(dateofJoining, other.dateofJoining)
				&& Objects.equals(department, other.department) && Objects.equals(empId, other.empId)
				&& Objects.equals(empName, other.empName) && Objects.equals(empSlary, other.empSlary)
				&& Objects.equals(gender, other.gender) && Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSlary=" + empSlary + ", dateofBirth="
				+ dateofBirth + ", dateofJoining=" + dateofJoining + ", department=" + department + ", location="
				+ location + ", gender=" + gender + "]";
	}

}
