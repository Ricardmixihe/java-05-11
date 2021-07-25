package com.jizhong.pojo;

public class Student {
	private String name;
	private int rp;//人品取值范围在  1~10
	private String sex;//性别
	
	//无参构造方法
	public Student(){
		this.name = "小新";
		this.rp = 10;
		this.sex = "男";
	}
	
	//有参构造方法
	public Student(String name,int rp,String sex){
		this.name = name;
		this.rp = rp;
		this.sex = sex;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){//小新
		this.name = name;
	}
	
	public int getRp(){
		return rp;
	}
	//人品取值范围在  1~10
	public void setRp(int rp){// -1 10000
		//当传递过来的人品值不在1~10范围内
		if(rp < 1 || rp > 10){
			System.out.println("您输入的人品不在1~10的范围内，默认为您设置为1");
			this.rp = 1;
		}else{
			this.rp = rp;
		}
	}
	
	/**
	 * 方法重载：
	 * 	方法名称相同，参数列表不同的方法
	 *  参数的  个数不同  类型不同 循序不同
	 */
	public void eat(int num){//鸟吃int数据
		System.out.println("鸟吃了：" + num);
	}
	
	public void eat(String foot){//猫吃String数据
		System.out.println("猫吃了：" + foot);
	}

	public void eat(String foot,int foot2){//狗吃String数据   ，String数据
		System.out.println("狗吃了：" + foot + foot2);
	}
	
	public void eat(int foot,String foot2){
		System.out.println("狗吃了：" + foot + foot2);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rp=" + rp + ", sex=" + sex + "]";
	}

	public void setSex(Object sex2) {
		// TODO 自动生成的方法存根
		
	}
	
	
	
	
	
	
}
