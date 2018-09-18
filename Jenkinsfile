pipeline{
	agent any

	def img

	triggers{
		pollSCM '* * * * *'
	}

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

		stage('Build Docker Image'){
			steps{
				img = docker.build("jhignas/qapp_spring:toDocker","-f Dockerfile_SpringApplication ./Docker")
			}
		}

		stage('Push Docker Image'){
			steps{
				docker.withRegistry('https://hub.docker.com/r/jhignas/qapp_spring/','Docker-Hub-Credentials'){
					img.push("toDocker")
				}
			}
		}

	}
}