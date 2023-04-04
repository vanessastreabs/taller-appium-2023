<div align="center">
<span style="font-family: 'Sora', sans-serif; font-size: 3em;">Taller Mobile Automation</span>
<br></br>
  <a href="appium.io" target="_blank" rel="noopener noreferrer">
    <img width="240" src="https://www.perfecto.io/sites/default/files/image/2020-03/Appium%20logo.png" alt="Appium logo">
  </a>
</div>
<br/>
<span style="font-family: 'Sora', sans-serif; font-size: 1em;">

Este proyecto presenta la automatización de un caso de prueba que agrega productos al carrito de una aplicación de prueba llamada General Store.


🔴El repositorio contiene dos ramas:

- 1️⃣base - Esta rama contiene la estructura del proyecto y es la que nos clonaremos para comenzar con el taller.
- 2️⃣solución - Es el proyecto terminado, cuenta con comentarios que explican los distintos métodos utilizados.

# Estructura 

## 📑pom.xml
Este es un archivo de Maven que contiene todas las dependencias utilizadas en el proyecto


## 📁pages/
Esta carpeta organiza el framework implementando el patrón de diseño Page Object Model
Contiene los siguientes archivos:

* 📑BasePage.java: Define métodos básicos que van a heredar el resto de páginas
* 📑CartPage.java: Define los elementos y métodos correspondientes a la página del carrito
* 📑HomePage.java: Define los elementos y métodos correspondientes a la página principal de la aplicación
* 📑ProductsPage.java: Define los elementos y métodos correspondientes a la página de productos


## 📁tests/
Esta carpeta contiene los archivos test

* 📑TestBase.java: Contiene la configuración de Appium, del dispositivo y de la aplicación, además del proceso de teardown


## 📁resources/
Esta carpeta contiene el archivo .apk
</span>

## 🔎capabilities para Appium Inspector

```
{
  "appium:deviceName": "Pixel_4_API_30",
  "platformName": "android",
  "appium:app": "C:\\Users\\{Usuario}\\taller2023\\taller-appium-2023\\src\\test\\java\\resources\\General-Store.apk",
  "appium:automationName": "UiAutomator2"
}