package hackerranktest;

import java.util.Scanner;

//Write your code here. DO NOT use an access modifier in your class declaration.

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
     
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
     
		in.close();
	}
}
