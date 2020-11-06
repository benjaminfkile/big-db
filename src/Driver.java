import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter; // Import the FileWriter class

public class Driver {

	public static void main(String[] args) {
		try {
			File myObj = new File("/home/bk/Desktop/big-db.csv");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				write();
			} else {
				System.out.println("File already exists.");
				write();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void write() {
		try {
			FileWriter myWriter = new FileWriter("/home/bk/Desktop/big-db.csv");
			Row r = new Row();
			myWriter.write(r.columns);
			for (int i = 0; i < r.numRows; i++) {
				Row nr = new Row();
				myWriter.write(nr.newRow);
			}

			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
