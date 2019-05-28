package pages;




import util.BasePage;

public class ProductPage extends BasePage{
	

	public ProductPage() 
	{
		/*String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains(""))};*/
	
		String URL = driver.getCurrentUrl();
		if(URL.contains("https://www.taniaksiazka.pl/fantastyka-c-70.html?params[price]=10,35"))
    	{
        	System.out.println("Landed in correct URL" +
                "" + URL);
    	}	
    		else
    			{
    				System.out.println("Landed in wrong URL");
    			}
    }
	

	}
   
