import java.util.ArrayList;
import java.util.*;
import java.util.ArrayList;

public class Management
{
    static Scanner sc= new Scanner(System.in);
    private ArrayList<Record> listofRecord;

    public Management(){
        this.listofRecord= new ArrayList<>();
        listofRecord.add(new Record("Bread","buy",30,20,15));
        listofRecord.add(new Record("Coffee","buy",45,35, 30));
    }

    private ArrayList<Record> purchase(boolean t){
        ArrayList<Record>temp= new ArrayList<>();
        String name,type;
        float Sellingprice;
        float Purchaseprice;
        int Quantity;
        int input;
        while(true){
            System.out.println("Enter name of the product: ");
            name= sc.next();
            System.out.println("Enter the quantity of product: ");
            Quantity= sc.nextInt();
            System.out.println("Enter product purchase price: ");
            Purchaseprice = sc.nextFloat();
            System.out.println("Enter product selling price: ");
            Sellingprice = sc.nextFloat();

            if(t)
                type= "Sell";
            else
                type= "buy";

            temp.add(new Record(name,type,Quantity,Sellingprice,Purchaseprice));
        }
        return temp;


    }

    public int addRecord(Record r)
    {
        this.listofRecord.add(r);
        return this.listofRecord.size();
    }

    public int count()
    {
        return this.listofRecord.size();
    }

    public Record getRecord(int index)
    {
        if(index<0 || index >= count())
        return null;
        {
            return this.listofRecord.get(index);
        }
    }
}
