#!/bin/bash

# Exit script on any error
set -e

# Function to display messages
echo_message() {
  echo -e "\033[1;32m$1\033[0m"
}

# Detect operating system
OS="$(uname -s)"

# Function to install Homebrew on macOS
install_homebrew() {
  echo_message "Installing Homebrew..."
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
}

# Function to install Java on macOS using Homebrew
install_java_macos() {
  echo_message "Installing OpenJDK..."
  brew install openjdk
  sudo ln -sfn "$(brew --prefix openjdk)/libexec/openjdk.jdk" /Library/Java/JavaVirtualMachines/openjdk.jdk
}

# Function to install Java on Linux
install_java_linux() {
  echo_message "Installing OpenJDK..."
  if command -v apt-get &> /dev/null; then
    sudo apt-get update
    sudo apt-get install -y openjdk-11-jdk
  elif command -v yum &> /dev/null; then
    sudo yum install -y java-11-openjdk
  elif command -v dnf &> /dev/null; then
    sudo dnf install -y java-11-openjdk
  else
    echo "Unsupported package manager. Please install Java manually."
    exit 1
  fi
}

# Check if Java is installed
if ! command -v java &> /dev/null; then
  echo_message "Java is not installed."

  case "$OS" in
    Darwin)
      # Check if Homebrew is installed
      if ! command -v brew &> /dev/null; then
        install_homebrew
      else
        echo_message "Homebrew is already installed."
      fi
      install_java_macos
      ;;
    Linux)
      install_java_linux
      ;;
    *)
      echo "Unsupported operating system: $OS"
      exit 1
      ;;
  esac
else
  echo_message "Java is already installed."
fi

# Set variables
REPO_OWNER="ib729"
REPO_NAME="Prp"
JAR_NAME="Prp.jar"
DOWNLOAD_URL="https://github.com/$REPO_OWNER/$REPO_NAME/releases/latest/download/$JAR_NAME"

# Download the latest release JAR file
echo_message "Downloading the latest release JAR file..."
curl -L -o $JAR_NAME $DOWNLOAD_URL

# Make the JAR executable
echo_message "Making the JAR executable..."
chmod +x $JAR_NAME

# Run the program
echo_message "Running the program..."
java -jar $JAR_NAME