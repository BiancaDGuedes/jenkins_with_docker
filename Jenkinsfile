pipeline {
    agent any

    stages {
        stage('Build Image de Build') {
            steps {
                echo 'Construindo a imagem para build...'
                sh 'docker build --target build -t minha-imagem-build .'
            }
        }

        stage('Testes') {
            steps {
                echo 'Executando testes no container de build...'
                sh 'docker run --rm minha-imagem-build mvn test'
            }
        }

        stage('Build Imagem Final') {
            steps {
                echo 'Construindo a imagem final com jar pronto...'
                sh 'docker build -t minha-imagem-final .'
            }
        }

        stage('Executar Jar') {
            steps {
                echo 'Executando o jar da aplicação...'
                sh 'docker run --rm minha-imagem-final java -jar app.jar'
            }
        }
    }
}
