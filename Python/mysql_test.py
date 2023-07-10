import mysql.connector
from mysql.connector import errorcode

config = {
        "user":"movies_user",
        "password": "popcorn",
        "host":"127.0.0.1", 
        "database":"movies", 
        "raise_on_warnings": True
        }

try:
    db = mysql.connector.connect(**config)

    print("\n Database user {} connected to MySQL on host {} with database {}" .format(config["user"], config["host"], config["database"]))

    input("\n\n Press any key to continue...")

except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("   The supplied username or password are invalid")

    elif err.errno == errorcode.ER_BAD_DB_ERROR:
        print("  The specifide database does not exist")

    else:
        print(err)

finally:
    db.close()