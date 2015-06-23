package hacker.rank.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	private final static int indexOfA = 0;
	private final static int indexOfB = 1;
	private final static int indexOfN = 2;

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		List<String> data = getData();
		int[] parcedData;
		int a, b, n;
		for (String dataRow : data) {
			parcedData = parseData(dataRow);
			if (verifyConstraints(parcedData)) {
				a = parcedData[indexOfA];
				b = parcedData[indexOfB];
				n = parcedData[indexOfN];

				printAnswer(a, b, n);

			} else {
				System.out.println("Data doesn't match constraints.");
			}
		}

	}

	private static void printAnswer(int a, int b, int n) {
		int result = a;

		for (int i = 0; i < n; i++) {
			result += Math.pow(2, i) * b;
			System.out.print(result + " ");
		}
		System.out.println();
	}

	//	0≤a,b≤50
	//	1≤n≤15
	private static boolean verifyConstraints(int[] data) {
		int a = data[indexOfA];
		int b = data[indexOfB];
		int n = data[indexOfN];

		boolean firstConstr = a >= 0 && a <= 50 && b >= 0 && b <= 50;
		boolean secondConstr = n >= 1 && n <= 15;

		return firstConstr && secondConstr;
	}

	// format of data = "0 2 10";
	private static int[] parseData(String data) {
		String[] splitedData = data.split(" ");
		int[] result = new int[splitedData.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.valueOf(splitedData[i]);
		}
		return result;
	}

	private static List<String> getData() {
		List<String> result = new ArrayList<>();
		int numberOfIntegers = 1;
		int i = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;

			while (i <= numberOfIntegers && (input = br.readLine()) != null) {
				if (i == 0) {
					if (fitInt(input)) {
						numberOfIntegers = Integer.valueOf(input);
					} else {
						System.out.println("Wrong numberOfIntegers");
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

	private static boolean fitInt(String number) {
		try {
			Integer.valueOf(number);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}
}