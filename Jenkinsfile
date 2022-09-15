node {
	stage('SCM Checkout') {		
		echo 'checkout stage started'
		git 'https://github.com/RajenderSingh/DemoJenkinsfile'
		echo 'checkout stage completed'			
	}
	stage('Compile Stage') {		
		echo 'compile stage started'
		def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
		bat "${mvnHome}/bin/mvn clean compile"
		echo 'compile stage completed'			
	}
	stage('Test Stage') {		
		echo 'test stage started'
		def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
		bat "${mvnHome}/bin/mvn test"
		echo 'test stage completed'			
	}
	stage('SonarQube Stage') {		
		echo 'sonarqube stage started'
		def sonarscannerHome = tool name: 'sonarqube-scanner'
		bat "${sonarscannerHome}/bin/sonar-scanner"
		echo 'sonarqube stage completed'			
	}
	stage('Deploy Stage') {		
		echo 'deploy stage started'
		def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
		bat "${mvnHome}/bin/mvn install"
		echo 'deploy stage completed'			
	}
}
