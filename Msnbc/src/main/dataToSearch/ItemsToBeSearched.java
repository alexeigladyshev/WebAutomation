package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by aleks_000 on 3/6/2017.
 */
public class ItemsToBeSearched {

    DataReader dr = new DataReader();
    public String [] getData() throws IOException{

        String path = System.getProperty("user.dir")+"/data/file1.xls";
        //String path = "C:\\Users\\aleks_000\\IdeaProjects\\WebAutomation\\Msnbc\\data";
        String [] st = dr.fileReader(path);
        return st;
    }
}
