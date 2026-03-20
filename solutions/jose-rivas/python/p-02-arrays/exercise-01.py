try:
    N = int(input("Entrez le nombre d'elements : "))

    if N < 1:
        print("Erreur : N doit etre >= 1")
    else:
        nombres = input("Entrez les nombres : ").split()

        if len(nombres) != N:
            print("Erreur : le nombre d'elements ne correspond pas a N")
        else:
            # Conversion en entiers
            tableau = []
            for n in nombres:
                tableau.append(int(n))

            max_val = tableau[0]

            for i in range(1, N):
                if tableau[i] > max_val:
                    max_val = tableau[i]

            print("Le maximum est :", max_val)

except ValueError:
    print("Erreur : veuillez entrer uniquement des nombres entiers.")