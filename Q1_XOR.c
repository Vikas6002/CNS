#include <stdio.h>

int main()
{
    char *str="HELLO WORLD";
    int i=0;
    while(str[i]!='\0')
    {
        char c=str[i]^0;
        printf("%c",c);
        i++;
    }
    return 0;
}
