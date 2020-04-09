package bank.factory;

import bank.factory.MockFactory;
import bank.factory.MyFactory;
import bank.factory.ProductionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BankFactory {
    //relation with factory -- injecttion
    private MyFactory myFactory ;

    //The value of factory in run time and in constructor will be set
    public BankFactory() throws IOException {
       // String rootPath= Thread.currentThread().getContextClassLoader().getResources("config.properties").getPath();
       // System.out.println("path = "+ rootPath);
        //Load the property file
        Properties prop=new Properties();
        prop.load(new FileInputStream("/Users/maryamGhiasvand/Desktop/Lab9/bank 2/config.properties"));
        //get the property value
        String environment = prop.getProperty("environment");

        //check the conditional logic:
        if(environment.equals("production")){
            myFactory= new ProductionFactory();
        }
        else if (environment.equals("test")){
            myFactory = new MockFactory();
        }else System.out.println("environment property not set correctly");

    }
    public MyFactory getFactorInstance(){
        return myFactory;
    }
}
