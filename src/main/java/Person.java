import java.util.ArrayList;
import java.util.HashSet;

public class Person {
    //region private attributes
    private String _name;
    private String _firstname;
    private String _phonenumber;
    private String _emailaddress; // Corrected the variable name to _emailaddress
    private ArrayList<String> _languages;
    //endregion private attributes

    //region public methods
    public Person(String name, String firstname, String phonenumber, String emailaddress, ArrayList<String> languages) {
        _name = name; // Assigned the value of name to _name
        _firstname = firstname;
        _phonenumber = phonenumber;
        _emailaddress = emailaddress; // Corrected the variable name to _emailaddress
        _languages = languages;
    }

    public String getName() {
        return _name;
    }

    public String getFirstname() {
        return _firstname;
    }

    public String getPhonenumber() {
        return _phonenumber;
    }

    public String getEmailaddress() {
        return _emailaddress;
    }

    public ArrayList<String> getLanguages() {
        return _languages;
    }
/*
    public void setLanguages(ArrayList<String> expectedLanguages) {
        this._languages = expectedLanguages;
    }*/
    public void setLanguages(ArrayList<String> expectedLanguages) {
        if (expectedLanguages != null) {
            this._languages = expectedLanguages;
    }
}

    //endregion public methods
}
