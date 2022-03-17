package game;

public class GameCharacter {
	//접근점
	private Weapon weapon;
	
	//교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon==null) {
			System.out.println("맨손공격");
		}else {
			weapon.attack();
		}
	}
}
