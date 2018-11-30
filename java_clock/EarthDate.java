public class EarthDate {

  private int TaiOffset = 37;
  private int MilInDay = 86400000;
  private double JulianDayAtEpoch = 2440587.5;
  private double JulianMilAtEpoch = JulianDayAtEpoch * 86400000;



  



  public static void main(String[] args){
    EarthDate ed = new EarthDate();
    System.out.println("TaiOffset: " + ed.TaiOffset);
    System.out.println("MilInDay: " + ed.MilInDay);
    System.out.println("JulianDateAtEpoch: " + ed.JulianDayAtEpoch);
    System.out.println("JulianMilAtEpoch: " + ed.JulianMilAtEpoch);


    System.out.println("Time:" + System.currentTimeMillis());

  }
}
