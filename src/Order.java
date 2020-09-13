public class Order {
  private String name;
  private float price;

  public Order(String name_changed, float price) {
    this.name = name_changed;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public float getPrice() {
    return this.price;
  }
}
