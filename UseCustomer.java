package collection;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {
	
	public static void main(String[] args)

    {
        Customer c1 = new Customer("MAX",1001,200,300,"MALE");
        Customer c2 = new Customer("LUKE",1002,300,400,"MALE");
        Customer c3 = new Customer("LIZ",1003,400,500,"FEMALE");
        Customer c4 = new Customer("LIN",1004,500,600,"FEMALE");
        Customer c5 = new Customer("GIL",1005,600,700,"MALE");

        HashMap<Integer,Customer>cus=new HashMap<>();
        cus.put(c1.getCusid(), c1);
        cus.put(c2.getCusid(), c2);
        cus.put(c3.getCusid(), c3);
        cus.put(c4.getCusid(), c4);
        cus.put(c5.getCusid(), c5);

        cus.keySet().forEach(x->System.out.println(x));
        
        int min=c1.getPurchaseAmt();
        for(Integer x:cus.keySet()){
        	System.out.println(x+""+cus.get(x));
        	if(cus.get(x).getPurchaseAmt()<min){
        		min=cus.get(x).getPurchaseAmt();
        	}
        	
        	int max=c1.getPurchaseAmt();
            for(Integer y:cus.keySet()){
            	System.out.println(y+""+cus.get(y));
            	if(cus.get(y).getPurchaseAmt()>max){
            		min=cus.get(y).getPurchaseAmt();
            	}
             } 
            Iterator<Customer> it=cus.values().iterator();
            while(it.hasNext()) {
            	if(it.next().getTotAmt()>1000) {
            		it.remove();
            	}
            }
            
            cus.forEach((a,b)->System.out.println(a+""+b));
            }
       }
}
