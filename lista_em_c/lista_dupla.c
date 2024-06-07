#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int info;
    struct no * anterior;
    struct no * proximo;
} t_no;

typedef struct lista {
    struct no * primeiro;
    struct no * ultimo;
} t_lista;

//protótipos das funções

t_no * constroi_no (int);

void inicia_lista (t_lista *);
int esta_vazia (t_lista *);
void insere_inicio (int, t_lista *);

int main () {
    // int a = 10;
    // printf ("a == 10: %d\n", a==10);
    // printf ("a != 10: %d\n", a!=10);
    // printf ("!a: %d\n", !a);
    t_no * no1 = constroi_no(10);
    t_no * no2 = constroi_no(20);
    printf ("a variavel no1 esta no endereco %p\n", &no1);
    printf ("o no1 alocado esta no endereco %p\n", no1);
    printf ("a variavel no2 esta no endereco %p\n", &no2);
    printf ("o no2 alocado esta no endereco %p\n", no2);

    t_lista lista;
    inicia_lista (&lista);
    printf ("primeiro: %p\n", lista.primeiro);
    printf ("ultimo: %p\n", lista.ultimo);

    insere_inicio(10, &lista);
    insere_inicio(20, &lista);

    printf ("onde esta o primeiro no: %p\n", lista.primeiro);
    printf ("onde esta o segundo: %p\n", lista.primeiro->proximo);

    return 0;
}

t_no * constroi_no (int i) {
    t_no * no = (t_no *) malloc (sizeof(t_no));
    no->info = i;
    no->anterior = NULL;
    no->proximo = NULL;
    return no;
}

void inicia_lista (t_lista *lista) {
    lista->primeiro = NULL;
    lista->ultimo = NULL;
}
int esta_vazia (t_lista *lista) {
    return lista->primeiro == NULL;
}
void insere_inicio (int i, t_lista *lista) {
    t_no * novo = constroi_no (i);
    if (esta_vazia(lista)) {
        lista->ultimo = novo;
    }
    else {
        novo->proximo = lista->primeiro;
        lista->primeiro->anterior = novo;
    }
    lista->primeiro = novo;
}
