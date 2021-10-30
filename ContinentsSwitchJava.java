/* prints out the largest cities on each
respective contitent via a switch statement
*/


public class ContinentsSwitchJava {
	public static void main(String[] args) {
    int continent = 4;

    switch(continent) {
      case(1):
        System.out.print("North America: Mexico City, Mexico");
        break;
      case(2):
        System.out.print("South America: Sao Paulo, Brazil");
        break;
      case(3):
        System.out.print("Europe: Moscow, Russia");
        break;
      case(4):
        System.out.print("Africa: Lagos, Nigeria");
        break;
      case(5):
        System.out.print("Asia: Shanghai, China");
        break;
      case(6):
        System.out.print("Australia: Sydney, Australia");
        break;
      case(7):
        System.out.print("Antarctica: McMurdo Station, US");
        break;
      default:
        System.out.println("Undefined continent!");
    }
	}
}