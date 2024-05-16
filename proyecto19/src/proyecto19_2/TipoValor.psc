Algoritmo TipoValor
	Escribir Ingresa,un,numero,ENTERO
	Leer num1
	Si num1=trunc(num1) Entonces
		Si num1>0 Entonces
			Escribir 'EL NUMERO  INTRODUCIDO ES POSITIVO'
		SiNo
			Si num1<0 Entonces
				Escribir "EL NUMERO ES NEGATIVO"
			SiNo
				Si num1 = 0 Entonces
					Escribir "EL NUMERO ES NEUTRO"
				FinSi
			FinSi
		FinSi
		// si el número es positivo, nulo o negativo.
		// Se ingresa por teclado un valor entero, mostrar una leyenda que indique
	SiNo
		Escribir 'El numero debe ser entero'
	FinSi
FinAlgoritmo
