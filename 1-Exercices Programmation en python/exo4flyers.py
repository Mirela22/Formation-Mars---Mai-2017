flyers=eval(input("Quel est le nombre de flyers:"))
price=0
b=0

if flyers < 100 :
    price=flyers*0.15

elif flyers<=300:
    prix=100*0.15+(flyers-100)*0.10
else :

    prix=100*0.15+200*0.10+(flyers-300)*0.06

print ("Le prix total est:", price)
