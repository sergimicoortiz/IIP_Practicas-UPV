# Número de días de un mes.

Escribe un programa que pida un mes y un año e imprima cuantos días tiene ese mes. Tendremos en cuenta si el año es bisiesto. Si es bisiesto tendrá 29 días y sino 28 días. Como ayuda extra, os indico como detectar si un año es bisiesto.

Año bisiesto: Un año es bisiesto si es divisible por 4. Pero hay una excepción los años acabados en doble 00, por ejemplo, 1900, 2000, que claramente son divisibles por 4 pero son bisiestos si son divisibles por 400. Por tanto, 1900, no fue bisiesto y 2000 sí. Claramente ya sabremos que el 2100 no será bisiesto.

Os indico un código para determinar si es bisiesto.


```
(anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))
```

Tú puedes usar un estructura 'switch' para evaluar los días tiene el mes. 

Recuerda: El mes será introducido en formato número real de 1 a 12.