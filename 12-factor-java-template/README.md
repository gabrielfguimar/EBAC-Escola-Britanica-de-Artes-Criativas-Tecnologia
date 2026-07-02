# ☕ Java Spring Boot — Twelve-Factor App Template

Este repositório é um guia prático e um modelo de referência (*boilerplate*) para o desenvolvimento de microsserviços modernos e resilientes em **Java (Spring Boot)**, implementando estritamente os princípios conceituais da metodologia **Twelve-Factor App** para soluções Software como Serviço (SaaS).

## 🚀 Como este projeto aplica os 12 Fatores na prática?

### I. Base de Código (Codebase)
Existe uma correlação estrita de 1:1 entre esta aplicação e seu repositório Git. Diferentes ambientes (Dev, Staging, Produção) herdam a exata mesma base de código através de múltiplos deploys controlados.

### II. Dependências (Dependencies)
Todas as dependências sono declaradas explicitamente no arquivo `pom.xml`. O projeto não assume a existência implícita de pacotes no sistema operacional hospedeiro. O build isolado é garantido através do uso de contêineres Docker de múltiplos estágios (*multi-stage build*).

### III. Configurações (Config)
Nenhuma credencial ou string de conexão está "chumbada" (*hardcoded*) no código. No arquivo `src/main/resources/application.yml`, todas as propriedades mutáveis utilizam a sintaxe `${VARIAVEL}` do Spring, sendo injetadas estritamente por variáveis de ambiente em tempo de execução.

### IV. Serviços de Apoio (Backing Services)
O banco de dados PostgreSQL é tratado como um recurso anexado. A troca de uma instância de banco local para um serviço em nuvem gerenciado (como AWS RDS) exige apenas a alteração da variável `DATABASE_URL`, sem modificar nenhuma linha de código.

### V. Construa, Lance, Execute (Build, Release, Run)
O ciclo de implantação é estritamente separado em três fases:
1. **Build:** Ocorre no primeiro estágio do `Dockerfile` através do Maven compilando o código e gerando o arquivo `.jar` isolado.
2. **Release:** O Docker Compose (ou ferramentas de CI/CD) une o artefato gerado com as variáveis de ambiente corretas da infraestrutura.
3. **Run:** O runtime da JVM executa o pacote final imutável (`app.jar`), impossibilitando alterações de código em quente.

### VI. Processos (Processes)
A aplicação é totalmente **Stateless (sem estado)**. Nenhuma informação de sessão de usuário ou estado de negócio é retida na memória local da JVM. Toda persistência é delegada aos serviços de apoio, permitindo a destruição ou escalonamento horizontal imediato de instâncias.

### VII. Vínculo de Portas (Port Binding)
O microsserviço é autossuficiente e exporta seus serviços vinculando-se diretamente à porta HTTP (`PORT`). Ele não depende de injeções em tempo de execução de servidores web externos instalados no host (como Tomcat externo ou JBoss).

### VIII. Concorrência (Concurrency)
A escalabilidade do sistema é feita horizontalmente, adicionando-se mais processos (contêineres) isolados para absorver a carga de trabalho, sem a necessidade de readequação da arquitetura lógica.

### IX. Descartabilidade (Disposability)
Graças à inicialização rápida do Spring Boot e ao gerenciamento de sinais de término do contêiner, a aplicação encerra de maneira graciosa (*graceful shutdown*), finalizando os processos ativos no banco de dados antes de ser encerrada de forma limpa pelo orquestrador.

### X. Paridade entre Ambientes (Dev/Prod Parity)
O ambiente local mimetiza fielmente o comportamento de nuvem utilizando o `docker-compose.yml`, que sobe a mesma versão do banco de dados PostgreSQL utilizada em homologação e produção, minimizando falhas de divergência de código.

### XI. Logs
A aplicação não gerencia ou escreve arquivos de log em disco local. O framework Spring foi configurado para direcionar a saída das mensagens para o console (`stdout`). O gerenciamento, agregação e roteamento desses fluxos ficam sob responsabilidade da infraestrutura (Docker Logs, Fluentd, AWS CloudWatch).

### XII. Processos de Administração (Admin Processes)
Tarefas administrativas pontuais (como scripts de migração de dados) são desacopladas e executadas como processos de execução única contra o mesmo ambiente de banco de dados ativo.

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos
Certifique-se de possuir o [Docker](https://www.docker.com/) e o [Docker Compose](https://docs.docker.com/compose/) instalados na sua máquina.

### Passos para Inicialização

1. Clone o repositório:
2. Construa as imagens e inicialize o ecossistema completo (Aplicação + Banco de Dados): docker compose up --build
3. O Spring Boot aguardará a prontidão do banco PostgreSQL e estará disponível e escutando na porta 8080.

## 🛣️ Testando a API (Endpoints)
Após subir o ambiente, você pode validar o funcionamento do microsserviço acessando a rota mapeada pelo controller diretamente no seu navegador ou via ferramentas como Postman/Insomnia.

Listar Produtos Cadastrados
URL: http://localhost:8080/products

Método: GET

Resposta esperada (200 OK — JSON):

[
  {
    "id": "1",
    "name": "Bolas de Malabarismo Zeekio",
    "type": "Premium Beanbag"
  },
  {
    "id": "2",
    "name": "Clavas K8",
    "type": "Circus Arts Equipment"
  }
]