package com.customer;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.mysql.cj.Session;

public class CustomerManage {
	private int cid;
	private String cname;
	private String address;
	private int contact;
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//creating Scanner object to read input
		Scanner input=new Scanner(System.in);
		//Creating option integer variable
		int option=0;
		//do-while loop
		do
		{
			menu();
			option=input.nextInt();
			//switch case begins
			switch(option)
			{
			//Case 1
			case 1:      
				customer c1=new customer();
				System.out.println("customer id:");
				int id=input.nextInt();
				c1.setCid(id);				
				System.out.println("customer name");
				String name=input.next();
				c1.setCname(name);
				
				System.out.println("customer address");
				String Adress=input.next();
				c1.setAddress(Adress);
				
				System.out.println("customer contact");
				int contact=input.nextInt();
				c1.setContact(contact);
			    
				Transaction t=session.beginTransaction();
				session.save(c1);
				t.commit();
				break;
				//Case 2
			case 2:   //delete message
				System.out.println("Enter id to be deleted");
				id=input.nextInt();
				customer c2 =session.get(customer.class,id);
			    Transaction t1=session.beginTransaction();
				session.delete(c2);
				t1.commit();
				session.save(c2);
				session.close();
				break;
				//Case 3
			case 3:       //update message
				System.out.println("Enter id to be updated");
				 id=input.nextInt();
				customer c3=session.get(customer.class, id);
			    if(c3!=null)
			    {
			    	input.nextLine();
			    	System.out.println("customer id:");
			    	id=input.nextInt();
			    	c3.setCid(id);
			    	
			    	System.out.println("customer Name:");
			    	 name=input.next();
			    	c3.setCname(name);
			    	
			    	System.out.println("customer address");
			    	 address=input.next();
			         c3.setaddress(address);
			    	
			    	System.out.println("contact");
			       contact=input.nextInt();
			     c3.setSalary(contact);
			        
			        Transaction t2=session.beginTransaction();
			        
			        session.saveOrUpdate(c3);
			        t2.commit();
			      
			    	
			    }
			    else
			    {
			    	System.out.println("id not found");
			    	
			    }
			    session.close();
			    factory.close();

				break;
				//Case 4
			case 4:
				
				
				break;
				//Case 5
			case 5:
				
				
				break;
				//Case 91
			case 9:            //display message
				System.out.println("thank you for using the code.Goodbye!\n");
				System.exit(0);
				break;
				
			case 7:
				default:
					System.out.println("\n invalid input\n");					
					break;
			
			}
		}
		//checking condition
		while(option!=9);  
		
		
	}
	
	 	//Method 2
	//Menu - Static menu for displaying options
	public static void menu()
	{
		//printing statements displaying menu on console
		System.out.println("MENU");
		System.out.println("1. ADD CUSTOMER");
		System.out.println("2. DELETE CUSTOMER");
		System.out.println("3. UPDATE CUSTOMER");
		
		System.out.println("Enter your selection:");
	}
	
}
