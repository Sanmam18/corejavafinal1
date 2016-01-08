package com.digitek.NewAdditiveOperators;

import org.junit.Assert;
import org.junit.Test;

import com.digitek.additiveoperators.ConditionalOpeartors;

public class ConditionalOperatorTest{

       private static final Object[] Expected = null;

	@Test
       public void  ConditionalOperator(){
    	   ConditionalOpeartors co = new  ConditionalOpeartors();
    	  Test acutalResult = co. ConditionalOperators();
    	  
    	  Object[] equals = null;
		Assert.assertEquals(Expected,equals);
       }
       
       }
