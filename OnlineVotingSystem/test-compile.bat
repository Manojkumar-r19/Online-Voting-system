@echo off
echo ========================================
echo   TESTING ONLINE VOTING SYSTEM
echo ========================================
echo.

cd src

echo [Step 1/3] Cleaning previous compilation...
del /s /q *.class >nul 2>&1

echo [Step 2/3] Compiling Java files...
javac com/voting/model/*.java com/voting/service/*.java com/voting/Main.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation FAILED!
    echo Please check for syntax errors.
    pause
    exit /b 1
)

echo [Step 3/3] Compilation SUCCESSFUL!
echo.
echo ========================================
echo   PROJECT STATUS: READY TO RUN
echo ========================================
echo.
echo All Java files compiled successfully!
echo No errors found.
echo.
echo To run the project:
echo   1. Double-click 'run.bat' in the main folder
echo   2. Or use command: java com.voting.Main
echo.
echo Default Admin Credentials:
echo   Username: admin
echo   Password: admin123
echo.
echo ========================================
pause
