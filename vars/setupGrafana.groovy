def call() {
    stage('Setup Grafana') {
        // Perform steps to set up Grafana in your Kubernetes cluster
        sh 'kubectl apply -f path/to/grafana/config.yaml'
    }
}
