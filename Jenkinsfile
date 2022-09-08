pipeline {
    agent any

    stages {
        stage('Compile') {
        	steps {
	        	withMaven(maven: 'maven-3-8-6') {
	        		echo 'compile stage started'
	        		sh 'mvn clean compile'
	        		echo 'compile stage completed'
	        	}
            }
        }
        stage('Test') {
            steps {
                withMaven(maven: 'maven-3-8-6') {
        			echo 'test stage started'
        			sh 'mvn test'
        			echo 'test stage completed'
        		}
            }
        }
        stage('Deploy') {
            steps {
                withMaven(maven: 'maven-3-8-6') {
        			echo 'deploy stage started'
        			sh 'mvn deploy'
        			echo 'deploy stage completed'
        		}
            }
        }
    }
}
