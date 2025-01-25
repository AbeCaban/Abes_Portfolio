# making a code that takes mana away every time 
# the user hits a key, then returns the mana lost over time. 
# everytime mana is lost it will print the amount of mana lost and the list of the mana available.
# 1. Initialize `total_mana` (e.g., 100).
# 2. Set `mana_recovery_rate` (e.g., 5 mana per second).
# 3. Set `mana_loss_per_action` (e.g., 10 mana).

# # User action: Key press
# 4. Wait for user to press a key.
# 5. Check if `total_mana` is greater than or equal to `mana_loss_per_action`.
#     - If yes:
#         a. Subtract `mana_loss_per_action` from `total_mana`.
#         b. Print the amount of mana lost and the current `total_mana`.
#     - If no:
#         a. Print a message: "Not enough mana!".

# # Recovery over time
# 6. Implement a recovery timer that:
#     - Adds `mana_recovery_rate` to `total_mana` every second.
#     - asyncio: Ideal for asynchronous programs with multiple tasks running concurrently.
        #import asyncio asyncio: Ideal for asynchronous programs with multiple tasks running concurrently.

# async def perform_action():
#     while True:
#         print("Performing action...")
#         await asyncio.sleep(5)  # Wait for 5 seconds

# # Run the asynchronous function
# asyncio.run(perform_action())

#     - Ensures `total_mana` does not exceed the maximum (e.g., 100).
#     - Continues until user ends the program.

# # Flow loop
# 7. Repeat the key-press action and recovery process.

mana_available = ['blue10', 'blue20', 'blue30', 'blue40', 'blue50', 'blue60', 'blue70', 'blue80', 'blue90', 'blue100']

mana_lost = []

mana_recovery_rate = 5

