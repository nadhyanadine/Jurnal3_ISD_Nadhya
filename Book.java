public class Book {
    String Judul;
    String Penulis;
    int Tahunterbit;

    public Book(String Judul, String Penulis, int Tahunterbit) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Tahunterbit = Tahunterbit;
    }

    public void display() {
        System.out.println("Judul: " + this.Judul + ", Penulis: " + this.Penulis + ", Tahun terbit: " + this.Tahunterbit);
    }
}