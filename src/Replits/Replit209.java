package Replits;

import java.util.*;

public class Replit209 {
    public static void main(String[] args) {
        List<Map<String,Object>> dataList= new ArrayList<>();

        Map <String,Object> appleMap= new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);


        Map <String,Object> orangeMap= new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(appleMap);
        dataList.add(orangeMap);

double price=0;
double quantity=0;
double total=0;
        for(Map<String,Object> listData:dataList) {
            for(Map.Entry<String,Object> entry:listData.entrySet()) {
                if(entry.getKey().equals("Price")) {
                //  price=Double.parseDouble(entry.getValue().toString());
                    price=(double) entry.getValue();

                } else if(entry.getKey().equals("Quantity")) {
                    quantity=(int) entry.getValue();
                }
                System.out.println(entry.getKey()+" : "+entry.getValue());

            }
            total+=price*quantity;
            System.out.println("Subtotal "+(price*quantity));

        }
        System.out.println("Your purchase total :"+(total));




            }

           }














