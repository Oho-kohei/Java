package Curriculum_New_1_18;

import java.util.Random;

public class Curriculum_New_1_18 {

//Q1
	 public static void Q1(String a, int b) {
		 System.out.println( a +  b );
	    }
	
//Q2
	 public static void Q2(int a, int b) {
		 System.out.println( a * b );
	 }
//Q3
	 public static void Q3(int[]a) {
		for(int b : a ){
			System.out.println(b);
		}
	 }
//Q4
	 public static void Q2(double a, double b) {
		 System.out.println( a + b );
	 }
//Q5
	 public static int[] Q5(int a) {
		 int[] b = new int[a];
		 Random rnd = new Random();
		 for(int i = 0;i<a;i++) {
			 b[i] = rnd.nextInt(100)+1;
			 System.out.println(b[i]);
		 }
		 return b ;
	 }
//Q6
	  public static double Q6(int[] a) {
	        double ave = 0;
	        for (int b : a) {
	            ave += b;
	        }
	        ave /= a.length;
	        System.out.println(ave);
	        return ave;
	    }
//Q7
	  public static boolean M7(double a) {
	        return a >= 50 ? true : false;
	    }
	
	
	
		 public static void main(String[] args) {//メインメソッドこれがないとJAVAは動かない
			 Q1("Hello JAVASE",11);
			 Q2(1,2);
			 int[] a = {1,2,3,4,5,};
			 Q3(a);
			 Q2(1.1,2.1);
			 int[]b = Q5(3); 
			 double c = Q6(b);
			 System.out.println(M7(c));
		 
		 
		 
		 }	

}
