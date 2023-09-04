package com.company;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder()
			   .withType(LeaveApplication.Type.Sick)
			   .from(LocalDate.now()).to(LocalDate.now().plusDays(2))
			   .build();
	   LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		System.out.println(application);
	}

	private static LeaveApprover createChain(){
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}
	
}
