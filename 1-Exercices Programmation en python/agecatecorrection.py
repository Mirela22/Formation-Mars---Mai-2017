age=eval(input("Quel est votre age ?:"))

if age >= 1 age=<14: #range ici pour gérer le cas zero
    print ("l'individu est de la catégorie enfant")

elif age<= 18:
    print ("l'individu est de la catégorie ado")

elif age<= 31:
    print ("l'individu est de la catégorie jeune")

elif  age<= 51:
    print ("l'individu est de la catégorie cadre")

elif  age<= 66:
    print ("l'individu est de la catégorie Senior")

elif  age<= 111:
    print ("l'individu est de la catégorie retraité")

else :
    print ("Menteur")
