public class Task4 {
    //Для данных областей составить линейную программу,
    //которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
    //и false — в противном случае:

    public static void main(String[] args) {
        double x = Math.random()*10-5;
        double y = Math.random()*10-5;
        System.out.println("x= "+x+"; y=" + y + " : " +
                (x>=-2 && x<=2 && y>=0 && y<=4 || x>=-4 && x<=4 && y>=-3 && y<=0));
    }
}
