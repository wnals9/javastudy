package ex07_TourGuide;

public class MainWrapper {

  public static void main(String[] args) {

    TourGuide guide1 = new TourGuide();
    guide1.setTour(new HawaiiTour());
    guide1.sightseeing();
    guide1.leisure();
    guide1.meal();

    TourGuide guide2 = new TourGuide();
    guide1.setTour(new JapanTour());
    guide1.sightseeing();
    guide1.leisure();
    guide1.meal();
    
  }

}
