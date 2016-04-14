import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteCellPhones {

	public static void main(String[] args) throws IOException {
		// Create the stream objects.
	      FileOutputStream outStream = 
	             new FileOutputStream("cellphoneobjects.dat");
	      ObjectOutputStream objectOutputFile = 
	             new ObjectOutputStream(outStream);
	      
	      CellPhone cell1 = new CellPhone("iPhone SE", "Apple");
	      CellPhone cell2 = new CellPhone("iPhone 6s", "Apple");
	      CellPhone cell3 = new CellPhone("Galaxy S7", "Samsung");
	      CellPhone cell4 = new CellPhone("Xperia Z5 Compact", "Sony");
	      
	      // Write the serialized objects to the file.
	      
	       objectOutputFile.writeObject(cell1);
	       objectOutputFile.writeObject(cell2);
	       objectOutputFile.writeObject(cell3);
	       objectOutputFile.writeObject(cell4);
	      
	      
	      // Close the file.
	      objectOutputFile.close();

	}

}
