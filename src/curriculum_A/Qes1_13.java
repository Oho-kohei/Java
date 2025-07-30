package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1
		byte qesbyte;
		short qesshort;
		int qesint;
		long qeslong;
		float qesfloat;
		double qesdouble;
		char qeschar;
		String qesstring;
		boolean qesboolean;
		
		
		//2
		qesbyte=0;
		qesshort=0;
		qesint=0;
		qeslong=0L;
		qesfloat=0.0f;
		qesdouble=0.0d;
		qeschar='\u0000';
		qesstring="";
		qesboolean=false;
		
		
		//3
		qesbyte=10;
		qesshort=100;
		qesint=1000;
		qeslong=10000L;
		qesfloat=9.5f;
		qesdouble=10.5d;
		qeschar='a';
		qesstring="ハロー";
		qesboolean=true;
		
		
		//4
		System.out.println(qesbyte+qesshort+qesint+qeslong);
		System.out.println(qesbyte+qesbyte);
		System.out.println(qeschar+qesstring+qesboolean);
		System.out.println(qesbyte*qesshort*qesint*qeslong);
		System.out.println(qesdouble/qesshort);
		System.out.println(qesbyte-qesshort);
		
		
		//5
		int num1=43;				
		System.out.println("ハローJAVA"+num1);				
		
		
		//6
		String name="山田太郎";
		System.out.println("「初めまして"+name+"です」");
				
		int tosi=18;
		System.out.println("「年齢は"+tosi+"歳です」");		
		
		float num=170.5f;
		System.out.println("「身長は"+num+"cmです」");
		
		double kg=62.2;
		System.out.println("「体重は"+kg+"kgです」");
		
		String mesi="寿司";
		System.out.println("「好きな食べ物は"+mesi+"です」");
		
		
		//7//BMI=体重/身長*身長
		
		double se=1.705;
		double bmi=kg/(se*se);
		System.out.println("「BMIは"+bmi+"です」");
		
		
		//8
		name="鈴木一郎";
		System.out.println("「初めまして"+name+"です」");
		
		tosi=24;
		System.out.println("「年齢は"+tosi+"歳です」");	
		
		num=168.5f;
		System.out.println("「身長は"+num+"cmです」");
		
		kg=64.2;
		System.out.println("「体重は"+kg+"kgです」");
		
		mesi="オムライス";
		System.out.println("「好きな食べ物は"+mesi+"です」");
		
		se=1.685;
		bmi=kg/(se*se);
		System.out.println("「BMIは"+bmi+"です」");
		
		
		//9
		name="鈴木一郎";
		System.out.println("「初めまして"+name+"です」");
		
		tosi+=24;
		System.out.println("「年齢は"+tosi+"歳です」");	
		
		num+=168.5f;
		System.out.println("「身長は"+num+"cmです」");
		
		kg+=64.2;
		System.out.println("「体重は"+kg+"kgです」");
		
		mesi="オムライス";
		System.out.println("「好きな食べ物は"+mesi+"です」");
		
		se=3.37;
		bmi=kg/(se*se);
		System.out.println("「BMIは"+bmi+"です」");
		
		
		//10
	    tosi=24;
	    System.out.println(tosi>=25);
		 
	    
	     //11
	    String strtosi = String.valueOf(tosi);
		
		 num=168.5f;
		 String strnum=String.valueOf(num);
		 
		 kg=64.2;
		String strkg=String.valueOf(kg);
		
		System.out.println(strtosi+":"+strnum+":"+strkg);
		
		
		//12
		int inttosi=Integer.parseInt(strtosi);
		System.out.println(inttosi);
		
		float floatnum=Float.parseFloat(strnum);
		System.out.println(floatnum);
		
		
		//13
		System.out.println(inttosi==25||floatnum>=160); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
