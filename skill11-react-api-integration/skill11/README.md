# Skill 11 – React API Integration

React application demonstrating API integration using Fetch API, Axios, and Local JSON.

## Features
- **Part A**: Fetch data from local JSON file (`public/users.json`)
- **Part B**: Fetch data from JSONPlaceholder API using Fetch API
- **Part C**: Fetch data from DummyJSON API using Axios (with refresh & filter)
- **Part D**: Dashboard with navigation between all three components

## Getting Started

```bash
npm install
npm run dev
```

Open [http://localhost:5173](http://localhost:5173)

## Project Structure

```
skill11/
├── public/
│   └── users.json
├── src/
│   ├── components/
│   │   ├── Dashboard.jsx
│   │   ├── LocalUserList.jsx
│   │   ├── UserList.jsx
│   │   └── FakePostList.jsx
│   ├── App.jsx
│   ├── main.jsx
│   └── index.css
├── index.html
├── package.json
└── vite.config.js
```

## APIs Used
- Local: `public/users.json`
- JSONPlaceholder: `https://jsonplaceholder.typicode.com/users`
- DummyJSON: `https://dummyjson.com/posts`

## GitHub
https://github.com/Durgabhavani0707/skill10-react
