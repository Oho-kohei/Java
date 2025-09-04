package curriculum_29_2;

public class curriculum_29_2 {

	
public  void  ken (int [] ken) {
	 
	String [] huken = {"北海道:札幌市:83424", "青森県:青森市:9646","岩手県:盛岡市:15275",
			 "宮城県:仙台市:7282","秋田県:秋田市:11638","山形県:山形市:9323","福島県:福島市:13784",
			 "茨城県:水戸市:6097","栃木県:宇都宮市:6408", "群馬県:前橋市:6362","埼玉県:さいたま市:3798"};
	
	for(int i = 0; i < ken.length; i++) {
		
		int a = ken [i] ;
		String[] b = huken [a].split(":");
		
		System.out.println("都道府県名:" + b [0]);
		System.out.println("県庁所在地:" + b [1]);
		System.out.println("面積:" + b [2] + "km2");
		System.out.println();
	}
}	
}