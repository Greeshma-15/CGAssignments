package com.cg.eis.exception;

public class EmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EmployeeException(String str){
		super(str);
	}
	static class EmployeeSalary{
	 static void check(int salary)throws EmployeeException{
		if(salary<3000){
			throw new EmployeeException("Salary is below 3000");
		}
		else
		{
			System.out.println("Salary is above 3000");
		}
	}

	public static void main(String[] args) {
		try{
			check(2500);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	}
}
