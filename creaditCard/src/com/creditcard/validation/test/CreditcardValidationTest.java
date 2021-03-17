package com.creditcard.validation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.creditcard.validation.CreditcardValidation;

class CreditcardValidationTest {

	private static CreditcardValidation creditcardValidation;
	
	@BeforeAll
	public static void setup()
	{
		creditcardValidation = new CreditcardValidation();
	}
	
	@Test
	public void testCreditcardValidation()
	{
		assertEquals("It is valid card",creditcardValidation.checkCreditcardValidation(5678353544698740L));
	}

}
