package hacker.rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SolutionEOF {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		List<String> data = getData();
		int i = 1;
		for (String dataRow : data) {
			System.out.println(i + " " + dataRow);
			i++;
		}
	}

	private static List<String> getData() {
		List<String> result = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			while ((input = br.readLine()) != null) {
				result.add(input);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}

