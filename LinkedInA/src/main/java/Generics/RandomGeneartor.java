package Generics;

import java.util.Random;

public class RandomGeneartor {
	
	
    public static String RandomStringGenerator(int size){
        String name = new String();
        
        char[] ar ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'
                ,'l', 'm', 'n', 'o', 'p', 'q', 'r','s','t','u', 'v','w','x', 'y', 'z'};

        for (int i=0; i<=size;i++)
        {
            Random randonm = new Random();
            name = name + ar[randonm.nextInt(ar.length)];

        }
        return name;
    }

}
