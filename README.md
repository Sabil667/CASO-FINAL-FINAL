Link de mi repositorio:https://github.com/Sabil667/CASO-FINAL-FINAL.git

1.1) En relación al estado de un objeto, para preservar el principio de encapsulación:

a) Los atributos de nuestra clase deben permanecer públicos, para permitir un acceso
total a la información que almacenamos en los objetos. Sin embargo, aquellos
métodos que realicen operaciones internas (y no deban ser utilizados), deben
establecerse como privados.
b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos
de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al
estado de los objetos mediante los métodos que le hayamos permitido utilizar.

La respuesta correcta es la b), "Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar"


2) Los métodos de una clase no pueden devolver objetos:
a) Verdadero
b) Falso

La respuesta correcta es la b), Falso


3) ¿Cuál de las siguientes características de la programación orientada a objetos está
relacionada con la reutilización de código?
a) Abstracción
b) Herencia

La respuesta correcta es la b), Herencia.

4) El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
a) O(n)
b) O(1)

La respuesta correcta es la b), O(1)


5) Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir
seleccionando el número correspondiente en la lista desordenada que se va a insertar en la
posición última de la lista ordenada:
a) Verdadero
b) Falso

La respuesta correcta es la a), Verdadero.


------------


2)Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar
cada una de estas estructuras? Justifique su respuesta y analice todas las
posibles operaciones a realizar por las estructuras. No redacte el orden tal y
como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

*En una tabla hash no se mantiene un orden especifico en la ordenacion de elementos, mientras que en un arbol si.
*Las operaciones de eliminacion, busqueda, e insercion en una tabla hash son mas rapidas que en un arbol.
*En una tabla hash si dos o mas claves diferentes se asignan a la misma ubicacion se produce una colision, mientras que en un arbol el concepto de colision no existe.
*Las tablas de hash requieren mas memoria que los arboles debido al manejo de colisiones.
*Los arboles son mas eficientes para las operaciones de rango, que son por ejemplo encontrar todos los elementos entre dos valores.

¿ Cuándo conviene utilizar cada una de estas estructuras?
-Arbol-
Cuando se necesita mantener los elementos en un orden especifico, lo que puede ser util para ciertas aplicaciones.
Cuando se quieren realizar operaciones de rango y cuando la memoria es un factor a tener en cuenta porque los arboles requieren menos memoria que las tablas hash.

-Tablas hash-
Cuando se necesita acceso rapido a los datos.
Cuando el orden no es importante
Cuando no se necesitan realizar operaciones de rango ya que estan no son adecuadas para ella.


Operaciones que se pueden realizar con las estructuras.

-Tabla hash-

1.Insercion-> Agregar un nuevo par clave-valor

2.Busqueda-> Buscar un valor en la tabla usando una clave

3.Eliminacion-> Eliminar un par clave-valor usando su clave

4.Contiene clave-> Verificar si una clave en especifico existe en la tabla

-Arbol-

1.Insercion-> Agregar un nuevo nodo en el arbol en la posicion correcta

2.Busqueda-> Busqueda de un valor en el arbol usando su valor 

3.Eliminacion-> Eliminacion de un nodo del arbol, donde se reorganizan los nodos restantes para mantener la propiedad de busqueda binaria

4.Recorrido-> Ver todos los nodos del arbol en un orden especifico

5.Encontrar el minimo y el maximo-> Encontrar el nodo con el valor maximo/minimo en el arbol

6.Operacion de rango-> Encuentra todos los nodos con valores dentro de un rango especifico



3) Explica las diferencias entre una pila y una cola. ¿Cuándo conviene utilizar cada
una de estas estructuras? ¿Cuál es el orden de complejidad computacional de
estas estructuras? No redacte el orden tal y como puede ver en los apuntes,
razónelo con sus propias palabras y argumentos.


-Pila-
*Es una estructura de datos que sigue el principio de LIFO (Last In First Out), lo que significa que el ultimo elemento que se agrega a la pila es el primero en ser eliminado.
*Las operaciones principales en una pila son push (agregar un elemento al tope de la pila) y pop (eliminar el elemento del tope de la pila).
*Las pilas se utilizan en escenarios donde necesitamos acceso rápido al último elemento insertado, como en el seguimiento de las llamadas a funciones en un programa.

