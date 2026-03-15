import React, { useEffect, useState } from 'react'
import axios from 'axios'

function App() {
  const [backendStatus, setBackendStatus] = useState('Checking...')

  useEffect(() => {
    axios.get('/api/test')
      .then(res => setBackendStatus(res.data))
      .catch(() => setBackendStatus('Backend not reachable'))
  }, [])

  return (
    <div className="container">
      <h1>Skill 13 – Full-Stack Deployment</h1>
      <p>Spring Boot + React deployed as a single application.</p>

      <div className="status-box">
        <h2>Backend Status</h2>
        <p className="status">{backendStatus}</p>
      </div>

      <div className="info-box">
        <h2>Deployment Steps</h2>
        <ol>
          <li>Generate React production build: <code>npm run build</code></li>
          <li>Copy <code>dist/</code> contents to <code>backend/src/main/resources/static/</code></li>
          <li>Package backend: <code>mvn clean package</code></li>
          <li>Run JAR: <code>java -jar target/demo-0.0.1-SNAPSHOT.jar</code></li>
          <li>Open <a href="http://localhost:8080">http://localhost:8080</a></li>
        </ol>
      </div>
    </div>
  )
}

export default App
