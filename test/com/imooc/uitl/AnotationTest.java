package com.imooc.uitl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AnotationTest {
	/*
	 * @Test:��һ����ͨ�ķ������γ�һ�����Է���
	 * 		@Test(expected=ArithmeticException.class)
	 * 		@Test(Timeout:����)
	 * @BeforeTest�����������еķ�������ǰ��ִ�У�static����
	 * @AfterTest�����������еķ������н�����ִ�У�static����
	 * @Before������ÿһ�����Է���ִ��ǰ��ִ��һ��
	 * @After������ÿһ�����Է���ִ�к�ִ��һ��
	 * @Ignore:����������εĲ��Է���
	 * @RunWith:���Ը��Ĳ���������
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
