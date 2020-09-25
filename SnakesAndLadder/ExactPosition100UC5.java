import java.util.Random;

public class ExactPosition100UC5{
	
	static final int ladder = 1, snake = 2;
	static int moves = 0;

	public static int getNumber(int a){
		Random rand = new Random();
		int max =a;
		int num = rand.nextInt(max);

		return num;
	}

	public static int checkOptions() {
		int num = getNumber(3);
		System.out.println("........" +num);
		return num;
	}

	public static void movement(int option, int steps){

		switch (option){
			case ladder:	
				if (moves + steps <=100)
					moves += steps;
				break;
			case snake:
				if(moves -steps >= 0)
					moves -= steps;
				else
					moves = 0;
				break;
			default: 
		}

		System.out.println("The total moves is " + moves);
	}
	public static void main(String[] args){

		int num = getNumber(6) + 1;
		System.out.println("The number obtained is: " + num);

		int option = checkOptions();
		System.out.println("The option obtained is: " + option);	
		movement(option, num);
		
	}
}