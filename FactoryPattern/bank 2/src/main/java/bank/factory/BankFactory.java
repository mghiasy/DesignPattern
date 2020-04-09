package bank.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BankFactory {
    //relation with factory -- injecttion
    private MyFactory myFactory ;

    //The value of factory in run time and in constructor will be set
    //******In the constructor we set the correct factory*****

    public BankFactory() {
 // public BankFactory() throws IOException {
//        instead of throw exception (here and in service) add them to try catch block and handle both exceptions
        try {
            //get path of resource
            String rootPath= Thread.currentThread().getContextClassLoader().getResource("").getPath();

            Properties prop=new Properties();
            //Load the property file here
            prop.load(new FileInputStream("/Users/maryamGhiasvand/Documents/MUM/ASD/Git/FactoryPattern/bank 2/src/main/resources/config.properties"));

            //get the property value
            String environment = prop.getProperty("environment");

            //check the conditional logic:
            if(environment.equals("production")){
                //if it is production return productFactory
                myFactory= new ProductionFactory();
            }
            else if (environment.equals("test")){
                myFactory = new MockFactory();
            }else System.out.println("environment property not set correctly");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    //has a method getFactorInstance of sth of type interface MyFactory
    //So returns either ProductionFactory or MockFactory depending on the property file
    public MyFactory getFactorInstance(){
        return myFactory;
    }
}
