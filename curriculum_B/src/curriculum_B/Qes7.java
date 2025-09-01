package curriculum_B;

import java.util.Scanner;//



public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);//Scannerクラスを初期化
	    String[] subjects = { "英語", "数学", "理科","社会" };
	    System.out.println("生徒の人数を入力してください(2以上)");
	    int num = new java.util.Scanner(System.in).nextInt();
	    int[][] scores = new int[num][subjects.length];
	    
	    for (int i = 0; i < scores.length; i++) {
	      System.out.println();
	      for (int j = 0; j < scores[i].length; j++) {
	        System.out.println(
	          (i + 1) + "番目の生徒の『" + subjects[j] + "』の点数を入力してください。");
	        int score = new java.util.Scanner(System.in).nextInt();
	        scores[i][j] = score;
	      }
	    }
	    
	    System.out.println();
	    
	    for (int i = 0; i < scores.length; i++) {
	          int b = 0;
	          for (int j = 0; j < scores[i].length; j++) {
	            b += scores[i][j];	
	     }
	          double c = b / 4;
	          String formattedValuec = String.format("%.2f",c);
	          System.out.println((i + 1) + "人目の平均点は"+ formattedValuec + "点です。");
	    }
	    
		System.out.println();
		
	    for (int i = 0; i < subjects.length; i++) {
	    	int sum = 0;
	          for (int j = 0; j < scores.length; j++) {
	            sum += scores[j][i];
	          }
	          double d = sum / num;
	          String formattedValued = String.format("%.2f",d );
	          System.out.println(
	            subjects[i] + "の平均点は" +formattedValued+ "点です。");
	        }
	}
}
