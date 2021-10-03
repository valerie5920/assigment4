package plswork;

import java.io.*;

public class Employeedemo  { 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		System.out.println(employee1.getName());
		System.out.println(employee2.getName());
//save to a text flie 
	}

}
 