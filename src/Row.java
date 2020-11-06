import java.util.Random;
import java.util.UUID;

public class Row {

	int numRows = 2000;
	
	Random r = new Random();
	
	String columns = "\"lat\",\"lng\",\"url\",\"id\",\"user\",\"del\",\"upvotes\",\"trips\",\"uploaded\",\"on\"\n";
	
	char sq='"';
	String lat = sq + String.valueOf(44.36 + (48.99 - (44.36)) * r.nextDouble()) + sq;
	String lng = sq +String.valueOf(-116.0458 + (-104.0186 - (-116.0458)) * r.nextDouble()) + sq;
	String url = sq +"https://i.ibb.co/9G1K3v5/1fd5e3ab-dfc5-4b16-9fa9-c1c2ada4e54b.jpg" + sq;
	String id = sq +UUID.randomUUID().toString().replace("-", "") + sq;
	String user = sq +UUID.randomUUID().toString().replace("-", "") + sq;
	String del = sq +"https://ibb.co/1bPyJnW/54ba619dfb17a18d318c663c31e41b7b" + sq;
	String upvotes = sq + "{}" + sq;
	String trips = sq +"{}" + sq;
	String uploaded =  sq + "1603682935469" + sq; 
	String on = sq +"t" +sq ;
		
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
			+"\n";
}
