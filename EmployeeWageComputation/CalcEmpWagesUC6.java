public class CalcEmpWagesUC6{

	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	static final int total_working_days = 20;
	static final int total_working_hours = 100;
	public static void main(String args[]){

		int work_hours = 0;
		int perhour_wage = 20;	
		int total_wages = 0, total_hours = 0, total_days = 0;	
		
		while (total_days < total_working_days && total_hours <= total_working_hours)
		{
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

			total_hours += work_hours;
			total_days++;

			System.out.println("Total hours: " + total_hours);
		}

		System.out.println("The Total Monthly wages are " + total_hours * perhour_wage);
	}
}