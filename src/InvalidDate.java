public class InvalidDate extends Exception {
    private String message;

    public InvalidDate(String text){
        this.message = text;
    }

    public String getMessage() {
        return this.message;
    }
}
