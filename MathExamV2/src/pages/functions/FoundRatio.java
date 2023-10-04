package pages.functions;

import pages.FirstPage;

public class FoundRatio {
    public static int foundRatio (){
        int ratio = 1;
        int sum = FirstPage.firstNumber + FirstPage.secondNumber;

        if (sum < 20) {
            ratio = 1;
        } else if ( sum < 27 ) {
            ratio = 5;
        } else if ( sum < 107 ){
            ratio = 10;
        }else if ( sum < 120 ){
            ratio = 15;
        }else {
            ratio = 20;
        }
        System.out.println(ratio);
        return ratio;
    }

}
