package com.htc.bigbasket.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.htc.bigbasket.constant.Constants;


public class PropertyManager {

	private static PropertyManager instance;
    private static final Object lock = new Object();
    //private static String propertyFilePath = System.getProperty("user.dir")+
    //        "\\src\\test\\resources\\configuration.properties";
    private static String url;
    private static String chromeproperty;
    private static String chromepath;
    private static String phoneno;
    private static String productname;
    private static String searchproductname;
    private static String quantity;
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String browser;
    private static String dob;
    
 
    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance () {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }
 
    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();
 
        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(Constants.PROPERTIES_PATH));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }
 
        //Get properties from configuration.properties
        url = prop.getProperty("url");
        chromeproperty=prop.getProperty("chromeproperty");
        chromepath=prop.getProperty("chromepath");
        phoneno=prop.getProperty("phoneno");
        productname=prop.getProperty("productname");
        quantity=prop.getProperty("quantity");
        firstName=prop.getProperty("firstname");
        lastName=prop.getProperty("lastname");
        email=prop.getProperty("email");
        browser=prop.getProperty("browser");
        dob=prop.getProperty("dob");
        searchproductname=prop.getProperty("searchproductname");
        
       // wrongUsername = prop.getProperty("wrongUsername");
       // wrongPassword = prop.getProperty("wrongPassword");
    }
 
    public String getURL () {
      return url;
    }
 
    public String getChromeProperty () {
        return chromeproperty;
    }
 
    public String getChromePath () {
        return chromepath;
    }
    
    public String getPhoneNo () {
    	return phoneno;
    }
    
    public String getProductName()
    {
    	return productname;
    }
    
    public String getSearchProductName()
    {
    	return searchproductname;
    }
    
    public String getQuantity()
    {
    	return quantity;
    }
    
    public String getFirstName()
    {
    	return firstName;
    }
    
    public String getLastName()
    {
    	return lastName;
    }
    
    public String getEmail()
    {
    	return email;
    }
    
    public String getBrowser()
    {
    	return browser;
    }
    
    public String getDOB()
    {
    	return dob;
    }
    
}
