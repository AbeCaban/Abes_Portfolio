# def print_space_elements(space_dict):
#     # TODO: Your code here
#     for key, value in space_dict.items():
#         print(key + ": " + value)

# # Example usage
# space_data = {
#     "Mercury": "The smallest planet",
#     "Venus": "The hottest planet",
#     "Earth": "Our home",
#     "Mars": "The Red Planet",
#     "Jupiter": "The largest planet",
#     "Saturn": "Known for its rings",
#      "Uranus": "An ice giant",
#     "Neptune": "The farthest planet",
#     "Pluto": "A dwarf planet"
# }

# print_space_elements(space_data)

# def intersecting_elements(set1, set2):
#     # implement this
#         nums = list(set1 & set2) 
#         nums.sort(reverse=True)
#         return nums

    


# print(intersecting_elements({1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}))
# # Expected output: [10, 9, 8, 7, 6, 5]

# print(intersecting_elements({-1, -2, -3, -4, -5}, {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}))
# # Expected output: [-1, -2, -3, -4, -5]

# print(intersecting_elements({1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}))
# # Expected output: []

# def exclusive_products(inventory1, inventory2):
#     # implement this
#     inventory1 = set(inventory1)
#     inventory2 = set(inventory2)
#     inventory1_upper = {item.upper() for item in inventory1}
#     inventory2_upper = {item.upper() for item in inventory2}
    
#     common_item = inventory1_upper & inventory2_upper
#     inventory1_upper -= common_item
#     inventory2_upper -= common_item
    
#     inventory1_upper = list(inventory1_upper)
#     inventory2_upper = list(inventory2_upper)
    
#     return inventory1_upper, inventory2_upper
    

# inventory1 = ["Shirt", "Jeans", "Hat"]
# inventory2 = ["jeans", "Belt", "Boots"]
# print(exclusive_products(inventory1, inventory2))
# # Expected output: (['HAT', 'SHIRT'], ['BELT', 'BOOTS'])

# inventory1 = ["T-Shirt", "hoodie", "Backpack"]
# inventory2 = ["Backpack", "Hoodie", "t-shirt"]
# print(exclusive_products(inventory1, inventory2))
# # Expected output: ([], [])

# inventory1 = []
# inventory2 = ["Dress", "Skirt", "Coat"]
# print(exclusive_products(inventory1, inventory2))
# # Expected output: ([], ['COAT', 'DRESS', 'SKIRT'])

def find_unique_string(words):
    # implement this
    
    single_words = set()
    repeated_words = set()
    for word in words:
        if word in single_words:
            repeated_words.add(word)
        else:
            single_words.add(word)
    unique_words_in_set = single_words - repeated_words
    
    unique_words_in_list = list(unique_words_in_set)
    
    if not unique_words_in_list:
        unique_words_in_list.append('')
    
    final_result = ", ".join([f"'{item}'" for item in unique_words_in_list])
            
    return final_result
    

print(find_unique_string(['apple', 'banana', 'apple', 'mango', 'banana']))  # It should print: 'mango' 'pineapple
print(find_unique_string(['hello', 'world', 'hello']))  # It should print: 'world' 'pineapple
print(find_unique_string(['hello', 'world', 'hello', 'world']))  # It should print: ''
print(find_unique_string([]))  # It should print: ''