import java.util.Random;
import java.util.UUID;

public class Row {

	int numRows = 3000;
	
	Random r = new Random();
	
	String columns = "\"lat\",\"lng\",\"url\",\"id\",\"user\",\"del\",\"upvotes\",\"trips\",\"uploaded\",\"on\",\"zone\"\n";
	
	char dq='"';
	String lat = dq + String.valueOf(33 + (49 - (33)) * r.nextDouble()) + dq;
	String lng = dq +String.valueOf(-124 + (-71 - (-124)) * r.nextDouble()) + dq;
	String url = dq +"https://i.ibb.co/9G1K3v5/1fd5e3ab-dfc5-4b16-9fa9-c1c2ada4e54b.jpg" + dq;
	String id = dq +UUID.randomUUID().toString().replace("-", "") + dq;
	String user = dq +UUID.randomUUID().toString().replace("-", "") + dq;
	String del = dq +"https://ibb.co/1bPyJnW/54ba619dfb17a18d318c663c31e41b7b" + dq;
	String upvotes = dq + "{}" + dq;
	String trips = dq +"{}" + dq;
	String uploaded =  dq + "1603682935469" + dq; 
	String on = dq +"t" +dq ;
	String zone = dq + String.valueOf(1 + (int)(Math.random() * ((70000 - 1) + 1))) + dq;
		
	String newRow = 
			lat 
			+ "," 
			+ lng 
			+ "," 
			+ url 
			+ "," 
			+ id 
			+ "," 
			+ user 
			+ "," 
			+ del 
			+ "," 
			+ upvotes 
			+ "," 
			+ trips 
			+ "," 
			+ uploaded 
			+ "," 
			+ on
			+ ","
			+ zone
			+"\n";
}
