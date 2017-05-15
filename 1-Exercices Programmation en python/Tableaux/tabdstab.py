tab=[[11,7],[16,32]] #tabelau de 4 cases, 2x2

print (tab[1][0]) #print de 16
print (tab) # on montre tout le tableau
print (tab[1]) #le tableau dans 1

for i in range (0,len(tab)): #il recupere la longeur des premiers crochets, mm si il y a des tableaux ds chaque éléments, range se balade sur des index = o et 1
    for j in range (0,len(tab[i])): #range se balade sur j mais recupere tab i, quand on demande la longeur de tab de i, on demande la longueur du premier tableau, quand i = 0, on fait la longeur de tab de 0, dans de ce qu'il y a dans le crochet entre 11 et 7
        print (tab[i][j])

# va lire dans cet ordre : 00 01 10 11
#impression sous forme de matrice

#boucle directement sur les élements

for soustab in tab :
    for value in soustab:
        print (value)
