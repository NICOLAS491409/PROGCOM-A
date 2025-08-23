import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// ===== Ejercicio 1 =====
System.out.print("Ingrese un número: ");
int num = sc.nextInt();
if(num >= 0){
System.out.println("El número es positivo");
} else {
System.out.println("El número es negativo");
}
// Se pide un número y se verifica si es positivo o negativo con un if
// ===== Ejercicio 2 =====
System.out.print("\nIngrese su edad: ");
int edad = sc.nextInt();
if(edad >= 18){
System.out.println("Es mayor de edad");
} else {
System.out.println("Es menor de edad");
}
// Se pide la edad y se evalúa si es mayor o menor de edad (condición >
// ===== Ejercicio 3 =====
System.out.print("\nIngrese el primer número: ");
int a = sc.nextInt();
System.out.print("Ingrese el segundo número: ");
int b = sc.nextInt();
if(a > b){
System.out.println("El mayor es: " + a);
} else if(a < b){
System.out.println("El mayor es: " + b);
} else {
System.out.println("Son iguales");
}
// Se ingresan dos números y se determina cuál es mayor o si son iguales
// ===== Ejercicio 4 =====
System.out.print("\nIngrese calificación (0-100): ");
int nota = sc.nextInt();
if(nota >= 60){
System.out.println("Aprobado");
} else {
System.out.println("Reprobado");
}
// Se ingresa una nota y se determina si está aprobada (>= 60) o reprobada
// ===== Ejercicio 5 =====
System.out.print("\nIngrese un número: ");
int num2 = sc.nextInt();
if(num2 % 2 == 0){
System.out.println("Es par");
} else {
System.out.println("Es impar");
}
// Se ingresa un número y se verifica si es par o impar con el operador %
// ===== Ejercicio 6 =====
System.out.print("\nIngrese tres números: ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
int max = n1;
if(n2 > max){
max = n2;
}
if(n3 > max){
max = n3;
}
System.out.println("El mayor es: " + max);
// Se ingresan tres números y se busca el mayor comparándolos con if
// ===== Ejercicio 7 =====
System.out.print("\nIngrese un año: ");
int anio = sc.nextInt();
if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
System.out.println("Es bisiesto");
} else {
System.out.println("No es bisiesto");
}
// Se ingresa un año y se determina si es bisiesto con la regla:
// divisible entre 4 pero no entre 100, o divisible entre 400
// ===== Ejercicio 8 =====
System.out.print("\nIngrese una contraseña: ");
sc.nextLine(); // limpiar buffer
String pass = sc.nextLine();
boolean largo = pass.length() > 8;
boolean tieneNum = pass.matches(".*\\d.*");
boolean tieneMayus = pass.matches(".*[A-Z].*");
if(largo && tieneNum && tieneMayus){
System.out.println("Contraseña válida");
} else {
System.out.println("Contraseña inválida");
}
// Se ingresa una contraseña y se valida si:
// - tiene más de 8 caracteres
// - contiene al menos un número
// - contiene al menos una mayúscula
// ===== Ejercicio 9 =====
System.out.print("\nIngrese un número: ");
int fizz = sc.nextInt();
if(fizz % 3 == 0 && fizz % 5 == 0){
System.out.println("FizzBuzz");
} else if(fizz % 3 == 0){
System.out.println("Fizz");
} else if(fizz % 5 == 0){
System.out.println("Buzz");
} else {
System.out.println(fizz);
}
// Se pide un número y se aplica el juego "FizzBuzz":
// múltiplo de 3 → Fizz, múltiplo de 5 → Buzz, de ambos → FizzBuzz
// ===== Ejercicio 10 =====
int saldo = 1000; // saldo fijo
System.out.print("\nIngrese monto a retirar: ");
int retiro = sc.nextInt();
if(retiro <= saldo){
System.out.println("Retiro exitoso. Saldo restante: " + (saldo - retiro));
} else {
System.out.println("Fondos insuficientes");
}
sc.close();
// Se simula un cajero con un saldo fijo de 1000
// Si el retiro es menor o igual al saldo, se descuenta; de lo contrario, fondos insuficientes
}
}