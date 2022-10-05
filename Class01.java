
package Java111Q1;
import Java111Q1.Cal_area;
class Cal_area
{
	int length;
    int width;
    int height;
    double radius;
    void showData1() {
        System.out.println("長 = " +length);
        System.out.println("寬 = " +width);
        System.out.println("高 = " +height);
        System.out.println("半徑 = " +radius);
        
        
    }
    void showData2() {
    	 System.out.printf("球形體積 = " + "%.1f", ((double) 3.14159 * radius * radius * radius * 4 / 3));
    	System.out.println("立方體表面積 = " + ((length * width + length * height + height * width) * 2));
}

void showAll() {
    showData2();
   
    showData1();
    
}



}
  
public class Class01 {

	
	public static void main(String[] args) {
		  Cal_area area = new Cal_area();
	        area.length = 4;
	        area.width = 5;
	        area.height = 6;
	        area.radius = 10;
	        area.showAll();
	}

}
