package curriculum_26_28_1;

import java.util.Scanner;


public class curriculum_26_28_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);  //Scannerで初期化
		 String []  animal = scanner.nextLine().split(",");//1行を読み込んで返却	”、”で区切った文字を読み取る
		
		 for(int i = 0; i < animal.length; i++) {
		 String[] suuzi = animal[i].split(":");
		
		 curriculum_26_28_1_2 a = new curriculum_26_28_1_2();
		 
		String b = a.date(suuzi[0]);
		
		System.out.println("動物名：" + suuzi[0]);
		System.out.println("体長：" + suuzi[1] + "ｍ");
		System.out.println("速度：" + suuzi[2]+ "km/h");
		System.out.println("学名：" + b );
		System.out.println();
		}
		 }
	

}
