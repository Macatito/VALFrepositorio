Algoritmo Tablas_Once_a_veinte
	m<-1
	n<-11
	Escribir "Las tablas del 11 al 20 son las siguientes:"
	Mientras n<=20
		Mientras m<=10
			Escribir  n "*" m "=" n*m
			m<-m+1
		Fin mientras
		Escribir "------------------------------------"
		m<-1
	n<-n+1
	Fin mientras
FinAlgoritmo
