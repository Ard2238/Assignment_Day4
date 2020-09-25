public class CalculatEmpWageUC2{
	public static void main(String args[]){

		int present = 1, fullday_hours= 8;
		int perhour_wage = 20;
		int checkEmp = (int) (Math.random() * 10) % 2;
		
		if( checkEmp != present){
			fullday_hours = 0;
		}
		
		int wages = perhour_wage * fullday_hours;
		System.out.println("The Employee wages are " + wages);
	}
}