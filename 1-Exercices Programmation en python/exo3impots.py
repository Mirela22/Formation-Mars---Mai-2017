S=eval(input("homme ou femme ?:"))
age=eval(input("Quel est votre age ?:"))
if s==femme:
    if age>17 and age<36:
        print ("l'individu doit payer des impots")

if s==homme:
    if age>19:
        print ("l'individu doit payer des impots")

else :
    print ("pas d'impot")
