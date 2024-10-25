package foreign;

public class SumNumber extends Thread {
    public int[] number ;
    public SumNumber(int[] number){
        this.number = number;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < number.length ;i++){
            sum+= number[i];
        }
        System.out.println(sum);
    }
}
