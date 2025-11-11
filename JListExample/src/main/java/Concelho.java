import java.util.ArrayList;
import java.util.Arrays;

public class Concelho {
	@Override
	public String toString() {
		return "Concelho [name=" + name + ", code=" + code + ", freguesias=" + freguesias + "]";
	}
	public final String name;
	public final int code;
	public final ArrayList<Freguesia> freguesias;
	public Concelho(String name, int code, ArrayList<Freguesia> freguesias) {
		super();
		this.name = name;
		this.code = code;
		this.freguesias = freguesias;
	}
}
