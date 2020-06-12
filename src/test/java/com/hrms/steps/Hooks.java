package com.hrms.steps;

import HrmsTestBase.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
@Before

public void start() {
	BaseClass.setUp();
}

@After

public void end() {
	BaseClass.tearDown();
}

}
