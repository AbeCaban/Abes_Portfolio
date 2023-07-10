# Abraham Caban Rios 9/1/2022 Module 6 assignment Dictionaries

silence_lvl_catalogs={ 
 '1':'lvl1 items are earplugs', 
 '2':'lvl1 items plus headphones', 
 '3':'lvl2 items plus wall sound tiles', 
 '4':'lvl3 items plus roof sound tiles', 
 '5':'lvl4 items plus sound proof door', 
 '6':'lvl5 items plus sound proof rug', 
 '7':'lvl6 items plus sound proof outer shell', 
 '8':'lvl7 items plus 2 guards to keep noisy people away', 
 '9':'lvl8 items plus diet watch', 
 '10':'training for a 0db facility plus relocation to such facility and 30 day stay. renewal of lvl10 is optional 3 days prior of ending contract', 

}

print("Welcome to Rest Rescue") 

print("Silence level options are:",
len(silence_lvl_catalogs)) 

for silence_lvl in silence_lvl_catalogs.keys(): 
    print(silence_lvl) 
print("\nEach level grants these items:") 

for key, value in silence_lvl_catalogs.items(): 
    print(f'{key}:{value}.')  

silence_lvl = input ("\nPlease enter desired lvl of silence:")

print("\nYou will recive:")

match silence_lvl:
    case "1":
        print('lvl1 items are earplugs')
    case "2":
        print('lvl1 items plus headphones')
    case "3":
        print('lvl2 items plus wall sound tiles')
    case "4":
        print('lvl3 items plus roof sound tikes')
    case "5":
        print('lvl4 items plus sound proof door')
    case "6":
        print('lvl5 items plus sound proof rug')
    case "7":
        print('lvl6 items plus sound proof outer shell')
    case "8":
        print('lvl7 items plus 2 gards to keep noisy people away')
    case "9":
        print('lvl8 items plus diet watch')
    case "10":
        print('Training for a 0db facility plus relocation to such facility and 30 day stay. Renewal of lvl10 is optional 3 days prior of ending contract.')
print('You will be contacted for further steps on your resting rescue. Thank You!')