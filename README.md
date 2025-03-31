# Meu Primeiro Programa em Java: `ContaTerminal.java` 🎉  

Olá, galera! 👋 Estou estudando **Engenharia de Software** e esse é o meu **primeiro programa em Java**. 🚀  

Criei um simples sistema bancário no terminal, onde o usuário insere os dados da conta (número, agência, nome e saldo) como argumentos na linha de comando, e o programa exibe essas informações formatadas, além de uma mensagem de boas-vindas personalizada.  

Bora entender esse código comigo? 💡  

---

## 📝 Estrutura do Código  

O código está dentro da **classe `ContaTerminal`**, que contém apenas o método `main`. Esse método é o ponto de entrada do programa e recebe os dados do usuário como argumentos da linha de comando.  

---

## 🔍 Explicação Passo a Passo  

### 1️⃣ Criando a Classe e o Método `main`  

```java
public class ContaTerminal {
    
    public static void main(String[] args) {
```

- **`public class ContaTerminal`** → Declara a classe principal do programa.  
- **`public static void main(String[] args)`** → Esse é o método principal. Ele recebe um array de `String` chamado `args`, que contém os argumentos passados na linha de comando quando o programa é executado.  

---

### 2️⃣ Validando a Entrada do Usuário  

```java
if (args.length < 4) {
    System.out.println("Erro: Argumentos insuficientes!");
    System.out.println("Uso correto: java ContaTerminal <numero> <agencia> <nomeCliente> <saldo>");
    System.out.println("Exemplo: java ContaTerminal 1234 567-8 \"Fulano da Silva\" 1500.75");
    return;
}
```

📌 **O que acontece aqui?**  
- O programa verifica se foram fornecidos pelo menos **quatro argumentos**.  
- Se faltar algum, ele exibe uma mensagem de erro com um exemplo correto de uso.  
- **`return;`** faz com que o programa pare imediatamente.  

✅ **Por que isso é importante?**  
- Evita que o programa tente acessar `args[]` e gere um erro por falta de dados.  

---

### 3️⃣ Convertendo os Dados  

```java
try {
    int numero = Integer.parseInt(args[0]);
    String agencia = args[1];
    String nomeCliente = args[2];
    double saldo = Double.parseDouble(args[3]);
```

📌 **O que está acontecendo?**  
- **`Integer.parseInt(args[0])`** → Converte o primeiro argumento (`args[0]`) para **inteiro** (`int`), que será o **número da conta**.  
- **`String agencia = args[1];`** → Mantém o segundo argumento como **String**, pois pode conter hífen (exemplo: `"567-8"`).  
- **`String nomeCliente = args[2];`** → O terceiro argumento é simplesmente armazenado como **String** (o nome do cliente).  
- **`Double.parseDouble(args[3])`** → Converte o último argumento (`args[3]`) para **double**, que será o **saldo da conta**.  

💡 **Por que usar `try`?**  
Caso o usuário insira um valor inválido para o **número da conta** ou **saldo**, o programa evita um erro fatal e trata isso de forma amigável.  

---

### 4️⃣ Exibindo os Dados  

```java
System.out.println("\n=== DADOS DA CONTA ===");
System.out.println("Número da conta: " + numero);
System.out.println("Agência: " + agencia);
System.out.println("Nome do cliente: " + nomeCliente);
System.out.printf("Saldo: R$ %.2f\n", saldo);
```

📌 **Aqui, formatamos a saída de forma amigável**:  
- `System.out.println()` exibe mensagens no terminal.  
- `System.out.printf("Saldo: R$ %.2f\n", saldo);` → Formata o saldo para **duas casas decimais**, garantindo um visual melhor.  

---

### 5️⃣ Mensagem Personalizada de Boas-Vindas  

```java
System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\n" +
        "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
        nomeCliente, agencia, numero, saldo);
```

📌 **Detalhes importantes**:  
- `printf` permite formatar strings de forma dinâmica.  
- **Placeholders usados:**  
  - `%s` → Substituído por uma **String** (`nomeCliente` e `agencia`).  
  - `%d` → Substituído por um **inteiro** (`numero`).  
  - `%.2f` → Substituído por um **número decimal com duas casas** (`saldo`).  

💡 **Isso deixa a saída mais bonita e profissional!**  

---

### 6️⃣ Tratando Erros  

```java
} catch (NumberFormatException e) {
    System.out.println("Erro: Formato inválido para número ou saldo!");
    System.out.println("Certifique-se que o número é inteiro e o saldo é numérico (ex: 1500.75)");
}
```

📌 **Por que isso é importante?**  
- Se o usuário digitar algo errado (ex: "ABC" no lugar do saldo), o programa captura a exceção **`NumberFormatException`** e exibe uma mensagem explicativa.  
- Isso evita que o programa quebre de forma inesperada.  

---

## 🚀 Testando o Programa  

### ✅ Exemplo 1: Entrada Correta  

```sh
java ContaTerminal 1234 567-8 "João Silva" 2500.50
```

🖥 **Saída no Terminal:**

```
=== DADOS DA CONTA ===
Número da conta: 1234
Agência: 567-8
Nome do cliente: João Silva
Saldo: R$ 2500.50

Olá João Silva, obrigado por criar uma conta em nosso banco!
Sua agência é 567-8, conta 1234 e seu saldo R$ 2500.50 já está disponível para saque.
```

