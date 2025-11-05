# 🏦 Práctica POO - Diseño y POO

[cite_start]Este repositorio contiene la solución a la Práctica de Programación Orientada a Objetos (POO) de la experiencia educativa "Diseño y POO" de la carrera de Ingeniería de Software[cite: 1, 2, 3].

---

## 1. Ejercicio 1a: La Clase `Cuenta`

[cite_start]El objetivo es diseñar e implementar una clase Java llamada `Cuenta`[cite: 4].

### 1.1. Campos de Datos (Privados)

[cite_start]La clase debe contener los siguientes campos de datos privados[cite: 4]:

* [cite_start]**`int id`**: Identificación de la cuenta (predeterminado 0)[cite: 5].
* [cite_start]**`double balance`**: Saldo de la cuenta (predeterminado 0)[cite: 6].
* [cite_start]**`double annualInterestRate`**: Tasa de interés anual (0 por defecto)[cite: 7]. [cite_start]Se debe asumir que todas las cuentas tienen la misma tasa de interés[cite: 8].
* [cite_start]**`Date dateCreated`**: Almacena la fecha en que se creó la cuenta[cite: 9].

### 1.2. Métodos Requeridos

La clase `Cuenta` debe implementar los siguientes métodos:

* **Constructores:**
    * [cite_start]Uno sin argumentos, que crea una cuenta predeterminada[cite: 10].
    * [cite_start]Uno que crea una cuenta con la identificación (`id`) y el saldo inicial (`balance`) especificados[cite: 11].
* [cite_start]**Métodos de Acceso y Mutación (Getters/Setters):** Para los campos `id`, `balance` y `annualInterestRate`[cite: 12].
* [cite_start]**Método de Acceso (Getter):** Para el campo `dateCreated`[cite: 13].
* [cite_start]**`getMonthlyInterestRate()`**: Devuelve la tasa de interés mensual[cite: 14].
    * [cite_start]*(Sugerencia: La tasa de interés mensual es la tasa de interés anual dividida entre 12. Recuerde dividir la tasa anual entre 100, ya que es un porcentaje, por ejemplo, 4.5%)[cite: 20, 21].*
* [cite_start]**`getMonthlyInterest()`**: Devuelve el interés mensual[cite: 15].
    * [cite_start]*(Sugerencia: El interés mensual es `balance` * `monthlyInterestRate`)[cite: 19, 20].*
* [cite_start]**`withdraw(amount)`**: Retira una cantidad específica de la cuenta[cite: 16].
* [cite_start]**`deposit(amount)`**: Deposita una cantidad específica en la cuenta[cite: 17].

### 1.3. Programa de Prueba

[cite_start]Se requiere un programa de prueba que realice las siguientes operaciones[cite: 22]:

1.  Crear un objeto `Cuenta` con Id. [cite_start]`1122`, un `balance` de **\$20,000** y una tasa de interés anual del **4.5%**[cite: 23].
2.  [cite_start]Usar el método `withdraw` para retirar **\$2,500**[cite: 24].
3.  [cite_start]Usar el método `deposit` para depositar **\$3,000**[cite: 24].
4.  [cite_start]Imprimir el saldo, el interés mensual y la fecha de creación de esta cuenta[cite: 24].

---

## 2. Ejercicio 1b: Simulación de Cajero Automático (ATM)

[cite_start]Este ejercicio consiste en utilizar la clase `Cuenta` creada en el Ejercicio 1a para simular el funcionamiento de un Cajero Automático (ATM)[cite: 30, 31].

### 2.1. Requisitos del Sistema

* [cite_start]**Cuentas Iniciales:** Crear **10 cuentas** en una matriz con IDs del `0` al `9`[cite: 32].
* [cite_start]**Saldo Inicial:** Todas las cuentas deben tener un saldo inicial de **\$100**[cite: 32].
* **Validación de ID:** El sistema solicita al usuario que ingrese una identificación. [cite_start]Si la ID es incorrecta, solicita una identificación correcta hasta que se ingrese una válida[cite: 33].
* [cite_start]**Menú Principal:** Una vez que se acepta una identificación, se muestra el menú principal[cite: 34]:
    1.  [cite_start]Consultar saldo[cite: 35].
    2.  [cite_start]Retirar dinero[cite: 35].
    3.  [cite_start]Depositar dinero[cite: 35].
    4.  [cite_start]Salir del menú principal[cite: 35].
* [cite_start]**Ciclo Continuo:** Al seleccionar la opción **4 (Salir)**, el sistema volverá a solicitar una identificación, manteniendo el sistema en ejecución constante[cite: 36, 37].

### 2.2. Ejecución de Muestra

La ejecución debe reflejar el siguiente flujo de comandos y salidas (ver la imagen):

| Acción | Entrada | Salida/Resultado |
| :--- | :--- | :--- |
| **Ingreso de ID** | [cite_start]`4` [cite: 42] | [cite_start]Muestra Menú Principal [cite: 43] |
| **Opción 1 (Consultar)** | [cite_start]`1` [cite: 46] | [cite_start]El saldo es `100.0` [cite: 46] |
| **Opción 2 (Retirar)** | [cite_start]`2` [cite: 50] [cite_start]/ Cantidad: `3` [cite: 51] | [cite_start]El saldo es `97.0` (tras consultar con opción 1) [cite: 54] |
| **Opción 3 (Depositar)** | [cite_start]`3` [cite: 59] [cite_start]/ Cantidad: `10` [cite: 68] | [cite_start]El saldo es `107.0` (tras consultar con opción 1) [cite: 74] |
| **Opción 4 (Salir)** | [cite_start]`4` [cite: 79] | [cite_start]El sistema vuelve a solicitar una identificación [cite: 80] |

---

## ℹ️ Información Adicional

* [cite_start]**Experiencia Educativa (EE):** Diseño y POO [cite: 2, 28, 60]
* [cite_start]**Carrera:** Ingeniería de Software [cite: 3, 29, 61]
* [cite_start]**Institución:** Facultad de Contaduría y Administración, Universidad Veracruzana [cite: 25, 26, 38, 39, 83, 84]
* [cite_start]**Período:** Agosto 2025 - Enero 2026 [cite: 26, 40, 84]
