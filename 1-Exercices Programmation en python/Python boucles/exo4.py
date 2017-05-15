nombre= eval(input("entrez un nombre :"))
somme = 0
factorielle=1

for i in range (1,nombre):
    somme = somme + i
    factorielle = factorielle*(i+1)


print ("somme des entiers",somme)
print ("la factorielle de",nombre,":",factorielle)
