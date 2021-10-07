public class Viettel {
    private static String termName = "Vietel";

    private String clientName;
    private int establishYear;
    private String contentBoard;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public static String getTermName( ) {
        return termName;
    }

    public void setTermName(String termName) {
        Viettel.termName = termName;
    }

    public String getTermNameOfOb() {
        return Viettel.termName;
    }

    public int getEstablishYear() {
        return establishYear;
    }

    public void setEstablishYear(int establishYear) {
        this.establishYear = establishYear;
    }
}
