nombre= eval(input("entrez un nombre :"))
leplusgrandnombre=1
i=0
position=0
while nombre != 0:
        i=i+1
        nombre= eval(input("entrez un nouveau nombre :"))
        if nombre>=leplusgrandnombre:
            nombre, leplusgrandnombre = leplusgrandnombre, nombre
            position =i

print (leplusgrandnombre, "qui a été saisi en", position)
