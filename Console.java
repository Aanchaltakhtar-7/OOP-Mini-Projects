import java.util.*;

public class Console
{
    Scanner sc= new Scanner(System.in);
    private Management ma;

    private int menu()
    {
        System.out.println("----------Inventory Menu----------");
        System.out.println("1.Add Product: ");
        System.out.println("2.Show Record list ");
        System.out.println("3.Remove product");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice;
        choice= sc.nextInt();
        return choice;
    }
    private void start()
    {
        while(true){
            int choice = menu();
            switch(choice){
                case 1:
                    addRecord();
            }
        }
    }

    private void addRecord() {

        System.out.println("Enter the product name: ");
        String name = sc.next();
        System.out.println("Enter the quantity of product: ");
        int Quantity= sc.nextInt();
        System.out.println("Enter product purchase price: ");
        float Purchaseprice = sc.nextFloat();
        System.out.println("Enter product selling price: ");
        float Sellingprice = sc.nextFloat();
        Record r= new Record(name,Quantity,Sellingprice,Purchaseprice);
        this.ma.addRecord(r);
    }

}
