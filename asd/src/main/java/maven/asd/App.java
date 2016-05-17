package maven.asd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Employee;




public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
 //getting entity manager factory instance using persistance object
        
    	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        
    	// getting entity manager instance using managerfactory object
        EntityManager entitymanager = emfactory.createEntityManager( );
        
        // getting transaction instance from entity manager and begin
        //transaction
        entitymanager.getTransaction( ).begin( );

        //creating entity object
        Employee employee = new Employee( ); 
        
        //not need to set id because it is auto generated using annotations 
        //employee.setEid( 1 );
        employee.setEname( "ashwin" );
        employee.setSalary( 40000 );
        
        //saving entity object in database
        entitymanager.persist( employee );
        
        //commiting transaction so that changes or insertion will 
        //reflect in database
        entitymanager.getTransaction( ).commit( );

        //closing entity manager
        entitymanager.close( );
        
        //closing entity manager factory
        emfactory.close( );
    }
}
