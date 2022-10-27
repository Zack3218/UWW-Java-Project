import java.util.Formatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class TestListing{
    public static void main (String[] args){
        ArrayList<BatterListing> list = new ArrayList<BatterListing>();
        list.add(new BatterListing("Ty Cobb", .3662));
        list.add(new BatterListing("Oscar Charleston", .3643));
        list.add(new BatterListing("Rogers Hornsby", .3585));
        list.add(new BatterListing("Shoeless Joe Jackson", .3558));
        list.add(new BatterListing("Jud Wilson", .3520));
        list.add(new BatterListing("Lefty O'Doul", .3593));
        list.add(new BatterListing("Turkey Stearnes", .3489));
        list.add(new BatterListing("Ed Delahanty", 0.3458));
        list.add(new BatterListing("Tris Speaker", 0.3447));
        list.add(new BatterListing("Billy Hamilton", 0.3444));
        list.add(new BatterListing("Ted Williams", 0.3444));
        list.add(new BatterListing("Dan Brouthers", 0.3424));
        list.add(new BatterListing("Babe Ruth", 0.3421));
        list.add(new BatterListing("Dave Orr", 0.3420));
        list.add(new BatterListing("Harry Heilmann", 0.3416));
        list.add(new BatterListing("Pete Browning", 0.3415));
        list.add(new BatterListing("Willie Keeler", 0.3413));
        list.add(new BatterListing("Bill Terry", 0.3412));
        list.add(new BatterListing("Lou Gehrig", 0.3401));
        list.add(new BatterListing("George Sisler", 0.3401));
        list.add(new BatterListing("Mule Suttles", 0.3396));
        list.add(new BatterListing("Jesse Burkett", 0.3382));
        list.add(new BatterListing("Tony Gwynn", 0.3382));
        list.add(new BatterListing("Nap Lajoie", 0.3382));
        list.add(new BatterListing("Jake Stenzel", 0.3378));
        list.add(new BatterListing("Riggs Stephenson", 0.3361));
        list.add(new BatterListing("Al Simmons", 0.3342));
        list.add(new BatterListing("Cap Anson", 0.3341));
        list.add(new BatterListing("John McGraw", 0.3336));
        list.add(new BatterListing("Eddie Collins", 0.3332));
        list.add(new BatterListing("Paul Waner", 0.3332));
        list.add(new BatterListing("Mike Donlin", 0.3326));
        list.add(new BatterListing("Sam Thompson", 0.3314));
        list.add(new BatterListing("Stan Musial", 0.3308));
        list.add(new BatterListing("Bill Lange", 0.3298));
        list.add(new BatterListing("Heinie Manush", 0.3298));
        list.add(new BatterListing("Willie Wells", 0.3296));
        list.add(new BatterListing("Biz Mackey", 0.3281));
        list.add(new BatterListing("Wade Boggs", 0.3279));
        list.add(new BatterListing("Rod Carew", 0.3278));
        list.add(new BatterListing("Honus Wagner", 0.3276));
        list.add(new BatterListing("Tip O'Neil", 0.3260));
        list.add(new BatterListing("Hugh Duffy", 0.3255));
        list.add(new BatterListing("Bog Fothergill", 0.3255));
        list.add(new BatterListing("Jimmie Foxx", 0.3253));
        list.add(new BatterListing("Cool Papa Bell", 0.3251));
        list.add(new BatterListing("Earle Combs", 0.3247));
        list.add(new BatterListing("Joe DiMaggio", 0.3246));
        list.add(new BatterListing("Babe Herman", 0.3245));
        list.add(new BatterListing("Joe Medwick", 0.3236));
        
        ArrayList<PitcherListing> pitchers = new ArrayList<PitcherListing>();
        pitchers.add(new PitcherListing("Ed Walsh", 1.816));
        pitchers.add(new PitcherListing("Addie Joss", 1.887));
        pitchers.add(new PitcherListing("Jim Devlin", 1.896));
        pitchers.add(new PitcherListing("Jack Pfiester", 2.024));
        pitchers.add(new PitcherListing("Smoky Joe Wood", 2.033));
        pitchers.add(new PitcherListing("Mordecai Brown", 2.057));
        pitchers.add(new PitcherListing("John Ward", 2.099));
        pitchers.add(new PitcherListing("Christy Mathewson", 2.133));
        pitchers.add(new PitcherListing("Al Spalding", 2.133));
        pitchers.add(new PitcherListing("Tommy Bond", 2.138));
        pitchers.add(new PitcherListing("Rube Waddell", 2.161));
        pitchers.add(new PitcherListing("Walter Johnson", 2.167));
        pitchers.add(new PitcherListing("Mariano Rivera", 2.209));
        pitchers.add(new PitcherListing("Jake Weimer", 2.231));
        pitchers.add(new PitcherListing("Orval Overall", 2.257));
        pitchers.add(new PitcherListing("Will White", 2.276));
        pitchers.add(new PitcherListing("Babe Ruth", 2.277));
        pitchers.add(new PitcherListing("Ed Reulbach", 2.284));
        pitchers.add(new PitcherListing("Jim Scott", 2.298));
        pitchers.add(new PitcherListing("Reb Russell", 2.334));
        pitchers.add(new PitcherListing("Andy Coakley", 2.350));
        pitchers.add(new PitcherListing("Eddie Plank", 2.350));
        pitchers.add(new PitcherListing("Larry Corcoran", 2.355));
        pitchers.add(new PitcherListing("Eddie Cicotte", 2.380));
        pitchers.add(new PitcherListing("George McQuillan", 2.381));
        pitchers.add(new PitcherListing("Ed Killian", 2.382));
        pitchers.add(new PitcherListing("Doc White", 2.391));
        pitchers.add(new PitcherListing("Harry Coveleski", 2.394));
        pitchers.add(new PitcherListing("Carl Lundgren", 2.417));
        pitchers.add(new PitcherListing("Nap Rucker", 2.421));
        pitchers.add(new PitcherListing("Candy Cummings", 2.424));
        pitchers.add(new PitcherListing("Jeff Tesreau", 2.428));
        pitchers.add(new PitcherListing("Joe Benz", 2.429));
        pitchers.add(new PitcherListing("Jim McCormick", 2.431));
        pitchers.add(new PitcherListing("George Bradley", 2.434));
        pitchers.add(new PitcherListing("Terry Larkin", 2.435));
        pitchers.add(new PitcherListing("Charles Bender", 2.455));
        pitchers.add(new PitcherListing("Hooks Wiltse", 2.471));
        pitchers.add(new PitcherListing("Sam Leever", 2.473));
        pitchers.add(new PitcherListing("Left Leifield", 2.473));
        pitchers.add(new PitcherListing("Clayton Kershaw", 2.479));
        pitchers.add(new PitcherListing("Hippo Vaughn", 2.486));
        pitchers.add(new PitcherListing("Bob Ewing", 2.492));
        pitchers.add(new PitcherListing("Cy Morgan", 2.509));
        pitchers.add(new PitcherListing("Ray Collins", 2.513));
        pitchers.add(new PitcherListing("Hoyt Wilhelm", 2.523));
        pitchers.add(new PitcherListing("Jacob deGrom", 2.525));
        pitchers.add(new PitcherListing("Lew Richie", 2.536));
        pitchers.add(new PitcherListing("Noodles Hahn", 2.546));
        pitchers.add(new PitcherListing("George Zettlein", 2.547));
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to rank a batter or a pitchers? (1 or 2) :");
        int number = input.nextInt();
        if(number < 1 || number > 2){
            System.out.printf("Invalid choice.%nExiting...%n");
            System.exit(0);
        }
        input.nextLine();
        
        if(number == 1){
            System.out.println("Please enter a batter's name: ");
            String userBatterName = input.nextLine();
       
            System.out.println("Please enter your batter's batting average: ");
            double userBatterAverage = input.nextDouble();
            input.nextLine();
            
            if(userBatterAverage > 1 || userBatterAverage < 0) {
            System.out.printf("Invalid batting average.%nExiting...%n");
            System.exit(0);
            }
        
            list.add(new BatterListing(userBatterName, userBatterAverage));
            Collections.sort(list, Comparator.comparing(BatterListing::getAverage));
            Collections.reverse(list);
        
            int i = 0;  
            for(BatterListing b : list){
                i++;
                System.out.print(i + ". ");
                System.out.println(b);
            }
            input.close();
        }
        else if(number == 2){
            System.out.println("Please enter a pitcher's name: ");
            String userPitcherName = input.nextLine();
        
            System.out.println("Please enter your pitcher's ERA: ");
            double userPitcherERA = input.nextDouble();
            input.nextLine();
            
            if(userPitcherERA > 10 || userPitcherERA < 0) {
            System.out.printf("Invalid pitcher ERA.%nExiting...%n");
            System.exit(0);
            }
        
            pitchers.add(new PitcherListing(userPitcherName, userPitcherERA));
            Collections.sort(pitchers, Comparator.comparing(PitcherListing::getERA));
        
            int j = 0;
            for(PitcherListing b : pitchers){
                j++;
                System.out.print(j + ". ");
                System.out.println(b);
            }
            input.close();
        }
    }
}
