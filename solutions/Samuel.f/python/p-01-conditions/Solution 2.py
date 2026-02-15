N = int(input("Veuilez entrer une année :"))
if N%4==0 or N%400==0 and N%100==1:
    print("L'année ",N," est bissextile")
else:
    print("L'année ",N," n'est pas bissextile")