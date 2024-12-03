pipeline {
    agent any

    tools {
        maven 'Maven 3'  // Ensure 'Maven 3' is configured in Jenkins Global Tool Configuration
        jdk 'Java 11'    // Ensure Java 11 is installed in Jenkins
    }

    environment {
        JAVA_HOME = '/opt/homebrew/Cellar/openjdk/23.0.1/libexec/openjdk.jdk/Contents/Home'  // Set your JAVA_HOME path here
        PATH = "${JAVA_HOME}/bin:${env.PATH}"  // Ensure the java binary is available in the PATH
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git 'https://github.com/KiranTalwar/SeleniumPractice_SwagLabs'
            }
        }

        stage('Install Dependencies') {
            steps {
                // Install dependencies using Maven (downloads required libraries for Selenium, WebDriverManager, etc.)
                sh 'mvn clean install'
            }
        }

        stage('Run Selenium Script') {
            steps {
                script {
                    // Ensure you're running the script from the correct location (adjust classpath accordingly)
                    // Compiling the Java class (assuming the class is at src/main/java/Practice_Automation/Automation_Form12.java)
                    sh 'javac -cp "path/to/selenium/libs/*" src/main/java/Practice_Automation/Automation_Form12.java'
                    // Running the Selenium script (make sure your compiled class and libraries are in the classpath)
                    sh 'java -cp "path/to/selenium/libs/*:target/classes" Practice_Automation.Automation_Form12'
                }
            }
        }
    }

    post {
        always {
            // Archive any browser logs, screenshots, or other output files for debugging or inspection.
            archiveArtifacts artifacts: '**/*.log', allowEmptyArchive: true
            archiveArtifacts artifacts: '**/*.png', allowEmptyArchive: true  // If you take screenshots during the test
        }

        success {
            echo 'Automation script executed successfully.'
        }

        failure {
            echo 'Automation script execution failed.'
        }
    }
}
