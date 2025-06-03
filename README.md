# 💱 Conversor de Monedas en Java

Este proyecto es una aplicación de consola escrita en Java que permite convertir montos entre distintas monedas utilizando una API de tipo de cambio en tiempo real. Es ideal para quienes desean una forma rápida y sencilla de realizar conversiones de divisas desde la terminal.

## 📸 Capturas de pantalla

### Menú principal  
(https://github.com/user-attachments/assets/56b72d81-8b39-44c0-af4b-73cabd0f4f2a)


### Ejemplo de conversión (USD a COP)  
(https://github.com/user-attachments/assets/ea13586c-2afa-409f-b520-202e3f708a3b)


### Opción de salir  
(https://github.com/user-attachments/assets/af447c2b-dd19-43e2-999d-5a8920cf9883)


## ⚙️ Funcionalidades

- Menú interactivo en consola.
- Conversión en tiempo real usando la API de ExchangeRate-API.
- Opciones disponibles:
  - USD ⇨ ARS
  - ARS ⇨ USD
  - USD ⇨ BRL
  - BRL ⇨ USD
  - USD ⇨ COP
  - COP ⇨ USD
- Salida limpia y clara con valores convertidos.
- Manejo de errores básico.

## 🔗 API Utilizada

- [ExchangeRate-API](https://www.exchangerate-api.com/)  
  Utilizada para obtener los tipos de cambio actualizados de manera sencilla con solicitudes HTTP.

## 📦 Requisitos

- Java 11 o superior.
- Acceso a internet.
- Biblioteca [Gson](https://github.com/google/gson) para la deserialización del JSON.

## ▶️ Ejecución

1. Clona este repositorio o descarga el código fuente.
2. Asegúrate de tener configurado `Gson` en tu proyecto.
3. Compila y ejecuta el programa desde tu IDE o terminal.

```bash
javac Main.java ApiConversor.java RespuestaApi.java
java Main
```

## 📁 Estructura del proyecto

```bash
📂 src
├── Main.java
├── ApiConversor.java
└── RespuestaApi.java
```

## 💡 Ejemplo de uso

```
Seleccione una conversión a realizar:
5
Ingrese el valor de la moneda(USD):
5

Valor: $1 (USD)
Equivalencia: $4137 (COP)
$5.0 (USD) = $20687 (COP)
```

## 🧑‍💻 Autor

- **Arkzado** – Desarrollador del proyecto.
