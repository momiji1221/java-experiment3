# java-experiment3


## 实验目的
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理


##实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。



## 实验过程
1.创建student和teacher两个接口
2.创建doctor类，继承接口，和application类，显示学费和收入
3.创建text类，计算税率

## 核心方法
'''
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
'''

## 实验结果


## 实验感想
经过这次实验，我了解了接口的使用方法以及异常处理的方法

