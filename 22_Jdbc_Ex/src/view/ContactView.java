package view;

import javax.swing.JOptionPane;

import controller.ContactController;

// ContactView -> ContactController -> ContactSeriver -> ContactDao -> DB

public class ContactView {

  public void display() {

    ContactController contactController = new ContactController();
    
    while(true) {
      
      String choice = JOptionPane.showInputDialog("1.삽입\n2.수정\n3.삭제\n4.전체조회\n5.상세조회\n원하는 작업을 입력하세요.");
      contactController.request(choice);
      
      
    }
  
  }
  
}
