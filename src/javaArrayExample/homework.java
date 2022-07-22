package javaArrayExample;


public class homework {

	public static void main(String[] args) {
		
		
		double[ ] anArray = {1,2,3,4,5,6,7,8};

        double maximum = anArray[0];

        int index = 0;

        for (int i = 1; i<anArray.length; i++){

             if (anArray[ i ] > maximum) {

                  maximum = anArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);

	}

}
