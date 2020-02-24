package com.openwebinars.spring.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");
        Mundo m =(Mundo) appContext.getBean("mundo");
        
        System.out.println(m.getMensaje());
        
        Mundo mConstructor =(Mundo) appContext.getBean("mundoConstructor");
        
        System.out.println(mConstructor.getMensaje());
        //objetos complejos (objeto con mas objetos)
        Vehiculo vehiculo = (Vehiculo) appContext.getBean("vehiculo");
        System.out.println(vehiculo);
        
        Vehiculo vehiculoConstructor = (Vehiculo) appContext.getBean("vehiculoConstructor");
        System.out.println(vehiculoConstructor);
        
        Vehiculo vehiculoAnidado = (Vehiculo) appContext.getBean("vehiculoAnidado");
        System.out.println(vehiculoAnidado);
        
        Motor motorListaBujias = (Motor) appContext.getBean("motorListaBujias");
        System.out.println(motorListaBujias);
        
        Motor motorMapaBujias = (Motor) appContext.getBean("motorMapaBujias");
        System.out.println(motorMapaBujias);
        
        Motor motorSetBujias = (Motor) appContext.getBean("motorSetBujias");
        System.out.println(motorSetBujias);
        
        //Esta comentado para probar el lazy-init=true
        /*Motor motorProperties = (Motor) appContext.getBean("motorProperties");
        System.out.println(motorProperties.getProperties().get("prop1"));*/
        
        //Autowired
        Motor motorAutowired = (Motor)  appContext.getBean("motorAutowired");
        System.out.println(motorAutowired);
        
        //Ambito 
        Mundo mundoSingleton = (Mundo)  appContext.getBean("mundoSingleton");
        Mundo mundoSingleton2 = (Mundo)  appContext.getBean("mundoSingleton");
        System.out.println("mundoSingleton->" +mundoSingleton);
        System.out.println("mundoSingleton2->" +mundoSingleton2);
        
        //Ciclo de vida de bean
        Saludo saludo= (Saludo)  appContext.getBean("saludoBean");
        System.out.println("Saludo vale:"+saludo);
        
        Saludo saludoBeanAnotaciones= (Saludo)  appContext.getBean("saludoBeanAnotaciones");
        System.out.println("SaludoBeanAnotaciones vale:"+saludoBeanAnotaciones );
        
        
        
        //Cuando finalice el flujo de la aplicacion, cerramos el contenedor
        ((ConfigurableApplicationContext) appContext).close();
    }
}
