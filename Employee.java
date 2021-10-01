package test;

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
		public Employee(String n, int id, String dept, String pos) {
		name = n; 
		idNumber = id;
		department = dept;
		position = pos;
		} //ending assigning stuff
		public void setname(String newname) {
			name= newname;
		}//end setname
		public void setidNumber(int newidNumber) {
			idNumber = newidNumber;
		}//end setidNumber
		public void setdepartment(String newdepartment) {
			department = newdepartment;
			
		}//end setdepartment
		public void  setposition(String newposition){
			position = newposition;
		}
		public String getName()
		{ 	return name;
		
		}//end return 
		public int getnewidNumber() { 
			return idNumber;
		}//return id
		public String getnewdepartment()  {
			return department;
		}
		public String getnewposition(){
			return position; 
		}
		
		 
			//end setposition
			
	}//end class





