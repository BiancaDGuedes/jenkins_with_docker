pipeline {
    tools {
        docker 'docker-latest'
    }

    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

    stages {
        stage('1. Build') {
            steps {
                echo 'Buildando com JDK 17...'
                sh 'mvn -B clean compile'
            }
        }
        stage('2. Test') {
            steps {
                echo 'Testando com JDK 17...'
                sh 'mvn -B test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}