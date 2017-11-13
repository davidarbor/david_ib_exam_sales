public class Sales{
    private String itemID; //ID of the item
    private double mValue; //the price of one item
    private int mQuantity; //the number of the items sold

    public Sales(String ID, double value, int quantity){
        itemID=ID;
        mValue=value;
        mQuantity=quantity;
    }

    public void setValue(double newValue){
        mValue=newValue;
    }
    public double getValue(){
        return mValue;
    }
    public void setQuantity(int newQuantity){
        mQuantity=newQuantity;
    }
    public int getQuantity(){
        return mQuantity;
    }
}