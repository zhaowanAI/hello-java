package com.aiguigu.com;

public class Person {
		private String  name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void sayHell(){
			System.out.println("你好"+name);
		}
}
