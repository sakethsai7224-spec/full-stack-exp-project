import React, { useState } from 'react'
import StudentList from './components/StudentList'
import AddStudent from './components/AddStudent'

function App() {
  const [refresh, setRefresh] = useState(false)

  const triggerRefresh = () => setRefresh(prev => !prev)

  return (
    <div>
      <h1>Skill 12 – Student Management (Full-Stack CRUD)</h1>
      <AddStudent onStudentAdded={triggerRefresh} />
      <StudentList key={refresh} />
    </div>
  )
}

export default App
