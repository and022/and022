import sqlite3

# Create database and at the same time we'll be connecting our database
def create_table():
    conection = sqlite3.connect('table_user.db')
    curse = conection.cursor()
    curse.execute('''
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name TEXT NOT NULL,
        age INTEGER
    )
''')
    conection.commit()
    conection.close()

# Create functions and informations for our database such as name, age and the most important the id
# In this case we are using The Crud = create, read , update and delete , at the moment we are using C - Create
def add_users(name, age):
    conecton = sqlite3.connect('table_user.db')
    curse = conecton.cursor()
    curse.execute('''Insert into users(name, age) Values(?, ?)''',(name, age))
    conecton.commit()
    conecton.close()

# I'm gonna create R = Read so that we can read all the informations into of database 
def show_users():
    conection = sqlite3.connect('table_user.db')
    curse = conection.cursor()
    curse.execute('''Select * from users''')
    users = curse.fetchall()
    for user in users:
        print("all the users now",user)
    conection.close()

# I'm gonna update our table U = update the informations in our table
def update_users(id, name, age):
    conection = sqlite3.connect('table_user.db')
    curse = conection.cursor()
    curse.execute('''Updadte users SET name = ? , age, Where id = ''',(name, age, id))
    conection.commit()
    conection.close()

# I'm gonna create D = Delete some users in our table 
def delete_users(id):
    conection = sqlite3.connect('table_user.db')
    curse = conection.cursor()
    curse.execute('''Delete from users where id = ? ''',(id,))
    conection.commit()
    conection.close()

# We are going to develop a simple menu in order to have an interation with other users
def menu():
    print("1. Add Users:")
    print("2. Show all the Users:")
    print("3. Update Users:")
    print("4. Delete Users:")
    print("5. Exit:")

# i'm gonna user while (loop) calling a function "create_table" togheter with  if elif and else
create_table()
while True:
    menu()
    # Create User = C
    choose = input("Choose an option:")
    if choose == '1':
        name = input("Type the name of user:")
        age = input("Type the age of user:")
        add_users(name, age)
        print(" User added with Success ! ")

    # R = Read all the Users   
    elif choose == '2':
        print("All the users added until now!")
        show_users()

    # U = Update Users (but before you need to delete user that exist so that you can add a new user)   
    elif choose == '3':
        id = int(input("Type the ID to be deletd:"))
        name = input("Type a new name to be added:")
        age = int(input("Type a new age to be added:"))
        update_users(id, name, age)
        print("Users updated with Sucess!")

    # D = Delete Users
    elif choose == '4':
        id = int(input("Delete Id of the user to be deleted: "))
        delete_users(id)
        print("User deleted with Success!")
    
    # Exit the Program
    elif choose == '5':
        print(" Exit the program!")
        break
    else:
        print("We can't found the option, please type the option correct:")

