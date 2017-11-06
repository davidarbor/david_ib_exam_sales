public class Runner{
    static SalesPerson[] salesPeople=new SalesPerson[6];
    public static void main(String[] args){
        /*the commented line at the bottom is NOT POSSIBLE, but I'm leaving it here because it was part of the code they
        wanted us to copy for one of the questions.*/
        salesPeople[0]=new SalesPerson("100");
        salesPeople[1]=new SalesPerson("101");
        salesPeople[2]=new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getID());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[0].calcTotalSales());
        System.out.println(salesPeople[0].largestSale().getValue());
        Sales saleOne=new Sales("A400", 1200.00, 3);
        addSales(saleOne, "100");
        System.out.println(salesPeople[0].largestSale().getValue());
        //System.out.println(salesPeople[1].getSalesHistory(0).getValue());
    }
    public static void addSales(Sales s, String ID){
        for(int i=0; i<salesPeople.length; i++){
            if(salesPeople[i]!=null){
                if (ID.equals(salesPeople[i].getID())) {
                    salesPeople[i].setSalesHistory(s);
                }
            }
        }
    }
}