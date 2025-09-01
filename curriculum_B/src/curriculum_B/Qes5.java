package curriculum_B;

public class Qes5 {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
	     for (j = 1; j < 10; j++) {
	            for (i = 1; i < 21; i++) {  //jは9回やると決まっているので、j<i は×。
	            	if ( i < 20 ) {
	                System.out.print(String.format("%03d", i ) + "*");    //iの数字は外に出るときに変わるので全部入れる
	                System.out.print(String.format("%03d",j )+"="+(String.format("%03d",(i * j))) + "|| ");//jはどんどん変わる。
	            	}else  {
	            		System.out.print(String.format("%03d", i ) + "*");    //iの数字は外に出るときに変わるので全部入れる
		                System.out.print(String.format("%03d",j )+"="+(String.format("%03d",(i * j))) + "");
	            
	            		
	                }
	            }
	            System.out.println("");//jを９回終えたら改行。i++してまた内側のforへ
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
