/*makes use of design principles 
 * 
 * 1. Encapsulate what varies
 * 2. Favor composition over inheritance
 * 3. Code to interface not implementation
 * 
 * It actually  defines a family of algorithms and encapusalates them and make them
 * interchangeable
 *
 * 
 * Below we are designing a duck family which may have different
 * fly and quack behavior*/
public class StrategyPattern {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck(new FlyWithWings(), new Quack());
		duck.performFly();
		duck.performQuack();
		
		ModelDuck modelDuck = new ModelDuck(new FlyNoWay(), new Mute());
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new RocketPoweredFlying());
		modelDuck.performFly();
	}
}

abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public  void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior=flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior=quackBehavior;
	}	
}

class MallardDuck extends Duck {
	
	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
		this.flyBehavior= flyBehavior;
		this.quackBehavior = quackBehavior;
	}
}

class ModelDuck extends Duck {
	public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
}

interface FlyBehavior {
	void fly();
}


interface QuackBehavior {
	void quack();
}

class FlyWithWings implements FlyBehavior {
	public void fly(){
		System.out.println("I am flying with wings");
	}
}

class FlyNoWay implements FlyBehavior {
	public void fly(){
		System.out.println("I can't fly");
	}
}

class RocketPoweredFlying implements FlyBehavior {
	public void fly(){
		System.out.println(" I am flying with rocket");
	}
}


class Quack implements QuackBehavior {
	public void quack(){
		System.out.println("this is a normal quack");
	}
}

class Squack implements QuackBehavior {
	public void quack(){
		System.out.println("this is a fake rubber quack");
	}
}

class Mute implements QuackBehavior {
	public void quack(){
		System.out.println("I can't quack");
	}
}

