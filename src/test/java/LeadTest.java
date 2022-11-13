import org.example.models.Leads;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LeadTest {

    List<Leads> testArray = new ArrayList<>();
    Leads lead, lead2;

    @BeforeEach
    public void init(){
        lead = new Leads("Victor hugo ", "655483673", "marina@emai.com", "BMW");
        lead2 = new Leads("Victor hugo ", "3465548367", "marina@emai.com", "BMW");

        Leads.arrayOfLeads = testArray;
        testArray.add(lead);



    }

    @Test
    @DisplayName("Check if the input name is correct")
    void check_WhenTheNameInput_OK() {
        assertEquals("Victor hugo", lead.getName());
        assertNotEquals("VicHugo", lead.getName());
    }

    @Test
    @DisplayName("Check if add new Lead is OK")
    void check_AddNewOpp_ok(){
        assertEquals(false, testArray.isEmpty());

    }



    @Test
    @DisplayName("Check if show leads is OK")
    void check_ShowLeads_ok(){
        assertEquals(false,testArray.isEmpty());
    }


}
