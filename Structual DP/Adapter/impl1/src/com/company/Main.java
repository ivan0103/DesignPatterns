package com.company;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		/** Using Object Adapter **/

		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter adapter1 = new EmployeeObjectAdapter(employee);
		String card1 = designer.designCard(adapter1);
		System.out.println(card1);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
