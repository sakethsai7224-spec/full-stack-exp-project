import React, { useEffect, useState } from "react";

function UserList() {

  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/users")
      .then(response => response.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <div>
      <h2>API Users</h2>
      {users.map(user => (
        <div key={user.id}>
          <p>{user.name} - {user.email} - {user.phone}</p>
        </div>
      ))}
    </div>
  );
}

export default UserList;
