pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Construindo a imagem de build...'
                sh 'docker build --target build -t minha-imagem-build .'
            }
        }

        stage('Test') {
            steps {
                echo 'Executando os testes dentro do container build...'
                sh 'docker run --rm minha-imagem-build mvn test'
            }
        }

        stage('Run Jar') {
            steps {
                echo 'Construindo imagem final e rodando o jar...'
                sh 'docker build -t minha-imagem-final .'
                sh 'docker run --rm minha-imagem-final java -jar app.jar'
            }
        }
    }
}
