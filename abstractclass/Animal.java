package hongyan.abstractclass;

public abstract/*������ؼ���*/ class Animal {
	
	String str;//������Ҳ��������ͨ��һ��ӵ����ͨ����
	
	public abstract void run();
	//���󷽷����������ڣ�����������ƺͷ�����ʵ�ַ����ˣ�
	//����ͳһ
	
	public void breath(){
		System.out.println("������");
		run();  //���õ��Ǿ�����Ǹ������run()
	}//������Ҳ��������ͨ��һ��ӵ����ͨ��������
	
	
	public Animal(){
		System.out.println("����һ������");
	}//������Ĺ��췽������ͨ��newʵ���������뽨�������������������
	
	
}

class Cat extends Animal{
	
	public void run(){
		System.out.println("è��С�ܣ�");
	}
	
}

class Dog extends Animal{
	public void run(){
		System.out.println("�����ܣ�");
	}
}