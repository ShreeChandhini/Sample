package collection;

public class Customer {
	private String name;
    private int cusid;
    private int totAmt;
    private int purchaseAmt;
    private String gender;

   public String getName() {
       return name;
   }
   
   public void setName(String name) {
       this.name = name;
   }
   
   public int getCusid() {
       return cusid;

   }

   public void setCusid(int cusid) {
       this.cusid = cusid;
   }

   public int getTotAmt() {
       return totAmt;
   }

   public void setTotAmt(int totAmt) {
       this.totAmt = totAmt;
   }

   public int getPurchaseAmt() {
       return purchaseAmt;
   }

   public void setPurchaseAmt(int purchaseAmt) {
       this.purchaseAmt = purchaseAmt;
   }

   public String getGender() {
       return gender;
   }

   public void setGender(String gender) {
       this.gender = gender;
   }

   public Customer(String name, int cusid, int totAmt, int purchaseAmt, String gender) {
       super();
       this.name = name;
       this.cusid = cusid;
       this.totAmt = totAmt;
       this.purchaseAmt = purchaseAmt;
       this.gender = gender;
   }

   @Override
   public String toString() {
       return "Customer [name=" + name + ", cusid=" + cusid + ", totAmt=" + totAmt + ", purchaseAmt=" + purchaseAmt
                + ", gender=" + gender + "]";

   }

  }
	
	
	


