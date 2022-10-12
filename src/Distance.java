import java.util.Scanner;
    import java.util.Scanner;
    public class Distance {
        static int x,y,x1=0,y1=0;

        static double dis;
        public void distance(){
            dis = Math.sqrt((x*x)+(y*y));

            System.out.println("distancebetween" + " ("+x+","+y+")"+" ("+x1+","+y1+") is ::\t " +dis);

        }
        public void input(){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter x point");

            x=sc.nextInt();

            System.out.println("enter y point");

            y=sc.nextInt();
        }
        public static void main(String[] args) {
            Distance i = new Distance();
            i.input();
            Distance d = new Distance();
            d.distance();


        }

    }


