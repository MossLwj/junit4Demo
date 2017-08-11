package com.imooc.uitl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 测试算法类
 * @author Administrator
 *
 */
public class CalculateTest {
	/*
	 * 1.测试方法上必须使用@Test注解修饰
	 * 2.测试方法必须使用public void修饰，不能带任何参数
	 * 3.新建一个源代码目录来存放我们的测试代码（即：test目录）
	 * 4.测试类包应该和被测试类包保持一致
	 * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖
	 * 6.测试类使用Test作为测试类名的后缀（代码规范）
	 * 7.测试方法使用test作为测试方法的前缀（代码规范）
	 */

	@Test
	public void testAdd(){
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubtact(){
		assertEquals(2, new Calculate().subtact(5, 3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(4, new Calculate().multiply(2, 2));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 2));
	}

}
