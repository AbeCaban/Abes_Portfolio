# Abraham Caban Rios 10/3/2022 module 7 re-do for module 12 while loop assig.
# Input initial investment and interest rate, output how many years it takes to double the investment.
print("Welcome to MiBank")

years=0

initial_investment = float(input("Please enter initial currency investment total: "))

int_r= float(input('Please enter percent interest rate:'))/100

inv=initial_investment

inv=float(inv)

while (inv) <= (initial_investment*2):
   years += 1  
   inv=inv+(inv*int_r*years)
   res = "{:.2f}".format(inv)
   
   print(f"In approximately {years} years your investment will be {res}.")