#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int *p = malloc(sizeof(int));
    printf("O endereço do ponteiro é: %p \n", p);
    
    *p = 120;
    
    if (p == NULL){
       printf("Não há espaço suficiente na memória para alocar!");
    }
    
    printf("O atual valor do ponteiro é: %i", *p);
    
    return 0;
    
}