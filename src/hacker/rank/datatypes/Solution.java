package hacker.rank.datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		List<String> data = getData();

		for (String number : data) {
			if (!fitLong(number)) {
				System.out.println(number + " can't be fitted anywhere.");
			} else {
				System.out.println(number + " can be fitted in:");
			}

			if (fitByte(number)) {
				System.out.println("* byte");
			}
			if (fitShort(number)) {
				System.out.println("* short");
			}
			if (fitInt(number)) {
				System.out.println("* int");
			}
			if (fitLong(number)) {
				System.out.println("* long");
			}
		}

	}

	private static List<String> getData() {
		List<String> result = new ArrayList<>();
		int number = 1;
		int i = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;

			while (i <= number && (input = br.readLine()) != null) {
				if (i == 0) {
					try {
						number = Integer.valueOf(input);
					}
					catch (NumberFormatException nfe) {
						System.out.println("Wrong number");
						continue;
					}
				} else {
					result.add(input);
				}
				i++;
			}

		}
		catch (IOException io) {
			io.printStackTrace();
		}
		return result;
	}

	private static boolean fitLong(String number) {
		try {
			Long.valueOf(number);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}

	private static boolean fitShort(String number) {
		try {
			Short.valueOf(number);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}

	private static boolean fitInt(String number) {
		try {
			Integer.valueOf(number);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}

	private static boolean fitByte(String number) {
		try {
			Byte.valueOf(number);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}

}