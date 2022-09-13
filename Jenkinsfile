node {
	stage('SCM Checkout') {		
		echo 'checkout stage started'
		git 'https://github.com/RajenderSingh/DemoJenkinsfile'
		echo 'checkout stage completed'			
	}
	stage('Compile Stage') {		
		echo 'compile stage started'
		def mvnHome = tool name: 'maven-3-8-6', type: 'maven'
		echo "${mvnHome}\bin\mvn --version"
		echo 'compile stage completed'			
	}
}
