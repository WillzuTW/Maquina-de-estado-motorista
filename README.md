# Máquina de Estado: Motorista de Aplicativo

> Máquina de estado responsável por simular o trajeto de um motorista de aplicativo genérico (Uber, 99, etc.), incluindo eventos casuais e imprevistos que podem acontecer durante a viagem.

## Como compilar e executar

Você pode rodar este projeto de duas maneiras:

### Opção 1: Via Editor/IDE
1. Baixe ou clone o projeto para o seu computador.
2. Abra a pasta do projeto no seu editor de código ou IDE.
3. Execute o projeto diretamente pelo botão de "Run" do seu editor na classe `Main`.

### Opção 2: Via Terminal
1. Baixe ou clone o projeto para o seu computador.
2. Navegue até a pasta `src` do projeto.
3. No Windows, você pode clicar na barra de endereços do explorador de arquivos, digitar `cmd` e apertar Enter para abrir o terminal direto nessa pasta.
4. Compile o arquivo principal digitando o comando abaixo:
   ```
   javac Main.java
5. Em seguida, rode o programa compilado com o comando:
   ```
   java Main
## Agentes
### Motorista
Esse agente é responsável por iniciar uma busca por um passageiro; Buscar ele; Levar ele até o destino, e por fim parar o carro.
#### Estados:
1. Parking: Faz a procura dos passageiros e o sorteio para ver se os acha
2. DrivingToPassenger: Faz o percurso para buscar o passageiro e também para o carro por meio de um sorteio.
3. DeliveringPassenger: Faz o percuso até o destino que o passageiro definiu e também realizada o sorteio para parar o carro.
   
#### Casualidade
Esse agente é responsável por monitorar se o motorista parou o carro, quando o motorista para o carro o agente sorteia o motivo por causa disso e só libera quando passa um tempo determinado exclusivo por motivo.
#### Estados:
1. Observando: Observa se o carro parou no meio do trajeto.
2. Eventos: Sorteia um evento aleatório que prende o carro por x interações e libera após isso.

## Como analisar no terminal as alterações?
Quando você iniciar você ira se deparar com essa tela aqui
```
+-- Motorista@14dad5dc -------------------------
| Estado atual: Parking
| Passageiro encontrado: Maria, Km da viagem: 3
+--------------------------------------------
+-- Casualidades@15db9742 ----------------------
| Estado atual: Observando
| Observando: Motorista@14dad5dc
+--------------------------------------------
```
Aqui temos dois blocos o primeiro sendo do objeto Motorista e o segundo o objeto Casualidades
Logo abaixo do nomes desses objetos temos o estado atual que ele se encontra e mais um abaixo temos o que está sendo imprimido para facilitar a compreensão do que está acontecendo no código.
Nela irá ter o que está acontecendo a cada interação.

## Diagramas
![Diagrama da Máquina de Estados]([Diagramas/Motorista de aplicativo.drawio.png](https://github.com/WillzuTW/Maquina-de-estado-motorista/blob/main/Diagramas/Motorista%20de%20aplicativo.drawio.png))

## Referências
Neste projeto foi usado IA para consultar documentação de java e também para encontrar erros de digitação durante o código 
