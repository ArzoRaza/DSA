public class _01_largNo{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 12, 8};
        int largNum = numbers[0];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count++;
            if(numbers[i] > largNum){
                largNum = numbers[i];
            }
        }
        System.out.println(largNum);
        System.out.println(count);
    }
    
}