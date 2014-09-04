 
public class IntegerPrinter2 {
	
	private int id;
	
	private String name;

	
	
	public IntegerPrinter2(int id, String name) {
	    System.out.println(IntegerPrinter2.class.getClassLoader());
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
