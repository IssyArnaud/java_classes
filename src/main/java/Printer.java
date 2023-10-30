public class Printer {
    private int sheets;
    private int toner;

    public Printer(){
        this.sheets = 1000;
        this.toner = 100;
    }

    public int getSheets(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public int print(int numPages, int numCopies){
        int sheetsUsed = numPages * numCopies;
        if (sheets >= sheetsUsed && toner > sheetsUsed){
            sheets -= sheetsUsed;
            toner -= sheetsUsed;
            return sheets;
        } else {
            return sheets;
        }
    }
}
