#include <stdio.h>

int main()
{
    char *str = "HELLO WORLD";
    int i = 0;

    while (str[i] != '\0')
    {
        int c = str[i] ^ 127;
        printf("%c XOR 127 : %d\n", str[i], c);
        i++;
    }

    i = 0;
    printf("\nAND\n");
    while (str[i] != '\0')
    {
        int c = str[i] & 127;
        printf("%c AND 127 : %d\n", str[i], c);
        i++;
    }

    return 0;
}
