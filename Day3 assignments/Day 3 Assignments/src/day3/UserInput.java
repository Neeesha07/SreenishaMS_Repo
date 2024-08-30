package day3;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scanner.nextInt();
		System.out.println("Enter iterations");
		int  iterations=scanner.nextInt();
		for(int i=0;i<iterations;i++) {
			System.out.println(num+"*"+(i+1)+"="+num*(i+1));
		}
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println(name.length());
		System.out.println("Hello"+" "+name);
		System.out.println(name.toLowerCase());
				}
       

}
