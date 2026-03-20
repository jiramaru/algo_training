try:
    texte = input("Entrez une chaine : ")

    if len(texte) < 1:
        print("Erreur : la chaine doit contenir au moins un caractere.")
    else:
        resultat = ""

        for i in range(len(texte) - 1, -1, -1):
            resultat = resultat + texte[i]

        print("Chaine inversee :", resultat)

except:
    print("Erreur lors de la lecture de la chaine.")