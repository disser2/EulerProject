import java.io.*;
import java.util.*;

public class Euler22 {

	public static void main(String[] args) {

		ArrayList<String> names = importNames("C:\\Users\\dantweiler\\eclipse-workspace\\p022_names.txt");
		Collections.sort(names);
		
		int sum = 0;
		int index = 1;
		for (String name : names) {
			int value = valueOfName(name);
			sum += value * index;
			
			System.out.println("Index: " + index + ", Name: " + name + ", ValueOfName: " + value + ", Product: " + value * index);
			
			index++;
		}
		
		System.out.println(sum);
		
	}
	
	/**
	 * Liest eine Datei ein und gibt alle von Kommas getrennte Werte als ArrayList von Strings
	 * @param filename
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> importNames(String filename) {
		ArrayList<String> names = new ArrayList<String>();
		
		String[] ar = new String[0];
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line;
		try {
			while((line = in.readLine()) != null)
			{
			    //System.out.println(line);
				ar = line.split(",");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (String a :ar) {
			names.add(a);
		}
		
		return names;
	}
	
	public static int valueOfName(String name) {

		int value = 0;
		
		for (int i = 1; i < name.length() - 1; i++) {
			char a = name.charAt(i);
			
			// "A" hat als char den Wert 65
			value += ((int) a) - 64;
		}

		return value;
	}

}
