# Calculadora
Calculadora de suma y restas montada en SpringBoot y MAVEN.
Las pruebas se pueden revisar en postman


INSTALACION

Git clone https://github.com/Asthalor/Calculadora.git
Entra en la carpeta del proyecto y compilalo con mvn clean install
Para lanzar el microservicio ejecuta mvn spring-boot:run

Una vez lanzado el microservicio se podrá acceder al API accediendo a la siguiente URL desde el POSTMAN:

http://localhost:8080/api/calculator

Opciones: 

firstNumber y secondNumber serán los numeros utilizados para hacer las cuentas.
operation: addition / subtraction para la suma / resta respectivamente.

Ejemplo:
GET http://localhost:8080/api/calculator?firstNumber=10&secondNumber=20&operation=addition
