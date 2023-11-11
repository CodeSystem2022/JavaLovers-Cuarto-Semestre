

#Bool contiene los valores de True y False
# los tipos numericos, es false para el 0 (cero), tue para los demas valores

valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 0.0001
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')
#video 2 de la clase 3 lo de arriba

# Tipo string -> False '', True demas valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'hola'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')
#Esto de aca arriba en el video 3 de la clase 3

# Tipo colecciones -> False para colecciones vacias
#Tipo colecciones -> True  para todas las demas
# Lista
valor = []
resultado = bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [1, 2, 3]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')


# Tuplas
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

# Diccionario

valor = {}
resultado = bool(valor)
print(f'valor de una diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'tito', 4}
resultado = bool(valor)
print(f'valor de una diccionario con elementos: {valor}, Resultado: {resultado}')
#Videos 4 de la clase 3

# Sentencias de control con bool

if bool('1'):
    print('Regresa verdadero')
else:
    print('Regresa falso')
