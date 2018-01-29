package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
/*
 * int getEmployeeId() 
 * String FirstName()
 * String LastName() 
 * String FullName() 
 * String getDepartment()
 * void setDepartment(String department)
 *  public double getAnnualSalary() 
 *  public void RaiseSalary(double percentage)
 */
	
	private Employee person;

	@Before
	public void setup() {
		person = new Employee(100, "John", "Doe", 50000.00);
	}
	
	@Test
	public void get_employee_id() {
		//arrange
		//act
		int id = person.getEmployeeId();
		//assert
//		Assert.assertEquals("Should be 100", person.getEmployeeId() == 100);
		Assert.assertEquals("Should be 100", 100, id);
}
	@Test
	public void get_employee_first_name() {
		//arrange
		//act
		
		//assert
		Assert.assertEquals("Employee's first name should be John", "John", person.FirstName());
}
	@Test
	public void get_employee_last_name() {
		//arrange
		//act
		
		//assert
		Assert.assertEquals("Employee's last name should be Doe", "Doe", person.LastName());
}
	@Test
	public void get_employee_full_name() {
		//arrange
		//act
		
		//assert
		Assert.assertEquals("Employee's last name should be Doe", "Doe, John", person.FullName());
}
	
	@Test
	public void set_employee_department() {
		//arrange
		//act
		person.setDepartment("Finance");
		//assert
		Assert.assertEquals("Employee's Department should be Finance", "Finance", person.getDepartment());
}
	@Test
	public void get_employee_salary() {
		//arrange
		//act
		//assert
		Assert.assertTrue("Salary should equal 5000", person.getAnnualSalary() ==50000.00);
	}
	@Test
	public void raise_employee_salary() {
		//arrange
		//act
		person.RaiseSalary(5);
		//assert
		Assert.assertTrue("Salary should equal 52500", person.getAnnualSalary() ==52500.00);
	}
	
	
	
}
