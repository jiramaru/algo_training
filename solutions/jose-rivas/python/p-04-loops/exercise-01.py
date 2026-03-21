try:
    N = int(input("Entrez un nombre N : "))

    if N < 1:
        print("Erreur : N doit etre >= 1")
    else:
        somme = 0

        for i in range(1, N + 1):
            somme = somme + i

        print("La somme de 1 a", N, "est :", somme)

except:
    print("Erreur : Veuillez entrer un nombre valide.")