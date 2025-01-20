@echo off
setlocal

:: Function to display messages
:echo_message
echo %~1
goto :eof

:: Check if Java is installed
:echo_message "Checking for Java installation..."
java -version >nul 2>&1
if %errorlevel% neq 0 (
    :echo_message "Java is not installed. Downloading and installing OpenJDK..."
    set "JAVA_INSTALLER_URL=https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.2_windows-x64_bin.zip"
    set "JAVA_ZIP=openjdk.zip"
    set "JAVA_DIR=C:\OpenJDK"

    :: Download OpenJDK
    powershell -Command "Invoke-WebRequest -Uri %JAVA_INSTALLER_URL% -OutFile %JAVA_ZIP%"

    :: Extract OpenJDK
    powershell -Command "Expand-Archive -Path %JAVA_ZIP% -DestinationPath %JAVA_DIR%"

    :: Set JAVA_HOME and update PATH
    setx JAVA_HOME "%JAVA_DIR%\jdk-11.0.2"
    setx PATH "%PATH%;%JAVA_HOME%\bin"

    :: Refresh environment variables
    set "PATH=%PATH%;%JAVA_HOME%\bin"
) else (
    :echo_message "Java is already installed."
)

:: Set variables
set "REPO_OWNER=ib729"
set "REPO_NAME=Prp"
set "JAR_NAME=Prp.jar"
set "DOWNLOAD_URL=https://github.com/%REPO_OWNER%/%REPO_NAME%/releases/latest/download/%JAR_NAME%"

:: Download the latest release JAR file
:echo_message "Downloading the latest release JAR file..."
powershell -Command "Invoke-WebRequest -Uri %DOWNLOAD_URL% -OutFile %JAR_NAME%"

:: Run the program
:echo_message "Running the program..."
java -jar %JAR_NAME%
