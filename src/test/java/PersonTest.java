import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



// voila comme ça je suis trkl sur ma ligne :)
// tkt pas tout va bien se passer

public class PersonTest {
    //region private attributes
    private static String _name = "Einstein";
    private static String _firstname = "Albert";
    private static String _phonenumber = "+41793456789";
    private static String _emailaddress = "ae@relativity.org";

    private static ArrayList<String> _languages = new ArrayList<String>();
    private static Person _person;
    //endregion private attributes

    @BeforeAll
    public static void beforeAll() {
        _languages = new ArrayList<String>();
        _person = new Person(_name, _firstname, _phonenumber, _emailaddress, _languages);
    }

    @Test
    public void allProperties_afterInstantiation_getCorrectValues() {
        //given
        //refer to BeforeAll method

        //when
        //refer to BeforeAll method

        //then
        assertEquals(_name, _person.getName());
    }

    @Test
    public void allPropertiesAfterInstantiationGetCorrectValues() {
        // given

        // when

        // then
        assertEquals(_name, _person.getName());
        assertEquals(_firstname, _person.getFirstname());
        assertEquals(_phonenumber, _person.getPhonenumber());
        assertEquals(_emailaddress, _person.getEmailaddress());
        assertEquals(_languages, _person.getLanguages());
    }

    @Test
    public void languages_AddFirstLanguage_GetCorrectUniqueLanguage() {
        // given
        String expectedLanguage = "French";
        ArrayList<String> expectedLanguages = new ArrayList<>();
        expectedLanguages.add(expectedLanguage);

        Person _person = new Person("Fernado", "George", "089708882", "ouiouo@gmail.ch", expectedLanguages); // Assurez-vous que la classe Person existe et a un champ ou une propriété `languages`
        _person.setLanguages(expectedLanguages); // Assurez-vous que la méthode `setLanguages(List<String> languages)` est implémentée dans Person

        // then
        assertEquals(expectedLanguage, _person.getLanguages().get(0)); // Assurez-vous que la méthode `getLanguages()` est implémentée dans Person
    }


    @Test
    public void languages_AddMultipleLanguagesAtOnce_GetCorrectListOfLanguages() {
        // given
        ArrayList<String> expectedLanguages = new ArrayList<>();
        expectedLanguages.add("French");
        expectedLanguages.add("Spanish");
        expectedLanguages.add("German");

        Person _person = new Person("Fernado", "George", "089708882", "ouiouo@gmail.ch", expectedLanguages); // Assurez-vous que la classe Person existe et qu'elle a un champ ou une propriété `languages`
        _person.setLanguages(expectedLanguages); // Assurez-vous que Person a une méthode setLanguages(List<String> languages)

        // then
        assertEquals(expectedLanguages.size(), _person.getLanguages().size()); // Vérifie la taille des listes

        for (String expectedLanguage : expectedLanguages) {
            // Vérifie que chaque langue attendue est contenue dans la liste des langues du _person
            assertTrue(_person.getLanguages().contains(expectedLanguage));
        }
    }


    @Test
    public void languages_AddMultipleLanguagesInExistingLanguagesList_GetCorrectListOfLanguages() {
        // given
        ArrayList<String> initialLanguages = new ArrayList<>();
        initialLanguages.add("French");
        initialLanguages.add("Spanish");
        initialLanguages.add("German");

        ArrayList<String> additionalLanguages = new ArrayList<>();
        additionalLanguages.add("German");

        ArrayList<String> expectedLanguages = new ArrayList<>(initialLanguages);
        expectedLanguages.addAll(additionalLanguages);

        Person person = new Person("John", "Doe", "123456", "john.doe@example.com", initialLanguages);

        assertEquals(initialLanguages.size(), person.getLanguages().size());

        // when
        person.setLanguages(expectedLanguages);

        // then
        assertEquals(expectedLanguages.size(), person.getLanguages().size());
        for (String expectedLanguage : expectedLanguages) {
            assertTrue(person.getLanguages().contains(expectedLanguage));
        }
    }


    @Test
    public void languages_AddMultipleLanguagesInExistingLanguagesListWithDuplicate_GetCorrectListOfLanguages() {
        // given
        ArrayList<String> initialLanguages = new ArrayList<>();
        initialLanguages.add("French");
        initialLanguages.add("Spanish");
        initialLanguages.add("German");

        ArrayList<String> additionalLanguages = new ArrayList<>();
        additionalLanguages.add("Vietnamese");
        additionalLanguages.add("French"); // Added duplicate language

        ArrayList<String> expectedLanguages = new ArrayList<>(initialLanguages);
        expectedLanguages.add("Vietnamese");

        Person person = new Person("John", "Doe", "123456", "john.doe@example.com", initialLanguages);

        assertEquals(initialLanguages.size(), person.getLanguages().size());

        // when
        person.setLanguages(expectedLanguages);

        // then
        assertEquals(expectedLanguages.size(), person.getLanguages().size());
        for (String expectedLanguage : expectedLanguages) {
            assertTrue(person.getLanguages().contains(expectedLanguage));
        }
    }
}
    