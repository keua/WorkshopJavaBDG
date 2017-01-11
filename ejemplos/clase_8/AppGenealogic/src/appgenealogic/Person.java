/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgenealogic;

/**
 *
 * @author selenium
 */
public class Person {
    
    private String strName;
    private String strWorkingPlace;

    public Person(String strName, String strWorkingPlace) {
        this.strName = strName;
        this.strWorkingPlace = strWorkingPlace;
    }

    /**
     * @return the strNombre
     */
    public String getStrName() {
        return strName;
    }

    /**
     * @param strNombre the strNombre to set
     */
    public void setStrName(String strNombre) {
        this.strName = strNombre;
    }

    /**
     * @return the strLugar
     */
    public String getStrWorkingPlace() {
        return strWorkingPlace;
    }

    /**
     * @param strLugar the strLugar to set
     */
    public void setStrWorkingPlace(String strLugar) {
        this.strWorkingPlace = strLugar;
    }
    
}
