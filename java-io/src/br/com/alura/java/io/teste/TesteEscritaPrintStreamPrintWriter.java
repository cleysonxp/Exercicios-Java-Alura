package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
					
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintStream ps = new PrintStream("lorem.txt");

		ps.println("Teste Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");		
		ps.println("Teste tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		ps.print("Teste tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

		ps.close();

	}
}