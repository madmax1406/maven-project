pipeline {

    agent {
  label 'devserver'
    }

    tools {
  maven 'mymaven'
    }

    stages {

    stage('Build') {
          steps {
            sh "mvn clean package"
        }

        post {
                success {
                    archiveArtifacts artifacts: '/target/*.jar'
            }
        }
    }
}
}
