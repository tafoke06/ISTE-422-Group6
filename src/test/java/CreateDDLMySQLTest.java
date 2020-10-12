/*Name: Tariq Afoke
  Course: Iste 422
  Description: Test class for CreateDDLMySQL
 */
 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest{
	CreateDDLMySQL testObj;
   
   @Before
	public void setUp() throws Exception {
		testObj = new CreateDDLMySQL(EdgeTable[3], EdgeField[3]);
	}
   
//    @Test
// 	public void testCreateDDL(){
// 		testObj.createDDL());
// 	}
   
   @Test
	public void testConvertStrBoolenToInt() {
	   assertEquals("The strBooleanToInt should be 1", 1, testObj.convertStrBooleanToInt("True"));
   }
   
   @Test
	public void testGenerateDatabaseName(){
		System.out.println(testObj.generateDatabaseName());
	}
   
   @Test
	public void testGetDatabaseName(){
		System.out.println(testObj.getDatabaseName());
	}
   
   @Test
	public void testGetProductName(){
		System.out.println(testObj.getProductName());
	}
   
   @Test
	public void testGetSQLString(){
		System.out.println(testObj.getSQLString());
	}
