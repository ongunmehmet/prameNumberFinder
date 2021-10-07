import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            int startingNumber=500;
            List<Integer> prameNumbers=  new ArrayList<Integer>();
            for(int i=1;i<=100;i++ ){
                startingNumber++;
                int counter=0;
                for(int k=2 ;k<startingNumber/2;k++){

                    if(startingNumber%k==0){
                        counter=counter+k;
                    }
                }
                if (counter==0)
                    prameNumbers.add(startingNumber);

            }
            Iterator it =prameNumbers.iterator();
            while (it.hasNext()){
                Object prame=it.next();
                System.out.println(prame);
            }
        }

    }

