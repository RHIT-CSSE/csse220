import java.util.HashMap;

/**
 * This class stores information about a city and can generate a report based on that
 * information. It should be able to handle a number of different bad data examples
 * as specified in the README.md file
 * 
 * @author YOUR_USERNAME
 *
 */
public class City {

	// You DO NOT have to modify the instance variables or constructor
	private String cityName;
	private HashMap<Integer,Integer> monthToInfectionMap = new HashMap<Integer, Integer>();
	private HashMap<Integer,Integer> monthToDeathMap = new HashMap<Integer, Integer>();
	
	public City(String cityName) {
		this.cityName = cityName;
	}
	
	//You WILL have to modify this method
	public void addData(String s) {
		
		String[] data = s.split(",");
		
		// TODO this code cannot currently handle a line that doesn't have 3 integers separated by commas
		// Follow the instructions to properly deal with this situation
		// Hint: you will need an InvalidDataException class! 
		
		int month = Integer.parseInt( data[0] );
		int infected = Integer.parseInt( data[1] );
		int deaths = Integer.parseInt( data[2] );
		if (monthToInfectionMap.containsKey(month) ) {
			if (monthToInfectionMap.get(month) == infected && monthToDeathMap.get(month) == deaths ) {
				//do nothing, ignore duplicate
			} else {
				//TODO should throw an Exception so we can report this with the filename and line number
				//Hint: You will need a DataDuplicationException class!
				//This file SHOULD NOT continue to be parsed!
				System.out.println("Duplicate month data with differing values found!");
			}
		} else {
			monthToInfectionMap.put(month, infected);
			monthToDeathMap.put(month, deaths);
		}

		
	}
	
	// You DO NOT have to modify this method
	public String getReport() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------");
		sb.append("\n");
		sb.append(this.cityName);
		sb.append(":\n");
		int totalInfected = 0;
		int totalDeaths = 0;
		for (Integer month: monthToInfectionMap.keySet() ) {
			totalInfected += monthToInfectionMap.get(month);
			totalDeaths += monthToDeathMap.get(month);
		}
		sb.append( "Average Monthly Infections: "   );
		sb.append( totalInfected / monthToInfectionMap.keySet().size() );
		sb.append("\n");
		sb.append( "Average Monthly Deaths: "   );
		sb.append( totalDeaths / monthToDeathMap.keySet().size() );
		return sb.toString();
	}
	
}