---

### ❌ Exemplo 2: Argumentos Insuficientes  

```sh
java ContaTerminal 1234 567-8
```

🖥 **Saída no Terminal:**

```
Erro: Argumentos insuficientes!
Uso correto: java ContaTerminal <numero> <agencia> <nomeCliente> <saldo>
Exemplo: java ContaTerminal 1234 567-8 "Fulano da Silva" 1500.75
```

---

### ❌ Exemplo 3: Erro de Formato  

```sh
java ContaTerminal 1234 567-8 "João Silva" ABC
```

🖥 **Saída no Terminal:**

```
Erro: Formato inválido para número ou saldo!
Certifique-se que o número é inteiro e o saldo é numérico (ex: 1500.75)
```

---

## 🎯 Conclusão  

Esse foi meu primeiro programa **100% funcional** em Java! 🎉  

✅ Aprendi a:  
✔️ Ler argumentos da linha de comando  
✔️ Converter tipos de dados (`String` → `int`, `String` → `double`)  
✔️ Tratar erros com `try-catch`  
✔️ Exibir mensagens formatadas no terminal  

---
#`ContaTerminalScanner.java` 🖨️  

Fala, galera! 👋 Continuando meus estudos em **Java**, agora fiz uma versão melhorada do sistema bancário, usando **entrada pelo teclado** com `Scanner`. 📟  

Neste programa, o usuário insere os dados da conta diretamente pelo **terminal** em vez de passar argumentos na linha de comando. Isso torna a experiência mais interativa! 😃  

Bora entender o código? 🚀  

---

## 📝 Estrutura do Código  

Dessa vez, criei a **classe `ContaTerminalScanner`**, que também possui apenas o método `main`. A principal diferença é que usamos a classe `Scanner` para capturar os dados diretamente do usuário.  

---

## 🔍 Explicação Passo a Passo  

### 1️⃣ Importando a Classe `Scanner`  

```java
import java.util.Scanner;
```

📌 **O que isso faz?**  
- Importa a classe `Scanner`, que permite ler entradas do teclado.  

---

### 2️⃣ Criando o Scanner e Capturando Dados  

```java
Scanner scanner = new Scanner(System.in);
```

📌 **Aqui, criamos um objeto `Scanner`** para capturar a entrada do usuário.  

Depois, solicitamos os dados um por um:  

```java
System.out.println("Digite o número da conta:");
int numero = scanner.nextInt();
scanner.nextLine(); // Consumir a quebra de linha pendente
```

💡 **Por que `scanner.nextLine();` depois de `nextInt()`?**  
- Quando usamos `nextInt()`, ele **não consome** a quebra de linha `\n` pressionada após o número.  
- Isso poderia causar problemas ao ler a agência com `nextLine()`.  

Agora, capturamos os outros dados:  

```java
System.out.println("Digite o número da agência:");
String agencia = scanner.nextLine();

System.out.println("Digite seu nome:");
String nomeCliente = scanner.nextLine();

System.out.println("Digite o saldo inicial:");
double saldo = scanner.nextDouble();
```

📌 **Dessa forma, garantimos que todos os dados são capturados corretamente!**  

---

### 3️⃣ Exibindo os Dados  

```java
System.out.println("\n=== DADOS DA CONTA ===");
System.out.println("Número da conta: " + numero);
System.out.println("Agência: " + agencia);
System.out.println("Nome do cliente: " + nomeCliente);
System.out.printf("Saldo: R$ %.2f\n", saldo);
```

📌 **Formatamos o saldo para duas casas decimais**, garantindo uma saída mais organizada.  

---

### 4️⃣ Mensagem Personalizada  

```java
System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\n" +
                  "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                  nomeCliente, agencia, numero, saldo);
```

📌 **O que fizemos aqui?**  
- Criamos uma **mensagem amigável**, incluindo os dados da conta.  
- **`printf`** foi usado para formatar a string com placeholders:  
  - `%s` → String  
  - `%d` → Inteiro  
  - `%.2f` → Decimal com 2 casas  

---

### 5️⃣ Fechando o Scanner  

```java
scanner.close();
```

💡 **Isso é importante!** Sempre que usamos `Scanner`, é bom fechar o recurso para evitar desperdício de memória.  

---

## 🚀 Testando o Programa  

🖥 **Exemplo de execução:**  

```
Digite o número da conta:
1234
Digite o número da agência:
567-8
Digite seu nome:
João Silva
Digite o saldo inicial:
2500.50

=== DADOS DA CONTA ===
Número da conta: 1234
Agência: 567-8
Nome do cliente: João Silva
Saldo: R$ 2500.50

Olá João Silva, obrigado por criar uma conta em nosso banco!
Sua agência é 567-8, conta 1234 e seu saldo R$ 2500.50 já está disponível para saque.
```

---

## 🎯 Conclusão  

Agora meu programa está **mais interativo** e **fácil de usar**! 🎉  

✅ Aprendi a:  
✔️ Capturar entrada do usuário com `Scanner`  
✔️ Tratar problemas de leitura (`nextInt()` + `nextLine()`)  
✔️ Exibir dados formatados no terminal  
