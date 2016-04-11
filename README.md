# Transposition Cipher
Transpostiotion cipher mengenkripksi pesan dengan mengatur ulang posisi tiap karakter. Plaintext (tanpa spasi) akan dipisahkan menjadi beberapa kolom sesuai dengan key yang dimasukkan. Key akan menentukan banyaknya kolom sehingga akan terbentuk matriks dengan ukuran n x m (m=nilai key). Banyaknya baris akan menyesuaikan panjangnya plaintext, apabila baris terakhir tidak terisi secara penuh, akan diisi dengan karakter "a" sampai satu baris tersebut penuh. Setelah matriks terbentuk, cara mengenkripsinya adalah menuliskan pesan secara vertikal dari atas ke bawah, dari kolom paling kiri menuju kolom paling kanan.  
<br>Plaintext: ILMUKOMPUTER</br> 
<br>![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/P%201.JPG)</br>
<br>Ciphertext : IKULOTMMEUPR</br>
<br>![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/C%201.JPG)</br>
<br>Contoh lainnya apabila panjang baris terakhir tidak memenuhi kapasitas matriks</br>
<br>Plaintext : "ILMUKOMPUTERUGM" akan diubah terlebih dahulu menjadi "ILMUKOMPUTERUGMA"</br>
<br>![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/P%202.JPG)</br>
<br>Ciphertext: IKUULOTGMMEMUPRA</br>
<br>![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/C%202.JPG)</br>
<br>Source code untuk **enkripsi** dapat dilihat pada [halaman ini] (https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/app/src/main/java/com/lucgu/tugaskriptografi/EncryptActivity.java)</br>

<br>Source code untuk **dekripsi** dapat dilihat pada [halaman ini] (https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/app/src/main/java/com/lucgu/tugaskriptografi/DecryptActivity.java)</br>
