package com.java.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) {

        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("D:\\anudip\\java\\kou.txt");
            // Created BufferedReader with the underlying Reader
            br = new BufferedReader(reader);
            // Check if markSupported by BufferedReader
            System.out.println("Is Mark Supported:" + br.markSupported());
            if (br.markSupported()) {
                // marks the current position
                // 10 characters to be read before the mark position becomes invalid
                br.mark(10);
            }
            // Skip 5 characters of data
            br.skip(5);
            System.out.print("After Skip File Content:");
            // Checks if the stream is ready to be read
            while (br.ready()) {
                // Reading one character for each loop
                System.out.print((char) br.read());
            }
            // Resets to the earlier marked position
            br.reset();
            System.out.println("");
            System.out.print("After Reset File Content using readLine:");
            while (br.ready()) {
                // Using readLIne to read one line for each loop
                System.out.print(br.readLine());
            }
            // Resetting again to the earlier marked position
            br.reset();
            System.out.println("");
            System.out.print("Reading characters into char Array:");
            char c[] = new char[10];
            if (br.ready()) {
                br.read(c);
                for (int i = 0; i < 10; i++) {
                    System.out.print(c[i]);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the streams
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }



}
