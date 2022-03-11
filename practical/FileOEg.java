import java.io.*;

public class FileOEg {
public static void main(String[] args) throws IOException {
	File input =new File("D:\\input1.txt");
	File output =new File("D:\\input2.txt");
	
	FileReader fr =new FileReader(input);
	FileWriter fw =new FileWriter(output);
	
	int i;
	while((i=fr.read())!= -1){
		System.out.print((char)i);
	}
	fr.close();
	fw.close();
	
}
}
