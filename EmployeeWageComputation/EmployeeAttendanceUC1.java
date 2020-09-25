public class EmployeeAttendanceUC1{
	public static void main(String args[]){

		int present = 1;
		int checkEmp = (int) (Math.random() * 10) % 2;
		
		if( checkEmp == present){
			System.out.println("Employee is present.");
		}else{
			System.out.println("Employee is absent.");
		}
	}
}