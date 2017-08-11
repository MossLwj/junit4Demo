package com.imooc.uitl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {

	/*
	 * 1.@BeforeCla���εķ����������з���������ǰִ�У����Ҹ÷����Ǿ�̬�ģ����Ե������౻���غ���žͻ�ִ����
	 * �������ڴ���ֻ�����һ��ʵ�����Ƚ��ʺϼ��������ļ�
	 * 2.@AfterClass�����εķ���ͨ����������Դ��������ر����ݿ�����ӡ�
	 * 3.@Before��@After��������ÿ�����Է�����ǰ���ִ��һ�Ρ�
	 *
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is BeforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is Before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is After...");
	}
	
	@Test
	public void test1(){
		System.out.println("this is test1...");
	}

	@Test
	public void test2(){
		System.out.println("this is test2...");
	}

}
