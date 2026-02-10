while True:
    n = input('Enter a number: ')
    try:
        n = int(n)  
    except:
        print('Number must be an integer please!')
        continue  
    if n % 2 == 0:
        print("even")
    else:
        print("odd")
    break  
