pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/BiancaDGuedes/jenkins_with_docker.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Construindo a imagem de build...'
                // Build só o stage build, imagem que tem Maven e faz o package
                sh 'docker build --target build -t minha-imagem-build .'
            }
        }

        stage('Test') {
            steps {
                echo 'Executando os testes dentro do container build...'
                // Roda o mvn test dentro do container build
                sh 'docker run --rm minha-imagem-build mvn test'
            }
        }

        stage('Run Jar') {
            steps {
                echo 'Construindo imagem final e rodando o jar...'
                // Build a imagem final com o jar pronto
                sh 'docker build -t minha-imagem-final .'

                // Rodar o jar para garantir que a aplicação inicia (opcional)
                sh 'docker run --rm minha-imagem-final java -jar app.jar'
            }
        }
    }
}
