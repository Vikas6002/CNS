#include <stdio.h>
int main()
{
char *str ="Hello world";
int i;
printf("Original String: %s\n\n", str);
printf("AND with 127:\n");
for (i = 0; str[i] !='\0'; i++)
{
printf("'%c' AND 127 = %d\n", str[i], str[i] & 127);
}
printf("\nXOR with 127:\n");
for (i = 0; str[i] !='\0'; i++)
{
printf("'%c' XOR 127 = %d\n", str[i], str[i] ^ 127);
}
return 0;
}