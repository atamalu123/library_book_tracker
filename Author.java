/*
 * 2. An Author class (with details such as name or nationality). 
 */

public class Author {
    private String name;

    // Constructor
    public Author(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString(){
        return "Author: " + name;
    }

}
