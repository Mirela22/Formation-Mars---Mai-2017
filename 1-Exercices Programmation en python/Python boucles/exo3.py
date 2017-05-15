import random
aleatoire = random.randint(0,100)

nombre= eval(input("entrez un nombre :"))

while nombre != aleatoire:
    if nombre < aleatoire:
        print("le nombre mystère est plus grand")
        nombre= eval(input("entrez un nouveau nombre :"))
    else :
        print("le nombre mystère est plus petit")
        nombre= eval(input("entrez un nouveau nombre :"))

print("le nombre mystère a été trouvé:",aleatoire)
