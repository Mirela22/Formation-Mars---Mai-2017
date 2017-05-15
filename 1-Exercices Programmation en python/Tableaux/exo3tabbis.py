#1

i=eval(input("entrez un nombre:"))

tab=[]
for k in range (0,i):
    tab.append([])
print (tab)
#2
tabb=[]
a=eval(input("entrez un nombre:"))
b=eval(input("entrez un second nombre:"))

for j in range (0,a):
    tabb.append([])
    for m in range (0,b):
        tabb[j].append(0)
print(tabb)
#3
x=eval(input("saisissez x:"))
y=eval(input("saisissez y:"))
c=eval(input("saisissez une valeur:"))

x=x-1
y=y-1

tabb[x][y]=c

print (tabb)
