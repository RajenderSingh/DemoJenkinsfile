node {
    stages {
	stage('SCM Checkout') {
		steps {
			echo 'checkout stage started'
			git 'https://github.com/RajenderSingh/DemoJenkinsfile'
			echo 'checkout stage completed'

			}
        }
        stage('Compile') {
		steps {
			def mvnHome = tool name: 'maven-3-8-6', type: 'maven' 
			echo 'compile stage started'
			sh "${mvnHome}/bin/mvn clean compile"
			echo 'compile stage completed'

			}
        }
        stage('Test') {
		steps {
			def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
			echo 'test stage started'
			sh "${mvnHome}/bin/mvn test"
			echo 'test stage completed'
			}
        }
        stage('Deploy') {
		steps {
			def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
			echo 'deploy stage started'
			sh "${mvnHome}/bin/mvn deploy"
			echo 'deploy stage completed'
			}
        }
    }
}
