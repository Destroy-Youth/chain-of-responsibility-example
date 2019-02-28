# chain-of-responsibility-example
Ejemplo de patrón de diseño usando Java


Los manejadores son literalmente encadenados de manera secuencial para pasarse entre ellos la petición, decidiendo si
son capaces de procesar la petición o es necesario pasarlo al siquiente eslavón. También puede ser usado en el escenario 
de que se necesite validar/procesar la petición de distintas maneras manteniendo un nivel bajo de cohesión entre los
validadores y cumpliendo el principio de single responsability además de crear un código mantenible y escalable.

![alt text](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-en.png)

No es estrictamente necesario que la petición pase por cada eslavón ni que la cadena sea lineal, ya que también puede 
manejar una estructura similar a un árbol de de decisión. Según se adapte a las necesidades la cadena tendrá distintos comportamientos

![alt text](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution2-en.png)

Este patrón de diseño maneja eventos o peticiones y sus respectivos manejadores como objetos, por lo que 
al momento de pasar de un eslavón a otro debe ser indiferente usar concreciones para cada tipo de validación/procesamiento.

![alt text](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png)
