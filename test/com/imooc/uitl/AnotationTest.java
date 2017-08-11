package com.imooc.uitl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AnotationTest {
	/*
	 * @Test:将一个普通的方法修饰成一个测试方法
	 * 		@Test(expected=ArithmeticException.class)
	 * 		@Test(Timeout:毫秒)
	 * @BeforeTest：它会在所有的方法运行前被执行，static修饰
	 * @AfterTest：它会在所有的方法运行结束后背执行，static修饰
	 * @Before：会在每一个测试方法执行前被执行一次
	 * @After：会在每一个测试方法执行后被执行一次
	 * @Ignore:会忽略所修饰的测试方法
	 * @RunWith:可以更改测试运行器
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}
	
	@Test(timeout=2000)
	public void testWhile(){
		while(true){
			System.out.println("run forever...");
		}
	}
	
	@Test(timeout=3000)
	public void testRead(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
