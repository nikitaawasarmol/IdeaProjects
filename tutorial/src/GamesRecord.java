import java.util.Scanner;

class Player {

    String name, club;
    int average, baverage;

}

class FootBaller extends Player{

    void setname(String nm, String cl)
    {
        name = nm;
        club = cl;
    }

    void display_footballer()
    {
        System.out.println("Footballer's Name is :" +name);
        System.out.println("Footballer's Club is: " +club);
    }

}
class Cricketer extends Player{

    void setname_cri(String nm, int avg)
    {
        name = nm;
        average = avg;
    }

    void disp()
    {
        System.out.println("Batsman's Name is:" + name);
        System.out.println("And Batting Average is:" + average);
    }

}
class Bowler extends Cricketer{

    void setname_bowler(String nm, int avg, int bavg)
    {
        name = nm;
        average = avg;
        baverage = bavg;

    }

    void disp_bowler()
    {
        System.out.println("Batsman's Name is:" + name);
        System.out.println("And Bolling Average is:" + baverage);
        System.out.println("And Batting Average is:" + average);
    }
}
public class GamesRecord {

    public static void main(String[] args) {

        int ch, ch2, i=0;

        do
        {

            System.out.println("Enter choice \n 1.Footballer\n 2.Cricketer \n 3. Exit ");
            Scanner s1 = new Scanner(System.in);
            ch = s1.nextInt();

            Bowler obj = new Bowler();
            FootBaller obj2 = new FootBaller();

            switch(ch)
            {
                case 1:

                    System.out.println("Enter Footballer's Name");
                    String fb_name = s1.next();

                    System.out.println("Enter Footballer's  Club");
                    String fb_club = s1.next();

                    obj2.setname(fb_name, fb_club);
                    obj2.display_footballer();
                    break;

                case 2:
                    if(ch == 2)
                    {
                        System.out.println("Enter Choice \n 1.Batsman \n 2.Bowler");
                        ch2 = s1.nextInt();

                        if(ch2 == 1)
                        {
                            System.out.println("Enter Batsman's Name: ");
                            String bats_name = s1.next();

                            System.out.println("Enter Batsman's Batting Average: ");
                            int bat_avg = s1.nextInt();

                            obj.setname_cri(bats_name, bat_avg);
                            obj.disp();
                        }

                        else
                        {
                            System.out.println("Enter Bowler's Name: ");
                            String bow_name = s1.next();

                            System.out.println("Enter Bowler's Batting Average: ");
                            int bow_avg = s1.nextInt();
                            System.out.println("Enter Bowler's Average: ");
                            int bol_avg = s1.nextInt();

                            obj.setname_bowler(bow_name, bow_avg, bol_avg);
                            obj.disp_bowler();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exited from the program!");

            }
        }

        while(ch!=3);
    }
}