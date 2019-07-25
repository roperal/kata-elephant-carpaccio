package com.kata.elephant;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class CalculatorInterfaceTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void when_give_items_should_return_fixed_price() {

		CalculatorInterface.main(new String[] {"1", "100"});
		Assert.assertEquals("100.0", systemOutRule.getLog());
	}

	@Test
	public void when_give_items_should_return_fixed_price_per_item() {

		CalculatorInterface.main(new String[] {"2", "100"});
		Assert.assertEquals("200.0", systemOutRule.getLog());
	}

	@Test
	public void when_give_price_per_item_should_return_total_price() {

		CalculatorInterface.main(new String[] {"2", "10"});
		Assert.assertEquals("20.0", systemOutRule.getLog());
	}

	@Test
	public void when_give_UT_state_should_apply_6_85_tax_rate(){
		CalculatorInterface.main(new String[]{"2","10","UT"});
		Assert.assertEquals("21.37", systemOutRule.getLog());
	}

	@Test
	public void when_give_NV_state_should_apply_8_tax_rate(){
		CalculatorInterface.main(new String[]{"2","10","NV"});
		Assert.assertEquals("21.6", systemOutRule.getLog());
	}

	@Test
	public void when_give_TX_state_should_apply_6_25_tax_rate(){
		CalculatorInterface.main(new String[]{"2","10","TX"});
		Assert.assertEquals("21.25", systemOutRule.getLog());
	}

	@Test
	public void when_give_AL_state_should_apply_4_tax_rate(){
		CalculatorInterface.main(new String[]{"2","10","AL"});
		Assert.assertEquals("20.8", systemOutRule.getLog());
	}

	@Test
	public void when_give_CA_state_should_apply_8_25_tax_rate(){
		CalculatorInterface.main(new String[]{"2","10","CA"});
		Assert.assertEquals("21.65", systemOutRule.getLog());
	}

	@Test
	public void when_total_price_greater_than_1000_apply_3_percent_discount(){
		CalculatorInterface.main(new String[]{"2","500","KK"});
		Assert.assertEquals("970.0", systemOutRule.getLog());
	}

	@Test
	public void when_total_price_greater_than_5000_apply_5_percent_discount(){
		CalculatorInterface.main(new String[]{"1","5000","KK"});
		Assert.assertEquals("4750.0", systemOutRule.getLog());
	}

	@Test
	public void when_total_price_greater_than_7000_apply_7_percent_discount(){
		CalculatorInterface.main(new String[]{"1","7000","KK"});
		Assert.assertEquals("6510.0", systemOutRule.getLog());
	}


	@Test
	public void when_total_price_greater_than_10000_apply_10_percent_discount(){
		CalculatorInterface.main(new String[]{"1","10000","KK"});
		Assert.assertEquals("9000.0", systemOutRule.getLog());
	}


	@Test
	public void when_total_price_greater_than_50000_apply_15_percent_discount(){
		CalculatorInterface.main(new String[]{"1","50000","KK"});
		Assert.assertEquals("42500.0", systemOutRule.getLog());
	}



}