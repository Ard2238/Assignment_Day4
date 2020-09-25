public class PartTimeWageUC3{
	public static void main(String args[]){

		int present_fulltime= 1, present_parttime=2, fullday_hours= 0;
		int perhour_wage = 20;
		int checkEmp = (int) (Math.random() * 10) % 3;
		
		if( checkEmp == present_parttime){
			fullday_hours = 4;
		}
		else if ( checkEmp == present_fulltime){
			fullday_hours = 8;
		}
		
		int wages = perhour_wage * fullday_hours;
		System.out.println("The Employee wages are " + wages);
	}
}