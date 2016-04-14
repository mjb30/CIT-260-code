import java.io.*;

public class ReadMovie {

	public static void main(String[] args) throws IOException {
		
		final int TITLE_SIZE = 22;
		final int RATING_SIZE = 4;
		
        RandomAccessFile raf = new RandomAccessFile("movies.dat", "rw");
        
        while(raf.getFilePointer() < raf.length()){
        	System.out.print(raf.readUTF());
        	System.out.println(raf.readInt());
        }
        raf.seek(TITLE_SIZE);
        raf.writeInt(29);
        
        raf.seek((TITLE_SIZE + RATING_SIZE) * 5 + TITLE_SIZE);
        raf.writeInt(92);
        
        raf.close();
        
	}

}
