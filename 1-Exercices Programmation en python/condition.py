numerateur=eval(input("entrez le numérateur:"))
resultat = 0

if numerateur>0 :
    print (numerateur)
    denominateur=eval(input("entrez le dénominateur:"))
    if denominateur!=0 :
        print (denominateur)
        resultat = numerateur / denominateur
        print (resultat)
    else :
        print ("le dénominateur ne peut être égal à 0")
else :
    print ("le numerateur doit être suppérieur à 0")
