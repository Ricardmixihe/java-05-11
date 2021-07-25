package com.jizhong.controller;

import com.jizhong.pojo.Student;

public class TestStudent {
	public static void main(String[] args) {
		//创建小新对象
		Student xiaoxin = new Student("小明",10,"男");
		xiaoxin.setRp(5);
		
		Student xiaoming = new Student();
		String name;
		xiaoming.setName("");
		int rp;
		xiaoming.setRp(0);
		Object sex;
		xiaoming.setSex(0);
		
	}
}
