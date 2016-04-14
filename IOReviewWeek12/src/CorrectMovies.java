import java.io.*;
public class CorrectMovies {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub 
		final int TITLE = 22;
		final int RATING = 4;
		
		RandomAccessFile raf = new RandomAccessFile("movies.dat", "rw");
		
		raf.seek(22);
		raf.writeInt(99);
		
		raf.seek((TITLE + RATING)*5 + TITLE);
		raf.writeInt(92);
		
		raf.seek(0);
		
		while(raf.getFilePointer() < raf.length()){
			System.out.print(raf.readUTF()); 
			System.out.println(raf.readInt());
		}
		
		raf.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cellphoneobjects.dat"));
		
		CellPhone obj = (CellPhone) ois.readObject();
		obj.printPhone();
		
		
		
		
	}

}
