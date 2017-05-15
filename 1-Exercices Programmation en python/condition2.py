numerateur=eval(input("entrez le numérateur:"))
denominateur=eval(input("entrez le dénominateur:"))
resultat = 0

if numerateur>0 :

    if denominateur!=0 :

        resultat = numerateur / denominateur
        print ("le résultat est :", resultat)
    else :
        print ("le dénominateur ne peut être égal à 0")
else :
    print ("le numerateur doit être suppérieur à 0")
