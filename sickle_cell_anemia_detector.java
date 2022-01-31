public class anemiaInfo {
    private String geneticDNA;
    private String geneticRNA;
    private String firstDNA, secDNA, thirdDNA, forthDNA, fifDNA, siDNA, firstRNA, secRNA, thirdRNA, forthRNA, fifRNA, siRNA;
    private String name;
    final String normalDNA = "CACGTGGACTGAGGACTCCTC";
    final String normalRNA = "GUGCACCUGACUCCUGAGGAG";
    public anemiaInfo(){
        geneticDNA = normalDNA;
        geneticRNA = normalRNA;
        name = "User";
    }
    public anemiaInfo(String name, String fDNA, String sDNA, String tDNA,String foDNA, String fiDNA,String sixDNA, String fRNA, String sRNA, String tRNA, String foRNA, String fiRNA, String sixRNA){
        this.name = name;
        firstDNA = fDNA;
        secDNA = sDNA;
        thirdDNA = tDNA;
        forthDNA = foDNA;
        fifDNA = fiDNA;
        siDNA = sixDNA;
        firstRNA = fRNA;
        secRNA = sRNA;
        thirdRNA = tRNA;
        forthRNA = foRNA;
        fifRNA = fiRNA;
        siRNA = sixRNA;
    }
    public String getfirstDNA(){
        return firstDNA;
    }
    public String getsecondDNA(){
        return secDNA;
    }
    public String getthirdDNA(){
        return thirdDNA;
    }
    public String getforthDNA(){
        return forthDNA;
    }
    public String getfifthDNA(){
        return fifDNA;
    }
    public String getsixthDNA(){
        return siDNA;
    }
    public String getfirstRNA(){
        return firstRNA;
    }
    public String getsecondRNA(){
        return secRNA;
    }
    public String getthirdRNA(){
        return thirdRNA;
    }
    public String getforthRNA(){
        return forthRNA;
    }
    public String getfifthRNA(){
        return fifRNA;
    }
    public String getsixthRNA(){
        return siRNA;
    }
    public String getName(){
        return name;
    }
    
}
