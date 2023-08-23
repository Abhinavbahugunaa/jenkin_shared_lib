def call(credentialsId){

    withSonarQubeEnv('sonar-api') {
         sh 'mvn clean package sonar:sonar'
    }
}
