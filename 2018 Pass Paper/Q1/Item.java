public abstract Item{

  private int itemNo;
  private String description;
  private double unitPrice;

  public Item(int itemno, String description, double unitPrice){
    this.itemNo = itemNo;
    this.description = description;
    this.unitPrice = unitPrice;
  }

  public void display(){
    System.out.println("Item no: " + itemNo);
    System.out.println("Description: " + description);
    System.out.println("Unit price: " + unitPrice);
  }
  
}