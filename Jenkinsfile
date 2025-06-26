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

        stage('Build and Test') {
            steps {
                echo 'Construindo a imagem e executando os testes...'
                sh 'docker build -t minha-imagem:latest .'
            }
        }
    }
}