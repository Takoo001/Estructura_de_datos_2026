Algoritmo laboratorio
	definir ventas, mes, ventas_totales, ventas_comision Como real
	
	escribir "¿Cuanto dias trabajo este mes?: "
	leer mes
	
	// Guardando los dias trabajados para usarla en comision
	dias_trabajados = mes
	
	// Bucle para pedir los valores de ventas diarias e ir sumandolas para tener el total de ellas
	// El bucle termina al ingresar nuevamente el dia de numeros trabajados
	Mientras mes > 0 Hacer
		escribir "Ingresa los valores de sus ventas diarias (Para terminar ingrese el numero de dias que trabajo): "
		leer ventas
		
		// Total de ventas
		ventas_totales = ventas_totales + ventas
		
		// Sacando promedio de ventas
		promedio_de_ventas = ventas_totales / dias_trabajados
		// Sacando dia con mayor ventas
		si ventas > dia_mayor_ventas Entonces
			dia_mayor_ventas = ventas
		FinSi
		// Sacando dia con menor ventas
		dia_menor_ventas = 100000
		si ventas < dia_menor_ventas Entonces
			dia_menor_ventas = ventas
		FinSi
		// Determinando cuantos dias las ventas superaron el promedio
		si ventas > promedio_de_ventas Entonces
			dias_mayor_promedio = dias_mayor_promedio + 1
		FinSi
		
		mes = mes - 1
	Fin Mientras
	
	// Calculando comisiones segun el respectivo caso 
	si ventas_totales < 10000 entonces 
		ventas_comision = ventas_totales + (ventas_totales * 0.05)
		escribir "Ya que sus ventas totales son menores a $10,000, Su comision es del 5%, con un total de: ",ventas_comision
	SiNo
		si ventas_totales >= 10000 y ventas_totales <= 20000 Entonces
			ventas_comision = ventas_totales + (ventas_totales * 0.10)
			escribir "Ya que sus ventas totales estan entre $10,000 y $20,000, Su comision es del 10%, con un total de: ", ventas_comision
		SiNo
			si ventas_totales > 20000 Entonces
				ventas_comision = ventas_totales + (ventas_totales * 0.15)
				escribir "Ya que sus ventas totales superan los $20000, Su comision es del 15%, con un total de: ", ventas_comision
			FinSi
			
		FinSi
	FinSi
	
	// Mostrando el dia con mayor ventas y el dia con menor ventas
	escribir "Su dia con mayor ventas fue con un total de: ", dia_mayor_ventas
	Escribir "Su dia con menor ventas fue con un total de: ", dia_menor_ventas
	
	// Mostrando el promedio de ventas diarias
	escribir "Su promedio de ventas diarias es de: ", promedio_de_ventas
	
	
	// Mostrando cuantos dias las ventas superaron el promedio_de_ventas
	escribir ""
	escribir "Las ventas superaron el promedio, ",dias_mayor_promedio," veces"
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
