package com.imooc.uitl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * ≤‚ ‘À„∑®¿‡
 * @author Administrator
 *
 */
public class CalculateTest {

	@Test
	public void add(){
		assertEquals(6, new Calculate().add(3, 3));
	}

}
