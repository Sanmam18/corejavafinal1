package com.digitek.incrementopertaor;

import org.junit.Assert;
import org.junit.Test;

import com.digitek.operators.IncrementDecrementOperators;

public class IncrementOperaterTest {
      
	@Test
	public void computingresult1(){
		
		IncrementDecrementOperators id = new IncrementDecrementOperators(); 
		int actualresult = id.computingresult1();
		Assert.assertEquals(69, actualresult);
	}
}
