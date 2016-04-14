import java.io.*;

public class ReadMystery {

	public static void main(String[] args) throws IOException {
		DataInputStream inputFile = new DataInputStream(new FileInputStream("mystery.dat"));
		
		boolean isEnd = false;
		
		while(!isEnd){
			try{
				System.out.print(inputFile.readInt());
			}catch(EOFException e){
				isEnd = true;
			}
		}	
		inputFile.close();
	}

}
	