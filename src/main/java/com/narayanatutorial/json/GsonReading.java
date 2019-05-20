package com.narayanatutorial.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class GsonReading {

	
	public static void main(String args[]) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("D:/employee"));
		String line="";
		while((line= reader.readLine()) != null) {
			if(line.contains("empID")) {
				String[] arr=line.split(":");
				System.out.println(arr[0]+" "+arr[1]);
			}
			//System.out.println("line:"+line);
		}
	}
}
