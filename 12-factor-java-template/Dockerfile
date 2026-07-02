# Estágio 1: Build (Fator V - Construção)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia apenas o arquivo de configuração para cachear dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia toda a árvore de diretórios correta de forma explícita
COPY src ./src

# Executa o empacotamento limpando artefatos anteriores
RUN mvn clean package -DskipTests

# Estágio 2: Run (Fator V e IX - Execução e Descartabilidade)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia o jar gerado no estágio anterior
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]