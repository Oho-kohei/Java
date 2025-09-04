package Person.java;

public class Person {

	public String name;
	public int age;
	public double height;     //インスタンスフィールド
	public double weight;
	
	public int hito;
	
	 public Person (String name , int age , double height , double weight , int hito) {
		this.name = name;
		this.age = age ;
		this.height = height;
		this.weight = weight;
		this.hito = hito;
	}
public double bmi () {
		double bmi = weight/(height*height) ;
		return bmi;
	}
public void print () {
	System.out.println("名前は" + name + "です");
	System.out.println("年は" + age + "です");
	System.out.println("BMIは" + String.format("%.1f",this.bmi())  + "です");
	System.out.println();
	System.out.println("合計" + hito + "です");
}
	

}
