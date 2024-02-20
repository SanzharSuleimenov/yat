package module3.collections.list;

public class MyElement implements Comparable<MyElement> {

  private String value;
  private String key;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MyElement() {}

  public MyElement(String key, String value) {
    this.value = value;
    this.key = key;
  }

  @Override
  public int compareTo(MyElement o) {
    // this < o --> result < 0
    // this == o --> result == 0
    // this > o --> result > 0
    int comparedKeys = this.getKey().compareTo(o.getKey());
    if (comparedKeys == 0) {
      return this.getValue().compareTo(o.getValue());
    }
    return comparedKeys;
  }

  @Override
  public String toString() {
    return "MyElement{" +
        "key='" + key + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
}
