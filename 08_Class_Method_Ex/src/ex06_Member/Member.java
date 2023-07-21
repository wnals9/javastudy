package ex06_Member;

public class Member {

  private String name;
  private Contact contact;
  
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  // Getter
  public String getName() {
    return name;
  }
  public Contact getContact() {
    return contact;
  }
  
  
}