La pila conviene usarla cuando se necesita acceso rapido al ultimo elemento insertado

-Cola-
*Es una estructura de datos que sigue el principio de FIFO (First In First Out), lo que significa que el primer elemento que se agrega a la cola es el primero en ser eliminado.
*Las operaciones principales en una cola son enqueue (agregar un elemento al final de la cola) y dequeue (eliminar el elemento del frente de la cola).
*Las colas se utilizan en escenarios donde necesitamos mantener el orden de los elementos, como en la programación de procesos en sistemas operativos.

La cola conviene usarla cuando se necesita mantener el orden de los elementos segun fueron insertados.

ORDEN DE COMPLEJIDAD COMPUTANCIONAL

-Pila-
*Push (agregar un elemento al tope de la pila): O(1)
*Pop (eliminar el elemento del tope de la pila): O(1)
*Peek (ver el elemento en el tope de la pila sin eliminarlo): O(1)

-Cola-
*Enqueue (agregar un elemento al final de la cola): O(1)
*Dequeue (eliminar el elemento del frente de la cola): O(1)
*Peek (ver el elemento en el frente de la cola sin eliminarlo): O(1)



4) Explica el método de ordenación denominado inserción y describe las
iteraciones sobre el siguiente conjunto de datos:
50 20 84 13 22 16 89 85

-Metodo de ordenacion-
1.Comenzamos desde el segundo elemento (el indice 1 en un array basado en 0). Este elemento se considera "en la mano"(se refiere al elemento actual que se esta considerando en el algoritmo). Todos los elementos antes de este están ordenados.
2.Comparamos este elemento con cada elemento antes de él. Si el elemento "en la mano" es menor que el elemento con el que se está comparando, lo insertamos antes de ese elemento. De lo contrario, pasamos al siguiente elemento.
3.Repetimos este proceso hasta que todos los elementos estén ordenados.

-Iteraciones-
1.Comenzamos con el segundo elemento: 20. Como 20 es menor que 50, lo movemos antes de 50. Nuestra lista ahora se ve asi: 20 50 84 13 22 16 89 85

2.Pasamos al siguiente numero: 84. Como 84 es mayor que 50, lo dejamos donde esta. La lista sigue igual.

3.Pasamos al siguiente numero: 13. Como 13 es menor que todos los numeros antes de el, lo movemos al principio de la lista. Nuestra lista ahora se ve asi: 13 20 50 84 22 16 89 85

4.Pasamos al siguiente numero: 22. 22 es mayor que 13 pero menor que 20, 50 y 84, por lo que lo insertamos despues de 13. Nuestra lista ahora se ve asi: 13 22 20 50 84 16 89 85

5.Pasamos al siguiente número: 16. 16 es mayor que 13 pero menor que 20, 22, 50 y 84, por lo que lo insertamos después de 13. Nuestra lista ahora se ve así: 13 16 20 22 50 84 89 85

6.Pasamos al siguiente número: 89. Como 89 es mayor que todos los números antes de él, lo dejamos donde está. La lista sigue igual: 13 16 20 22 50 84 89 85

7.Pasamos al último número: 85. 85 es mayor que 13, 16, 20, 22, 50 y 84 pero menor que 89, por lo que lo insertamos antes de 89. Nuestra lista ahora se ve así: 13 16 20 22 50 84 85 89


5) Dadas dos funciones y su número de operaciones:
A = 1024n
B = 16n^3
Calcular a partir de qué tamaño de entrada n A es más eficiente que B.

1024n < 16n^3
64 < n^2
n > 8

Para n>8 la funcion de A es mas eficiente que B




Preguntas:
a) ¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programa
como considere conveniente. Explique su solución de manera concisa.
b) Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando

a)El codigo proporcionado no compila debido a un error de tipo de datos. La funcion recursive está diseñada para devolver un int, pero la operacion de potenciacion puede resultar en un numero decimal cuando el exponente es negativo. En este caso, recursive(1, -2) deberia devolver 1.0, pero como la funcion está configurada para devolver un int, esto causa un error de compilacion.
Para solucionar este problema, he cambiado el tipo de a y el tipo de retorno de la funcion recursive a double para permitir calculos con numeros decimales. Ahora, recursive(1, -2) devuelve 1.0, que es el resultado correcto de 1^(-2).









