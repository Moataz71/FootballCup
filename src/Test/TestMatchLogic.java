package Test;
import com.team.Amateur;
import com.team.Professional;
import com.team.Team;
import match.MatchLogic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TestMatchLogic {
    Professional pro1 = new Professional();
    Amateur am1 = new Amateur();
    List<Team> allTeams = new ArrayList<>();

    @Before
    public void BeforeMatchlogicTest(){

        pro1.setTeamName("Juventeus");
        pro1.setId(1);
        pro1.setType("Profesional");
        pro1.setSponsor("Sky");
        pro1.setBudget(100000);

        am1.setTeamName("Real Madrid");
        am1.setId(5);
        am1.setType("Amateur");
        am1.setMascotte("Bear");
        am1.setHomeBar("Kawk");

        allTeams.add(pro1);
        allTeams.add(am1);
    }

    @Test
    public void TestMatchlogic(){
        int count1 = allTeams.size()-1;
        MatchLogic.match(pro1, am1, allTeams);
        int count2 = allTeams.size();
        assertEquals("Test the match",count1,count2);
    }

}
