pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
                 sh "cd .."
    echo 'Compile project'
    sh "chmod +x gradlew"
    sh "./gradlew build"
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
