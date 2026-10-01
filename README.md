# Máquina de Estado: Motorista de Aplicativo

> Máquina de estado responsável por simular o trajeto de um motorista de aplicativo genérico (Uber, 99, etc.), incluindo eventos casuais e imprevistos que podem acontecer durante a viagem.

## Como compilar e executar

Você pode rodar este projeto de duas maneiras:

### Opção 1: Via Editor/IDE (Recomendado)
1. Baixe ou clone o projeto para o seu computador.
2. Abra a pasta do projeto no seu editor de código ou IDE.
3. Execute o projeto diretamente pelo botão de "Run" do seu editor na classe `Main`.

### Opção 2: Via Terminal (Linha de comando)
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
### Casualidade
Esse agente é responsável por monitorar se o motorista parou o carro, quando o motorista para o carro o agente sorteia o motivo por causa disso e só libera quando passa um tempo determinado exclusivo por motivo.

```
$ javac Main.java
$ java Main
Iniciando corrida...
Motorista a caminho.
```



## Referências
Neste projeto foi usado IA para consultar documentação de java e também para encontrar erros de digitação durante o código 
