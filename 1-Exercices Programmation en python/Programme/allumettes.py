import random

def nbrealludepart (nombre):
    if nombre%2==0:
            nombre+=1
    return nombre


def nbrealurestante (nombretire,nombredepart):
    nombreallumetterestante= nombredepart - nombretire
    return nombreallumetterestante

def testnombreallumettesrestantes (nombreallumettes):
    if nombreallumettes==0:
        print ("Vous avez perdu")
        score=1
    else:
        print("continuez")
        return


nad=nbrealludepart(random.randint(3,100))
print(nad)
score=0
while score!=0:
    a=eval(input("entrez le nombre d'allumettes que vous souhaitez tiré:"))
    b=nbrealurestante(a,nad)
    testnombreallumettesrestantes(b)

    c=nbrealludepart(random.randint(1,3))
    d=nbrealurestante(c,b)
    testnombreallumettesrestantes(d)
