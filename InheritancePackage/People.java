package InheritancePackage;

import java.util.ArrayList;
import java.util.List;

public class People extends Community{

    public static void main(String[] args) {
        Community community = new Community();
        community.CommunityBoardwalk = "com_people";
        community.CommunityAspen = "com_peopleAspen";
        List<String> communitys = community.getPeopleName();
        System.out.println("people names : "+ communitys);

        People people = new People();
        List<String> peopleNames = people.getPeopleName();
        System.out.println("unknown names : "+ peopleNames);

        Community community1 = new People();
        community1.CommunityBoardwalk = "peoplecheckin";
        community1.CommunityAspen = "guest";
        System.out.println("brodwalk  name : "+ community1.CommunityBoardwalk);
        System.out.println("aspen name : "+ community1.CommunityAspen);
    }

    @Override
    public List<String> getPeopleName(){
        System.out.println("To get name from the get people name method to override result");
        List<String> names = new ArrayList<>();
        names.add("guest1");
        names.add("guest2");
        return names;
    }
}
