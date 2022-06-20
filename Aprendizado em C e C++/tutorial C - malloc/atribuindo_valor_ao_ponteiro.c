#include <stdio.h>
#include <stdlib.h>

int main() {
    
    short x;
    x = 10;
    
    int c[10];
    
    short *p = &x;
    
    printf("Endereço = %p \n", p);
    printf("valor do ponteiro = %d", *p);
    
    return 0;
    
}