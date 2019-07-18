pipeline {
  agent any
  stages {
    stage('Build Server') {
      parallel {
        stage('Build Server') {
          steps {
            sleep 10
          }
        }
        stage('Build Mobile App') {
          steps {
            sleep 10
          }
        }
      }
    }
    stage('Deploy to QA') {
      parallel {
        stage('Deploy Server (QA)') {
          steps {
            sleep 10
          }
        }
        stage('Upload App the Cloud') {
          steps {
            sleep 5
          }
        }
      }
    }
    stage('Run Tests') {
      parallel {
        stage('Run Postman Tests') {
          steps {
            sleep 10
          }
        }
        stage('Run Selenium Test') {
          steps {
            sleep 10
          }
        }
        stage('Run Appium Tests') {
          steps {
            sleep 10
          }
        }
        stage('Run Performance Tests') {
          steps {
            sleep 10
          }
        }
      }
    }
    stage('Deploy Server QA') {
      steps {
        sleep 10
      }
    }
  }
}