pipeline{
	agent any

	triggers{
		pollSCM '* * * * *'
	}

	stages{

		stage('check'){
			steps{
				sh "pwd"
				sh "whoami"
				sh "gradle"
			}
		}

		stage('Build JAR'){
			steps{
				sh "./gradlew bootJar"
			}
		}

	/*	stage('Build and Push Docker Image'){
			steps{
				def img = docker.build("jhignas/qapp_spring:toDocker","-f Dockerfile_SpringApplication ./Docker")
				img.push("toDocker")
			}
		}
	*/

	}
}