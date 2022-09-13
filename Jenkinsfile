node {
	stage('SCM Checkout') {		
		echo 'checkout stage started'
		git 'https://github.com/RajenderSingh/DemoJenkinsfile'
		echo 'checkout stage completed'			
	}
	stage('Compile Stage') {		
		echo 'compile stage started'
		sh "C:\apache-maven-3.8.6-bin\apache-maven-3.8.6\bin\mvn clean compile"
		echo 'compile stage completed'			
	}
}
