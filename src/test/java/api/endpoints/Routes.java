package api.endpoints;

public class Routes 
{
	//In this framework, we can access url(baseurl+end points) in two ways. 
	//One is using routes.java
	//another is using routes.propertie
	
	public static String base_url= "https://qa01.app.non-prod.ignyte.app";
	
	public static String all_contacts = base_url+"/contacts/list/all-contacts"; 
	public static String get_contact = base_url+"/contacts/list/all-contacts/{contactName}"; //path parameter
	public static String get_projects = base_url+"/api/v1/project/all";
	
	
	
}
