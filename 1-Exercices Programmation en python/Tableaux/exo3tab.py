import random

tab=[]
nbrepositif=0
nbrenegatif=0
for i in range (0,10):
    b=random.randint (0,100)
    tab.append(b)
    if b>0:
        nbrepositif+=1
    else:
        nbrenegatif+=1
print (tab)
print("total de nombre positif: ", nbrepositif)
print("total de nombre negatif: ", nbrenegatif)
