package Java_Collections.L_10;

import Java_Collections.L_8.StockItem;
import Java_Collections.L_9.StockList;

import java.util.Map;


public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
        temp = new StockItem("Cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("Car",12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.50,200);
        stockList.addStock(temp);
         temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",2.50,36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);
        System.out.println(stockList);

        for(String s: stockList.items().keySet()){
            System.out.println(s);
        }

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);


        Basket  timsBasket = new Basket("Tim");
        sellItem(timsBasket,"Car",1);
        System.out.println(timsBasket);
        sellItem(timsBasket,"Car",1);
        System.out.println(timsBasket);
        /*
        if(sellItem(timsBasket,"Car",1) != 1){
            System.out.println("There are no more cars in stock");
        }
        */
        sellItem(timsBasket,"spanner",5);
        System.out.println(timsBasket);

        sellItem(timsBasket,"juice",4);
        sellItem(timsBasket,"cup",1);
        sellItem(timsBasket,"bread",1);

        removeItem(timsBasket, "car", 1);
        removeItem(timsBasket, "cup", 9);
        removeItem(timsBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(timsBasket, "car", 1));

        System.out.println(timsBasket);
        System.out.println(stockList);


        //temp = new StockItem("pen",1.12);
        //stockList.items().put(temp.getName(),temp);

       // stockList.items().get("Car").adjustStock(2000);
        System.out.println(stockList);

        for(Map.Entry<String,Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + "costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket,String item,int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't  sell " +  item);
            return 0;
        }
        if(stockList.reserveStock(item,quantity) !=0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }


    public static int removeItem(Basket basket,String item,int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't  sell " +  item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem,quantity) == quantity){
            return stockList.unreservedStock(item,quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
      for(Map.Entry<StockItem,Integer> item : basket.Items().entrySet() ){
        stockList.sellStock(item.getKey().getName(),item.getValue());
      }
      basket.clearBasket();
    }



}
