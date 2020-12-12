package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

class VisitorLog{
	
	String name;
	String phone;
	double fever;
	String entryDateTimeStamp;
	
	public VisitorLog() {
		
	}
	
	public VisitorLog(String name, String phone, double fever, String entryDateTimeStamp) {
		this.name = name;
		this.phone = phone;
		this.fever = fever;
		this.entryDateTimeStamp = entryDateTimeStamp;
	}
	
	public String toString() {
		return name+","+phone+","+fever+","+entryDateTimeStamp+"\n";
	}
	
}

public class FileWriterReader {
	
	static void write(String data) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/logs.csv");
			//FileWriter writer = new FileWriter(file);		// always overwrite
			FileWriter writer = new FileWriter(file, true);	// append mode enabled
			// write the data as text i.e. String in file :)
			writer.write(data);
			writer.close();
			System.out.println("Data Saved in File "+file.getName());
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	static void read() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/logs.csv");
			FileReader reader = new FileReader(file);				// -> Reads Char by Char
			BufferedReader buffer = new BufferedReader(reader);		// -> Reads Line by Line
			
			String line = "";
			
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		
		VisitorLog log1 = new VisitorLog("George", "+91 87654 22222", 98.9, new Date().toString());
		System.out.println(log1);
		
		System.out.println("Would you like to save this log ?");
		
		String option = scanner.nextLine(); // Reading String from Console
		scanner.close();
		
		if(option.equals("yes")) {
			String data = log1.toString();
			FileIO.write(data);
		}*/
		
		FileWriterReader.read();

	}

}
