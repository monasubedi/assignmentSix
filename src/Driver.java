public class Driver {
    public static void main(String[]args){

        Figure[] figures = {new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
        for(Figure f : figures){
           f.getFigure();
        }
        System.out.println("UpwardHat :");
        System.out.println("UpwardHat :" + figures[1]);
        System.out.println("DownwardHat :" + figures[2]);
        System.out.println("FaceMaker :" + figures[3]);
        System.out.println("Vertical :" + figures[4]);


    }
}
