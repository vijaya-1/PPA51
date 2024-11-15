#include<iostream>
using namespace std;

class Demo
{
    public:
    int A;
    private:
    int B;
    public:
        Demo()
        {
            A=11;
            B=21;
        }
        void Fun()
        {
            cout<<"The Value of A: "<<A<<"\n";  // accessing is allowed
            cout<<"The VAlue of B: "<<B<<"\n";  // allowed bcz it is inside the class 
        }
};
int main()
{
    Demo obj;
    obj.Fun();  // Allowed to access beacuase  fun is public

    cout<<"The Value of A:"<<obj.A<<"\n";   //Allowed 
    cout<<"The Value of B:"<<obj.B<<"\n";   //Not allowed because it is outside the class

    return 0;
}