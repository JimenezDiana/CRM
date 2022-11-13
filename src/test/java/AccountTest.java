import org.example.enums.Industry;
import org.example.models.Accounts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    List<Accounts> arrayOfAcc = new ArrayList<>();


    Accounts accounts1, accounts2;




    @BeforeEach
    public void init() {

        accounts1 = new Accounts(Industry.ECOMMERCE, 10, "Barcelona", "Spain");
        accounts2 = new Accounts(Industry.MEDICAL, 122, "Paris", "Francia");

        Accounts.arrayOfAcc = arrayOfAcc;
        arrayOfAcc.add(accounts1);


    }

    @Test
    @DisplayName("Check if the input numbers of employees is correct")
    void check_WhenTheNumOfEmployeesInput_OK() {
        assertEquals(10, accounts1.getNumEmployees());
        assertNotEquals(0, accounts2.getNumEmployees());
    }

    @Test
    @DisplayName("Check if the input country is correct")
    void check_WhenTheCountryInput_OK() {
        assertNotEquals("France", accounts2.getCountryList());
    }


    @Test
    @DisplayName("Check if convert to Account is OK")
    void check_ConvertToAccount_ok(){
        assertEquals(1, arrayOfAcc.size());

    }

    //Faltaría el test de eliminarLead

}