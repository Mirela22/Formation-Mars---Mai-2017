a=5
b=8
c=10

if a>b:
    a,b = b,a #a=3, b=8; c=5

if b>c:
    b,c=c,b #a=3, b=5; c=8
    if a>b:
        a,b = b,a

print (a,b,c)
