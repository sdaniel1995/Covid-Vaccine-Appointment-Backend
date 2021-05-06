pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
    echo 'Compile project'
    sh "gradle bootRun"
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
