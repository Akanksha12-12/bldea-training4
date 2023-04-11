package com.BLDEA.Crorepatiapp.pkg1;

import java.util.Scanner;

public class Crorepathiapp {
public static void main(String[] args)throws Exception {
	System.out.println("Welcome to our Kaun Banega Crorepati Game");
	System.out.println("Lets Welcome our very first Candidate");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name=sc.next();
	System.out.println("What is your age?");
	int age=sc.nextInt();
	System.out.println("What is your city?");
	String city=sc.next();
	System.out.println("What is your state?");
	String state=sc.next();
	
	Candidate c1=new Candidate(name,age,city,state);

	System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());
	System.out.println("The rules of the game are:"); 
	System.out.println("Rule 1. There will be 10 question which rewards a specific amount in"+ "incremental order");
	System.out.println("Rule 2. The game contains 3 life-lines.\n"+ "1. Audiance Poll\n2. 50-50\n3. Skip the question");
	System.out.println("Rule 3. You can quit the game at any stage.");
	
	System.out.println("Please type 1 if you wish to see the reward per question."+ "Else type any different number");
	int type_1=sc.nextInt();
	if(type_1==1) {
		System.out.println("Q1 - 1000/-\n"+
				           "Q2 - 2000/-\n"+
				           "Q3 - 5000/-\n"+
				           "Q4 - 10000/-\n"+
				           "Q5 - 20000/-\n"+
				           "Q6 - 50000/-\n"+
				           "Q7 - 100000/-\n"+
				           "Q8 - 1000000/-\n"+
				           "Q9 - 5000000/-\n"+
				           "Q10 -10000000/-\n");
		System.out.println("Do you wish to continue? (If yes then type: YES/NO)");
	}
	else {
		System.out.println("Do you wish to continue? (If yes then type: YES/NO)");
	}
		String type_2=sc.next();
		
		if(type_2.equalsIgnoreCase("yes")==true) {
			System.out.println("Lets Begin the Game.");
			System.out.println("Here is your first Question.");
			boolean res1=Questions.fetchQuestion1(c1.getName());
			if(res1==true) {
				System.out.println("Congrats!! your answer is correct.\n"+
			                       "you have won Rs."+c1.getAmount());
				System.out.println("Here is your next question.");
				boolean res2=Questions.fetchQuestion2(c1.getName());
				if(res2==true) {
					System.out.println("Congrats!! your answer is correct.\n"+
				                       "you have won Rs."+c1.getAmount());
					System.out.println("Here is your next question.");
					boolean res3=Questions.fetchQuestion3(c1.getName());
					if(res3==true) {
						System.out.println("Congrats!! your answer is correct.\n"+
					                       "you have won Rs."+c1.getAmount());
						System.out.println("Here is your next question.");
						boolean res4=Questions.fetchQuestion4(c1.getName());
						if(res4==true) {
							System.out.println("Congrats!! your answer is correct.\n"+
						                       "you have won Rs."+c1.getAmount());
							System.out.println("Here is your next question.");
							boolean res5=Questions.fetchQuestion5(c1.getName());
							if(res5==true) {
								System.out.println("Congrats!! your answer is correct.\n"+
							                       "you have won Rs."+c1.getAmount());
								System.out.println("Here is your next question.");
								boolean res6=Questions.fetchQuestion6(c1.getName());
								if(res6==true) {
									System.out.println("Congrats!! your answer is correct.\n"+
								                       "you have won Rs."+c1.getAmount());
									System.out.println("Here is your next question.");
									boolean res7=Questions.fetchQuestion7(c1.getName());
									if(res7==true) {
										System.out.println("Congrats!! your answer is correct.\n"+
									                       "you have won Rs."+c1.getAmount());
										System.out.println("Here is your next question.");
										boolean res8=Questions.fetchQuestion8(c1.getName());
										if(res8==true) {
											System.out.println("Congrats!! your answer is correct.\n"+
										                       "you have won Rs."+c1.getAmount());
											System.out.println("Here is your next question.");
											boolean res9=Questions.fetchQuestion9(c1.getName());
											if(res9==true) {
												System.out.println("Congrats!! your answer is correct.\n"+
											                       "you have won Rs."+c1.getAmount());
												System.out.println("Here is your next question.");
												boolean res10=Questions.fetchQuestion10(c1.getName());
												if(res10==true) {
													System.out.println("Congrats!! your answer is correct.\n"+
												                       "you have won Rs."+c1.getAmount());
								
			}
												else {
													System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
												}
												}
											else {
												System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
											}
											}
										else {
											System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
										}
										}
									else {
										System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
									}
									}
								else {
									System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
								}
								}
							else {
								System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
							}
							}
						else {
							System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
						}
						}
					else {
						System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
					}
					}
				else {
					System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
				}
				}
			else {
				System.out.println("We are sorry!! your answer is incorrect,\n"+"you have won Rs."+c1.getAmount());
			}
			}
											
											
			
		else {
			System.out.println("Thank you for paticipating. All the Best.");
		}
	}
}

