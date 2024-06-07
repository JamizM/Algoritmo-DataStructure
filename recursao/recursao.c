#include <limits.h>
#include <stdio.h>

float fat (int n) {
    int i;
    float f=1.0;
    for (i=2; i<=n; i++) {
        f = f * i;
    }
    return f;
}
int fat_rec (int n) {
    if (n <= 1) return 1;
    return n * fat_rec(n-1); 
}
int fib (int n) {
    if (n<=1) return 1;
    return fib(n-1) + fib(n-2);
}

int main (){
    // printf ("inteiro maximo com sinal: %d\n", INT_MAX);
    // printf ("inteiro maximo sem sinal: %u\n", UINT_MAX);
    // for (int i=0; i<=13; i++) {
    //     printf ("fatorial de %d = %.0f\n", i, fat(i));
    // }
    // for (int i=0; i<13; i++)
    //     printf ("fatorial de %d = %d\n", i, fat_rec(i));
    for (int i=1; i<=45; i++) {
        printf ("fibinacci em %d: %d\n", i, fib(i));
    }
    return 0;
}