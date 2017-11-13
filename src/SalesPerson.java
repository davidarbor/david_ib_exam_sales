public class SalesPerson{
    private String mID;
    private Sales[] salesHistory=new Sales[3]; //details of the different sales
    private int mCount=0; //number of sales made
    private double mTotal=0; //getValue() multiplied by getQuantity() (see Sales class)

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
        salesHistory[mCount]=sale;
        mCount++;
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
        //calculates the sale with the largest value
        Sales max=salesHistory[0];
        for(int i=0; i<salesHistory.length; i++){
            if(salesHistory[i]!=null){
                if (salesHistory[i].getValue() > max.getValue()){
                    max = salesHistory[i];
                }
            }
        }
        return max;
    }
    public double totalSales(){
        for(int i=0; i<salesHistory.length; i++){
            if(salesHistory[i]!=null){
                mTotal+=salesHistory[i].getValue()*salesHistory[i].getQuantity();
            }
        }
        return mTotal;
    }
}