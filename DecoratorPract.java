package myPractice;



public class DecoratorPract {
	
	public static void main(String[] args) {
		
		IceCream myiceCream = new Nuts(new Vannila(new Vannila()));
		System.out.println("cost : "+ myiceCream.cost());
		
	}
	
}


abstract class IceCream{
	abstract int cost();
}

abstract class Cream extends IceCream{}

abstract class IceCreamIngredients extends IceCream{}

class Vannila extends IceCream{
	
	IceCream iceCream;
	
	public Vannila() {
		// TODO Auto-generated constructor stub
	}
	
	public Vannila(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
}

class ButterScotch extends IceCream{
	
	IceCream iceCream;
	
	public ButterScotch() {
		// TODO Auto-generated constructor stub
	}

	public ButterScotch(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
	
}

class Strawberry extends IceCream{
	
	IceCream iceCream;
	
	public Strawberry() {
		// TODO Auto-generated constructor stub
	}
	
	public Strawberry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
}

class Fruits extends IceCreamIngredients{
	
	IceCream iceCream;
	
	public Fruits() {
		// TODO Auto-generated constructor stub
	}
	public Fruits(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
	
}

class Nuts extends IceCreamIngredients{
	
	IceCream iceCream;
	
	public Nuts() {
		// TODO Auto-generated constructor stub
	}
	public Nuts(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
}

