age=eval(input("Quel est votre age ?:"))
print (age)

if age<15:
    print ("l'individu est de la catégorie enfant")

elif age>14 and age<19:
    print ("l'individu est de la catégorie ado")

elif age>18 and age<31:
    print ("l'individu est de la catégorie jeune")

elif age>30 and age<51:
    print ("l'individu est de la catégorie cadre")

elif age>50 and age<66:
    print ("l'individu est de la catégorie Senior")

elif age>65 and age<111:
    print ("l'individu est de la catégorie retraité")

else :
    print ("Menteur")
