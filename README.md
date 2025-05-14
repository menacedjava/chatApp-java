1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a3462456aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<h1>ChatApp Java</h1>
<p>Chat App Java is a simple console-based client-server chat application built in Java using sockets. It demonstrates the fundamentals of real-time communication, threading, and network programming in Java. 
This project is ideal for beginners lookin' to understand how TCP/IP-based messaging systems work behind the scenes.</p> 
<h1>🧠Features </h1>
<p> ✅ Real-time messaging between multiple clients <br> ✅ Multithreaded server capable of handling multiple connections <br> ✅ Simple text-based interface <br> ✅ Lightweight and minimal dependencies (pure Java) <br> 
✅ Clean separation between server and client code </p>
<h1> 🏗️Project Structure </h1>
<p> ↕ Server.java - Listens for incoming client connections and relays messages to all connected clients. <br> • Client.java - Connects to the server, sends messages, and listens for incoming messages from the server. </p>
<h1>🚀 How it works </h1>
<p> 1. Server starts and listens on a defined port. <br> 2. Clients connect to the server using the same port and IP-address. <br> 3. Each client runs in its own thread to allow for simultaneous message sendin' and receivin'. <br> 4. Messages sent from one client and broadcast to all other clients via the server. </p>
<h1> 🧪How to Run </h1>
<p> 1. Clone the repository </p>
<pre><code>git clone https://github.com/menacedjava/chatApp-java.git
cd chatApp-java </code></pre>
