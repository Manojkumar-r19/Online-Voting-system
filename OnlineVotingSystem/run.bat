@echo off
echo ========================================
echo   Online Voting System - Compiler
echo ========================================
echo.

cd src

echo [1/3] Compiling Java files...
javac com/voting/*.java com/voting/model/*.java com/voting/service/*.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation failed!
    echo Please check for syntax errors.
    pause
    exit /b 1
)

echo [2/3] Compilation successful!
echo.
echo [3/3] Running Online Voting System...
echo ========================================
echo.

java com.voting.Main

echo.
echo ========================================
echo   Program Terminated
echo ========================================
pause
