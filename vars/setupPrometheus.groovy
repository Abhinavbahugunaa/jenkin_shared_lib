def call() {
    stage('Setup Prometheus') {
        // Perform steps to set up Prometheus in your Kubernetes cluster
        sh 'kubectl apply -f path/to/prometheus/config.yaml'
    }
}
