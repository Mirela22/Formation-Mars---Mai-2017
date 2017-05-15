#pas de contraintes sur les années, sur les mois on vérifie qu'ils soient entre 1 et 12, les jours sont plus compliqués

day = eval(input("jour:"))
month = eval(input("mois:"))
year = eval(input("année:"))

isvalidday = False
isvalidmonth = False
#on peut stocker le retour d'une condition ==> =month >=1 and month <=12
maxday=31

if month >=1 and month <=12:
    isvalidmonth = True
    if month ==4 or month ==6 or month ==9 or month==11:
        maxday=30
    elif month ==2:
        if year%400==0 or (year%4==0 and year%100!=0):
            maxday=29
        else:
            maxday = 28
    if day >=1 and day <=maxday:
        isvalidday = True


if isvalidday and isvalidmonth: # c'est ce qu'on appel un flag
    print ("data valide")
else :
    print ("data invalide")
