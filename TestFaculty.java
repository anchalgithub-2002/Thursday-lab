package com.company;
public class Faculty{
	public String name;
	private int basic;
	public int salary;
	public Faculty(String name,int basic){
		this.name=name;
		this.basic=basic;
	}
	public int getSalary(){
		salary=basic;
		return salary;
	}
	public String getDetails(){
		return name+""+getSAlary();
	}
	
	public class AssistantProfessor extends Faculty{
		int DA;
		public AssistantProfessor(String name,int basic,int AD){
			super(name,basic);
			this.DA=DA;
		}
		public int getSalary(){
			return super.getSalary()+((super.getSalary()*DA/100));
		}
		public String getDetails(){
			return"Assitant Professor:"+name+""+this.getSalary();
		}
		
		public class AssociateProfessor extends AssitantProfessor{
			public int medAllowance;
			public AssociateProfessor(String  name,int basic,int DA,int medAllowance){
				super(name,basic,DA);
				this.medAllowance=medAllowance;
			}
			public int getSalary(){
				return super.getsalary()+medAllowance;
			}
			public String getDetails(){
				return "AssociateProfessor"+name+""+getSalary();
			}
		}
		
		public class Professor extends AssociateProfessor{
			public Professor (String name,int basic,int DA,int medAllowance,int otherAllowance){
				super(name,basic,DA,medAllowance);
				this.otherAllowance=otherAllowance;
			}
			public int getSalary(){
				return super.getSalary()+((otherAllowance*super.getSalary())/100);
			}
			public String getDetails(){
				return"prof"+name+""+getSalary();
			}
		}
		public class TestFaculty{
			public static void main(String args[]){
				AssistantProfessor a=new AssistantProfessor("anchal",30000,14000);
				System.out.println(a.getDetails());
				AssistantProfessor a1=new AssistantProfessor("anchal",30000,14000);
				System.out.println(a.getDetails());

			}
		}
	}
}