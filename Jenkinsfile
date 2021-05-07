pipeline {
    agent any

    stages {
         stage('Initialize') {
             steps {
                 echo 'init project'
                 sh 'gradle clean'
             
}
        }
        stage('Build') {
             steps {
                 echo 'Compile project'
                  dir('covid_vaccine') {
                  sh'ls -la'
                      sh "chmod +x gradlew"
    sh "./gradlew build"
              }
    
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
