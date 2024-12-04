Algoritmo CINCONUMEROS
	Escribir "Ingrese 5 numeros enteros"
	Leer d,e,f,k,w  //No me critique a mi me gustan estas letras
	n<-1
	Mientras n<5
		si d<e
			d<-e
			e<-f
			f<-k
			k<-w
		sino
			e<-f
			f<-k
			k<-w 
		FinSi
	n<-n+1
	FinMientras
	Escribir "El número mas grande es: " +d
FinAlgoritmo
