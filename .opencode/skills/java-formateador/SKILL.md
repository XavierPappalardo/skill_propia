# java-formateador

## Descripción
Esta skill tiene como objetivo obligar a cualquier agente que desarrolle código Java dentro de este proyecto a seguir estrictamente el formato definido a continuación. Cuando generes, edites o reescribas archivos .java, DEBES aplicar todas estas reglas sin excepción.

## Reglas obligatorias
### 1. Salto de línea
- Debes dejar un salto de línea luego de cada línea de código.

### 2. Comentarios
- Antes de cada bloque de código (métodos, bucles, condicionales, series de instrucciones, instanciación de clases, asignación de valores, llamadas a métodos, etc.) debes incluir un comentario en español que explique brevemente lo que se va a hacer.
- Los comentarios deben comenzar con mayúscula y respetar las tildes del castellano.
- Si el comentario incluye paréntesis, debe haber un espacio antes de abrir ( y la primera letra que esté dentro del paréntesis debe ser mayúscula.

### 3. Espaciado entre operadores
- Dentro del código, debe existir un espacio antes y después de los siguientes operadores binarios: +, ++, -, *, **, %%, &&, =, ==.
- **Excepción obligatoria:** NO apliques esta regla cuando el signo - se utiliza para indicar un número negativo (unario). Ejemplo: mascota.setEdad(-5); debe mantenerse tal cual.
- Esta regla solo aplica a operadores. No debe aplicarse a comentarios ni a cadenas de caracteres.

### 4. Comas
- Tanto en código, como en comentarios y en cadenas de caracteres, siempre debe haber un espacio después de cada coma ,.

### 5. Otras indicaciones
- Respeta exactamente la indentación con 4 espacios por nivel, tal como se ve en el ejemplo.
- Usa nombres claros y mantén el estilo mostrado.
- No añadas comentarios innecesarios fuera de lo que justifique cada bloque.
- No elimines ni modifiques este formato al editar código existente, a menos que el usuario te indique lo contrario.

## Caso de referencia
`java
package Ejercicio_02;

public class Main {

    // Método main

    public static void main(String[] args) {

        // Instanciamos Mascota

        Mascota mascota = new Mascota();

        // Asignamos valores inválidos

        mascota.setNombre(null);

        mascota.setEspecie(null);

        mascota.setEdad(-5);

        // Empleamos el método mostrarInfo (No devolverá nada debido a los valores inválidos)

        mascota.mostrarInfo(mascota.getNombre(), mascota.getEspecie(), mascota.getEdad());

        // Asignamos valores válidos

        mascota.setNombre("Pepe");

        mascota.setEspecie("Perro");

        mascota.setEdad(3);

        // Empleamos mostrarInfo (Ahora con valores válidos)

        mascota.mostrarInfo(mascota.getNombre(), mascota.getEspecie(), mascota.getEdad());

        // Hacemos a la mascota cumplir años 4 veces con cumplirAnios

        for (int i = 0; i < 4; i++) {

            mascota.cumplirAnios(mascota.getEdad());

        }

        // Volvemos a mostrar la información de la mascota

        mascota.mostrarInfo(mascota.getNombre(), mascota.getEspecie(), mascota.getEdad());

    }

}
`

## Uso
Esta skill se aplicará automáticamente siempre que trabajes con archivos .java en este proyecto. Debes seguir estas reglas en todo código Java que generes, modifiques o completes.
