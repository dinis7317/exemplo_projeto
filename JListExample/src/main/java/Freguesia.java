
public class Freguesia {
	public final String name;
	public final String code;

	@Override
	public String toString() {
		return "Freguesia [name=" + name + ", code=" + code + "]";
	}

	public Freguesia(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
}
