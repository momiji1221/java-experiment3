package jiekou;

public class Doctor implements Student,Teacher{
	String Name;
	String Sex;
	String Age;
	float Salaly;
	float Pay;
	public Doctor(String Name,String Sex,String Age)
	{
		this.Name = Name;
		this.Sex = Sex;
		this.Age = Age;
	}
	public String toString() {
		return "姓名: "+this.Name+"  性别: "+this.Sex+"  年龄: "+this.Age;
	}
	public void setPay(float Pay){
		this.Pay = Pay;
		System.out.println("应缴学费："+this.Pay);
	}
	public void getPay(float Pay){
		this.Pay = Pay;
		System.out.println("待缴学费："+this.Pay);
	}
	public void setSalaly(float Salaly){
		this.Salaly = Salaly;
		System.out.println("应发工资："+this.Salaly);
	}
	public void getSalaly(float Salaly){
		this.Salaly = Salaly;
		System.out.println("待发工资："+this.Salaly);
	}

}
