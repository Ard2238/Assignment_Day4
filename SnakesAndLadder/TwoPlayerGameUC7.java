import java.util.Random;

public class TwoPlayerGameUC7{
	
	static final int ladder = 1, snake = 2;
	static int num_dice =0;
	int moves = 0, numondice = 0, option = 0; 

	public static int getNumber(int a){
		Random rand = new Random();
		int max =a;
		int num = rand.nextInt(max);

		return num;
	}

	public static int checkOptions() {
		int num = getNumber(3);
		return num;
	}

	public void movement(int option, int steps){

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

		TwoPlayerGameUC7 p1= new TwoPlayerGameUC7();
		TwoPlayerGameUC7 p2= new TwoPlayerGameUC7();

		while( p1.moves<=100 || p2.moves<=100){

			if(p1.moves== 100 || p2.moves ==100)
				break;
			p1.numondice = getNumber(6) + 1;
			p2.numondice = getNumber(6) + 1;

			p1.option = checkOptions();	
			p1.movement(p1.option, p1.numondice);

			while(p1.option == ladder){
				p1.option = checkOptions();	
				p1.movement(p1.option, p1.numondice);
			}

			p2.option = checkOptions();	
			p2.movement(p2.option, p2.numondice);

			while(p2.option == ladder){
				p2.option = checkOptions();	
				p2.movement(p1.option, p1.numondice);
			}

			System.out.println("The current position of p1 is " + p1.moves);
			System.out.println("The current position of p2 is " + p2.moves);

			num_dice++;
		}

		System.out.println("The dice was rolled " + num_dice + " times.");
		if(p2.moves == 100){
			System.out.println("P2 is the Winner !!");
		}else{
			System.out.println("P1 is the Winner !!");
		}		
	}
}