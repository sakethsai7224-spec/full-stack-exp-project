import React, { useEffect, useState } from "react";
import axios from "axios";

function FakePostList() {

  const [posts, setPosts] = useState([]);
  const [filteredPosts, setFilteredPosts] = useState([]);

  const fetchPosts = () => {
    axios.get("https://dummyjson.com/posts")
      .then(response => {
        setPosts(response.data.posts);
        setFilteredPosts(response.data.posts);
      });
  };

  useEffect(() => {
    fetchPosts();
  }, []);

  return (
    <div>
      <h2>Fake API Posts</h2>
      <button onClick={fetchPosts}>Refresh</button>

      {filteredPosts.map(post => (
        <div key={post.id}>
          <h4>{post.title}</h4>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
}

export default FakePostList;
