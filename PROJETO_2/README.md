readme_content = """# Security Vault App - Projeto 2 (EBAC)

Este projeto foi desenvolvido como parte do **Projeto 2** do curso da **EBAC (Escola Britânica de Artes Criativas e Tecnologia)**. A aplicação consiste em um sistema de gerenciamento de vendas e emissão de notas fiscais com armazenamento seguro em memória, aplicando conceitos avançados de Programação Orientada a Objetos (POO), arquitetura de repositórios e testes automatizados.

## 🚀 Funcionalidades

- **Emissão Automática de Notas Fiscais**: Cálculo automático do valor total baseado na lista de itens informados.
- **Identificação Única Criptográfica**: Geração automatizada de identificadores globais únicos (UUID) para cada nota fiscal.
- **Validação de Domínio Absoluta**: Blindagem de regras de negócio através do lançamento de exceções (`IllegalArgumentException`) caso dados obrigatórios (como cliente ou itens) estejam ausentes.
- **Persistência Segura em Memória**: Utilização de estruturas concorrentes (`ConcurrentHashMap`) na camada de repositório para garantir integridade na manipulação dos dados.
- **Cobertura de Testes Unitários**: Validação de 100% dos fluxos principais e de exceção utilizando JUnit 5.

## 🛠️ Tecnologias Utilizadas

- **Java 21**: Versão de Long Term Support (LTS) utilizada para compilação e execução.
- **Apache Maven**: Gerenciador de dependências e ciclo de vida do projeto.
- **JUnit 5 (Jupiter)**: Framework de testes automatizados para validação contínua.
- **Visual Studio Code**: IDE padrão de desenvolvimento com o *Extension Pack for Java*.

## ⚙️ Como Executar a Aplicação
**Pré-requisitos**
1. JDK 21 instalado e configurado nas variáveis de ambiente do sistema.
2. Extensão Extension Pack for Java ativa no seu VS Code.

- Passos para Rodar
1. Abra a pasta PROJETO_2 no seu VS Code.
2. Certifique-se de que o projeto foi importado como um projeto Maven válido.
3. Abra o arquivo src/main/java/com/securityvault/Main.java.
4. Clique no link Run que aparece logo acima do método public static void main.
5. O console exibirá o processamento da venda com os valores calculados:

Iniciando processamento de venda...
Venda concluída com sucesso!
ID da Nota Fiscal: [UUID Gerado]
Valor Total: R$ 4650.0

## 🧪 Como Rodar os Testes Automatizados (JUnit 5)
Os testes validam de forma isolada e integrada todas as regras do sistema. Para executá-los:

1. Via Interface do VS Code (Aba Testing)
2. Clique no ícone de Balão de Ensaio (Beaker) na barra lateral esquerda do VS Code.
3. Expanda a árvore de arquivos até encontrar as classes de teste.
4. Clique no ícone de Play no topo para rodar todos os testes.

Todos os 6 testes cadastrados devem retornar com o check verde (✅).

## Cenários de Teste Cobertos:
- **shouldCalculateTotalValueCorrectly: Verifica se o somatório dos itens da nota fiscal condiz com o esperado.

- **shouldThrowExceptionWhenClientIsNull**: Garante o bloqueio de notas fiscais sem cliente associado.
- **shouldThrowExceptionWhenItemsAreEmpty**: Impede a criação de uma nota fiscal sem nenhum produto.
- **testProcessSaleWithSuccess**: Valida a integração ponta a ponta do serviço de vendas com a persistência de repositório.

## 📂 Estrutura do Projeto

O projeto segue estritamente a convenção padrão de diretórios do Maven:

```text
PROJETO_2/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── securityvault/
    │               ├── Main.java (Ponto de Entrada)
    │               ├── ClientEntity.java
    │               ├── ItemEntity.java
    │               ├── InvoiceEntity.java
    │               ├── VaultRepository.java
    │               ├── AbstractVaultRepository.java
    │               └── SalesVaultService.java
    └── test/
        └── java/
            └── com/
                └── securityvault/
                    ├── InvoiceEntityTest.java
                    └── SalesVaultServiceTest.java
