def sayhello(n):
    print ("Bonjour" + n)
#on a défini une fonction qui prend en compte un paramètre (ici n), n est une variable local, elle est dispo uniquement ds le sous programme


def sayhelloandage(n, age):
    print ("Bonjour" + n)
    print ("Age ?" + str(age)) #str transforme ls chaine de caractères en numérique
#on a défini une fonction qui prend en compte un paramètre (ici n), n est une variable local, elle est dispo uniquement ds le sous programme

#une variable déclarée dans une fonction ne peut être utilisée dans le programme, elle n'est pas globale

def average (notes):
    total=0
    for note in notes: #note est une valeur locale de for
        total += note
    avg = total/ len(notes)
    return avg #sort de la fonction


n=[8,16,14,2,15]

a=average(n)
print(average(n))

print(a)
