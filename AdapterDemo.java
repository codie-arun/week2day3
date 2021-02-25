package week2day3;

public class AdapterDemo {
	public static void main(String[] args) {
		IndianSocket shakthi = new ShakthiSocket();
		AmericanPlug ap = new ApplePlug();
		
		Adapter adp = new Adapter(ap);
		
		shakthi.roundPinHole(adp);
	}
}

class Adapter extends IndianPlug{
	
	AmericanPlug ap;
	
	public Adapter(AmericanPlug ap) {
	
		this.ap = ap;
	}	

	@Override
	public void roundPin() {
		ap.flatPin();
	}

	
	
}


abstract class IndianSocket{
	public abstract void roundPinHole(IndianPlug ip);
}

abstract class IndianPlug{
	public abstract void roundPin();
}

abstract class AmericanSocket{
	public abstract void flatPinHole(AmericanPlug ap);
}

abstract class AmericanPlug{
	public abstract void flatPin();
}


class ShakthiSocket extends IndianSocket{
	
	public void roundPinHole(IndianPlug ip) {
		ip.roundPin();
	}
}	
class ApplePlug extends AmericanPlug{
	
	public void flatPin() {
		System.out.println("Flat pin works..");
	}
}
	
