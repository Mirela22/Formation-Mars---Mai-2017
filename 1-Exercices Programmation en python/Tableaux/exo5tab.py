tabun=[1,5,8,15]
tabde=[6,7,4]
somme=0
multi=0
l=0
k=0

for i in range (0, len(tabun)):
    for j in range (0, len(tabde)):
        k=tabun[i]
        l=tabde[j]
        multi=k*l
        somme += multi
        print("k",k,"l",l,"multiplication des deux valeurs",multi)

print("somme", somme)
