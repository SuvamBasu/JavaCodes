public class VarArgs {
    public static void main(String[] args) {
        VarArgs ref= new VarArgs();

        System.out.println("Addition of numbers is:"+ref.add(99));
        System.out.println("Addition of numbers is:"+ref.add(99, 2, 5));
        System.out.println("Addition of numbers is:"+ref.add(99, 1));
        System.out.println("Addition of numbers is:"+ref.add(99,1,2,3,4,5,6));
    }
    int add(int...values)
    {
        int sum=0;
        for (int i: values)
        sum+=i;
        return sum;
    }
}
