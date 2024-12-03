pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 
'https://github.com/KiranTalwar/SeleniumPractice_SwagLabs'
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
            archiveArtifacts artifacts: '**/target/*.jar', 
allowEmptyArchive: true
        }
    }
}

