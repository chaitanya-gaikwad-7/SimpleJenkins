pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo "Hello"
                echo $installation_server
                echo $oracle_server
                echo $port
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