package MapsHW;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class: Maps
 * @author CSSE Faculty
 * Purpose: provide practice with the HashMap data structure
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 */
public class Maps {
	
	/**
	 * Given two arrays this operation builds and returns a new HashMap that 
	 * contains a mapping from String (hashmap's key) to Integer (hashmap's value)
	 * 
	 * @param airportCodes an array of String containing 3-letter airport codes
	 * @param airportElevations an array of Integer containing each airport's elevation in meters
	 * @return a HashMap containing a mapping from each airport code to its elevation
	 * requires: no duplicate airport codes are contained in array airportCodes - that is, you can program this operation
	 *           assuming that the caller will make sure there are no duplicates in airportCodes array
	 * example: 
	 *    input airportCodes = ["CDG", "FOC", "IND"]
	 *    input airportElevations = [118, 14, 230]
	 *    return value = {CDG=118, FOC=14, IND=230}
	 */
	public static HashMap<String, Integer> buildAirportMap(String[] airportCodes, Integer[] airportElevations) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // buildAirportMap
	
	
	/**
	 * Given a single input string in inputString, this operation returns the character 
	 * from inputString that appears the most number of times
	 * 
	 * Your solution must use a HashMap; you cannot use nested for-loops to solve this problem.
	 * When you use a HashMap you are permitted to use 1 for loop.
	 *
	 * @param inputString - string of characters for determining the most common character 
	 * @return most common character that appeared in inputString
	 * requires: inputString will not be empty and there will be 1 character that appears more than all the others
	 *           That is, you can program this operation assuming that the caller will make sure that inputString.length() > 0
	 *           and that there will be only 1 character that "wins"
	 *  
	 * example 1:
	 *    input inputString = "aaab"
	 *    return value = 'a'
	 *    
	 * example 2:
	 *    input inputString = "abcbcdc"
	 *    return value = 'c'
	 */
	public static char mostCommonCharacter(String inputString) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // mostCommonCharacter	
	
	
	/**
	 * In a particular school (not Rose-Hulman) each course can only have 1 pre-requisite course.
	 *  
	 * These pre-req courses are represented by a mapping from courseName to preReqCourseName, for example:
	 * 
	 * {"CS120"="","CS220"="CS120","CS230"="CS220","MA100"="MA102","MA102"="MA100"}
	 * 
	 * Note that if a course has no pre-req, the preReqCourseName is represented by the empty string ""
	 * 
	 * So in example above, CS120 has no prereq course.
	 *                      CS220 has a prereq of 120
	 *                      CS230 has a prereq of 220
	 *                      MA100 has a prereq of MA102
	 *                      MA102 has a prereq of MA100
	 *                     
	 * Your job is to write an operation that calculates and returns the number of preReqCourses 
	 * that must be taken prior to taking a specific courseToTake.
	 * 
	 * @param courseMap a mapping from courseName to preReqCourseName
	 * @param courseToTake the name of the course that needs its prereqs counted up
	 * @return number of prereq courses required to take before taking courseToTake
	 *         or -1 if the courseToTake's prereq courses ends up including itself (see example 4 below)
	 * 
	 * example 1:
	 *    input courseMap = {"CS120"="","CS220"="CS120","CS230"="CS220","MA100"="MA102","MA102"="MA100"}
	 *    input courseToTake = "CS120"
	 *    return value = 0
	 *    
	 * example 2:
	 *    input courseMap = {"CS120"="","CS220"="CS120","CS230"="CS220","MA100"="MA102","MA102"="MA100"}
	 *    input courseToTake = "CS220"
	 *    return value = 1
	 *    
	 * example 3:
	 *    input courseMap = {"CS120"="","CS220"="CS120","CS230"="CS220","MA100"="MA102","MA102"="MA100"}
	 *    input courseToTake = "CS230"
	 *    return value = 2
	 *    
	 * example 4:
	 *    input courseMap = {"CS120"="","CS220"="CS120","CS230"="CS220","MA100"="MA102","MA102"="MA100"}
	 *    input courseToTake = "MA102"
	 *    return value = -1
	 *    "MA102" are in a prereq infinite loop, that is, by following prereqs of "MA102", one can eventually get back to "MA102"
	 */
	public static int getNumberOfCoursesToTake(HashMap<String, String> courseMap, String courseToTake) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // getNumberOfCoursesToTake
	
	
	/**
	 * During a heat wave, any sign of lower temperatures becomes breaking news.  
	 * This operation takes an array of temperatures and a corresponding array of the city names
	 * giving the location where each temperature reading was recorded.  
	 * 
	 * The operation returns the name of a city that experienced a temperature drop.  
	 * If no city experienced a drop, the operation should return null.	 
	 * 
	 * You must use a HashMap to solve this problem.
	 * 
	 * @param recordedTemps the temperatures recorded in time order
	 * @param cities names of the cities where each temperature was recorded
	 * @return city name that had a temperature drop or null if no temperature drop in any city
	 * requires: only 1 city will experience a temperature drop - that is, you can program this operation
	 *           assuming that the caller will make sure that only one city experiences a temperature drop
	 * 
	 * example 1:
	 *    input recordedTemps = [90, 100, 90, 99]
	 *    input cityNames = ["Seattle", "LA", "Seattle", "LA"]
	 *    return value = "LA", because 100 to 99 was a drop.
	 * 
	 * example 2:
	 *    input recordedTemps = [91, 92, 80, 93, 100, 83, 93, 82, 105, 85]
	 *    input cityNames = ["Terre Haute", "Terre Haute", "Seattle", "Terre Haute", "LA", "Seattle", "Terre Haute", "Seattle", "LA", "Seattle"]
	 *    return value = "Seattle", because 83 to 82 was a drop
	 * 
	 * example 3:
	 *    input recordedTemps = [91, 92, 80]
	 *    input cityNames = ["Terre Haute", "Terre Haute", "Seattle"]
	 *    return value = null, because no city experienced a temperature drop
	 */
	public static String getTemperatureDropCity(int[] recordedTemps, String[] cityNames) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // getTemperatureDropCity
	

