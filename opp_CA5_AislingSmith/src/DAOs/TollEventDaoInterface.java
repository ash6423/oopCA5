/**                                               Feb 2019          
 * UserDaoInterface
 * 
 * Declares the methods that all UserDAO types must implement,
 * be they MySql User DAOs or Oracle User DAOs etc...
 * 
 * Classes from the Business Layer (users of this DAO interface)
 * should use reference variables of this interface type to avoid 
 * dependencies on the underlying concrete classes (e.g. MySqlUserDao).
 * 
 * More sophistocated implementations will use a factory
 * method to instantiate the appropriate DAO concrete classes
 * by reading database configuration information from a 
 * configuration file (that can be changed without altering source code)
 * 
 * Interfaces are also useful when testing, as concrete classes
 * can be replaced by mock DAO objects.
 */
package DAOs;

import DTOs.TollEvent;
import Exceptions.DaoException;
import java.util.List;

public interface TollEventDaoInterface 
{
    
    public List<TollEvent> findAllTollEvents() throws DaoException;
    public TollEvent findTollEventByRegistration(String reg) throws DaoException;
    public List<TollEvent> findTollEventBySpecificDate(String dateTime) throws DaoException;
   // public List<TollEvent> findTollEventByStartAndEndDate(String dateTime1, String dateTime2) throws DaoException;
  
    
}
