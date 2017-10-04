import math

def isHipotenusa(n):
  h = n**2
  b = 1
  c = h - 1
  for _ in range(1,h):
    if math.floor(math.sqrt(c)) == math.ceil(math.sqrt(c)):
      if math.floor(math.sqrt(b)) == math.ceil(math.sqrt(b)):
        print("h^2: " + str(n**2) + " b^2: " + str(b) + ", c^2: " + str(c))
        print("h: " + str(n) + " b: " + str(math.sqrt(b)) + ", c: " + str(math.sqrt(c)))
        return True
    b += 1
    c -= 1
  return False

def soma_hipotenusas(n):
  soma = 0
  for i in range(1,n+1):
    if isHipotenusa(i):
      soma += i
  return soma
  
#print(isHipotenusa(5))
print(soma_hipotenusas(25)) #105
