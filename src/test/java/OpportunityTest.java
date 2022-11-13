import org.example.enums.Product;
import org.example.enums.Status;
import org.example.models.Opportunity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OpportunityTest {

    List<Opportunity> testArrayOpps = new ArrayList<>();

    Opportunity opp11, opp12;

    @BeforeEach
    public void init(){
        opp11 = new Opportunity("Paul Newman", Product.BOX, 5, Status.OPEN);
        opp12 = new Opportunity("kae Tempest", Product.HYBRID, 55, Status.OPEN);

        Opportunity.arrayOfOpps = testArrayOpps;
        testArrayOpps.add(opp11);

    }

    @Test
    @DisplayName("Check if the input dmName is correct")
    void check_WhenTheDmNameInput_OK(){
        assertEquals("Paul Newman", opp11.getDm());
        assertNotEquals("KaeTempest", opp12.getDm());
    }

    @Test
    @DisplayName("Check if the input quantity is correct")
    void check_WhenQuantityInput_OK(){
        assertEquals(5, opp11.getQuantity());
        assertNotEquals(0, opp12.getQuantity());

    }

    @Test
    @DisplayName("Check if generate new opportunity is OK")
    void check_GenerateNewOpp_ok(){
        assertEquals(1, testArrayOpps.size());

    }

    @Test
    @DisplayName("Check if add new opportunity is OK")
    void check_AddNewOpp_ok(){
        assertEquals(false, testArrayOpps.isEmpty());

    }

    @Test
    @DisplayName("Check if show Opportunity is OK")
    void check_ShowOpportunities_ok(){

        assertEquals(false,testArrayOpps.isEmpty());
    }


}