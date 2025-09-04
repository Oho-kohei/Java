package curriculum_29_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import curriculum_29_2.curriculum_29_2;

public class curriculum_29_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  //Scannerで初期化
		String [] suuzi = scanner.nextLine().split(",");//1行を”,”で区切って読み込み
		
		int[] kazu = Stream.of(suuzi).mapToInt(Integer::parseInt).toArray();//String型配列をint型配列に変換
		Arrays.sort(kazu);//配列を昇順に並べる//Arrays.toString(suuzi);
		
		String sortt = scanner.nextLine();
		
		if(sortt.equals("昇順")) {
			Arrays.sort(kazu);//配列を昇順に並べる//Arrays.toString(suuzi);
		}else if (sortt.equals("降順")) {
			Arrays.sort(kazu);
			for (int f = 0, l = kazu.length - 1; f < l; f++, l--){
				  int temp = kazu[f];
				  kazu[f]  = kazu[l];
				  kazu[l] = temp;
		}
		}
		curriculum_29_2 a = new curriculum_29_2();

		a.ken(kazu);
	}
}
