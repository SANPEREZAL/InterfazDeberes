En la interfaz deberes, lo único que se hace es mostrar los objetos estudiante y profesor con sus respectivos atributos, para luego guardarlos en el archivo
![image](https://github.com/user-attachments/assets/e62622ad-f27b-4ec0-85e4-cd091ed96425)
La clase abstracta persona que implementa de deberes, simplemente nos funcionará como plantilla para las dos siguientes clases (estudiante, profesor) en la que definimos dos atributos básicos que tendrian en comun estos dos objetos (nombre, edad)
![image](https://github.com/user-attachments/assets/ad248ab3-a733-4751-92e0-bf01ff8efd18)
Para nuestra clase estudiante, importamos las librerias FileOutputSream y ObjectOutputStream para escribir en archivos los objetos como bytes (serializacion). En esta clase simplemente se hereda de la clase abstracta persona, pero se le agrega el atributo "carrera", asi luego de crear el objeto estudiante, se llama al metodo guardar() para luego ser guardado en estudiantes.txt
![image](https://github.com/user-attachments/assets/08645741-999e-4ca0-8963-50bc2796bf61)
La clase profesor es básicamente la misma que Estudiante, pero en esta el atributo extra no es el mismo, es "asignatura", y de la misma forma, implementa su propia version de los métodos de la interfaz deberes, para asi luego guardar nuestro objeto en un archivo llamado "profesores.txt"
![image](https://github.com/user-attachments/assets/fb2ff2fd-8447-409d-9082-7acb752c319b)
La clase main simplemente crea los objetos Estudiante y Profesor y llama sus respectivos métodos
![image](https://github.com/user-attachments/assets/0d3a50df-7a50-4a2a-b36f-edf666efde28)


