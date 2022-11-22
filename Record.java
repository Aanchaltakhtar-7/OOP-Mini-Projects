public class Record {
    private String name,type;
    private int Quantity;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(float sellingprice) {
        this.sellingprice = sellingprice;
    }

    public float getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(float purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    private float sellingprice, purchaseprice;

    public Record(String name,String type, int quantity, float sellingprice, float purchaseprice) {
        this.name = name;
        this.type= type;
        this.Quantity = quantity;
        this.sellingprice = sellingprice;
        this.purchaseprice = purchaseprice;
    }
}
