Algoritmo Adivina_numero
intentos<-10
n_secreto<-azar(100)+1
//Escribir n_secreto
Escribir "Adivine el numero del 1 al 100:"
Leer n_ingresado
	Mientras n_secreto<>n_ingresado Y intentos>=1 Hacer
		si n_secreto>n_ingresado
			Escribir "Muy bajo"
		sino
			Escribir "Muy alto"
		FinSi
	    intentos<-intentos-1
	si intentos >=1 
			Escribir " Le quedan " intentos " intentos"
			Escribir "Ingrese otro numero: "
			Leer n_ingresado
		FinSi
    Fin Mientras
a<-11-intentos
si n_secreto=n_ingresado 
	Escribir "Exacto, Usted adivinó en " a " intentos"
sino 
	Escribir "El número era: " n_secreto " Suerte para la próxima"
	FinSi
FinAlgoritmo