package hashMapObject;//created package as hashMapObject

/**
 * Creating a HashMap object in the Java Program and perform the following functionalities:
      Adding key-value pairs to the HashMap object
        Retrieving all the keys present in the HashMap.
          Retrieving all the values present in the HashMap.
            Making the HashMap as Synchronized.
 */
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.util.Collections;//java collection framework is a set of classes and interfaces that implement commonly reusable collection data structures
import java.util.HashMap;//hashmap contains values based on key
import java.util.Iterator;//iterator is an interface,used to iterator collection of objects
import java.util.Map;//map provides methods for storing values baes on key basis
import java.util.Set;//set is a collection that cannot contain duplicate elements

public class Examination { //Creating Class as Examination
	public static void main(String[] args) { // Main class
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		// Creating HashMap object
		HashMap<String, String> examination = new HashMap<String, String>();

		// Adding Key Value into the hashMap .
		examination.put("Subject1", "OOPS");//inserting 4 subjects  names
		examination.put("Subjec2", "Android");
		examination.put("Subject3", "Java");
		examination.put("Subject4", "Phython");

		System.out.println("HashMap:");//system is used to return code
        //out is a static number
        //println is used to print text and gives output
		for (Map.Entry<String, String> exam : examination.entrySet()) { //Prints all the elements in the hashMap
			System.out.println(exam.getKey() + " " + exam.getValue());//system is used to return code
	        //out is a static number
	        //println is used to print text and gives output
		}

		//Retrieving and prints all keys and values present in the hashMap table  
		System.out.println("\nAll  the keys and values present in the hashMap:");
		for (Map.Entry<String, String> exam1 : examination.entrySet()) {//for loop
			System.out.println("Key(" + exam1.getKey() + ")" + " " + "Value(" + exam1.getValue() + ")");//system is used to return code
	        //out is a static number
	        //println is used to print text and gives output
		}

        /*
         * We synchronized HashMap because it returns a thread-safe map 
             backed up by the specified HashMap.
         */
		Map<String, String> SyncMap = Collections.synchronizedMap(examination); //Creating a synchronized map Object 
		Set<java.util.Map.Entry<String, String>> set = SyncMap.entrySet();//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
		synchronized (SyncMap) { //Synchronizing HashMap 

          //Note: Iterator should be used in a synchronized block even if we have synchronized the HashMap explicitly
			Iterator<java.util.Map.Entry<String, String>> i = set.iterator();
			System.out.println("\nSyncronized HashMap:");//system is used to return code
	        //out is a static number
	        //println is used to print text and gives output
			
			while (i.hasNext()) {  //While Loop to print the elements of Synchronized HashMap
				java.util.Map.Entry<String, String> syncHash = i.next();//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
				System.out.println(syncHash.getKey() + " " + syncHash.getValue());//system is used to return code
		        //out is a static number
		        //println is used to print text and gives output

			}
		}
	}
}