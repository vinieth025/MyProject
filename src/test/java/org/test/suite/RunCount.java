package org.test.suite;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunCount {

	
	public static void main(String[] args) {
		
		Result r = JUnitCore.runClasses(SuiteClass.class);
		
		int failureCount = r.getFailureCount();
		System.out.println("FailureCount"+failureCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println("IgnoreCount"+ignoreCount);
		
		int runCount = r.getRunCount();
		System.out.println("RunCount"+runCount);
		
		List<Failure> failures = r.getFailures();
		
		for(int i=0;i<failures.size();i++) {
			
			String string = failures.get(i).toString();
			System.out.println(string);
		}
	}
}
