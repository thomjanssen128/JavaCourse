package nl.thom.h8;

public class PersonDiedException extends Exception { //checked exception
//    public class PersonDiedException extends RuntimeException { //runtime exception
        public PersonDiedException(String errorMessage) {
            super(errorMessage);
        }
}
