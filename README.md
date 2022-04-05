# Output
## Passo 1:
Lista = { 1, 2, 3, 4, 5 }

## Passo 2:
Pile is full!\
Lista = { 0, 0, 0, 0, 0 }\
Pilha = { 1, 2, 3, 4, 5 }

## Passo 3:
Pilha = { 0, 0, 0, 0, 0 }\
Fila = { 5, 4, 3, 2, 1, 0, 0, 0, 0, 0 }

## Passo 4:
Lista = { 6, 7, 8, 9, 10 }

## Passo 5:
Pile is full!\
Lista = { 0, 0, 0, 0, 0 }\
Pilha = { 6, 7, 8, 9, 10 }

## Passo 6:
Queue is full!\
Pilha = { 0, 0, 0, 0, 0 }\
Fila = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 }

# Explicação
A fila está ordenada de forma diferente da inserida por causa da presença de pilhas no processo de transferência dos dados.\
A lista recebe os números em ordem no `Passo 1`, seus membros são removidos em ordem também
e inseridos corretamente na pilha `Passo 2`, porém ao remover os elementos novamente, ao se tratar de uma pilha, o último a entrar é o primeiro a sair, logo os dados são inseridos na fila na ordem contrária a que foram inseridos na pilha, ou seja, de trás para a frente ``Passo 3``. O mesmo pode ser observado no ``Passo 6`` ao inserir os últimos 5 elementos de forma inversa também.