class WrapperDemo
{
    public static void main(String Arg[])
    {
        int no1 = 11;

        Integer no2 = 11;

        System.out.println(no1);
        System.out.println(no2);

        int x = no2;   //this is auto unboxing(i.e it is done automatically)
        System.out.println(x);

        Integer y = no1;  //this is boxing (auto boxing)
        System.out.println(y);
    }
}