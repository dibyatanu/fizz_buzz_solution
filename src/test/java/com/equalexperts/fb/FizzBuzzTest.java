package com.equalexperts.fb;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnFizzBuzz_MaxRange20() {
		final String actualResult=FizzBuzz.returnFizzBuzz(20);
		assertThat("Unexpected Results",actualResult, is(equalTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10")));
	}
	@Test
	public void returnFizzBuzz_MaxRange30() {
		final String actualResult=FizzBuzz.returnFizzBuzz(30);
		assertThat("Unexpected Results",actualResult, is(equalTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 lucky fizz buzz 26 fizz 28 29 lucky fizz: 7 buzz: 4 fizzbuzz: 1 lucky: 4 integer: 14")));
	}
	

}
