# Bank Management System

A Java-based desktop application for managing banking operations. This project uses Java Swing for the graphical user interface and is designed to integrate with a MySQL database for data persistence.

## Current Scope
- **Login Screen**: Swing-based ATM style login window.
- **Signup Screen**: Account application form (Step 1) with data persistence.
- **Signup Step 2**: Skeleton for additional user details.
- **Database Integration**: Secure MySQL connection using environment variables.
- **Static Assets**: Project images are bundled under `src/icon/`.

## Project Structure
- `src/bank/management/system/`: Source code directory.
  - `Login.java`: Entry point for the application.
  - `Signup.java`: Primary signup form with database submission.
  - `Signup2.java`: Second phase of the signup process.
  - `conn.java`: Database connection handler.
- `src/icon/`: Assets directory containing images for the UI.
- `lib/`: Third-party jar dependencies committed with the project.

## Database Configuration
To keep the database credentials secure, the application uses an environment variable for the MySQL password.

### Setting the Environment Variable
#### Windows (PowerShell)
```powershell
[System.Environment]::SetEnvironmentVariable("DB_PASSWORD", "your_password_here", "User")
```
*Note: You may need to restart your IDE or terminal for the change to take effect.*

#### Linux / macOS
```bash
export DB_PASSWORD='your_password_here'
```

### Loading the Environment Variable in Java
The variable is loaded in `conn.java` using:
```java
String db_pass = System.getenv("DB_PASSWORD");
```

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- MySQL Server.
- MySQL Connector/J (JDBC Driver).
- `jcalendar-tz-1.3.3-4.jar` for the `JDateChooser` calendar widget.

### Installation
1. Clone the repository to your local machine.
2. Open the folder in your preferred IDE.
3. Make sure `lib/jcalendar-tz-1.3.3-4.jar` is attached to the project classpath.
4. Add the MySQL JDBC driver to your project's build path if you continue the database integration work.

### IDE Notes
- **VS Code**: The repository includes `.vscode/settings.json`, so the Java extension should automatically load `lib/**/*.jar` under `Java Projects > Referenced Libraries`.
- **Eclipse**: Right click project -> `Build Path` -> `Configure Build Path` -> `Libraries` -> `Add JARs...` -> select `lib/jcalendar-tz-1.3.3-4.jar`.
- **IntelliJ IDEA**: `File` -> `Project Structure` -> `Modules` -> `Dependencies` -> `+` -> `JARs or directories` -> select `lib/jcalendar-tz-1.3.3-4.jar`.

### Compile Manually
```powershell
javac -cp "lib/jcalendar-tz-1.3.3-4.jar" -d out src\bank\management\system\Login.java src\bank\management\system\Signup.java
java -cp "out;lib/jcalendar-tz-1.3.3-4.jar;src" bank.management.system.Login
```

## Notes
- Committing the calendar jar is fine for a small educational project as long as you intend to redistribute that dependency with the repository.
- The MySQL JDBC driver is not bundled in this repository.
