Algoritmo Suma_hasta_N
	Escribir "Digite un n�mero entero menor a cien y mayor que 0"
	Leer n
	Mientras  n>=100 o n<=0
		Escribir "El n�mero introducido est� fuera del rango, ingrese otro n�mero"
		Leer n
	fin mientras
	Si n>0 y n<100
		R<-(n*(n+1))/2
		Escribir "El doble de la suma desde 1 hasta " n " es igual a: " 2*R
	FinSi
FinAlgoritmo
