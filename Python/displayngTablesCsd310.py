import mysql.connector
db = mysql.connector.connect(
        user="root",
        password="",
        host="127.0.0.1",
        database="outland_adventures",
        )

cursor = db.cursor()

# print("--AirFaires--")
# cursor.execute("SELECT * from airfare;")
# for airfare in cursor:
#    print(airfare)
# print("")

# print("--Customer--")
# cursor.execute("SELECT * from customer;")
# for customer in cursor:
#    print(customer)
# print("")

# print("--Department--")
# cursor.execute("SELECT * from department;")
# for department in cursor:
#    print(department)
# print("")

# print("--Destination--")
# cursor.execute("SELECT * from destination;")
# for destination in cursor:
#    print(destination)
# print("")

# print("--Employee--")
# cursor.execute("SELECT * from employee;")
# for employee in cursor:
#    print(employee)
# print("")

# print("--Equipment--")
# cursor.execute("SELECT * from equipment;")
# for equipment in cursor:
#    print(equipment)
# print("")

# print("--Jobs--")
# cursor.execute("SELECT * from jobs;")
# for jobs in cursor:
#    print(jobs)
# print("")

print("--Orders--")
cursor.execute("SELECT * from orders;")
for orders in cursor:
   print(orders)
print("")

# print("--Purchases--")
# cursor.execute("SELECT * from purchases;")
# for purchases in cursor:
#    print(purchases)
# print("")

# print("--Rental--")
# cursor.execute("SELECT * from rental;")
# for rental in cursor:
#    print(rental)
# print("")

# print("--Trips--")
# cursor.execute("SELECT * from trips;")
# for trips in cursor:
#    print(trips)
# print("")

# print("--Visa--")
# cursor.execute("SELECT * from visa;")
# for visa in cursor:
#    print(visa)