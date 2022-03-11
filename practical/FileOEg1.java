import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileOEg1 {
public static void main(String[] args) throws IOException{
	FileReader input = new FileReader("D:\\input2.txt");
	BufferedReader br =new BufferedReader(input);
	
	
	int i;
	while((i=br.read())!=-1) {
		System.out.print((char)i);
	}
	br.close();
	input.close();
}
}
