pipeline {
  agent any
  tools { 
    maven 'MavenAlen'
  }

  environment {
    SONAR_ORG = 'alenvaldes-94'                       
    SONAR_PROJECT_KEY = 'alenvaldes-94_usach_tarea4'  
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Test') {
      steps {
        bat 'mvn -B -e -DskipTests=false clean verify'
      }
    }

    stage('SonarCloud Analysis') {
      steps {
        withSonarQubeEnv('SonarCloud') {
          bat """
            mvn -B sonar:sonar ^
              -Dsonar.organization=%SONAR_ORG% ^
              -Dsonar.projectKey=%SONAR_PROJECT_KEY%
          """
        }
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'target/surefire-reports/*.xml', fingerprint: true
    }
  }
}