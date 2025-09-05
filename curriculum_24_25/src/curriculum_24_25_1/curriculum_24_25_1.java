package curriculum_24_25_1;

import java.util.Scanner;

import curriculum_24_25_2.curriculum_24_25_2_1;

public class curriculum_24_25_1 {

	public static void main(String[]args) {
		
	Scanner scanner = new Scanner(System.in);
	String username = scanner.nextLine();//1行を読み込んで返却
	scanner.close();
	
	curriculum_24_25_2_1 a = new curriculum_24_25_2_1();
	
	a.setName(username);
	System.out.println("こんにちは「" + a.getName() + "」さん");
	
	a.randomm();
	
	System.out.println();
	System.out.println("さあ冒険に出かけよう！");
	
	}
}






