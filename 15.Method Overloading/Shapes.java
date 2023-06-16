class Shapes{
// Area of sqaure
int area(int l){
return l*l;
}
// Area of Rectangle
int area(int l, int b){
return l*b;
}
// Area of Cuboid
int area(int l, int b, int h){
return ((2*l*b) + (2*l*h) + (2*h*b));
}
public static void main(String[] args){
Shapes s = new Shapes();
System.out.println("Area of square: " + s.area(5));
System.out.println("Area of Rectangle: " + s.area(9,12));
System.out.println("Area of Cuboid: " + s.area(2,3,8));
}
}

