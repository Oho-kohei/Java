package curriculum_24_25_2;

import java.util.Random;

public class curriculum_24_25_2_1 extends curriculum_24_25_2 {
	 public curriculum_24_25_2_1 () {
		    super();
		  }
public void randomm (){
Random r = new Random();
	
	int hp = r.nextInt(1000);
	int mp = r.nextInt(1000);
	int attack = r.nextInt(1000);
	int speed = r.nextInt(1000);
	int defense = r.nextInt(1000);
	
	setHp(hp);
	
	
	setMp(mp);
	
	
	setAttack(attack);
	
	
	setSpeed(speed);
	
	
	setDefense(defense);
	
	System.out.println("ステータス");
	System.out.println("HP:" + getHp());
	System.out.println("MP:" + getMp());
	System.out.println("攻撃力:" + getAttack());
	System.out.println("素早さ:" + getSpeed());
	System.out.println("防御力:" + getDefense());
	
}
	
	
}
