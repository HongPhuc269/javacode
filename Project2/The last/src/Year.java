public enum Year {
     FRESHMAN("Năm thứ nhất"), SOPHONMORE("Năm thứ hai"), JUNIOR("Năm thứ ba"), SENIOR("Năm thứ tư"),ALUMNI("Cựu sinh viên");
    private String year;

    Year(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
}
