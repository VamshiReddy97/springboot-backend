package com.javaintern.springbootbackend;

import com.javaintern.springbootbackend.model.Employee;
import com.javaintern.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("vamshi");
		employee.setLastName("reddy");
		employee.setEmailId("vamshireddy@gmail.com");
		employeeRepository.save(employee);

		Employee employee1= new Employee();
		employee1.setFirstName("umesh");
		employee1.setLastName("reddy");
		employee1.setEmailId("umeshreddy@gmail.com");
		employeeRepository.save(employee1);
	}
}
