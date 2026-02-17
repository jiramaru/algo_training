def factorielle(n):
    resultat = 1
    for i in range(1,n+1):
        resultat=resultat*i
    return resultat
n = int(input("Entrez un nombre :"))
print (factorielle(n))