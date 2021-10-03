package plswork;
import java.io.*;

public class Employee {

		private String name; //employee name
		private int idNumber; //ID number 
		private String department; //department 
		private String position; //position
			
		public Employee ()
		{
		name = " ";
		idNumber = 0;
		department = " ";
		position = " ";
		
		
		}//end employee
		public Employee(String n, int id, String dept, String pos) throws IOException {
		name = n; 
		idNumber = id;
		department = dept;
		position = pos;
		} //ending assigning stuff
		
		public void setName(String newname) {
			name= newname;
		}//end setname
		public void setIdNumber(int newidNumber) {
			idNumber = newidNumber;
		}//end setidNumber
		public void setDepartment(String newdepartment) {
			department = newdepartment;
			
		}//end setdepartment
		public void  setPosition(String newposition){
			position = newposition;
		}
		public String getName()
		{ 	return name;
		
		}//end return 
		public int getnewIdNumber() { 
			return idNumber;
		}//return id
		public String getnewDepartment()  {
			return department;
		}
		public String getnewPosition(){
			return position; 
		}
		
		 
			//end setposition
			
	}//end class

