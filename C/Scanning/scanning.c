#include <stdio.h>
int main(){
int meuNumero;
int meuOutroNumero;
printf("Digite o primeiro numero: \n");
scanf("%d", &meuNumero);
printf("Digite o segundo numero: \n");
scanf("%d", &meuOutroNumero);
int total = meuNumero + meuOutroNumero;
printf("A soma desses numeros e igual a: %d\n", total);
return 0;
}