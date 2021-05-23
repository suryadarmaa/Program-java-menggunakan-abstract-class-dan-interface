// membuat  abstract class bernama Mahasiswa yang
// mengimplementing interface DataMahasiswa
abstract class Mahasiswa implements DataMahasiswa {

    // Overriding dua methods dari interface DataMahasiswa
    @Override public void NimMahasiswa()
    {
        System.out.println(
                "Nim Saya : 2005551063");
    }
    @Override public void NamaMahasiswa()
    {
        System.out.println(
                "Nama Lengkap Saya I Putu Gede Suryadharma Adhi Natha");
    }
}
