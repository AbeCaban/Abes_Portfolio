# Abraham Caban Rios 9/24/2022 
# Creating a path to a file and returning proof.
import os


def get_new_username():
    """Prompt for a new username."""
    username = input("What is your name? ")
    username = username.title()
    return username

def get_new_address():
    """Prompt for an adress."""
    userAdress = input("What is your adress? ")
    return userAdress

def get_new_phoneNumber():
    """Prompt for a phone number."""
    usephoneNumbe = input("What is your phone number? ")
    return usephoneNumbe

def get_user_newfilename():
    """Prompt for a new user file name."""
    newUserFile = input("Whats the file name desired to save personal info? ")
    newUserFile = f'{newUserFile}.txt'
    return newUserFile

def get_user_newdirectory():
    """Prompt for a new user directory."""
    newUserDirectory = input("Whats the directory desired to save file? ")
    return newUserDirectory

def makeOsLibFile(dir):
    if os.path.exists(dir):
        print("Directory already exists.")
    else:
        os.mkdir(dir)
    os.chdir(dir)

def make_user_file(file):
    with open(file, 'w') as file_object:
        file_object.write(userInfo)

def get_file_info(file):
    with open(file, 'r') as file_object:
        contents = file_object.read()
    print(contents)


dir = get_user_newdirectory()
makeOsLibFile(dir)
file = get_user_newfilename()
userInfo = (f'{get_new_username()},{get_new_phoneNumber()},{get_new_address()}')
make_user_file(file)
get_file_info(file)

# resorses
# https://www.youtube.com/watch?v=pnCTO2jIkZM