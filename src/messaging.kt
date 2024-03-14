import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket

// Server class to handle incoming messages from clients
class Server(private val port: Int) {
    private val clients = mutableListOf<PrintWriter>()

    fun start() {
        val serverSocket = ServerSocket(port)
        println("Server started on port $port")
        while (true) {
            val clientSocket = serverSocket.accept()
            println("New client connected: ${clientSocket.inetAddress.hostAddress}")
            val clientWriter = PrintWriter(clientSocket.getOutputStream(), true)
            clients.add(clientWriter)
            ClientHandler(clientSocket).start()
        }
    }

    fun broadcast(message: String) {
        for (client in clients) {
            client.println(message)
        }
    }

    inner class ClientHandler(private val clientSocket: Socket) : Thread() {
        override fun run() {
            val reader = BufferedReader(InputStreamReader(clientSocket.getInputStream()))
            while (true) {
                val message = reader.readLine() ?: break
                broadcast(message)
            }
        }
    }
}

// Client class to send messages to the server
class Client(private val serverAddress: String, private val port: Int) {
    fun start() {
        val socket = Socket(serverAddress, port)
        val reader = BufferedReader(InputStreamReader(socket.getInputStream()))
        val writer = PrintWriter(socket.getOutputStream(), true)
        println("Connected to server at $serverAddress:$port")
        while (true) {
            print("Enter your message: ")
            val message = readLine() ?: break
            writer.println(message)
            println("Message sent.")
            val response = reader.readLine()
            println("Server response: $response")
        }
    }
}

fun main() {
    // Start server in a separate thread
    val server = Server(12345)
    Thread { server.start() }.start()

    // Allow some time for the server to start before the client connects
    Thread.sleep(1000)

    // Start client
    val client = Client("localhost", 12345)
    client.start()
}
