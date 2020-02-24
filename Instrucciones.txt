Notas:
	Aquí se crean diferentes beans de objetos simples y objetos que hacen referencia a otros objetos.
	También se hacen inserciones en listas, mapas y sets.
	También hay código sobre properties
	También se habla sobre carga tardía o perezosa
		Con el fichero log4j.properties, podemos ver el modo debug de spring (lo he comentado todo porque escribia mierda en la consola)
	Si ponemos sobre esta linea "xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd" >"
		despues default-lazy-init="true" se crearán los objetos CUANDO INSTANCIEMOS LAS REFERENCIAS DE LOS MISMOS
	Con autowired se autoinyecta. 
		Byname, 
			<bean id="motorAutowired" class="com.openwebinars.spring.hellospring.Motor" autowire="byName">
			</bean>
			
			<bean id="bujia" class="com.openwebinars.spring.hellospring.Bujia">
				<property name="precio" value="1000000"></property>
			</bean>
			Aquí, al llamarse el segundo bean igual que el atributo bujia de la clase motor, se autoinyecta
			
			Se puede hacer también por tipo
				Pero si hay diferentes beans de tipo bujia, da excepción
	El ambito de un objeto es el tiempo de vida de un objeto:
		singleton (defecto): aunque creemos varias referencias de un bean y lo instanciemos varias veces, spring sólo genera una instancia
		prototype: scope = "prototype", cada vez que demandemos un bean de este tipo se cree una nueva instancia
	Mediante las interfaces InitializingBean,DisposableBean se pueden implementar los métodos para ejecutar código en las fases pre y post creación
	del bean de spring.
	Esto también se podría hacer mediante init-method y destroy-method
		
	
					
Instrucciones:
	Crear applicationContext.xml:
		BuildPath en source, add folder, marcamos main y pulsamos sobre create folder.
		La llamamos resources, apply y apply
		Dentro de resources, boton derecho y creamos nuevo paquete
		Ahora creamos el beans.xml (como el applicationContext.xml de toda la vida)
		Botón derecho y creamos spring bean configuration file
		
		