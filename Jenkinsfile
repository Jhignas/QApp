pipeline{
	agent any

	stages{

		// stage('check'){
		// 	steps{
		// 		sh "pwd"
		// 		sh "whoami"
		// 		sh "gradle"
		// 	}
		// }

		stage('Build JAR'){
			steps{
				sh "gradle bootJar"
			}
		}

		stage('Build and Push Docker Image'){
			steps{
				script{
					def img = docker.build("jhignas/qapp_spring:toDocker","-f /Docker/Dockerfile_SpringApplication")
					docker.withRegistry('https://hub.docker.com/r/jhignas/qapp_spring/','Docker-Hub-Credentials'){
						img.push("toDocker")
					}
				}				
			}
		}

	}
}