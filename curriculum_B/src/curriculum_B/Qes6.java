package curriculum_B;

import java.util.Random;
import java.util.Scanner;//ユーザからの入力をシンプルかつ高速に取得するためのクラス

public class Qes6 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 Scanner scanner = new Scanner(System.in);  //Scannerで初期化
		 String[]  seihins = scanner.nextLine().split("、");//1行を読み込んで返却	”、”で区切った文字を読み取る	
		 Random r = new Random();
		int MAX = 11;
		
		for (String seihin : seihins ) {
			int n = r.nextInt(MAX);
			String b = seihin + "の残りの台数は" + n + "台です";
			
			switch (seihin) {
			case "パソコン":
			case"冷蔵庫":
			case"扇風機":
			case"洗濯機":
			case"加湿器":
				break;
			case"テレビ":
			case"ディスプレイ":
				 b = "ディスプレイ" .equals(seihin) ? seihin + "の残り台数は" + (MAX - n) + "台です": b ;
				break;
			default:
				 b = "『" + seihin + "』は指定の商品ではありません";
			
		
			}
			System.out.println(b);
		}
		
	}

}
