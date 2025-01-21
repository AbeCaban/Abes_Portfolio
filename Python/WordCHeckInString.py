def word_in_srting_check():
    word = input("Enter a word: ")
    string = input("Enter a string: ")
    count = string.count(word)
    if word in string:
        print(f"True, {word} is in the sting provided {count} times")
    else:
        print("False")

word_in_srting_check()
