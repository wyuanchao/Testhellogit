package hello;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		/*int guess=(int)(Math.random()*100+1);
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		System.out.println(guess+" "+N);
		int i=0;
		while (true) {
			int result=in.nextInt();
			if (result<0) {
				i=-1;
				break;
			}
			i++;
			if (result<guess) {
				System.out.println("Too small");
			}else if (result>guess) {
				System.out.println("Too big");
			}else {
				break;
			}
		}
		if (i==-1||i>N) {
			System.out.println("Game Over");
		}
		if (i==1) {
			System.out.println("Bingo!");
		}
		if(i>1&&i<=3) {
			System.out.println("Lucky You!");
		}
		if(i>3&&i<=N) {
			System.out.println("Good Guess!");
		}
		in.close();*/
		// TODO Auto-generated method stub
    /*System.out.print("Helld World\n");
    Scanner in =new Scanner(System.in);
    System.out.println("echo:"+in.nextLine());
    in.close();
    System.out.println("2+3="+(2+3));*/
	/*System.out.println("���");
	Scanner in =new Scanner(System.in);
	System.out.println("Echo:"+in.nextLine());
	int amount=0;
	int price=0;
	amount=in.nextInt();
	price=in.nextInt();
	System.out.println(amount+"-"+price+"="+(amount-price));
	in.close();*/
	/*int foot=0;
	double inch=0;
	Scanner in=new Scanner(System.in);
	foot=in.nextInt();
	inch=in.nextInt();
	System.out.println((foot+inch/12)*0.3048);
	in.close();*/
	/*int number=0;
	int count=0;
	Scanner in=new Scanner(System.in);
	number=in.nextInt();
	while(number>0)
	{
		number=number/10;
		count=count+1;
	}
	in.close();
	System.out.println(count);*/
	/*int number;
	int sum=0;
	int count=0;
	Scanner in=new Scanner(System.in);
	number=in.nextInt();
	while (number!=-1) {
		sum=sum+number;
		count=count+1;
		number=in.nextInt();
	}
	in.close();
	if (count>0) {
	System.out.println("ƽ������"+(double)sum/count);
	}*/
	/*int a;
	int count=0;
	int number;
	number=(int)(Math.random()*100+1);
	Scanner in=new Scanner(System.in);
	do{
		a=in.nextInt();
		count=count+1;
	    if (a>number) 
		{
		System.out.println("ƫ��");
		}else if(a<number)
		{
		System.out.println("ƫС");
		}
	} while(a!=number);
	in.close();
	System.out.println("��ϲ���¶��ˣ�������"+count+"��");*/
	/*int a;
	int digital;
	int result=0;
	Scanner in =new Scanner(System.in);
	a=in.nextInt();
	do {
		digital=a%10;
		a=a/10;
		result=result*10+digital;
		System.out.print(digital);
	}while (a>0);
	System.out.println();
	System.out.println(result);
	in.close();*/
	/*int a;
	double result=0.0;
	int sign=1;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	for (int i=1;i<=a;i++)
	{
		result=result+sign*1.0/i;
		sign=-sign;
	}
	in.close();
	System.out.println(result);
	System.out.printf("%.2f", result);*/
	/*int a;
	int number;
	int count=1;
	number=(int)(Math.random()*100+1);
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	while (a!=number)
	{ 
		count++;
		if (a>number) {
			System.out.println("ƫ��");
		}else if (a<number) {
			System.out.println("ƫС");
		}
		a=in.nextInt();
	}
	in.close();
	System.out.println("��ϲ�����¶��ˣ���һ������"+count+"��");*/
	/*int a;
	int b;
	int r=1;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	int oa=a;
	int ob=b;
	while (b!=0) 
	{
		r=a%b;
		a=b;
		b=r;
	}
	System.out.println(oa+"��"+ob+"�����Լ����"+a);
	in.close();*/
	/*int[] arr= {11,22,36,56,10,9};
	int max=getMax(arr);
	System.out.print(max);
}
public static int getMax(int[] arr) {
	int max=arr[0];
	for (int i=1;i<arr.length;i++) {
		if (max<arr[i]) {
			max=arr[i];
		}
	}
	return max;*/
	/*int[] arr ={11,22,33,44,55};
	reverseArr(arr);
	print(arr);
	}
	public static void reverseArr(int[] arr) {
		for (int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
}
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	/*Scanner in=new Scanner(System.in);
	System.out.println("������һ��1-7��Χ�ڵ���ֵ");
	int week=in.nextInt();
	in.close();
	System.out.println("����"+getweek(week));
	}
	public static char getweek(int week) {
		char[] week1= {' ','һ','��','��','��','��','��','��'};
		return week1[week];*/
	/*int[] arr = {11,22,33,44,55,66,77};
	Scanner in=new Scanner(System.in);
	int value=in.nextInt();
	in.close();
	int index=getIndex(arr,value);
	System.out.print(index);
}
	public static int getIndex(int[] arr,int value) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==value) {
				return i;
			}
		}
		return -1;*/
		/*car c1=new car();
		c1.color="red";
		c1.num=8;
		c1.run();
		car c2=new car();
		c2.color="black";
		c2.num=4;
		c2.run();
		car c3=new car();
		c3=c2;
		c3.run();
	}
}
class car{
	String color;
	int num;
	public void run() {
		System.out.println(color+"........"+num);*/
		/*person p=new person();
		p.speak();
	}
}
class person{
	String name;
	int num;
	public void speak() {
	System.out.println(name);
	System.out.println(num);*/
		/*print(10);
		student s=new student();
		print(s);
	}
	public static void print(int x) {
		System.out.println(x);
	}
	public static void print(student stu) {
		stu.name="����";
		stu.age=23;
		stu.speak();
	}
}
 class student{
	 String name;
	 int age;
	 public void speak() {
		 System.out.println(name+"........."+age);*/
		/*phone s=new phone();
		s.setBrand("����");
		s.setPrice(5288);
		System.out.println(s.getBrand()+"....."+s.getPrice());
		s.call();
		s.sendMessage();
		s.playGame();
	}
}
		class phone{
			private String brand;
			private int price;
			public void setBrand(String brand) {
				this.brand=brand;
		}
			public String getBrand() {
				return brand;
		}
			public void setPrice(int price) {
				this.price=price;
		}
			public int getPrice() {
				return price;
		}
			public void call() {
				System.out.println("��绰");
		}
			public void sendMessage() {
				System.out.println("������");
		}
			public void playGame() {
				System.out.println("����Ϸ");*/
		/*phone s=new phone();
		s.setBrand("����");
		s.setPrice(5288);
		System.out.println(s.getBrand()+"....."+s.getPrice());
		s.call();
		s.sendMessage();
		s.playGames();
	}
}
		class phone{
			private String brand;
			private int price;
			public void setBrand(String brand) {
				this.brand=brand;
			}
			public String getBrand() {
				return brand;
			}
			public void setPrice(int price) {
				this.price=price;
			}
			public int getPrice() {
				return price;
			}
			public void call() {
				System.out.println("��绰");
			}
			public void sendMessage() {
				System.out.println("������");
			}
			public void playGames() {
				System.out.println("����Ϸ");*/
		/*student p1=new student();
		p1.setName("����");
		p1.setage(23);
	    System.out.println(p1.getName()+"....."+p1.getage());
	    student p2=new student("����",24);
	    p2.show();
			}
		}
    class student{
    	private String name;
    	private int age;
    	public student() {}
    	public student(String name,int age) {
    		this.name=name;
    		this.age=age;
    	}
    	public void setName(String name) {
    		this.name=name;
    	}
    	public String getName() {
    		return name;
    	}
    	public void setage(int age) {
    		this.age=age;
    	}
    	public int getage() {
    		return age;
    	}
    	public void show() {
    		System.out.println(name+"...."+age);*/
		/*person p1=new person();
		p1.show();
		System.out.println("--------------------");
		person p2=new person("����",23);
		p2.show();
		System.out.println("--------------------");
		person p3=new person("����",24);
		p3.show();
    	}
    }
class person{
	private String name;
	private int age;
	public person() {
		System.out.println("�޲ι��췽��");
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("�вι��췽��");
	}
	public void show() {
		System.out.println(name+"........."+age);*/
		/*person p1=new person("����",23);
		System.out.println(p1.getName()+"...."+p1.getAge());
		System.out.println("-----------------");
		person p2=new person();
		p2.setName("����");
		p2.setAge(24);
		System.out.println(p2.getName()+"...."+p2.getAge());
	}
}
	class person{
		private String name;
		private int age;
		public person() {}
		public person(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;*/
		/*phone p1=new phone();
		p1.setBrand("ƻ��");
		p1.setPrice(1500);
		System.out.println(p1.getBrand()+"..."+p1.getPrice());
		System.out.println("-------------");
		phone p2=new phone("С��",50);
		p2.show();
		} 
	}
      class phone{
    	  private String brand;
    	  private int price;
    	  public phone() {}
    	  public phone(String brand,int price) {
    		  this.brand=brand;
    		  this.price=price;
    	  }
    	  public void setBrand(String brand) {
    		  this.brand=brand;
    	  }
    	  public String getBrand() {
    		  return brand;
    	  }
    	  public void setPrice(int price) {
    		  this.price=price;
    	  }
    	  public int getPrice() {
    		  return price;
    	  }
    	  public void show() {
    		  System.out.println(brand+"..."+price);*/
		/*student s=new student();
		s.show();
    	  }
      }
	class student{
		private String name="����";
		private int age=23;
		public student() {
			this.name="����";
			this.age=24;
		}
		public void show() {
			System.out.println(name+"..."+age);*/
		/*Rectangle s=new Rectangle(10,20);
		System.out.println(s.perimeter());
		System.out.println(s.area());
		}
}
 class Rectangle{
	 private int length;
	 private int high;
	 public Rectangle() {}
	 public Rectangle(int length,int high) {
		 this.length=length;
		 this.high=high;
	 }
	 public void setLength(int length) {
		 this.length=length;
	 }
	 public int getLength() {
		 return length;
	 }
	 public void setHigh(int high) {
		 this.high=high;
	 }
	 public int getHigh() {
		 return high;
	 }
	 public int perimeter() {
		 return 2*(length+high);
	 }
	 public int area() {
		 return high*length;*/
		/*employee e=new employee("�����","9527",32125.5);
		e.show();
	 }
 }
class employee{
	private String name;
	private String id;
	private double salary;
	public employee() {}
	public employee(String name,String id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
	}
	public void show() {
		System.out.println("�ҵ�������"+name+"���ҵĹ����ǣ�"+id+"���ҵĹ�����"+salary);*/
		/*person p1=new person();
		p1.name="����ʦ";
		p1.country="�ձ�";
		person p2=new person();
		p2.name ="С����ʦ";
		p1.speak();
		p2.speak();
		/*for (int i=1;i<10;i++) {
    	int p=(int)(Math.random()*100+1);
    	System.out.println(p);
    }*/
	/*Scanner in=new Scanner(System.in);
	int guessNum=(int)(Math.random()*100+1);
	System.out.println("������һ��1-100��������");
	while (true) {
		int result=in.nextInt();
		if (result<guessNum) {
			System.out.println("С��");
		}else if(result>guessNum) {
			System.out.println("����");
		}else {
			System.out.println("����");
			break;
		}
	}
	in.close();*/
	/*cat p=new cat();
	p.color="��ɫ";
	p.leg=4;
	System.out.println(p.color+"...."+p.leg);
	}
}
class animal{
	String color;
	int leg;
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class cat extends animal{}
class dog extends animal{}*/
		/*son s=new son();
		s.print();
	}
	}
class father{
	int num1=10;
}
class son extends father{
	int num2=20;
	public void print() {
		System.out.println(num1);
		System.out.println(num2);*/
		/*son s=new son();
		System.out.println(s.getName()+"..."+s.getAge());
		System.out.println("----------------");
		son s1=new son("����",23);
		System.out.println(s1.getName()+"..."+s1.getAge());
	}
}
class father{
	private String name;
	private int age;
	/*public father() {
		System.out.println("father �ղι��췽��");
	}*/
	/*public father(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("father �вι��췽��");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
}
class son extends father{
	public son() {
		this("����",25);
		System.out.println("son �ղι��췽��");
	}
	public son(String name,int age) {
		super(name,age);
		System.out.println("son �вι��췽��");*/
		/*ios8 s=new ios8();
		s.call();
		s.siri();
	}
}
class ios7{
	public void call() {
		System.out.println("��绰");
	}
	public void siri() {
		System.out.println("speak english");
	}
}
class ios8 extends ios7{
	public void siri() {
		//super.siri();
		System.out.println("����");*/
		/*student s=new student();
		s.setName("����");
		s.setAge(23);
		s.eat();
		s.study();
		System.out.println(s.getName()+"..."+s.getInt());
	}
}
class person{
	private String name;
	private int age;
	public person() {}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getInt() {
		return age;
	}
	public void eat() {
		System.out.println("�Է�");
	}
}
class student extends person{
	public student() {}
	public student(String name,int age) {
	}
	public void study() {
		System.out.println("ѧ��ѧϰ");
	}
}
class person{
	String name;
	static String country;
	public void speak() {
		System.out.println(name+"...."+country);*/
		/*int[] arr= {33,44,66,99,11,22};
		/*tool at=new tool();
		int max=at.getMax(arr);
		System.out.println(max);
		System.out.println("----------------");
		at.print(arr);
		System.out.println();
		System.out.println("----------------");
		at.reverse(arr);
		at.print(arr);*/
		/*int max=tool.getMax(arr);
		System.out.println(max);
	}
}
class tool{
	private tool() {}
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int[] arr) {
		for (int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}*/
		/*int i=0;
	    Scanner in=new Scanner(System.in);
	    int guess=(int)(Math.random()*100+1);
	    System.out.println("������һ��1-100��������");
		while (true) {
			int result=in.nextInt();
			i++;
			if(guess<result) {
				System.out.println("����");
				}else if(guess>result){
				System.out.println("С��");	
				}else {
					break;
				}
		}
		System.out.println("��ϲ�������"+i+"�ξͲ¶���");*/
		/*Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		in.close();
		if (s==1) {
			System.out.println(1);
		}
		int i,x1=1,x2=1,sum=0,number=0;
		for(i=2;x2<s;i++) {
			sum=x1+x2;
			x1=x2;
			x2=sum;
		}
		System.out.println(i);*/
		/*Scanner in=new Scanner(System.in);
		int yy=in.nextInt();
		//String input = in.next();
		System.out.print("/");
		int mm=in.nextInt();
		//String input1 = in.next();
		int dd=in.nextInt();
		System.out.println(yy+"/"+mm+"/"+dd);
		int[] arr= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);*/
		/*Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int arr;
		double sum=0;
		int i;
		for(i=0;i<N;i++) {
			arr=in.nextInt();
			sum=sum+arr;
		}
		double average=sum/N;
		//System.out.println("average = "+("%.1lf",average));*/
		//System.out.println("count = "+N);
		   /*cat c=new cat("��",4);
		   System.out.println(c.getColr()+"..."+c.getLeg());
		   c.eat();
		   c.work();
		   dog.work();
			}
		}
			class  Animal{
				private String color;
				private int leg;
				public Animal () {
				}
				public Animal(String color,int leg) {
					this.color=color;
					this.leg=leg;
				}
				public void setColor(String color) {
					this.color=color;
				}
				public String getColr() {
					return color;
			   }	
				public void setLeg(int leg) {
					this.leg=leg;
				}
				public int getLeg() {
					return leg;
				}
				public  void eat() {
					System.out.println("�Է�");
				}
			}
			class cat extends Animal{
				public cat() {}
				public cat(String color,int leg) {
					super(color,leg);
				}
				public void eat() {
					
					System.out.println("è����");
				}
				public void work() {
					System.out.println("èץ����");
				}
			}
			class dog extends Animal{
				public dog() {}
				public dog(String name,int leg) {}
				public void eat() {
					System.out.println("������");
				}
				public static void work() {
					System.out.println("������");*/
		/*cat c=new cat();
		c.eat();
		animal a=new cat();
		a.eat();
		}
	}
	class animal{
		public void eat() {
			System.out.println("����Է�");
		}
	}
	class cat extends animal{
		public void eat() {
			System.out.println("è����");*/
		/*father f=new son();
		System.out.println(f.num);
		//son s=new son();
		//System.out.println(s.num);
			}
		}
		class father{
			int num=10;
		}
		class son extends father{
			int num=20;
		}*/
		/*person p=new superMan();
		System.out.println(p.name);
		p.business();
		superMan n=(superMan)p;
		n.fly();
		}
	}
	class person{
		String name="John";
		public void business() {
			System.out.println("̸����");
		}
	}
	class superMan extends person{
		String name="superMan";
		public void business() {
			System.out.println("̸�����ڵĴ���Ŀ");
		}
		public void fly() {
			System.out.println("����");*/
		/*method(new Cat());
		method(new Dog());
	}
    public static void method(Animal a) {
    	if (a instanceof Cat) {
    		Cat c=(Cat)a;
    		c.eat();
    		c.catchMouse();
    	}else if(a instanceof Dog) {
    		Dog d=(Dog)a;
    		d.eat();
    		d.lookHome();
    	}else {
    		a.eat();
    	}
    }
	
}
class Animal{
	public void eat() {
		System.out.println("�Է�");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("è����");
	}
	public void catchMouse() {
		System.out.println("ץ��");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("������");
	}
	public void lookHome() {
		System.out.println("����");*/
		/*animal a=new cat();
		a.eat();
		}
	}
	abstract class animal{
		public abstract void eat();
	}
	class cat extends animal{
		public void eat() {
			System.out.println("è����");*/
		  /*cat c=new cat("�ӷ�",10);
	    System.out.println(c.getName()+"...."+c.getAge());
	    c.eat();
	    c.catchMouse();
	    dog d=new dog("̩��",21);
	    System.out.println(d.getName()+"...."+d.getAge());
	    d.eat();
	    d.lookhome();
		}
	}
	abstract class animal{
		private String name;
		private int age;
		public animal() {}
		public animal(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public abstract void eat();
	}
	class cat extends animal{
		public cat() {}
		public cat(String name,int age) {
			super(name,age);
		}
		public void eat() {
			System.out.println("è����");
		}
		public void catchMouse() {
			System.out.println("ץ����");
		}
	}
	class dog extends animal{
		public dog() {}
		public dog(String name,int age) {
			super(name,age);
		}
		public void eat() {
			System.out.println("������");
		}
		public void lookhome() {
			System.out.println("����");*/
		  /*coder d=new coder("����","9524",80000);
		  d.work();
		  manager m=new manager("����ʦ","3324",20000,50000);
		  m.work();	  
			}
		}
		abstract class employee{
			private String name;
			private String id;
			private double salary;
			public employee() {}
			public employee(String name,String id,double salary) {
				this.name=name;
				this.id=id;
				this.salary=salary;
			}
			public void setName(String name) {
				this.name=name;
			}
			public String getName() {
				return name;
			}
			public void setId(String id) {
				this.id=id;
			}
			public String getId() {
				return id;
			}
			public void setSalary(double salary) {
				this.salary=salary;
			}
			public double getSalary() {
				return salary;
			}
			public abstract void work();
		}
		class coder extends employee{
			public coder() {}
			public coder(String name,String id,double salary) {
				super(name,id,salary);
			}
			public void work() {
				System.out.println("�ҵ������ǣ�"+this.getName()+"���ҵĹ����ǣ�"+this.getId()+
						",�ҵĹ����ǣ�"+this.getSalary());
			}
		}
		class manager extends employee{
			private int bonus;
			public manager() {}
			public manager(String name,String id,double salary,int bonus) {
				super(name,id,salary);
				this.bonus=bonus;
			}
			public void work() {
				System.out.println("�ҵ������ǣ�"+this.getName()+"���ҵĹ����ǣ�"+this.getId()+
						",�ҵĹ����ǣ�"+this.getSalary()+"���ҵĽ����ǣ�"+bonus);*/
	    /*inter i=new demo();
	      i.print();
		}
	}
	interface inter{
		public static final int num=10;
		public abstract void print();
	}
	class demo implements inter{
		public void print() {
			System.out.println("print");*/
		  /*jumpcat j=new jumpcat("�ӷ�",8);
		  System.out.println(j.getName()+"..."+j.getAge());
		  j.eat();
		  j.sleep();
		  j.jump();
			}
		}
		abstract class animal{
			private String name;
			private int age;
			public animal() {}
			public animal(String name,int age) {
				this.name=name;
				this.age=age;
			}
			public void setName(String name) {
				this.name=name;
			}
			public String getName() {
				return name;
			}
			public void setAge(int age) {
				this.age=age;
			}
			public int getAge() {
				return age;
			}
			public abstract void eat ();
			public abstract void sleep();
		}
		class cat extends animal{
			public cat() {}
			public cat(String name,int age) {
				super(name,age);
			}
			public  void eat () {
				System.out.println("è����");
			};
			public void sleep() {
				System.out.println("����˯");
			};
		}
		interface inter{
			public abstract void jump();
		}
		class jumpcat extends cat implements inter{
			public jumpcat() {}
			public jumpcat(String name,int age) {
				super(name,age);
			}
			public void jump() {
				System.out.println("����");*/
		/*Scanner in=new Scanner(System.in);
	    int guess=(int)(Math.random()*100+1);
	    while (true) {
	    	int result=in.nextInt();
	    	if (result<guess) {
	    		System.out.println("С��");
	    	}else if (result>guess) {
	    		System.out.println("����");
	    	}else {
	    		System.out.println("����");
	    		break;
	    	}
	    }
	    in.close();*/
		/*Scanner in=new Scanner(System.in);
		int put=in.nextInt();
		int s=(int)(put/(100*0.3048/12));
		int foot=s/12;
		int inch=s%12;
		in.close();
		System.out.println(foot+" "+inch);*/
		/*Scanner in=new Scanner(System.in);
		int begin=in.nextInt();
		int lose=in.nextInt();
		in.close();
		int hour=begin/100;
		int minute=begin%100;
		int max=(minute+lose);
		hour=(max/60)+hour;
		minute=max%60;
		if(minute<0) {
			minute=minute+60;
			hour=hour-1;
		}
		System.out.println(hour*100+minute);*/
		/*Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int c=input;
		int a=0;
		int b=0;
		int result=0;
		while (true) {
			a=c/10;
			b=c%10;
			c=a;
			result=result*10+b;
			if (a==0) {
				break;
			}
		}
		System.out.println(result);*/
		/*outer.inner.print();
		   }
		}
		class outer{
			static class inner{
				public static void print() {
					System.out.println("I Love you!");
				}*/
			/*outer o=new outer();
			o.method();
			}
		}
		class outer{
			public void method() {
				class inner{
					public void print() {
						System.out.println("I Love You!");	
					}
				}
				inner i=new inner();
				i.print();*/
	}
}