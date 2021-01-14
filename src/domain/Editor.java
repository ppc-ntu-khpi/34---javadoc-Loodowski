package domain;

/**
 * subclass of Artist that represents an editor
 * @see Artist
 * @author Kirukato
 */

public class Editor extends Artist {

    /**
     * constructor
     * @param electronicEditing status of electronic editing
     * @param skiils skills of editor
     * @param name name of editor
     * @param jobTitle job title
     * @param level level of editor
     * @param dept dept of editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * constructor
     * @param electronicEditing status of electronic editing
     * @param skiils skills of editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * constructor
     * @param electronicEditing status of electronic editing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * default constructor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Information about the person who has information about the skills and status of electronic editing
     * Method override method toString()
     * @return string with basic information about a person with information about skills and e-editing status
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Method by which you can get the status of electronic editing
     * @return  boolean value of status of electronic editing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method by which you can change status of electronic editing
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
