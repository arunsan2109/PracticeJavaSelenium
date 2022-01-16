package Program;

public class RandomNumber {
	
	public void getRandomNumber(){
		double temp;
		temp = Math.random()*100;
		int result = (int) Math.round(temp);
		System.out.println("Random Number " +result);
	}

	public static void main(String[] args){
		
		RandomNumber randomNumber = new RandomNumber();
		randomNumber.getRandomNumber();
	}
}
