package com.qa.ohrm.test;

import org.testng.annotations.Test;

import com.qa.ohrm.keywork.engine.KeyworkEngine;

public class LoginTest {
	
	public KeyworkEngine keyWorkEngine;
	
	@Test
	public void loginTest() {
		keyWorkEngine = new KeyworkEngine();
		keyWorkEngine.startExecution("login");
		
	}
}
