package test.overriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		super.fire();
		System.out.println("蓬辦辦辦辦錠~~~~~ ぷ幗幗み");
	}//fire
}
