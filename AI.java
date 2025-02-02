/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import org.apache.mahout.cf.taste.common.TasteExpectation;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
class AI ;

{
    public static String dataFile = "/home/amrit/customer.csv";
	public static void main(String[] args) throws IOExpection, TasteException {
     DataModel model = new FileDataModel(new File(DataFile));
     LogLikelyhoodSimilarity similarity = new LogLikelyhoodSimilarity(model);
     System.out.println("similarities between user1 and user3 is" + similarity.userSimilarity(1,3)); 
	   }
	  
   }
	