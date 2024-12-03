pipeline {
    agent any
    tools {
        maven 'Maven'  // This should match the name configured in Global Tool Configuration
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/KiranTalwar/SeleniumPractice_SwagLabs'
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
