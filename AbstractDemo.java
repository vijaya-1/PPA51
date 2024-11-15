
abstract class Arithematic
{
    abstract public int Addition(int A, int B);    //abstract method declaration
    abstract public int Subtraction(int A, int B);
    public int Multiplication(int A, int B)    //concrete method
    {
        return A * B;
    }
}

class Marvellous extends Arithematic
{
    public int Addition(int A,int B)     //abstract method definition
    {
        return A + B;
    }
    public int Subtraction(int A ,int B)
    {
        return A - B;
    }
}
class AbstractDemo
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();

        System.out.println(mobj.Addition(11,10));      
        System.out.println(mobj.Subtraction(11,10));        
        System.out.println(mobj.Multiplication(11,10));          

    }
}