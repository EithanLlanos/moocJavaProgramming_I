
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared){
        if(!(compared instanceof Book)) return false;
        
        Book comp = (Book)compared;
        
        return this.name.equals(comp.getName()) && this.publicationYear==comp.getPublicationYear();
    }

}
