//To represent a book 
class Book {
    String title;
    Author author; 
    int price;
    
    //Constructor 
    Book(String title, Author author, int price){
        this.title = title;
        this.author = author; 
        this.price = price;
    }
}

//To represent an author
class Author {
    String name;
    int yob;

    //Constructor 
    Author(String name, int yob) {
        this.name = name;
        this.yob = yob;
    }
}

//Examples and tests for authors & books 
class ExampleBooks {
    ExampleBooks() {}

    Author max = new Author("Max Rampulla",1998);
    Book diary = new Book("Diary", this.max, 99);
}