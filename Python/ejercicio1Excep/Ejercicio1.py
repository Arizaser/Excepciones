'''/**
	Realiza un programa que pida 6 n�meros por teclado y nos diga cu�l es el
	m�ximo. Si el usuario introduce un dato err�neo (algo que no sea un n�mero
	entero) el programa debe indicarlo y debe pedir de nuevo el n�mero
	'''

lista = []

for i in range (5):
    while True:
        try:
            lista.append(int(input("Introduzca numeros: "+"\n")))
            break
        except:
            print("El numero introducido no es correcto. Introduce otro")



print("El numero maximo introducido es ", max(lista))