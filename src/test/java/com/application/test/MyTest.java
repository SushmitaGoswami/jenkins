package com.application.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.application.Utility;

public class MyTest {

@Test
public void testing()
{
	assertTrue(Utility.getValue() == 1);
}
}
