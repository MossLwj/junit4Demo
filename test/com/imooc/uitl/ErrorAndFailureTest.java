package com.imooc.uitl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ErrorAndFailureTest {
	/*
	 * Failure：一般由单元测试使用的断言方法判断失败而引起的，表示测试点发现了问题。就是说测试的结果与我们期望的结果不一致。
	 * Errors：error是由代码异常引起的，它可能产生于测试代码本身的错误，也可能是被测试代码中的一个隐藏的bug
	 * 
	 * 测试用例不是用来证明你是对的，而是用来证明你没有错。
	 */
	
	@Test
	public void testAdd(){
		assertEquals(5, new Calculate().add(3, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}

}
