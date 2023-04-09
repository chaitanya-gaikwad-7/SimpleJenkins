pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo "Hello"
            }
        }
    }
    post{
        always{
            echo "Always ececute"
        }
        success{
            echo "After success"
        }
        failure{
            echo "After Failure"
        }
        unstable{
            echo "After unstable"
        }
    }
}