public class Prisoner {
    public String nama;        
    public double tinggiMeter; 
    public int hukumanTahun;   

    public void prisoner(String nama, double tinggiMeter, int hukumanTahun) {
        this.nama = nama;
        this.tinggiMeter = tinggiMeter;
        this.hukumanTahun = hukumanTahun;
    }

    @Override
    public String toString() {
        return String.format("Tahanan{nama='%s', tinggi=%.2fm, hukuman=%d tahun}",
                nama, tinggiMeter, hukumanTahun);
    }
}