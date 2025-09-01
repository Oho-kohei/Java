package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  int i = 1;
		  int j = 1;
	        for (i = 1; i < 10; i++) {
	            for (j = 1; j < 10; j++) {  //jは9回やると決まっているので、j<i は×。
	            	if ( j < 9 ) {
	                System.out.print(String.format("%02d", i ) + "*");    //iの数字は外に出るときに変わるので全部入れる
	                System.out.print(String.format("%02d",j )+"="+(String.format("%02d",(i * j))) + "|| ");//jはどんどん変わる。
	            	}else  {
	                	System.out.print(String.format("%02d", i ) + "*");    //iの数字は外に出るときに変わるので全部入れる
	 	                System.out.print(String.format("%02d",j )+"="+(String.format("%02d",(i * j))));//jは
	                }
	            }
	            System.out.println("");//jを９回終えたら改行。i++してまた内側のforへ
		
		
		
		
		
		
		
		}
	}

}
