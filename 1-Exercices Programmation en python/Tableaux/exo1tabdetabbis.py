colors=["bleu","rouge","vert","orange"]

print(colors[2])

#1.3
for color in colors:
    print(color)
#1.4
colors.append("violet") #les guillemets car on lui fait passer une chaine de caractère
#1.5
colors[1]="rose"

for i in range (0, len(colors)):
    print(i, colors[i])
    #"len = abrevation pour length"

c=input("nouvelle couleur:")

while c!="stop":
    colors.append(c)
    c=input("nouvelle couleur:")

for color in colors:
    print(color)
