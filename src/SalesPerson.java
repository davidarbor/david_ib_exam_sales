public class SalesPerson{
    private String mID;
    private Sales[] salesHistory=new Sales[3]; //details of the different sales
    private int mCount=0; //number of sales made

    public SalesPerson(String ID){
        mID=ID;
    }
    public SalesPerson(String ID, Sales[] sale, int count){
        mID=ID;
        salesHistory=sale;
        mCount=count;
    }

    public int getCount(){
        return mCount;
    }
    public String getID(){
        return mID;
    }
    public void setSalesHistory(Sales sale){
        mCount++;
        salesHistory[mCount]=sale;
    }
    public Sales[] getSalesHistory(){
        return salesHistory;
    }
    public double calcTotalSales(){
        double salesValue=0;
        for(int i=0; i<salesHistory.length; i++){
            if(salesHistory[i]!=null) {
                salesValue+=salesHistory[i].getValue();
            }
        }
        return salesValue;
    }
    public Sales largestSale(){
        //code missing (calculates the sale with the largest value)
        Sales max=salesHistory[0];

        return max;
    }
}