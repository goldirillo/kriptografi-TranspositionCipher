# Transposition Cipher
Transpostiotion cipher mengenkripksi pesan dengan mengatur ulang posisi tiap karakter. Plaintext (tanpa spasi) akan dipisahkan menjadi beberapa kolom sesuai dengan key yang dimasukkan. Key akan menentukan banyaknya kolom sehingga akan terbentuk matriks dengan ukuran n x m (m=nilai key). Banyaknya baris akan menyesuaikan panjangnya plaintext, apabila baris terakhir tidak terisi secara penuh, akan diisi dengan karakter "a" sampai satu baris tersebut penuh. Setelah matriks terbentuk, cara mengenkripsinya adalah menuliskan pesan secara vertikal dari atas ke bawah, dari kolom paling kiri menuju kolom paling kanan.  
Plaintext: ILMUKOMPUTER
![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/P%201.JPG)
Ciphertext : IKULOTMMEUPR
![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/C%201.JPG)
Contoh lainnya apabila panjang baris terakhir tidak memenuhi kapasitas matriks
Plaintext : ILMUKOMPUTERUGM 
akan diolah menjadi
>ILMUKOMPUTERUGMA
![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/P%202.JPG)
Ciphertext: IKUULOTGMMEMUPRA
![alt tag](https://github.com/goldirillo/kriptografi-TranspositionCipher/blob/master/screenshoot/C%202.JPG)
