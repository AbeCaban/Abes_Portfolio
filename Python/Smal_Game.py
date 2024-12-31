#https://www.youtube.com/watch?v=C6M67z4_bZ8

print(" ")
print(" ")
while True:
    txt = """ Mini Games!!!
    - Guess the Number (1)
    - Rock Paper Scissors (2)
    - Wordle (3)
    - ConnectFour (4)
    - Tic Tac Toe (5)
Select a game (press a number or 'q' to quit):"""

    print(" ")
    print(" ")

    value = input(txt)
    match value:
        case "1":
            print("Guess the Number")
        case "2":
            print("Rock Paper Scissors")
        case "3":
            print("Wordle")
        case "4":
            print("ConnectFour")
        case "5":
            print("Tic Tac Toe")
        case "q":
            break