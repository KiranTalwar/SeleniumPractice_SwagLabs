pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Make sure the branch name matches your GitHub repository
                git branch: 'main', url: 'https://github.com/KiranTalwar/SeleniumPractice_SwagLabs'
            }
        }
        stage('Install Dependencies') {
            steps {
                // Running Maven to install dependencies
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                // Running tests with Maven
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            // Make sure the path to your JUnit report is correct
            junit '**/target/surefire-reports/*.xml'
            // Archive JAR files if they are generated in the target directory
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
