pipeline {
    agent any

    stages {
        stage('Compile') {
		steps {
			echo 'compile stage started'
			sh 'mvn clean compile'
			echo 'compile stage completed'

			}
        }
        stage('Test') {
		steps {
			echo 'test stage started'
			sh 'mvn test'
			echo 'test stage completed'
			}
        }
        stage('Deploy') {
		steps {
			echo 'deploy stage started'
			sh 'mvn deploy'
			echo 'deploy stage completed'
			}
        }
    }
}
