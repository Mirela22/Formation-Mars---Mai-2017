import random
aleatoire = random.randint(0,100)

nombre= eval(input("entrez un nombre :"))

for i in range (1,4):
    print ("essai", i)
    if nombre < aleatoire:
        print("le nombre mystère est plus grand")
        nombre= eval(input("entrez un nouveau nombre :"))
    else :
        print("le nombre mystère est plus petit")
        nombre= eval(input("entrez un nouveau nombre :"))

print("le nombre mystère est :",aleatoire)

#correction

from random import randint
secret = randint (0,100)
guess = eval (input("nombre:"))
life = 2
while guess != secret and life>0:
    if guess > secret:
        print("c'est plus petit")
    else:
        print ("c'est plus grand")
    life = life-1
    guess = eval (input("nombre:"))

print ("bravo")
