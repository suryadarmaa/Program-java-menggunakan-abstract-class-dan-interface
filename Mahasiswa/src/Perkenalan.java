// membuat non abstract class
// Perkenalan yang men extending class Mahasiswa
class Perkenalan extends Mahasiswa {
    // overriding sisa method dari interface DataMahasiswa
    @Override public void text()
    {
        System.out.println(
                "Saya Berasal Dari Bali, hobi saya bermain game, saya berumur 18 tahun. " +
                        "Saya berkuliah di Universitas Udayana Jurusan Teknologi Informasi");
    }
}
