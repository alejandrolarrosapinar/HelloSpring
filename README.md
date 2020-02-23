# Descripción

Aquí se crean diferentes beans de objetos simples y objetos que hacen referencia a otros objetos.
También se hacen inserciones en listas, mapas y sets.
También hay código sobre properties
También se habla sobre carga tardía o perezosa
	Con el fichero log4j.properties, podemos ver el modo debug de spring
Si ponemos sobre esta linea "xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd" >"
	despues default-lazy-init="true" se crearán los objetos CUANDO INSTANCIEMOS LAS REFERENCIAS DE LOS MISMOS

## Crear applicationContext.xml:
	BuildPath en source, add folder, marcamos main y pulsamos sobre create folder.
	La llamamos resources, apply y apply
	Dentro de resources, boton derecho y creamos nuevo paquete
	Ahora creamos el beans.xml (como el applicationContext.xml de toda la vida)
	Botón derecho y creamos spring bean configuration file
	
