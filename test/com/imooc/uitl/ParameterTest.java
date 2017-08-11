package com.imooc.uitl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	
	/*
	 * 1.����Ĭ�ϵĲ���������Ϊ@RunWith(Parameterized.class)��
	 * 2.�������������Ԥ��ֵ�ͽ��ֵ��
	 * 3.����һ������ֵΪCollection�ľ�̬��������ʹ��@Parameters���Ρ�
	 * 4.Ϊ����������һ���������Ĺ������캯������������Ϊ֮����������ֵ��
	 */
	int excepted = 0;
	int input1 = 0;
	int input2 = 0;
	
	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][]{
				{3,1,2},
				{4,2,2}
		});
	}
	
	public ParameterTest(int excepted,int input1,int input2) {
		this.excepted = excepted;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Test
	public void TestAdd() {
		assertEquals(excepted,new Calculate().add(input1, input2));
	}


}
