pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
    echo 'Compile project'
    sh "chmod +x gradlew"
    sh "./gradlew bootRun"
}
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
