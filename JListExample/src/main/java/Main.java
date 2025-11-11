
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Main {

	public static void main(String[] args) {
		Gson gson = new Gson();
		JsonReader jsonReader;
		try {
			JsonReader jsonReader2=jsonReader = readDataFromFile("portugal.json");
			Type userListType = new TypeToken<ArrayList<Distrito>>(){}.getType();
			 
			ArrayList<Distrito> distritos=gson.fromJson(jsonReader2, userListType);
			System.out.println(distritos);
			
			new JListExample().createGUI(distritos);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static JsonReader readDataFromFile(String fileName) throws FileNotFoundException {
		return new JsonReader( new FileReader(fileName) );
	}

}
