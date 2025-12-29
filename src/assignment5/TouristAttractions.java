package assignment5;

import java.util.Map;
import java.util.TreeMap;

public class TouristAttractions 
{
	public static void main(String[] args) 
	{
		// Create Set of top 10 most visited tourist TouristAttractions
		Map<String, Double> TouristAttractions = new TreeMap<>();

        TouristAttractions.put("Great Wall of China", 21196.0);
        TouristAttractions.put("Forbidden City" , 720000.0);
        TouristAttractions.put("Eiffel Tower" , 0.025);
        TouristAttractions.put("Louvre Museum" , 0.021);
        TouristAttractions.put("Colosseum" , 0.024);
        TouristAttractions.put("Taj Mahal" , 0.17);
        TouristAttractions.put("Statue of Liberty" , 0.59);
        TouristAttractions.put("Times Squad" , 0.665);
        TouristAttractions.put("Disneyland Park" , 0.344);
        TouristAttractions.put("Grand Bazaar" , 0.307);

	    // Print TouristAttractions with area size
	    System.out.println("Top 10 Most Visited Tourist Attractions with Size :");
	    
	    for (Map.Entry<String, Double> Entries : TouristAttractions.entrySet()) 
	    {
            System.out.println(Entries.getKey() +" = " +Entries.getValue() +" km");
	    }
	    
	}
}