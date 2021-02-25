package myPractice;

public class BuilderPract {
	
	public static void main(String[] args) {
		
		Computer mycomputer = new ComputerBuilder("1TB","16GB").setDisplay("4K").setNfc("Enabled").build();
		System.out.println(mycomputer);
		
	}

}



class Computer{
	
	private String hdd;
	private String ram;
	private String display;
	private String nfc;

	public Computer(ComputerBuilder comp) {
		
		this.hdd = comp.getHdd();
		this.ram = comp.getRam();
		this.display = comp.getDisplay();
		this.nfc = comp.getNfc();
				
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", display=" + display + ", nfc=" + nfc + "]";
	}
	
	
	
	
	
}


class ComputerBuilder {
	
	private String hdd;
	private String ram;
	private String display;
	private String nfc;
	
	public ComputerBuilder(String hdd,String ram) {
		this.hdd=hdd;this.ram=ram;
	}
	
	
	public final String getHdd() {
		return hdd;
	}
	public final void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public final String getRam() {
		return ram;
	}
	public final void setRam(String ram) {
		this.ram = ram;
	}
	public final String getDisplay() {
		return display;
	}
	public final ComputerBuilder setDisplay(String display) {
		this.display = display;
		return this;
	}
	public final String getNfc() {
		return nfc;
	}
	public final ComputerBuilder setNfc(String nfc) {
		this.nfc = nfc;
		return this;
	}
	
	public Computer build() {
		return new Computer(this);
	}
	
	
	
	
	
}