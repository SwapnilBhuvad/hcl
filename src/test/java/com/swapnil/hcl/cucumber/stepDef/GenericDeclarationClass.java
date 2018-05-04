package com.swapnil.hcl.cucumber.stepDef;

import java.util.Properties;

import org.junit.rules.ErrorCollector;

public class GenericDeclarationClass {
	public static String configpath=System.getProperty("user.dir")+"/config.properties";
	public final ErrorCollector collector = new ErrorCollector();
	public static Properties prop;

}
