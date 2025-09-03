package curriculum_B;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;//ユーザからの入力をシンプルかつ高速に取得するためのクラス
import java.util.regex.Pattern;


public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//1 
		int flagg = 0;
		 Scanner scanner = new Scanner(System.in);  //Scannerで初期化
		 String username = "";
		 String regex_username = "^[A-Za-z0-9]+$" ;
		 do {
			 username = scanner.nextLine();//1行を読み込んで返却
 		 if (username==null){
		     System.out.println("名前を入力してください"); //条件式1を満たす場合にのみ実行する
		 } else if (username.isEmpty()){
		 	 System.out.println("名前を入力してください");//条件式1を満たさない、かつ、条件式2を満たす場合に実行される	
		 } else if (username.length() >= 10) {
			 System.out.println("名前を10文字以内にしてください");
		 } else if (Pattern.matches("^[A-Za-z0-9]+$",username)) {	  //
			 System.out.println("ユーザー名「"+username+"」を登録しました");
			 flagg=1;
		 } else {
		     System.out.println("半角英数字のみで名前を入力してください"); 	//条件式1,2のどちらも満たさない場合に実行される
		 } 
		 }while(flagg==0);
		//じゃんけん
		String [] janken = {"グー","チョキ","パー"};
	
		int count = 0;
		int flag =0;
	
		Random r = new Random();
		String me = "";
		String pc = "";
		
			do {
				 me = janken[r.nextInt(3)];
				 pc = janken[r.nextInt(3)];
			System.out.println(username+"の手は「"+me+"」");
			System.out.println("相手の手は「"+pc+"」");
	
			count++;
			
			if(((Objects.equals(me,"グー")==true) && (Objects.equals(pc,"チョキ")==true)) ||
				((Objects.equals(me,"チョキ")==true) && (Objects.equals(pc,"パー")==true)) ||
				((Objects.equals(me,"パー")==true) && (Objects.equals(pc,"グー")==true))){  //String の比較は＝＝じゃだめ
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は"+count+"です");
				flag = 1;
				break;
				
			} else if((Objects.equals(me,"チョキ")==true) && (Objects.equals(pc,"グー")==true)) {  
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				
			} else if((Objects.equals(me,"パー")==true) && (Objects.equals(pc,"チョキ")==true)) {  
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				
			} else if((Objects.equals(me,"グー")==true) && (Objects.equals(pc,"パー")==true)) {  
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください");
				System.out.println("そしたら何かが見えてくるはずです");
				
			} else if (((Objects.equals(me,"グー")==true) && (Objects.equals(pc,"グー")==true)) ||
				((Objects.equals(me,"チョキ")==true) && (Objects.equals(pc,"チョキ")==true)) ||
				((Objects.equals(me,"パー")==true) && (Objects.equals(pc,"パー")==true))){  
				System.out.println("DRAW あいこ もう一回しましょう！");
			
			}
		}while (flag == 0);	
	}

}
