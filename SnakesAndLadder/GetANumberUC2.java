import java.util.Random;

public class GetANumberUC2{
	public static void main(String[] args){

		Random rand = new Random();
		int max =6;
		int num = rand.nextInt(max);

		System.out.println("The number obtained is: " + num);
	}
}