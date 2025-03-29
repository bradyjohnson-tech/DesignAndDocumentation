def main():
    print("This program cmputes the square of an Integer")
    print()
    n = int(eval(input("Enter an Integer: ")))
    acc = 0
    odd = 1
    for i in range(n):
        acc += odd
        odd += 2
    print("The square of", n, "is", acc)

if __name__ == "__main__":
    main()