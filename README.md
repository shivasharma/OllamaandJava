# Ollama and Java: AI Chat Console 🤖☕

This repository contains a Java-based console application that connects to a local **Ollama** instance. It demonstrates how to use the HTTP API to send prompts and handle **streaming responses** in real-time.

## 📋 Prerequisites

Before running this project, ensure you have:
1. **Java JDK 21**: [Download here](https://www.oracle.com)
2. **Apache Maven**: [Download here](https://maven.apache.org)
3. **Ollama**: Download and install from the [Official Ollama Website](https://ollama.com)

---

## 🚀 Setup Instructions

### 1. Prepare the AI Model
Open your terminal and run the following command to download the model used in the code:
```bash
ollama pull qwen2.5-coder:1.5b-base
