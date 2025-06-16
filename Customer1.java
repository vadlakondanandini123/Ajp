// program demontrating class and object
public class Customer1 {

    //variables
    int CustomerId;
    String customer_name;
    //method
    void getCustomer()
    {
        System.out.println(CustomerId+"/n"+customer_name);

    }
public static void main(String args[])
{
    Customer1 c=new Customer1();
    c.CustomerId=12345;
    c.customer_name="Nandini";
    c.getCustomer();
}
}
