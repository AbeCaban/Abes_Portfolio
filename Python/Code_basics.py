# making a code that takes mana away every time 
# the user hits a key, then returns the mana lost over time. 
# everytime mana is lost it will print the amount of mana lost and the list of the mana available.
# 1. Initialize `total_mana` (e.g., 10).
# 2. Set `mana_recovery_rate` (e.g., 1 mana per second).
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
import asyncio
import keyboard

mana_available = ['blue10', 'blue20', 'blue30', 'blue40', 'blue50', 'blue60', 'blue70', 'blue80', 'blue90', 'blue100']

mana_lost = []
mana_recovery_rate = 1
mana = None

    
 
while True:
    print("Press 'q' to quit or any other key to spend mana.")
    event = keyboard.read_event(suppress=True)
    if event.event_type == 'down':
        if event.name == 'q':
            print('Exiting Spell Casting')
            break
        elif len(mana_available) > 0:
            input("Press a key to spend mana.")
            mana_spent = mana_available.pop(-1)
            mana_lost.append(mana_spent)
            print(f"You spent {mana_spent} mana.")
            print(f"You have {len(mana_available)} mana left.")
        elif len(mana_available) < 10:
            while len(mana_available) < 10:
             mana_available.append(f"blue{10 * (len(mana_available) + 1)}")
            
            # print("You have no mana left.")



# help gathered so i dont forget
'''import asyncio

# Initial mana setup
mana_available = ['blue10', 'blue20', 'blue30', 'blue40', 'blue50', 
                  'blue60', 'blue70', 'blue80', 'blue90', 'blue100']
mana_lost = []
mana_recovery_rate = 1  # Recovery rate in mana points per second

# Function to recover mana over time
async def recover_mana():
    while True:
        await asyncio.sleep(1)  # Wait 1 second
        if len(mana_available) < 10:
            recovered_mana = f"blue{10 * (len(mana_available) + 1)}"
            mana_available.insert(0, recovered_mana)  # Add recovered mana
            print(f"Recovered 1 mana: {recovered_mana}")
        else:
            print("Mana is full.")
        await asyncio.sleep(mana_recovery_rate)

# Function to handle mana spending
async def spend_mana():
    while input("Do you want to play? (y/n) ") == 'y':
        if mana_available:
            input("Press Enter to spend mana.")  # Wait for user input
            mana_spent = mana_available.pop(-1)  # Spend the highest mana
            mana_lost.append(mana_spent)
            print(f"You spent {mana_spent}.")
            print(f"You have {len(mana_available)} mana left.")
        else:
            print("You have no mana left.")

# Main function to run recovery and spending concurrently
async def main():
    await asyncio.gather(
        recover_mana(),
        spend_mana(),
    )

# Run the program
asyncio.run(main())
'''
# another  similar code

'''# Mana recovery function
async def recover_mana():
    while True:
        await asyncio.sleep(1)  # Wait for 1 second
        if len(mana_available) < 10:
            mana_available.append(f"blue{10 * (len(mana_available) + 1)}")
            print(f"Mana recovered: {mana_available[-1]}")
        else:
            print("Mana is full.")

# Gameplay function
async def play_game():
    while input("Do you want to play? (y/n) ") == 'y':
        if input("Press 'q' to quit or any other key to spend mana: ") != 'q':
            if mana_available:
                input("Press Enter to spend mana.")
                mana_spent = mana_available.pop(-1)  # Spend the highest mana
                mana_lost.append(mana_spent)
                print(f"You spent {mana_spent} mana.")
                print(f"You have {len(mana_available)} mana left.")
            else:
                print("You have no mana left.")
        else:
            print("Exiting game.")
            break

# Main function to run tasks concurrently
async def main():
    await asyncio.gather(
        recover_mana(),  # Run mana recovery
        play_game(),     # Run gameplay
    )

# Start the asyncio event loop
asyncio.run(main())'''