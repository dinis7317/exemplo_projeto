import java.util.ArrayList;
import java.util.Arrays;

public class Distrito {
	public final String name;
	public final int code;
	public final ArrayList<Concelho> conselhos;// erro ortográfico para ser compatível com ficheiro: conselhos
	public Distrito(String name, int code, ArrayList<Concelho> concelhos) {
		super();
		this.name = name;
		this.code = code;
		this.conselhos = concelhos;
	}
	@Override
	public String toString() {
		return "Distrito [name=" + name + ", code=" + code + ", concelhos=" + conselhos + "]";
	}
}
