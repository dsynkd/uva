/* @JUDGE_ID: darrensadr 272 JAVA */ 

import java.io.*;
import java.util.*;

class Main
{
	public static void main (String args[]) throws Exception
	{
		String input;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Boolean osc = true;
		while ((input = reader.readLine()) != null) {
			String output = "";
			for(char ch : input.toCharArray()) {
				if(ch == '"') {
					output += (osc ? "``" : "''");
					osc = !osc;
				}
				else {
					output += ch;
				}
			}
			System.out.println(output);
		}
	}
}