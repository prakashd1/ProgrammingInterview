package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spiral {

	public static int[][] createSpiral(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Please input number greater than 0");
		}
		int i[][] = new int[n][n];
		boolean centre = false;
		
		int x = 0, y = 0, cnt = 0;
		
	

		return i;

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Size of sprial");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String ip = reader.readLine();
		int n = Integer.parseInt(ip);
		createSpiral(n);

	}
}
