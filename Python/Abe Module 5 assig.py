# Abraham Caban 8/26/2022 Module 5 assignment
# Calculating the fiber optic cost and display of the company

print("welcome to Abe's company")
ucpn = input("enter your company name:")
focl = input("enter desired number of feet of fiber optic cable to be instaled:")


if float(focl) > 100 and float(focl) <= 250:
 totalcost = (float(focl) * 0.80)
 print(float(totalcost), ucpn)
if float(focl) > 250 and float(focl) <= 500:
 totalcost = (float(focl) * 0.70)
 print(float(totalcost), ucpn)
if float(focl) > 500:
 totalcost = (float(focl) * 0.50)
 print(float(totalcost), ucpn)