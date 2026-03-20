# Fonction pour additionner deux nombres
def addition(a, b):
    return a + b

try:
    valeurs = input("Entrez deux nombres : ").split()

    a = int(valeurs[0])
    b = int(valeurs[1])

    resultat = addition(a, b)

    print("La somme est :", resultat)

except:
    print("Erreur : veuillez entrer deux nombres entiers.")