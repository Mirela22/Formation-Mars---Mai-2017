b=eval(input("entrez une valeur:"))
tab=[b]
moyenne=0
compteur=1
somme=b
for i in range (4):

    c=eval(input("nouvelle valeur:"))
    tab.append(c)
    somme=somme+c
    compteur=compteur+1

for value in tab:
    print(value)



#for k in range (10):
#    print("serie",k)
#    for i in range (5):

#        print (tab[i])

moyenne= (somme/compteur)
print("la moyenne est de :",moyenne)
