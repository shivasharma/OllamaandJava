Ollama and Java: AI Chat Console
This project is a simple Java console application that demonstrates how to integrate with Ollama using the Ollama API. It features real-time streaming, allowing the AI to respond token-by-token just like ChatGPT.
📋 Prerequisites
Before you begin, ensure you have the following installed:
Java JDK 21 or higher.
Apache Maven (for dependency management).
Ollama: Download and install from Ollama.com.
🚀 Getting Started
1. Set up Ollama
First, you need to have the Ollama server running and the specific model downloaded.
Open your terminal or command prompt.
Pull the model used in this project:
bash
ollama pull qwen2.5-coder:1.5b-base
Use code with caution.

Keep the Ollama application running in the background.
2. Clone the Repository
Clone this project to your local machine:
bash
git clone https://github.com
cd OllamaandJava
Use code with caution.

3. Build the Project
Use Maven to download the necessary JSON libraries and compile the code:
bash
mvn clean install
Use code with caution.

🛠 How to Run
Option A: Using the Command Line
Run the application directly using the Maven Exec plugin:
bash
mvn exec:java -Dexec.mainClass="org.ollamajava.OllamaStreamingChat"
Use code with caution.

Option B: Using an IDE (IntelliJ / Eclipse / VS Code)
Open the project folder in your IDE.
Right-click on pom.xml and select "Reload/Import Maven Project".
Navigate to src/main/java/org/ollamajava/OllamaStreamingChat.java.
Right-click the file and select Run.
🕹 How to Use
Once the program starts, you will see a prompt: You: .
Type your question (e.g., "Write a Java function to sort an array") and press Enter.
The AI will stream the response back to you.
Type exit or quit to close the application.
🧠 Key Learning Points for Students
HTTP POST Requests: Learn how to send data to a local server using HttpURLConnection.
JSON Processing: See how the org.json library is used to create request bodies and parse incoming streams.
Streaming Data: Understand how BufferedReader.readLine() captures data chunks in real-time before the full response is finished.
Happy Coding! 🚀
