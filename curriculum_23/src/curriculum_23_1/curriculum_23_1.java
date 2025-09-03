package curriculum_23_1;

import curriculum_23_2.curriculum_23_2;

public class curriculum_23_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		curriculum_23_2 a = new curriculum_23_2();
		
		a.setName("ライオン");
		a.getName();
		System.out.println("動物名：" + a.getName());
	
		a.setNagasa("2.1");
		a.getNagasa();
		System.out.println("体長：" + a.getNagasa() + "ｍ");
		
		a.setHayasa("80");
		a.getHayasa();
		System.out.println("速度：" + a.getHayasa() + "km/h");
	}

}
