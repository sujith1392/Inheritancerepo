package InheritancePackage;

import java.util.ArrayList;
import java.util.List;

public class Community {
    String CommunityBoardwalk;
    String CommunityAspen;

    public List<String> getPeopleName(){
        System.out.println("To get people name from the community class");
        List<String> PeopleName = new ArrayList<>();
        PeopleName.add("name1");
        PeopleName.add("name2");
        return PeopleName;

    }

}
