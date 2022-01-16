package Program;

public class ReverseNumber {

	public void getReverseNumber(){
		int expectedResult=0, reminder=0, temp=0, input = 112233;
		temp=input;
		while(temp>0){
			reminder = temp%10;
			expectedResult = (expectedResult*10) + reminder;
			temp=temp/10;
		}
		System.out.println("Reverse Number " +expectedResult);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.getReverseNumber();
	}

}
