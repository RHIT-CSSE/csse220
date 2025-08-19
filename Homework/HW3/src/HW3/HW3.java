package HW3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class: HW3
 * <p>
 * ***************************************************************************************
 * REQUIRED HELP CITATION
 *
 * TODO: cite your help here or say "only used CSSE220 materials"
 * ***************************************************************************************
 *
 * <dl>
 * <dt>Class:</dt><dd>HW3</dd>
 *
 * <dt>Purpose:</dt>
 * <dd>provide practice with the HashMap data structure, and continued practice with arrays</dd>
 *
 * <dt>Learning targets:</dt>
 * <dd>
 * <ul>
 * <li>I can apply HashMap operations to solve small problems.</li>
 * <li>I can use Java primitives in the context of small methods.</li>
 * <li>I can iterate (i.e., loop) through arrays and HashMaps.</li>
 * <li>I can read Java API documentation to learn how to use built-in methods.</li>
 * </ul></dd></dl>
 *
 * @author CSSE Faculty
 */
public class HW3 {

    /**
     * Given two arrays this operation must build and return a new HashMap that
     * contains a mapping from String (hashmap's key) to Integer (hashmap's value)
     *
     * @param airportCodes      an array of String containing 3-letter airport codes
     * @param airportElevations an array of Integer containing each airport's elevation in meters
     * @return a HashMap containing a mapping from each airport code to its elevation
     * requires: no duplicate airport codes are contained in array airportCodes - that is, you can program this operation
     * assuming that the caller will make sure there are no duplicates in airportCodes array
     * example:
     * input airportCodes = ["CDG", "FOC", "IND"]
     * input airportElevations = [118, 14, 230]
     * return value = {CDG=118, FOC=14, IND=230}
     */
    public static HashMap<String, Integer> buildAirportMap(String[] airportCodes, Integer[] airportElevations) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    } // buildAirportMap

    /**
     * Finds the first number in an array divisible by 77 and returns it.
     * <p>
     * If no number is found, the function returns -1
     * <p>
     * Example: firstDivisibleBy77({88,24,154,77}) returns 154
     * firstDivisibleBy77({5929, 280})             returns 5929
     * firstDivisibleBy77({1,2,3,4})               returns -1
     * <p>
     * Don't forget about the modulus operator (%)
     */
    public static int firstDivisibleBy77(int[] numbers) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    }

    /**
     * Given a single input string in inputString, this operation must return the character
     * from inputString that appears the most number of times
     * <p>
     * Your solution must use a HashMap; you cannot use nested for-loops to solve this problem.
     * When you use a HashMap you are permitted to use 1 for loop.
     *
     * @param inputString - string of characters for determining the most common character
     * @return most common character that appeared in inputString
     * requires: inputString will not be empty and there will be 1 character that appears more than all the others
     * That is, you can program this operation assuming that the caller will make sure that inputString.length() > 0
     * and that there will be only 1 character that "wins"
     * <p>
     * example 1:
     * input inputString = "aaab"
     * return value = 'a'
     * <p>
     * example 2:
     * input inputString = "abcbcdc"
     * return value = 'c'
     */
    public static char mostCommonCharacter(String inputString) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    } // mostCommonCharacter


    /**
     * During a heat wave, any sign of lower temperatures becomes breaking news.
     * This operation takes an array of temperatures and a corresponding array of the city names
     * giving the location where each temperature reading was recorded.
     * <p>
     * The operation must return the name of a city that experienced a temperature drop.
     * If no city experienced a drop, the operation should return null.
     * <p>
     * You must use a HashMap to solve this problem.
     *
     * @param recordedTemps the temperatures recorded in time order
     * @param cityNames     names of the cities where each temperature was recorded
     * @return city name that had a temperature drop or null if no temperature drop in any city
     * requires: only 1 city will experience a temperature drop - that is, you can program this operation
     * assuming that the caller will make sure that only one city experiences a temperature drop
     * <p>
     * example 1:
     * input recordedTemps = [90, 100, 81, 99]
     * input cityNames = ["Seattle", "LA", "Seattle", "LA"]
     * return value = "LA", because 100 to 99 was a drop.
     * <p>
     * example 2:
     * input recordedTemps = [91, 92, 80, 93, 100, 83, 93, 82, 105, 85]
     * input cityNames = ["Terre Haute", "Terre Haute", "Seattle", "Terre Haute", "LA", "Seattle", "Terre Haute", "Seattle", "LA", "Seattle"]
     * return value = "Seattle", because 83 to 82 was a drop
     * <p>
     * example 3:
     * input recordedTemps = [91, 92, 80]
     * input cityNames = ["Terre Haute", "Terre Haute", "Seattle"]
     * return value = null, because no city experienced a temperature drop
     */
    public static String getTemperatureDropCity(int[] recordedTemps, String[] cityNames) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    } // getTemperatureDropCity

    /**
     * Given two arrays, count the number of times the first array occurs in the
     * second array. You can assume that the first array is shorter than the second.
     * <p>
     * For example: timesOccur({1,2}, {7,1,2,7,7,7,1,2,7}) returns 2
     * timesOccur({1,1},       {1,1,1,3} returns 2 (in the 0th and 1st position)
     * timesOccur({1,2},       {1,3,2,1} returns 0
     * timesOccur({1,2,3},     {1,2,3,8,1,2,3,9,2}) return 2
     * timesOccur({1,2,3,4,5}, {2,1,2,3,4,5,7}) returns 1
     * <p>
     * Requires: arrays, nested for loops
     */
    public static int timesOccur(int[] shorter, int[] longer) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    }

    /**
     * Given two parallel String arrays:
     * one of names and the other of cities these names have visited, this operation
     * is to return the list of names that have "visited" any city more than once.  That is,
     * return an ArrayList containing the names that correspond to any city more than
     * once.
     * <p>
     * Even if a name appears with a city many times (more than twice), the name should
     * only appear in the returned list once.
     * <p>
     * The final names in the ArrayList may appear in any order (but should not be repeated)
     * <p>
     * The two arrays names and citiesVisited will always be the same length
     * <p>
     * HINT: You will wish to utilize a HashMap to track what names have visited what cities
     * (that is PLURAL cities)
     * <p>
     * HINT: The ArrayList "contains" method will be VERY useful for this problem.
     * <p>
     * Examples:
     * (1)
     * names =         ["Bill",    "Jan",   "Jon", "Bill",   "Jon", "Jon", "Jon",     "Bill"]
     * citiesVisited = ["Chicago", "Philly", "LA", "Philly", "LA",  "LA",  "Chicago", "Philly"]
     * (index 0 means "Bill visited Chicago")
     * <p>
     * Return list -> ["Jon", "Bill"]  because Jon visited Chicago more than once
     * and Bill visited Philly more than once
     * <p>
     * (2)
     * names =         ["A", "A", "A", "B", "B", "B", "C"]
     * citiesVisited = ["1", "2", "3", "1", "2", "1", "1"]
     * <p>
     * Return list ->["B"]  because B visited 1 more than once
     * <p>
     * <p>
     * (3)
     * names =         ["A", "A", "A", "B", "B", "B", "C"]
     * citiesVisited = ["1", "2", "3", "1", "2", "3", "1"]
     * <p>
     * Return list ->[]  empty list because there are no names that visited the same city twice
     *
     * @param names         - String array of names
     * @param citiesVisited - String array of corresponding cities each name has visited
     *                      <p>
     *                      names and citiesVisited are parallel String arrays
     * @return list containing all names that correspond to some city more than once
     */
    public static ArrayList<String> citiesVisitedMoreThanOnce(String[] names, String[] citiesVisited) {
        throw new UnsupportedOperationException("TODO: Remove this line and implement this method.");
    }
}
