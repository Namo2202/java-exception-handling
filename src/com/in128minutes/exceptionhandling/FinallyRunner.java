package com.in128minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[3];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("before scanner closed");
			if (scanner != null)
				scanner.close();
		}

		System.out.println("just before closing out main");
	}

}
