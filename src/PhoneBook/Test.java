package PhoneBook;

public class Test {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.addContact("Петя Петянов", "+79992286868");
        phoneBook.addContact("Вова Вованов", "+79992286867");
        phoneBook.addContact("Гоша Гошанов", "+79992286866");
        phoneBook.addContact("Саша Сашанов", "+79992286865");
        phoneBook.addContact("Илья Ильянов", "+79992286864");
        phoneBook.addContact("Олег Олегов", "+79992286863");
        phoneBook.print();
    }
}