	/**
	 * Given two parallel String arrays:
	 * one of names and the other of cities these names have visited, this operation
	 * is to return the list of names that have "visited" any city more than once.  That is, 
	 * return an ArrayList containing the names that correspond to any city more than 
	 * once.
	 * 
	 * Even if a name appears with a city many times (more than twice), the name should
	 * only appear in the returned list once.
	 * 
	 * The final names in the ArrayList may appear in any order (but should not be repeated)
	 * 
	 * The two arrays names and citiesVisited will always be the same length
	 * 
	 * HINT: You will wish to utilize a HashMap to track what names have visited what cities
	 * (that is PLURAL cities)
	 * 
	 * HINT: The ArrayList "contains" method will be VERY useful for this problem.
	 * 
	 * Examples:
	 * (1)
	 * names =         ["Bill",    "Jan",   "Jon", "Bill",   "Jon", "Jon", "Jon",     "Bill"]
	 * citiesVisited = ["Chicago", "Philly", "LA", "Philly", "LA",  "LA",  "Chicago", "Philly"]
	 * (index 0 means "Bill visited Chicago")
	 * 
	 * Return list -> ["Jon", "Bill"]  because Jon visited Chicago more than once
	 *                                 and Bill visited Philly more than once
	 *                            
	 * (2)                           
	 * names =         ["A", "A", "A", "B", "B", "B", "C"]
	 * citiesVisited = ["1", "2", "3", "1", "2", "1", "1"]
	 * 
	 * Return list ->["B"]  because B visited 1 more than once
	 * 
	 * 
	 * (3)
	 * names =         ["A", "A", "A", "B", "B", "B", "C"]
	 * citiesVisited = ["1", "2", "3", "1", "2", "3", "1"]
	 * 
	 * Return list ->[]  empty list because there are no names that visited the same city twice
	 * 
	 * 
	 * @param names - String array of names
	 * @param citiesVisited - String array of corresponding cities each name has visited
	 * 
	 * names and citiesVisited are parallel String arrays
	 * 
	 * @return list containing all names that correspond to some city more than once
	 */
	public static ArrayList<String> citiesVisitedMoreThanOnce(String[] names, String[] citiesVisited) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
}
