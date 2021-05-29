calificaciones=[4,5,6,7]

def promedio(lista:list):
    suma=0
    for tmp in lista:
        suma=suma+tmp
    return suma/len(lista)

print("el promedio es: {} ".format(promedio(calificaciones)))


