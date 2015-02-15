package com.asyn.codeeval;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		try  {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String sCurrentLine;
			while ((sCurrentLine=br.readLine())!=null) {
				String[] numbers = sCurrentLine.split(";");
				String[] part1 = numbers[0].split(",");
				String[] part2 = numbers[1].split(",");
				
				for(int i=0; i<part1.length; i++) {
					for(int j=0; j<part2.length; j++) {
						if(part1[i].equals(part2[j])) {
							System.out.print(part1[i]);
							if(i != part1.length-1)
								System.out.print(",");
							break;
						}
					} // end for j
				} // end for i
				
				System.out.println();
			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} // end catch
	}

} // end class
