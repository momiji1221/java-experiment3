package jiekou;

public class Application {
	public static void main(String args[]){
		Doctor people1;
		Doctor people2;
		people1 =new Doctor("������","Ů","23");
		people2 =new Doctor("���Ӻ�","��","22");
		System.out.println(people1.toString());
		people1.getPay(500);
		people1.setPay(500);
		people1.getSalaly(2000);
		people1.setSalaly(2000);
		System.out.println(people2.toString());
		people2.getPay(500);
		people2.setPay(500);
		people2.getSalaly(1000);
		people2.setSalaly(1000);
		Text T1=new Text();
		people1.sub(people1.Salaly,people1.Pay);
	}
}
