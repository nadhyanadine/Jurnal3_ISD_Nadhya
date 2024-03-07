import java.util.Scanner;

public class cb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        linklist linkedList = new linklist();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Buku di Awal");
            System.out.println("2. Input Data Buku di Akhir");
            System.out.println("3. Hapus Data Buku dari Awal");
            System.out.println("4. Hapus Data Buku dari Akhir");
            System.out.println("5. Cetak Seluruh Data Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    int tahun = scanner.nextInt();
                    scanner.nextLine(); // 
                    linkedList.addFirst(new Book(judul, penulis, tahun));
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    penulis = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    tahun = scanner.nextInt();
                    scanner.nextLine(); 
                    linkedList.addLast(new Book(judul, penulis, tahun));
                    break;
                case 3:
                    linkedList.deleteFirst();
                    break;
                case 4:
                    linkedList.deleteLast();
                    break;
                case 5:
                    linkedList.printList();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}