#include<stdio.h>
void main()
{
	int ch;
	puts("enter any alphabet");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':
			puts("vowel");
			break;
			case 'e':
				puts("vowel");
				break;
				case 'i':
					puts("vowel");
					break;
					case 'o':
						puts("vowel");
						break;
						case 'u':
							puts("vowel");
							break;
							   default:
						            puts("entered alphabet is consonent");
									break;
	}
}
