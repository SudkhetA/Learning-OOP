# System Requirement

## Linux

OS: Ubuntu/Debian

Package:
  - wget

## Windows

OS: Windows 10 or later

# Install JDK

## Linux

### Install Amazon Corretto 26 on Debian-Based Linux
```bash
wget -O - https://apt.corretto.aws/corretto.key | sudo gpg --dearmor -o /usr/share/keyrings/corretto-keyring.gpg && \
echo "deb [signed-by=/usr/share/keyrings/corretto-keyring.gpg] https://apt.corretto.aws stable main" | sudo tee /etc/apt/sources.list.d/corretto.list

sudo apt-get update; 
sudo apt-get install -y java-26-amazon-corretto-jdk
```

### Verify Your Installation
```bash
java -version
```
Expected out for 26.0.2
```text
openjdk version "26.0.2" 2026-08-18 
OpenJDK Runtime Environment Corretto-26.0.2.11.1 (build 26.0.2+11-FR)
OpenJDK 64-Bit Server VM Corretto-26.0.2.11.1 (build 26.0.2+11-FR, mixed mode)
```
## Windows

### Install Amazon Corretto 26

1. Download a Windows [.msi](https://corretto.aws/downloads/latest/amazon-corretto-26-x64-windows-jdk.msi) file
2. Double-click the .msi file to start the installation wizard.
3. Follow the steps in the wizard. <br />You have the option of setting a custom installation path. By default, Amazon Corretto 26 is installed at `C:\Program Files\Amazon Corretto\.` If you set a custom path, make a note of it for the next step.
4. Once the install wizard is finished, set the `JAVA_HOME` and PATH environment variables. <br />
   Set JAVA_HOME to the installation location, noting that the directory contains the currently-installed version. For example, if the default directory is used for 26.0.2, then set `JAVA_HOME` as `C:\Program Files\Amazon Corretto\jdk26.0.2_11.` <br />
   Add `%JAVA_HOME%\bin` to the current PATH variable.
5. Verify the installation by running __java -version__ in a command prompt. You should see the following output.
   ```text
   openjdk version "26.0.2" 2026-08-18 
   OpenJDK Runtime Environment Corretto-26.0.2.11.1 (build 26.0.2+11-FR)
   OpenJDK 64-Bit Server VM Corretto-26.0.2.11.1 (build 26.0.2+11-FR, mixed mode)
   ```

# Editor

- VSCode
- IntelliJ IDE
- Eclipse