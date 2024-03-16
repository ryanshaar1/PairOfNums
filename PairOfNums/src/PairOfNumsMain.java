import java.util.*;
public class PairOfNumsMain {
	public static Scanner reader = new Scanner(System.in);
	public static PairOfNums[] generate(int n) {
		PairOfNums[] pair = new PairOfNums[n];
		boolean isPair = false;
		for(int i =0 ;i<n ; i++) {
			isPair = false;
			while(isPair == false) {
				int num1 = (int)(Math.random()*1000)+1;
				int num2 = (int)(Math.random()*1000)+1;
				pair[i] = new PairOfNums(num1,num2);
				if(pair[i].endStart() == true) {
					isPair =true;
				}
			}

		}
		return pair;
	}
}
