#1
def calcul (a,b,c):
    somme =0
    somme = a+b+c
    return somme

a=calcul(2,3,5)
b=calcul(456,1022546,25654541545)
print(b)

#2
def voyelle (chainecaract): #les caractères sont considérés comme écrit dans des tableaux
    nombredevoyelle=0
    for caract in chainecaract:
        if caract == "a" or caract == "e" or caract == "i" or caract == "o" or caract == "u" or caract == "y" :
            nombredevoyelle +=1
        else:
            continue
    return nombredevoyelle

c=voyelle("Mirela")
print (c)
d=voyelle("azrefbdjgbjfgbsjfvbkfd")
print (d)
e=voyelle("aeiouyhjfgfdjmg")
print (e)
print(voyelle("fanta"))
#3
