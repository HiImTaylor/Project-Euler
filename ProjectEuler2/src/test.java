
public class test {
	/*
	 * Problem statement:
	 * 
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
	 * By starting with 1 and 2, the first 10 terms will be:
	 * 		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
	 * find the sum of the even-valued terms.
	 */
	private static long first, second, next, value;
	
	public static void main(String[] args) {
		first = 1;
		second = 2;
		next = first + second;
		System.out.println("First is: " + first + "	Second is: " + second + "	Next is: " + next);
		
		while(second < 4000000){
			first = second;
			second = next;
			next = first + second;
		}
		
		System.out.println("First is: " + first + "	Second is: " + second + "	Next is: " + next);
	}
	
}