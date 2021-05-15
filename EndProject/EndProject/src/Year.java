public enum Year {
    FRESHMAN("Năm thứ nhất"), SOPHONMORE("Năm thứ 2"), JUNIOR("Năm thứ 3"), SENIOR("Năm thứ 4"),ALUMNI("Cựu sinh viên");
    private String year;

    private Year(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
}
