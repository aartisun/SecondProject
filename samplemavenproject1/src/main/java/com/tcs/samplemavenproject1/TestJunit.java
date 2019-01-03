package com.tcs.samplemavenproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestJunit {
	private String strName;
	private int strAge;
	private int salary;

	public TestJunit(String strName, int strAge, int salary) {
		super();
		this.strName = strName;
		this.strAge = strAge;
		this.salary = salary;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getStrAge() {
		return strAge;
	}

	public void setStrAge(int strAge) {
		this.strAge = strAge;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public TestJunit() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + salary;
		result = prime * result + strAge;
		result = prime * result + ((strName == null) ? 0 : strName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestJunit other = (TestJunit) obj;
		if (salary != other.salary)
			return false;
		if (strAge != other.strAge)
			return false;
		if (strName == null) {
			if (other.strName != null)
				return false;
		} else if (!strName.equals(other.strName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestJunit [strName=");
		builder.append(strName);
		builder.append(", strAge=");
		builder.append(strAge);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	public void doArrayListWork() {
		java.util.List<String> l1 = new ArrayList<String>();
		
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		l1.add(null);
		l1.add(null); //MULTIPLE NULL  VALUES ARE ALLOWED IN ARRAYLIST
		System.out.println("Before Reversing : " + l1);
		Collections.reverse(l1);
		System.out.println("After Reversing : " + l1);
		l1.clear();

		/////////////////////////////////////////////

		//reversing an array .converting array into list then reverse and again convert back to array.
		String [] str = new String[] {"aarti","julka","tandon","aanya","tandon","sunil","tandon"};
		System.out.println("Before Reversing Array: " + Arrays.toString(str));
		l1 = Arrays.asList(str);
		Collections.reverse(l1);
		str= (String[])l1.toArray(); 
		System.out.println("After Reversing Array: " + Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("After sorting Array: " + Arrays.toString(str));

	}

}
