# Práctica 2. Ejercicio 2

Usando estructura condicional anidada.

```
if() {
  if(){

  }else or else if() {

  }...
}else or else if() { 
  if(){

  }else or else if() {

  }...
}...
```

>*Algoritmo a implementar*

Se dispone de un sensor que en función de un determinado rango de temperaturas ha de proceder a activar o desactivar un refrigerador.

El programa ha de dar valor a las variables que controlen la activación o no del refrigerador, su potencia y el grado de apertura de las láminas de las ventans del techo del recinto, en función de la temperatura que indique el sensor y la franja horaria.

Si hay que activarlo, los valores de potencia oscilan entre 1 y 3. La apertura de las láminas oscilan entre 0 y 3, siendo 0 el estar cerradas.

```Rangos de temperaturas que considera el sensor.```

A) Inferior e igual a 10 grados.

B) Inferior e igual a 20 grados.

C) Inferior e igual a 40 grados.

D) Superior a 40 grados.

```Franjas horarias para decidir el estado de las láminas.```

A) Entre las 00:00 y las 05:59.

B) Entre las 06:00 y las 11:59.

C) Entre las 12:00 y las 17:59.

D) Entre las 18:00 y las 23:59.

**De esta forma el algoritmo establece que:**

1.Si el Rango de Temperatura es A.

  *- Y la franja horaria es A ó B ó D. Lámina en estado 0, refrigerador desactivado.*
  *- Y la franja horaria es C. Lámina en estado 3, refrigerador activado y potencia 1*
  
2.Si el Rango de Temperatura es B.

  *-Y la franja horaria es A. Lámina en estado 0, refrigerador activado y potencia 1.*

  *-Y la franja horaria es B. Lámina en estado 3, refrigerador activado y potencia 1.*

  *-Y la franja horaria es C. Lámina en estado 2, refrigerador activado y potencia 2.*

  *-Y la franja horaria es D. Lámina en estado 1, refrigerador activado y potencia 1.*

3.Si el Rango de Temperatura es C.

  *-Y la franja horaria es A. Lámina en estado 0, refrigerador activado y potencia 2.*
  
  *-Y la franja horaria es B. Lámina en estado 1, refrigerador activado y potencia 2.*

  *-Y la franja horaria es C ó D. Lámina en estado 1, refrigerador activado y potencia 3.*

4.Si el Rango de Temperatura es D.

  *- Cualquier frnaja horaria. Lámina en estado 0, refrigerador activado y potencia 3.

Siga los pasos en el código para implementar este ejercicio.
