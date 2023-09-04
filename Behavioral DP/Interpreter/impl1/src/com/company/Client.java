package com.company;

public class Client {

	public static void main(String[] args) {
		Report report1 = new Report("Cashflow report", "NOT ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		User user1 = new User("Dave", "USER", "ADMIN");
		System.out.println("User access report: " + exp.interpret(user1));

		User user2 = new User("JIM", "USER");
		System.out.println("User access report: " + exp.interpret(user2));
	}

}
