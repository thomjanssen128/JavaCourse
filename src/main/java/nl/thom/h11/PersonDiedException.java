package nl.thom.h11;

public class PersonDiedException extends Exception { //checked exception
//    public class PersonDiedException extends RuntimeException { //runtime exception
        public PersonDiedException(String errorMessage) {
            super(errorMessage);
        }
}
