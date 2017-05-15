Sex=eval(input("sex:"))
age=eval(input("age:"))


if (sex== "m" and  age>= 20) or (sex== "m" and age>= 18 and age<= 35):
    print ("l'individu doit payer des impots")

else :
    print ("pas d'impot")
