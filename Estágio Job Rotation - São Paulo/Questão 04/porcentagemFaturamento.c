#include <string.h>
#include <stdio.h>

typedef struct {
 float valor;
 char nomeCidade[3];
 float porcentagem;
}Cidade;

int main (){

 Cidade cidade[5];
double valorTotal;

  for (int i = 0; i < 5; i++) {
        setbuf(stdin, NULL);
        scanf(" %[^\t\n]s",cidade[i].nomeCidade);
        scanf("%f",&cidade[i].valor);

        valorTotal = valorTotal +cidade[i].valor;
}
printf("Valor Total R$ %.2f\n",valorTotal);

printf("<-----------------------> \n");

for (int i = 0; i < 5; i++) {

        cidade[i].porcentagem = (cidade[i].valor * 100) / valorTotal;
}

for (int i = 0; i < 5; i++) {

        printf("Cidade %s ", cidade[i].nomeCidade);
        printf("Participacao da venda Total %.1f%%\n", cidade[i].porcentagem);
}

return 0;
}
