public class CalculateMonthlyWagesUC5{

	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	static final int total_working_days = 20;
	public static void main(String args[]){

		int work_hours = 0;
		int perhour_wage = 20;	
		int total_wages = 0;	
		
		for(int i=0; i<total_working_days; i++){
			int checkEmp = (int) (Math.random() * 10) % 3;
			switch (checkEmp){
				case present_fulltime:
					work_hours = 8;
					break;
				case present_parttime:
					work_hours = 4;
					break;
				default:
					work_hours = 0;		
			}
		
			int wages = perhour_wage * work_hours;
 			total_wages +=  wages;
		}
		System.out.println("The Total Monthly wages are " + total_wages);
	}
}