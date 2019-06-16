package com.test.virtusa.virtusatest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import com.virtusa.test.Application;
import com.virtusa.test.Paragraph;
import com.virtusa.test.Utility;


public class AppTest {
	
	static Paragraph app =null;
	static InputStream inputFile = null;
	static Scanner scan = null;
	static List<String> output = null;
	
	@BeforeClass
	public static void setUp() throws Exception {

	    inputFile = AppTest.class.getClassLoader().getResourceAsStream("inputFile.txt");
	    app = new Paragraph(true,inputFile);
		output = new ArrayList<String>();
	}
    @After
    public void tearDown() throws Exception {
        app = null;
    }
    
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void testMain() {
      
		
		// Read the input from console, validate and process
		ArrayList<String> output=app.read();
		Utility.println("");
		Utility.println("########### Test Result ##########");
		for(int i=0;i<output.size();i++)
		{
			Utility.println(output.get(i));
		}
		Utility.println("");
	
    }
    
   
}
