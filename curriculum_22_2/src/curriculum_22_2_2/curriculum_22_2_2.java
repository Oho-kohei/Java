package curriculum_22_2_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class curriculum_22_2_2 {

	String aisatsu;
	String kuni;
	String tabemono;
	String syoku;
	
	public  curriculum_22_2_2(String a,String b,String c,String d){
	this.aisatsu = a;
	this.kuni = b;
	this.tabemono = c;
	this.syoku = d;
	
	}
public void yobidasi() {
	System.out.println(aisatsu + "ここは" + kuni + "です！");
	System.out.println("この"+ tabemono + "はうまい");
	System.out.println(tabemono + "は"+ syoku + "です");
	
}
public void yobidaasi() {
	LocalDateTime date1 = LocalDateTime.now();
	System.out.println(date1); // 2021-10-06T23:47:22.175049200

	// 表示形式を指定
	DateTimeFormatter dtformat = 
		DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
	
	String fdate1 = dtformat.format(date1); //表示形式+Stringに変換
	
	System.out.println(fdate1); // 2021/10/06 23:47:22.175


}
}

