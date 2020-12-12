package co.edureka.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class FileOutputInput {

	static void write(String data) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/logs1.csv");
			//FileOutputStream stream = new FileOutputStream(file);	// always overwrite
			FileOutputStream stream = new FileOutputStream(file, true);	// append mode enabled
			// write the data as bytes when we use FileOutputStream
			stream.write(data.getBytes());
			stream.close();
			System.out.println("Data Saved in File "+file.getName());
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	static void read() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/logs1.csv");
			FileInputStream stream = new FileInputStream(file);
			
			int i = 0;
			
			while((i = stream.read()) != -1) {
				char ch = (char)i;
				System.out.print(ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		/*
		VisitorLog log1 = new VisitorLog("Kia", "+91 87654 12345", 98.4, new Date().toString());
		System.out.println(log1);
		
		String data = log1.toString();
		FileOutputInput.write(data);*/
		
		FileOutputInput.read();
	}

}
