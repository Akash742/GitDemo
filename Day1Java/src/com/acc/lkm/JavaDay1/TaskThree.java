package com.acc.lkm.JavaDay1;

public class TaskThree {
	static String name = "Akash";
	static String role = "Lead";
	static String sim1 = "8334802387";
	static String sim2 = "8910245738";
	
	void beforeJoining(String name, String sim1)
	{
		System.out.println(this.name);
		System.out.println(this.sim1);
	}
	void afterJoining(String name, String role, String num2)
	{
		beforeJoining(this.name, this.sim1);
		System.out.println(this.role);
		System.out.println(this.sim2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree task = new TaskThree();
		
		task.beforeJoining(name, sim1);
		System.out.println();
		
		task.afterJoining(name, role, sim2);
	}

}
