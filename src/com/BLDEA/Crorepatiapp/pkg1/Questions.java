package com.BLDEA.Crorepatiapp.pkg1;

import java.util.Scanner;

public class Questions {
 static String result;
 static String result2;
 static int count_life_line=3;
 static int aud_phn=1;
 static int cnt_50_50=1;
 static int skip_cnt=1;
 static Scanner sc=new Scanner(System.in);
 public static boolean fetchQuestion1(String name)throws Exception {
	 System.out.println("1. Who is founder of Java?");
	 System.out.println("a. Dennis Ritchie\n"+
	                    "b. Charles Babbage\n"+
			            "c. Rahul Gandhi\n"+
	                    "d. James Gosling\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("d")) {
		 Candidate.setAmount(1000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(1000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion2(String name) throws Exception{
	 System.out.println("2. Which city is known as 'Pink City' of India?");
	 System.out.println("a. Bangalore\n"+
	                    "b. Mumbai\n"+
			            "c. Jaipur\n"+
	                    "d. Delhi\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("c")) {
		 Candidate.setAmount(2000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b. Mumbai\n"+
							            "c. Jaipur\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a. Bangalore\n"+
							                    "b. Mumbai\n"+
									            "c. Jaipur\n"+
							                    "d. Delhi\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b. Mumbai\n"+
									            "c. Jaipur\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bangalore\n"+
									                    "b. Mumbai\n"+
											            "c. Jaipur\n"+
									                    "d. Delhi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b. Mumbai\n"+
					            "c. Jaipur\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bangalore\n"+
									                    "b. Mumbai\n"+
											            "c. Jaipur\n"+
									                    "d. Delhi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bangalore\n"+
									                    "b. Mumbai\n"+
											            "c. Jaipur\n"+
									                    "d. Delhi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println( "b. Mumbai\n"+
									            "c. Jaipur\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bangalore\n"+
									                    "b. Mumbai\n"+
											            "c. Jaipur\n"+
									                    "d. Delhi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println( "b. Mumbai\n"+
							            "c. Jaipur\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bangalore\n"+
									                    "b. Mumbai\n"+
											            "c. Jaipur\n"+
									                    "d. Delhi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Bangalore\n"+
			                    "b. Mumbai\n"+
					            "c. Jaipur\n"+
			                    "d. Delhi\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2000);
					return true;
				}
			}

		}


		return false;
	}
	


public static boolean fetchQuestion3(String name)throws Exception {
	 System.out.println("3. Which of the following gods is also known as 'Gauri Nandan'?");
	 System.out.println("a. Agni\n"+
	                    "b. Indra\n"+
			            "c. Hanuman\n"+
	                    "d. Ganesha\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("d")) {
		 Candidate.setAmount(5000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. Hanuman\n"+
					                    "d. Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. Hanuman\n"+
							                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c. Hanuman\n"+
			                    "d. Ganesha\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. Hanuman\n"+
							                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. Hanuman\n"+
					                    "d. Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Agni\n"+
									                    "b. Indra\n"+
											            "c. Hanuman\n"+
									                    "d. Ganesha\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Agni\n"+
			                    "b. Indra\n"+
					            "c. Hanuman\n"+
			                    "d. Ganesha\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(5000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion4(String name)throws Exception {
	 System.out.println("4. The largest coal producing state in India is?");
	 System.out.println("a. Bihar\n"+
	                    "b. West Bengal\n"+
			            "c. Orissa\n"+
	                    "d. Madhya pradesh\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("a")) {
		 Candidate.setAmount(10000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. Bihar\n"+
					                    "b. West Bengal\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. Bihar\n"+
							                    "b. West Bengal\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a. Bihar\n"+
			                    "b. West Bengal\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. Bihar\n"+
							                    "b. West Bengal\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. Bihar\n"+
					                    "b. West Bengal\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Bihar\n"+
									                    "b. West Bengal\n"+
											            "c. Orissa\n"+
									                    "d. Madhya pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Bihar\n"+
			                    "b. West Bengal\n"+
					            "c. Orissa\n"+
			                    "d. Madhya pradesh\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion5(String name) throws Exception{
	 System.out.println("5. How many colours are present in the Rainbow?");
	 System.out.println("a. 11\n"+
	                    "b. 7\n"+
			            "c. 8\n"+
	                    "d. 1\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("b")) {
		 Candidate.setAmount(20000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. 11\n"+
					                    "b. 7\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. 11\n"+
							                    "b. 7\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a. 11\n"+
			                    "b. 7\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(20000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. 11\n"+
							                    "b. 7\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. 11\n"+
					                    "b. 7\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 11\n"+
									                    "b. 7\n"+
											            "c. 8\n"+
									                    "d. 1\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. 11\n"+
			                    "b. 7\n"+
					            "c. 8\n"+
			                    "d. 1\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(20000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion6(String name) throws Exception{
	 System.out.println("6. The most abundant gas on earth's atmosphere is?");
	 System.out.println("a. Oxygen\n"+
	                    "b. Carbon Dioxide\n"+
			            "c. Nitrogen\n"+
	                    "d. Hydrogen\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("c")) {
		 Candidate.setAmount(50000);
		 return true;
		
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. Nitrogen\n"+
					                    "d. Hydrogen\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. Nitrogen\n"+
							                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c. Nitrogen\n"+
			                    "d. Hydrogen\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. Nitrogen\n"+
							                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. Nitrogen\n"+
					                    "d. Hydrogen\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Oxygen\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Nitrogen\n"+
									                    "d. Hydrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Oxygen\n"+
			                    "b. Carbon Dioxide\n"+
					            "c. Nitrogen\n"+
			                    "d. Hydrogen\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(50000);
					return true;
				}
			}

		}


		return false;
	}
	
public static boolean fetchQuestion7(String name)throws Exception {
	 System.out.println("7. How many years did it take to build the Taj Mahal?");
	 System.out.println("a. 10 years\n"+
	                    "b. 2 years\n"+
			            "c. 50 years\n"+
	                    "d. 20 years\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("d")) {
		 Candidate.setAmount(100000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(100000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. 50 years\n"+
					                    "d. 20 years\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(100000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. 50 years\n"+
							                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c. 50 years\n"+
			                    "d. 20 years\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(100000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(100000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(100000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. 50 years\n"+
							                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. 50 years\n"+
					                    "d. 20 years\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 10 years\n"+
									                    "b. 2 years\n"+
											            "c. 50 years\n"+
									                    "d. 20 years\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. 10 years\n"+
			                    "b. 2 years\n"+
					            "c. 50 years\n"+
			                    "d. 20 years\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(100000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion8(String name)throws Exception {
	 System.out.println("8. Who is the first Indian to win Nobel Prize?");
	 System.out.println("a. Mahatma Gandhi\n"+
	                    "b. Rabindranath Tagore\n"+
			            "c. Manmohan Singh\n"+
	                    "d. Jawaharlal Nehru\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("b")) {
		 Candidate.setAmount(1000000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(1000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b. Rabindranath Tagore\n"+
							            "c. Manmohan Singh\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b. Rabindranath Tagore\n"+
									            "c. Manmohan Singh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b. Rabindranath Tagore\n"+
					            "c. Manmohan Singh\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(1000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b. Rabindranath Tagore\n"+
									            "c. Manmohan Singh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b. Rabindranath Tagore\n"+
							            "c. Manmohan Singh\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Mahatma Gandhi\n"+
									                    "b. Rabindranath Tagore\n"+
											            "c. Manmohan Singh\n"+
									                    "d. Jawaharlal Nehru\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Mahatma Gandhi\n"+
			                    "b. Rabindranath Tagore\n"+
					            "c. Manmohan Singh\n"+
			                    "d. Jawaharlal Nehru\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(1000000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion9(String name) throws Exception{
	 System.out.println("9. How many bones does a human adult have?");
	 System.out.println("a. 209\n"+
	                    "b. 230\n"+
			            "c. 301\n"+
	                    "d. 206\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("d")) {
		 Candidate.setAmount(5000000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. 301\n"+
					                    "d. 206\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. 301\n"+
							                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c. 301\n"+
			                    "d. 206\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c. 301\n"+
							                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c. 301\n"+
					                    "d. 206\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. 209\n"+
									                    "b. 230\n"+
											            "c. 301\n"+
									                    "d. 206\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. 209\n"+
			                    "b. 230\n"+
					            "c. 301\n"+
			                    "d. 206\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(5000000);
					return true;
				}
			}

		}


		return false;
	}
	

public static boolean fetchQuestion10(String name)throws Exception {
	 System.out.println("10. Which gas is also known as laughing gas?");
	 System.out.println("a. Nitrous oxide\n"+
	                    "b. Carbon Dioxide\n"+
			            "c. Helium\n"+
	                    "d. Nitrogen Dioxide\n"+
			            "e. life line");
	 result = sc.next();
	 if(result.equalsIgnoreCase("a")) {
		 Candidate.setAmount(10000000);
		 return true;	 
	 }
	 else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(10000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. Nitrous oxide\n"+
					                    "b. Carbon Dioxide\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. Nitrous oxide\n"+
							                    "b. Carbon Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a. Nitrous oxide\n"+
			                    "b. Carbon Dioxide\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(10000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a. Nitrous oxide\n"+
							                    "b. Carbon Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a. Nitrous oxide\n"+
					                    "b. Carbon Dioxide\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a. Nitrous oxide\n"+
									                    "b. Carbon Dioxide\n"+
											            "c. Helium\n"+
									                    "d. Nitrogen Dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a. Nitrous oxide\n"+
			                    "b. Carbon Dioxide\n"+
					            "c. Helium\n"+
			                    "d. Nitrogen Dioxide\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(10000000);
					return true;
				}
			}

		}


		return false;
	}
	

}