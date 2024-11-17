# Calculadora V2 - Aplicación de una Calculadora Gráfica - Desarrollo de Interfaces 2º DAM

Esta aplicación es una calculadora gráfica desarrollada en Java, diseñada para realizar operaciones matemáticas básicas y avanzadas. Incluye una funcionalidad de historial que permite guardar y cargar cálculos realizados. El programa tiene una interfaz gráfica intuitiva y está orientado tanto a usuarios registrados como invitados.

## Características

1. **Ventana principal:**
   - Login sencillo con opción de entrar como invitado o cargar un historial existente.
   
2. **Calculadora funcional:**
   - Botones para números del 0 al 9.
   - Soporte para operaciones con decimales utilizando el punto (`.`).
   - Operaciones básicas:
     - Suma (`+`)
     - Resta (`-`)
     - Multiplicación (`*`)
     - División (`/`)
   - Operaciones avanzadas (no requieren presionar `=`):
     - Elevado al cuadrado.
     - Raíz cuadrada.
     - Función recíproca.

3. **Historial de cálculos:**
   - Registra cada operación realizada.
   - Permite guardar o cargar historiales en archivos.
   - Modo invitado: No guarda automáticamente el historial, pero ofrece la opción al salir.

4. **Interfaz gráfica amigable:**
   - Diseño simple y accesible.
   - Navegación intuitiva entre las opciones.

## Requisitos del Sistema

- Java 8 o superior.
- NetBeans IDE (opcional, pero recomendado para modificar el proyecto).
- Sistema operativo Windows, macOS o Linux.


1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/LuiisCarlos/calculadora.git
   ```

## Uso

1. **Abrir la aplicación:**
   - Inicia el programa. Aparecerá una ventana de login simple.

2. **Elegir un modo:**
   - **Cargar historial**: Si ya tienes un historial guardado, selecciona esta opción para cargarlo.
   - **Entrar como invitado**: Accede sin necesidad de historial. El historial no se guardará automáticamente, pero se te dará la opción de hacerlo al cerrar sesión.

3. **Usar la calculadora:**
   - Realiza operaciones básicas y avanzadas:
     - **Básicas**: Introduce los números y selecciona `+`, `-`, `*` o `/`, luego presiona `=`.
     - **Avanzadas**: Presiona directamente los botones para elevar al cuadrado, calcular la raíz cuadrada o la función recíproca.
   - Usa el punto (`.`) para números decimales.

4. **Gestionar el historial:**
   - Cada operación se guarda en el historial (excepto en modo invitado).
   - Puedes guardar el historial en un archivo o cargar uno existente desde el menú.

5. **Cerrar sesión:**
   - Sal del programa. Si estás en modo invitado, se te preguntará si deseas guardar el historial antes de salir.

## Autor
  * Luis Carlos Caicedo Giraldo - Estudiante 2º DAM

