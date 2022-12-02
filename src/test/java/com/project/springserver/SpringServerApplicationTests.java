package com.project.springserver;

import com.project.springserver.model.employee.Employee;
import com.project.springserver.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {
	@Autowired
	private EmployeeDao employeeDao;

//	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Bruce Wayne");
		employee.setLocation("Khushibun");
		employee.setBranch("Security");
		employeeDao.save(employee);
	}

//	@Test
	void getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		System.out.println(employees);
	}

	@Test
	void getAllEmployeesAndDeleteThem() {
		List<Employee> employees = employeeDao.getAllEmployees();
		for (Employee employee: employees) {
			employeeDao.delete(employee);
		}
	}

}
