import foreign.SumNumber;

public class daluong {

    public static void main(String[] args) {
        int[] number = {4,3,6,1,3,6,7,3,9,4,33,5,3,1,3,5,6,7,4,3,2,4,5,34,3,1,6,7,5,3,53,7,9};
        SumNumber a = new SumNumber(number);
        a.start();

        int maxNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if(number[i] > maxNumber){
                maxNumber = number[i];
            }
        }
        System.out.println(maxNumber);
        
    }
}