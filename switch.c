#include<stdio.h>
void main()
{
	int mnum;
	puts("enter the month number");
	scanf("%d",&mnum);
	switch(mnum)
	{
		case 1:
			puts("jan");
			break;
			case 2:
				puts("feb");
				break;
				case 3:
					puts("march");
					break;
					case 4:
						puts("april");
						break;
						case 5:
							puts("may");
							break;
							case 6:
								puts("june");
								break;
								case 7:
									puts("july");
									break;
									case 8:
										puts("aug");
										break;
										case 9:
											puts("sep");
											break;
											case 10:
												puts("oct");
												break;
												case 11:
													puts("nov");
													break;
													case 12:
														puts("dec");
														break;
														default:
															puts("please enter the valid month number");
															break;
	}
}
