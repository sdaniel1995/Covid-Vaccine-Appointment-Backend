pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
                 echo 'Compile project'
                 sh "pwd"
                 sh "ls"
                 sh "cd covid_vaccine"
                 sh "ls"
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
