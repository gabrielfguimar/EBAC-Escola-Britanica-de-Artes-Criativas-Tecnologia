# Security-Vault-z4

## Descrição do Projeto
O **Security-Vault-z4** é uma aplicação Java desenvolvida como parte da especialização em Back-End, focada na implementação de um sistema de gerenciamento de dados (CRUD) na memória. O projeto tem como objetivo exercitar padrões de projeto, organização de código e manipulação de coleções em Java.

## Arquitetura
O sistema utiliza o padrão **DAO (Data Access Object)** para separar a lógica de persistência (armazenamento na memória) das regras de negócio e da interface com o usuário.

### Estrutura de Classes
* **`VaultItem`**: Entidade que representa o objeto protegido (ID, Descrição, Conteúdo).
* **`VaultDAO`**: Interface que define o contrato das operações CRUD (Salvar, Listar, Atualizar, Deletar).
* **`VaultDAOImpl`**: Implementação concreta da interface, utilizando `ArrayList` como repositório temporário.
* **`SecurityVaultApp`**: Classe principal que contém o menu interativo e gerencia o fluxo de execução via `Scanner`.

## Funcionalidades Implementadas
Até o momento, o sistema oferece as seguintes operações básicas:
1. **Create**: Registro de novos itens no cofre.
2. **Read**: Listagem de todos os itens cadastrados.
3. **Update**: Edição de dados de um item existente através do seu ID.
4. **Delete**: Remoção de itens da base de dados na memória.

## Como Executar
1. Certifique-se de ter o JDK (Java Development Kit) instalado.
2. Compile as classes com `javac *.java`.
3. Execute a aplicação com `java SecurityVaultApp`.

---
*Projeto desenvolvido para fins educacionais - Trilha de Especialista Back-End Java.*
## 📝 Autor: Gabriel Flores Guimarães