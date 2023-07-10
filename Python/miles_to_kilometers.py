#Abraham Caban Rios Module 8 9/17/2022
#Turning miles in to kilometers

print("-----The 'try/except' has started.-----")
try:
    def miles_in_kilometers():
     kilometers_driven= (miles * 1.609)
     return kilometers_driven

    miles = float(input("\nPlease enter miles driven: "))
    print (f"Your traveled miles in Kilometers are {miles_in_kilometers()}")

except Exception as e:
    print(e)
finally:
    print("\n-----The 'try/except' is finished.-----")


# def miles_in_kilometers():
#   kilometers_driven= float(miles * 1.609)
#   return kilometers_driven

# miles = float(input("Please enter miles driven: "))
# print (f"Your traveled miles in Kilometers are {miles_in_kilometers()}")

#Sorces https://www.youtube.com/watch?v=NIWwJbo-9_8 