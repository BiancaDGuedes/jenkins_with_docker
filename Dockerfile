# Etapa 1: Build e testes com Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Define a pasta de trabalho
WORKDIR /app

# Copia os arquivos do projeto para o container
COPY . .

# Executa o build e os testes
RUN mvn clean test
