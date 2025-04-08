a=int(input("Enter Input A"))
b=int(input("Enter InputB:"))
operation = input("Addition/Substraction/Multiplication/Division/Square/Square2:")
if(operation=="Addition"):
    print(a+b)
elif(operation=="Substraction"):
    print(a-b)
elif(operation=="Multiplication"):
    print(a*b)
elif(operation=="Division"):
    print(a/b)
elif(operation=="Square"):
    print(a*a)
elif(operation=="cube"):
    print(a*a*a)
elif(operation=="Square2"):
    print(a*a+2*a*b+b*b)
else:
    print("invalid operation selected. ")