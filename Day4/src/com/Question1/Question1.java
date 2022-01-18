package com.Question1;

//Write a program to Read from file in byte format and Write to command prompt in both byte format and using
//formatted output(System.out.print or println)


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question1 {

	private static byte[] readFileContent(File file) {
		byte[] ar = new byte[(int) file.length()];

		try (FileInputStream input = new FileInputStream(file)) {

			// converting file into array of bytes
			input.read(ar);
			for (byte temp : ar) {
				System.out.print(temp);
			}
			System.out.println();
			// Printing in char format
			for (byte a : ar) {
				System.out.print((char) a);
			}

		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ar;
	}

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		readFileContent(file);
	}

}