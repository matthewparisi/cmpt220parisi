package lab10;

public class Manager1 implements Printable {

	private String name;
	private int idnumber;
	
	public Manager1(String name,int idnum){
		this.name = name;
		this.idnumber = idnum;
	}
	
	@Override
	public void print() {
		System.out.println("Managers name: " + name + " Idnumber: " + idnumber);
		
	}

}
