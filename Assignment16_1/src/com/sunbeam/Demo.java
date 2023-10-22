package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
//	public static int menu() {
//		int choice;
//		System.out.println("ENTER YOUR CHOICE");
//		System.out.println("*********************************************************");
//		System.out.println("ENTER 0. EXIT");
//		
//		System.out.println("ENTER 1. add new candidate");
//		System.out.println("Enter 2.modify name and party for the id");
//		Scanner sc= new Scanner (System.in);
//		choice=sc.nextInt();
//		
//		
//		return choice;
//	}

	public static void main(String[] args) {
		int choice=0;
		do {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("*********************************************************");
			System.out.println("ENTER 0. EXIT");
			
			System.out.println("ENTER 1. add new candidate");
			System.out.println("Enter 2.modify name and party for the id");
			Scanner sc= new Scanner (System.in);
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				  Candidate c= new Candidate();
				 try(CandidateDao cd = new CandidateDao()){
					System.out.println("ADD NEW CANDIDATE"); 
					c.Accept();
					cd.save(c); 
				 }catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("EXIT from case 1...........!!!");
				break;
			case 2:
				     Candidate b=new Candidate();
				     try(CandidateDao cd = new CandidateDao()){
				    	 int id;
				    	 Scanner s=new Scanner(System.in);
				    	 System.out.println("Enter id of candidate ot change name nd party");
				    	 id=s.nextInt();
				    	 b.setId(id);
				    	 System.out.println("Enter name");
				    	 b.setName(s.next());
				    	 System.out.println("Enter party name");
				    	 b.setParty(s.next());
				    	 cd.update(b);
				    	
				     }catch (Exception e) {
						e.printStackTrace();
					}
				     break;
			case 3:
					
//				    PartyVotes vp = new PartyVotes();
				try(CandidateDao cc = new CandidateDao() ){
					List<PartyVotes> list = cc.getPartywiseVotes();
					list.forEach(System.out :: println);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
				default:
					System.out.println("Sorry worng choice.......");
				break;
			}
			
		}while(choice!=0);
		System.out.println("TERMINATED.........");
	}

}
