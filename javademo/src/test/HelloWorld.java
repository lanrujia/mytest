package test;

import org.junit.Test;

public class HelloWorld {

	public static void main(String[] args) {
		//打印一个hello world
		System.out.println("hello world!!!");
	}
	
	/**
	 * fun1方法
	 */
	public void fun1() {
		System.out.println("635456");
	}

	/**
	 * 这是单元测试
	 */
	@Test
	public void fun2(){
		System.out.println("22222");
	}
	
}
