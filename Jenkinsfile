pipeline {
    agent any

    tools {
        dockerTool 'docker-latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/BiancaDGuedes/jenkins_with_docker.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Construindo a imagem Docker...'
                sh 'docker build -t minha-imagem:latest .'
            }
        }

        stage('Test') {
            steps {
                echo 'Executando testes no container...'
                sh 'docker run --rm minha-imagem:latest ./run-tests.sh'
            }
        }
    }
}