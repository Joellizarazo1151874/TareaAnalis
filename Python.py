import random

# Se lee la cantidad de filas y columnas de la matriz que se va a crear
a = int(input("numero de filas: "))
b = int(input("numero de columnas: "))

import time
start_time = time.time()

AB = [[random.randint(0, 7) for j in range(b)] for i in range(a)]
M = [[AB[i][j] for j in range(b)] for i in range(a)]
    
for i in range(a):
    for j in range(b):
        if i == 0 or i % 2 == 0:
            M[i][j] += 1
        if j == 0 or j % 2 == 0:
            M[i][j] += 2
        if i % 2 != 0 and j % 2 != 0:
            M[i][j] -= 3
    
# Se imprime la matriz AB
print("Matriz AB:")
for i in range(a):
    for j in range(b):
        print(AB[i][j], end=' ')
    print()
    
# Se imprime la matriz M
print("------------------------")
print("Matriz M:")
for i in range(a):
    for j in range(b):
        print(M[i][j], end=' ')
    print()
    
# Se calcula el tiempo de ejecución
end_time = time.time()
duration = end_time - start_time
print(f"El tiempo de ejecucion fue de {duration:.5f} segundos\n")