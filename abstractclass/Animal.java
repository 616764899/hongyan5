package hongyan.abstractclass;

public abstract/*抽象类关键字*/ class Animal {
	
	String str;//抽象类也可以像普通类一样拥有普通变量
	
	public abstract void run();
	//抽象方法的意义在于：将方法的设计和方法的实现分离了！
	//子类统一
	
	public void breath(){
		System.out.println("呼吸！");
		run();  //调用的是具体的那个子类的run()
	}//抽象类也可以像普通类一样拥有普通函数方法
	
	
	public Animal(){
		System.out.println("创造一个动物");
	}//抽象类的构造方法不能通过new实例化，必须建立子类对象来引用内容
	
	
}

class Cat extends Animal{
	
	public void run(){
		System.out.println("猫步小跑！");
	}
	
}

class Dog extends Animal{
	public void run(){
		System.out.println("狗跑跑！");
	}
}