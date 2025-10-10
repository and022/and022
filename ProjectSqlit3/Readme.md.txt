User Management System with SQLite3
A simple Python application that demonstrates CRUD (Create, Read, Update, Delete) operations using SQLite3 database.

📋 Table of Contents
Overview

Features

Installation

Usage

Database Structure

Functions

Menu Options

Example Usage

File Structure

Dependencies

Troubleshooting

🔍 Overview
This project is a command-line interface application that manages user records in an SQLite database. It provides a complete CRUD implementation with a user-friendly menu system.

✨ Features
✅ Create: Add new users to the database

👁️ Read: View all existing users

✏️ Update: Modify existing user information

🗑️ Delete: Remove users from the database

💾 Persistent Storage: Data is saved in an SQLite database file

🖥️ Interactive Menu: Easy-to-use text-based interface

🚀 Installation
Ensure you have Python 3.x installed on your system

Clone or download the project files

No additional dependencies required - uses built-in SQLite3 library

💻 Usage
Run the application using:

bash
python projectsqlite3.py
The main menu will appear with the following options:

📊 Database Structure
The application creates a SQLite database file table_user.db with the following table:

Table: users
Column	Type	Constraints	Description
id	INTEGER	PRIMARY KEY AUTOINCREMENT	Unique identifier (auto-generated)
name	TEXT	NOT NULL	User's name
age	INTEGER	-	User's age
🔧 Functions
Database Operations
create_table(): Creates the users table if it doesn't exist

add_users(name, age): Inserts a new user record

show_users(): Retrieves and displays all users

update_users(id, name, age): Modifies an existing user's information

delete_users(id): Removes a user by ID

User Interface
menu(): Displays the main menu options

📝 Menu Options
1. Add Users
Prompts for name and age

Adds new user to the database

Confirms successful addition

2. Show all the Users
Displays all users in the database

Shows ID, name, and age for each user

3. Update Users
Requires existing user ID

Prompts for new name and age

Updates the specified user record

4. Delete Users
Requires user ID to delete

Removes the specified user from database

Confirms successful deletion

5. Exit
Closes the application gracefully

🎯 Example Usage
text
1. Add Users:
2. Show all the Users:
3. Update Users:
4. Delete Users:
5. Exit:
Choose an option: 1
Type the name of user: Alice
Type the age of user: 30
User added with Success!

Choose an option: 2
All the users added until now!
all the users now (1, 'Alice', 30)

Choose an option: 3
Type the ID to be updated: 1
Type a new name to be added: Alice Smith
Type a new age to be added: 31
Users updated with Success!

Choose an option: 5
Exit the program!
📁 File Structure
text
project-directory/
├── projectsqlite3.py    # Main application file
└── table_user.db        # Database file (created automatically)
📦 Dependencies
Python 3.x

SQLite3 (included in Python standard library)

🔍 Troubleshooting
Common Issues
Database file not created: Check write permissions in the current directory

Table creation errors: Ensure SQLite3 is available in your Python installation

Update/Delete not working: Verify the user ID exists before attempting operations

Error Handling
The program includes basic error handling for database operations

Invalid menu options prompt the user to try again

Database connections are properly closed after each operation

🛠️ Development
This project serves as an excellent learning tool for:

SQLite database operations in Python

CRUD application development

Basic CLI interface design

Database management concepts

📄 License
This is an educational project. Feel free to modify and distribute for learning purposes.