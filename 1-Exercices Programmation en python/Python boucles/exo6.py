nombre=-1
somme=0
billetdedix=0
billetdecinq=0
piecedeun=0
while nombre != 0:
        nombre= eval(input("entrez un le prix de l'article :"))
        somme = somme + nombre


print ("Prix total=",somme)

argent= eval(input("entrez le montant donné par le client:"))
rendu=argent-somme
print ("Monnaie rendue=",rendu)

if (rendu%10==0):
    billetdedix=(rendu/10)
elif (rendu%5==0):
    billetdecinq=(rendu/5)
    if billetdecinq>=3 :
        billetdedix=((rendu-5)/10)
        billetdecinq=1
elif piecedeun ==(rendu%5):
    billetdecinq= (rendu-(rendu%5))/5
        if billetdecinq >=3 :
            billetdedix=((rendu-5)/10)
            billetdecinq=1

print ("Nombre de billet de 10=",billetdedix)
print ("Nombre de billet de 5=",billetdecinq)
print ("Nombre de pièce de 1=",piecedeun)
