pipeline {

    agent {
  label 'devserver'
    }

    tools {
  maven 'mymaven'
    }

    parameters {
        string defaultValue: 'Pushkar', name: 'NAME'
    }   


    stages {

    stage('Build') {
          steps {
            sh "echo My Name is ${params.NAME}"
            sh "mvn clean package"
        }

        post {
                success {
                    archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
    }
}
}
