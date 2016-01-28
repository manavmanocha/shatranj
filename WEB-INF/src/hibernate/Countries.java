package hibernate;

public class Countries {
	private int countryId;
	private String countryName;
	private String countryStatus;
	
	public void setCountryId(int countryId){
		    this.countryId=countryId;
		  }

	public int getCountryId(){
		    return this.countryId ;
		  }
	
	public void setCountryName(String countryName){
	    this.countryName=countryName;
	  }

	public String getCountryName(){
	    return this.countryName ;
	  }
	public void setCountryStatus(String countryStatus){
	    this.countryStatus=countryStatus;
	  }

	public String getCountryStatus(){
	    return this.countryStatus ;
	  }

}
