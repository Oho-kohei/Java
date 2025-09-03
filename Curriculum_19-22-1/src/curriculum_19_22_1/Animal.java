package curriculum_19_22_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q1
		Dog myDog = new Dog();
		
		System.out.println(myDog.name);
//Q2	
		Dog myDogs = new Dog(1);
		
		System.out.println(myDogs.a);
		
		
		// 現在日時を取得
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1); // 2021-10-06T23:47:22.175049200

		// 表示形式を指定
		DateTimeFormatter dtformat = 
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		
		String fdate1 = dtformat.format(date1); //表示形式+Stringに変換
		
		System.out.println(fdate1); // 2021/10/06 23:47:22.175
	

		}
}





