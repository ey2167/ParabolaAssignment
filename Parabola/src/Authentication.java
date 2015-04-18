
public class Authentication {
	static String keyword = "420";
public static boolean authenticatekey(String key){
	
	if(key.equals(keyword)){
		return true;
	}
	else
		return false;
	
}
	
}
