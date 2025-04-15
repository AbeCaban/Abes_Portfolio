# Dictionaries
# https://www.w3schools.com/python/python_dictionaries.asp

# Dictionaries are used to store data values in key:value pairs.
# A dictionary is a collection which is ordered*, changeable and does not allow duplicates.
# Dictionaries are written with curly brackets, and they have keys and values.

# example
# thisdict = {
#     "brand": "Ford",
#     "model": "Mustang",
#     "year": 1964
# }
# print(thisdict)
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict["color"] = "red"
thisdict["model"] = "GT"
thisdict.update({"model" : "Shelby"})
print(thisdict)