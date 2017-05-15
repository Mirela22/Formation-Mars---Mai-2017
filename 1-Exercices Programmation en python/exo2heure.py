#h=eval(input("Entrez une heure:"))
#m=eval(input("Entrez les minutes:"))
#n=m+1
#print ("l'heure avec une minute en plus:")
#print (h,n)
#Correction : (il faut prendre en compte les cas problematiques comme 59 minut, 23 heures etc)

#hour = eval (input("heures:"))
#minutes = eval (input("Minutes:"))

#if minutess == 59:
#    minutes = 0
#    if hour ==23:
#        hour=0
#    else :
#        hour = hour+1
#else :
#        minutes = minutes+1

hour = eval (input("heures:"))
minutes = eval (input("Minutes:"))

minutes = minutes+1

if minutes == 60:
    minutes = 0
    if hour ==24:
        hours=0
    else :
        hour = hour+1
