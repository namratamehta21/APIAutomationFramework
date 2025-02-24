package api.utilities;

import java.util.ResourceBundle;

public class ReadProperties 
{
	public static ResourceBundle getURL()
	{
		ResourceBundle routes = ResourceBundle.getBundle("routes");//write direct route as file name , as ResourceBundle by default search file in resources folder
		return routes;
	}
}
