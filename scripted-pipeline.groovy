node { 
    stage('Pull') { 
        echo 'Pull Success'
    } 
    stage('Build') { 
        echo 'Build Success'
    }
    stage('Test') { 
        echo 'Test Success'
    }
    stage('Deploy') { 
        echo 'Deploy Success'
    }
}