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
# thisdict = {
#   "brand": "Ford",
#   "model": "Mustang",
#   "year": 1964
# }
# thisdict["color"] = "red"
# thisdict["model"] = "GT"
# thisdict.update({"model" : "Shelby"})
# print(thisdict)

import pandas as pd

# Create a comparison table with key features
features = [
    "Custom-branded profile",
    "QR code + Link sharing",
    "Menu/products display",
    "Customer reviews",
    "No app needed for customer access",
    "Mobile-first design",
    "Easy setup (no tech skills)",
    "Contact options (call, msg, etc.)",
    "Profile analytics",
    "All-in-one platform"
]

# Company categories
qr_tools = [
    "QR Code Generator", "QRCodeChimp", "myqrcode.com", "QR Tiger", "ME-QR", "Flowcode", "QR Code KIT"
]
link_bio = [
    "Linktree", "bio.fm", "Lnk.Bio", "Later Link in Bio", "Hootbio"
]
review_sites = [
    "Yelp", "Google Business Profile", "TripAdvisor"
]
website_builders = [
    "Wix", "Squarespace", "GoDaddy Website Builder", "Shopify"
]
qrise = ["QRise"]

# Map features to companies (manually estimated based on known features)
comparison_data = {
    "QRise":              [True, True, True, True, True, True, True, True, False, True],
    "QR Code Generator":  [False, True, False, False, True, Partial:=True, False, False, False, False],
    "QRCodeChimp":        [Partial, True, False, False, True, True, Partial, False, True, False],
    "myqrcode.com":       [False, True, False, False, True, Partial, False, False, False, False],
    "QR Tiger":           [False, True, False, False, True, True, Partial, False, True, False],
    "ME-QR":              [False, True, False, False, True, True, Partial, False, False, False],
    "Flowcode":           [Partial, True, False, False, True, True, Partial, False, True, False],
    "QR Code KIT":        [Partial, True, False, False, True, True, Partial, False, True, False],
    "Linktree":           [Partial, True, False, False, True, True, True, Partial, True, Partial],
    "bio.fm":             [Partial, True, False, False, True, True, True, Partial, True, Partial],
    "Lnk.Bio":            [Partial, True, False, False, True, True, True, Partial, True, Partial],
    "Later Link in Bio":  [Partial, True, False, False, True, True, True, Partial, True, Partial],
    "Hootbio":            [Partial, True, False, False, True, True, True, Partial, True, Partial],
    "Yelp":               [False, False, Partial, True, True, Partial, False, True, Partial, False],
    "Google Business Profile": [False, False, Partial, True, True, Partial, False, True, Partial, False],
    "TripAdvisor":        [False, False, Partial, True, True, Partial, False, True, Partial, False],
    "Wix":                [True, False, True, Partial, True, True, False, True, True, False],
    "Squarespace":        [True, False, True, Partial, True, True, False, True, True, False],
    "GoDaddy Website Builder": [True, False, True, Partial, True, True, False, True, True, False],
    "Shopify":            [True, False, True, Partial, True, True, False, True, True, False],
}

# Create the DataFrame
df = pd.DataFrame(comparison_data, index=features).T

# Replace True/False with checkmarks and blanks for easier viewing
df_display = df.replace({True: "✅", False: "", Partial: "➖"})

df_display.head(10)  # Show the first few rows as a sample

