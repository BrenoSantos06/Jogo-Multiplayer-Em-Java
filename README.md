# Acerte o Número — Multiplayer em Java

Um jogo multiplayer simples desenvolvido em Java utilizando arquitetura cliente-servidor com RMI (Remote Method Invocation).

O projeto foi desenvolvido com foco na aplicação prática de conceitos de Sistemas Distribuídos, comunicação em rede e sincronização entre múltiplos clientes.

---

## Sobre o Projeto

O jogo funciona de forma multiplayer para dois jogadores, onde um servidor central gera um número aleatório entre 1 e 100 e os clientes tentam descobrir esse número em turnos alternados.

Toda a comunicação ocorre remotamente através do Java RMI, permitindo partidas em rede local ou pela internet utilizando VPNs como Hamachi ou Radmin VPN.

A aplicação também possui uma interface gráfica desenvolvida em Java Swing.

---

## Funcionalidades

* Multiplayer para 2 jogadores
* Comunicação remota com Java RMI
* Arquitetura cliente-servidor
* Interface gráfica com Java Swing
* Controle de turnos
* Histórico compartilhado de jogadas
* Atualização automática em tempo real
* Validação de entradas
* Encerramento automático da partida
* Compatível com execução local e online

---

## Tecnologias Utilizadas

* Java
* Java RMI
* Java Swing
* Programação Orientada a Objetos
* Sistemas Distribuídos
* Programação Concorrente

---

## Conceitos Aplicados

Este projeto aplica diversos conceitos importantes de computação distribuída:

* Comunicação Cliente-Servidor
* RPC (Remote Procedure Call)
* RMI (Remote Method Invocation)
* Compartilhamento de estado
* Sincronização de dados
* Controle de concorrência
* Comunicação em rede
* Aplicações distribuídas

---

## Funcionamento do Jogo

1. O servidor gera um número secreto aleatório.
2. Dois jogadores conectam-se ao servidor.
3. Cada jogador escolhe um identificador (Jogador 1 ou Jogador 2).
4. Os turnos são alternados automaticamente.
5. O servidor informa se o número secreto é maior ou menor.
6. O jogo termina quando um jogador acerta o número.

---

## Estrutura do Projeto

```text
AcerteNumero
 └── src
      └── aplicacao
           ├── Cliente.java
           ├── ClienteGUI.java
           ├── Jogo.java
           ├── JogoImpl.java
           └── Servidor.java
```

---

## Como Executar Pela IDE

# 1. Importe o projeto para sua IDE (Eclipse, IntelliJ, NetBeans).
# 2. Compile o projeto.
# 3. Execute a classe `Servidor` para iniciar o servidor.
# 4. Execute a classe `ClienteGUI` para iniciar o cliente gráfico.
# 5. Abra duas instâncias do cliente para iniciar a partida.

## Como Executar Pelo Terminal

### 1. Compilar o projeto

Na pasta src :

```bash
javac aplicacao\*.java
```

---

### 2. Executar o servidor

```bash
java -cp . aplicacao.Servidor
```

---

### 3. Executar o cliente gráfico

```bash
java -cp . aplicacao.ClienteGUI
```

Abra duas instâncias do cliente para iniciar a partida.

---

## Multiplayer Online

O jogo pode ser executado entre computadores diferentes utilizando:

* Hamachi
* Radmin VPN
* Rede local
* Port Forwarding

Para isso, basta alterar o IP do servidor no arquivo `ClienteGUI.java`.

Exemplo:

```java
LocateRegistry.getRegistry("SEU_IP");
```

---

## Gerando Arquivos JAR

### Cliente

```bash
jar cfe ClienteGUI.jar aplicacao.ClienteGUI -C src .
```

### Servidor

```bash
jar cfe Servidor.jar aplicacao.Servidor -C src .
```

---

## Executando os Arquivos JAR

### Servidor

```bash
java -jar Servidor.jar
```

### Cliente

```bash
java -jar ClienteGUI.jar
```

---

## Interface

A aplicação possui:

* Tema escuro
* Histórico compartilhado
* Controle visual de turno
* Interface gráfica simples
* Atualização automática da partida

---

## Objetivo Acadêmico

Este projeto foi desenvolvido com fins educacionais para aplicação prática de conceitos relacionados a:

* Sistemas Distribuídos
* Redes de Computadores
* Comunicação Remota
* Programação Concorrente

---

## Autor

Breno Cirqueira de Araújo Santos
