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

def intersecting_elements(set1, set2):
    # implement this
        nums = list(set1 & set2) 
        nums.sort(reverse=True)
        return nums
    


print(intersecting_elements({1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}))
# Expected output: [10, 9, 8, 7, 6, 5]

print(intersecting_elements({-1, -2, -3, -4, -5}, {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}))
# Expected output: [-1, -2, -3, -4, -5]

print(intersecting_elements({1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}))
# Expected output: []