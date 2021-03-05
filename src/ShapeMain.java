import java.util.Arrays;

public class ShapeMain {

    private static void displayArea(ShapeBasic b){
        System.out.println("Display area for the "+b.getName()+ ", The area is ==> "+b.calArea());
    }

    private static void displayCenter(ShapeBasic b){
       double[] fc =  b.findCenter();
           System.out.println("The center of the shape ==> "+Arrays.toString(fc));
    }

    private static void displayCircumference(ShapeBasic b){
        System.out.println("Display area for the "+b.getName()+ ", The circumference is ==> "+b.circumference());
    }

    private static void displayIsinside(ShapeBasic b){
        System.out.println("Is the given point inside the shape? ==> "+ b.insideShape()+"\n");
    }

    public static void main(String[] args) {
	// write your code here
        ShapeBasic[] shape = new ShapeBasic[3];
        //shape[0] = new Rectangle("Rectangle",10,20);
        shape[0] = new Triangle("Triangle",0,0,20,0,10,30,0,0,35,10,0);
        shape[1] = new Triangle("Triangle",0,0,10,30,20,0,0,0,10,10,0);
        shape[2] = new Circle("Circle",10,10,0,0,0,0,0,0,50,50,20);
        for (int i=0;i<shape.length;i++){
            displayArea(shape[i]);
            displayCenter(shape[i]);
            displayCircumference(shape[i]);
            displayIsinside(shape[i]);
        }

    }
}
