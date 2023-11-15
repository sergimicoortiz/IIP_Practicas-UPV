# Buscar un char en un String - recursivo

Escribe un método capaz de encontrar un char en un Srting. 

El método tiene ha de retornar la posición de la primera aparición del char en la cadena o -1 si el char no está en la cadena.

El método ha de ser recursivo (no bucles, llamándose asimismo resuelve el problema)

Como tú mismo te darás cuenta, será necesario añadir un nuevo parámetro al método, algo común en algunos algoritmos recursivos. 

Este parámetro extra tiene la misión de marcar la posición del char de la cadena que se está considerando cada vez.

Por eso la primera llamada a ese método empieza en 0, posición de la primer carácter de la cadena, tal como se ve a continuación:


```
int donde = encuentraCaracter("Hola Mundo !", '!', 0);  

// Donde el tercer parámetro indica que empezamos a buscar el carácter desde la primera posición de la cadena (O)

```