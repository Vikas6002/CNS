#include <stdio.h>

int main() {
    char *str = "Hello world";
    printf("XORing with 0 changes nothing:\n\n");
    while (*str) {
        printf("'%c' XOR 0 = '%c'\n", *str, *str ^ 0);
        str++; 
    }

    return 0;
}