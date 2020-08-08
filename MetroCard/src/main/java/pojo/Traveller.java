package pojo;

public class Traveller {
  long id;
  String name;

  public Traveller(long id, String name) {
    this.id = id;
    this.name = name;
  }

  // Getters and Setters not shown for brevity

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}