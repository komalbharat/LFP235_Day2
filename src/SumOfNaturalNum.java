public class SumOfNaturalNum {
    public static void main(String[] args)
    {
        int num = 5, i = 1, sum = 0;
//executes until the condition returns true
        while(i <= num)
        {
//adding the value of i into sum variable
            sum = sum + i;
//increments the value of i by 1
            i++;
        }
//prints the sum
        System.out.println("Sum Natural Numbers is = " + sum);
    }
}
