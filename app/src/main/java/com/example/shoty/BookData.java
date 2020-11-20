package com.example.shoty;

import java.util.ArrayList;

public class BookData {
    private static String[] bookTitles = {
            "Hujan",
            "Mawar Putih",
            "Kamu! Titik!",
            "Senja dan Cerita",
            "Seramnya Rumah Leo",
            "Hantu Lorong Biru",
            "Gadis Bus Malam",
            "Makam Tersembunyi",
            "Aku, Putri Ayah",
            "Janji Arga",
            "Pensil Rapuh",
            "Misteri Surat Melody",
            "Persahabatan Keren",
            "Roti Bakar Rasa Cokelat",
            "Move On",
            "Keep Friends",
            "Hujan Duit",
            "Waktu",
            "My Dark Life",
            "Aku, Putri Ayah",
            "Akhir Penyesalan",
            "Selembar Kertas",
            "Dialah Lelaki Yang Kunanti",
            "Pengagum Rahasia",
            "Sampaikan Salamku Untuk Dia",
    };
    private static String[] authorNames = {
            "Siti Muyasaroh",
            "Dessy Lusiana",
            "Umay",
            "Radatul Akbar",
            "Erfransdo",
            "Ravain Farros Alhasbi",
            "Okta. M. Azka",
            "Virenza3579",
            "Qomareea",
            "Prisa",
            "Rizka Ayu Damayanti",
            "Naira Khansa Nabila",
            "Danvi Sekartaji",
            "Putiara",
            "Mellania Yosha",
            "Windi",
            "Rizka Fitri Oktora",
            "Sinto",
            "Cherry",
            "Qomareea",
            "Shavia Maulidina",
            "Misa Ry",
            "Siti Rayyan Umami",
            "Nia Saputri",
            "Adiningsih",
    };
    private static String[] categories = {
            "Romance",
            "Romance",
            "Romance",
            "Romance",
            "Horror",
            "Horror",
            "Horror",
            "Horror",
            "Drama",
            "Drama",
            "Drama",
            "Drama",
            "Friendship",
            "Friendship",
            "Friendship",
            "Friendship",
            "Thriller",
            "Thriller",
            "Thriller",
            "Family",
            "Family",
            "Family",
            "School Life",
            "School Life",
            "School Life",
    };
    private static String[] isiBuku = {
                    "“zal… bangun zal!!!” seorang wanita yang rambutnya telah memutih mengguncang-guncang tubuhku. Baru sekitar 15 menit yang lalu mataku terpejam, dan sekarang dipaksa bangun.\n" +
                    "“iya… kenapa eyang?” jawabku dengan mata tertutup rapat.\n" +
                    "“tolong jemput Gendis di bandara, sopir eyang sakit. Gendis mau ke sini, bentar lagi pesawatnya mendarat.” Mendengar nama Gendis kantukku menguap, aku langsung mengambil posisi duduk,\n" +
                    "“Gendis? Dia mau ke sini eyang?” tanyaku memastikan pendengaranku masih normal\n" +
                    "“iya… dia mau kuliah di sini, cepetan jemput dia, kasian cucu eyang kalau harus nunggu lama.” Aku langsung beranjak menyambar jaket dan kunci motor, tanpa pikir panjang aku langsung menuju bandara. Tak kuhiraukan lagi suara eyang yang memanggil-manggil namaku, dalam benakku saat ini adalah bertemu Gendis, Seperti apa dia sekarang? Masih ingatkah dia denganku? Kalau tidak salah sudah hampir 10 tahun aku tidak bertemu dengannya.\n" +
                    "Gendis adalah temanku waktu kecil, dia 2 tahun lebih muda dariku, rumah kita sebelahan. Sayangnya setelah lulus SD dia bersama orangtuanya pindah kesumatra.\n" +
                    "Sudah sekitar 2 jam aku mengitari bandara, baru kusesali betapa bodohnya aku, kenapa tadi aku tidak membawa ponsel atau apalah yang sekiranya membuatku mudah mencari Gendis. Mataku terus memilah satu persatu orang yang aku temui,\n" +
                    "“Rizal…” ku menoleh ke sumber suara, seorang gadis membawa ransel berjalan ke arahku. Tak salah lagi, itu Gendis. Jantungku berdetak sangat cepat.\n" +
                    "“Rizal kan?” tanyanya,\n" +
                    "“Yuuuup” jawabku, gadis itu langsung memelukku.\n" +
                    "“Kenapa kamu tumbuh begitu baik?” katanya sambil melepas tangan yang melingkar di leherku dan tersenyum manis.\n" +
                    "“Hahahaa… haruskah aku sepertimu? Gagal tumbuh. Seingatku dulu tinggimu juga segini.” Jawabku sekenanya.\n" +
                    "“Nyebelin, tinggiku sudah nambah dari terakhir kita ketemu. Ayo pulang.”\n" +
                    "Kita berjalan keluar bandara, hujan menyambut kami.\n" +
                    "“Kita nunggu reda dulu ya?” kataku.\n" +
                    "“Langsung aja, sekalian hujan-hujan.” Katanya antusias.\n" +
                    "“Ya udah kamu tunggu di sini, biar aku ambil motor dulu.” Sebenarnya aku nggak suka kehujanan, tapi aku ngak tega menolak keinginannya. Naasnya di bagasi motorku nggak ada jas hujan, aku lupa membawanya. Terpaksa basah kuyup sampe rumah. Kusamperin Gendis, kulepas jaketku, memang ku tak suka dingin tapi aku lebih tak suka melihatnya kedinginan.\n" +
                    "Selama perjalanan pulang kita saling diam, sibuk dengan pikiran masing-masing. Baru pertama aku merasa hujan begitu indah.\n" +
                    "“Rizal…” suara bunda dari bawah memekakkan telinga,\n" +
                    "“Iya Bunda… Kenapa?” teriakku tak bergemih dari balik selimut,\n" +
                    "Tok… Tok… Tok…\n" +
                    "“Masuk bunda, nggak dikunci” kataku, eh… tapi nggak biasanya bunda ketuk pintu sebelum masuk kamar, kusibakkan selimutku, ternyata Gendis di ambang pintu membawa nampan berisi makanan, segelas air putih dan obat. Dia tersenyum kemudian raut mukanya berubah\n" +
                    "“Maaf zal, aku lupa kalau kamu alergi dingin,” Katanya dengan muka tertunduk\n" +
                    "“Sudahlah, mana makananku? Keburu laper nih.” Jawabku, dia berjalan keranjangku, kuambil posisi duduk yang pas,\n" +
                    "“Nih… kata bunda harus dihabisin.”\n" +
                    "“Kata bunda apa kata Gendis?” tanyaku mencoba mencairkan suasana, kulihat raut wajahnya masih merasa bersalah.\n" +
                    "“Iihhh… Besok temeni Gendis daftar kuliah ya?”\n" +
                    "“Mau kuliah jurusan apa?” tanyaku dengan mulut penuh makanan.\n" +
                    "“Sastra bahasa, kamu kuliah jurusan apa zal?”\n" +
                    "“Teknik komputer.” Dalam hati aku berharap bisa satu kampus dengannya tapi sepertinya tidak mungkin, kampusku tidak ada jurusan sastra.\n" +
                    "“Gimana? Bisa nggak?” tanyanya memastikan\n" +
                    "“Siap, setelah itu temeni jalan-jalan ya?”\n" +
                    "“Okee, ke candi ya? Udah lama nggak liat candi.”\n" +
                    "“Iya … terserah kamu aja.”\n" +
                    "“Kalau begitu makan yang banyak, terus minum obat biar cepet sembuh. Kan nggak lucu cewek cantik jalan-jalan sama cowok penuh dengan bentol-bentol. Hahaha.” Tak ada yang berubah dari seorang Gendis, dia masih seperti dulu, begitu menggemaskan.\n" +
                    "Meski kita beda Universitas tapi tiada hari yang kulewati tanpa Gendis, dari hanya ngobrol biasa di teras sampai jalan-jalan keluar, entah kenapa Jogja jauh lebih indah sejak dia kembali di sini. Dan anehnya sekarang aku menyukai hujan, entah sengaja maupun tidak terkadang aku dan Gendis hujan-hujanan. Mungkin terdengar aneh dua remaja usang main hujan-hujan, tapi kami menyukainya, walaupun setelah itu kami harus mendengar bunda dan eyang ngomel, atau aku yang harus menelan obat alergi.\n" +
                    "Malam ini hujan, aku dan Gendis duduk di teras rumahnya. Gendis bercerita tentang banyak hal, tapi kemudian kita sama-sama terdiam.\n" +
                    "”Gendis?” kataku, membuka kembali percakapan\n" +
                    "“Ya?”\n" +
                    "“Kenapa kamu suka hujan?”\n" +
                    "“Entah, seru aja. Keliatannya kamu juga suka hujan, kenapa?”\n" +
                    "“Karena kamu.” Kata yang keluar begitu mulus, seketika itu juga aku menyesali apa yang aku katakan, kita kembali terjebak hening.\n" +
                    "Pukul 9 malam aku baru pulang dari rumah teman. Kulihat bunda dan eyang duduk di teras rumah eyang, tumben Gendis tak ada, biasa tiga wanita beda generasi itu selalu kompak. Bunda memanggilku, kuberjalan gontai ke arah mereka, kulihat muka mereka cemas,\n" +
                    "“Rizal, Gendis belum pulang kuliah, kamu cari dia ya.” Kata bunda,\n" +
                    "“Sepertinya bentar lagi mau hujan, tolong cari dia.” Sambung eyang,\n" +
                    "“Iya, Rizal pamit.” Tanpa berkata lagi aku langsung mengambil motorku dan kembali menyisiri jalan. Butiran air mulai turun membuatku mulai cemas, walau biasanya Gendis suka hujan-hujan tapi ini terlalu larut untuk hujan-hujan. Di persimpangan jalan kampus Gendis, aku melihatnya berjalan sendiri, perasaanku lega.\n" +
                    "Bbbrraaaaaaaaak…\n" +
                    "Kubuka mataku, kulihat atap, ini bukan kamarku, aku di mana? Kenapa seluruh tubuhku terasa sakit dan kaki tak bisa digerakkan. Kulihat sekelilingku, Bunda memeluk Gendis yang tengah terisak, eyang, kakak-kakakku, kakak-kakak iparku, dan ayah menatapku sedih. Semua bungkam. Kemudian ayah tersenyum parau,\n" +
                    "“Bagaimana keadaanmu nak?” tanya ayah,\n" +
                    "“Ayah aku kenapa?” timpalku,\n" +
                    "“Kemarin kamu kecelakaan dan sekarang kamu lumpuh.” Kata bunda lirih, semua kembali gelap.\n" +
                    "Kubuka mataku, kini di kamar ini hanya ada Gendis yang mentapku sedih.\n" +
                    "“Kamu sudah sadar?” tanyanya, tapi aku hanya diam.\n" +
                    "“Boleh aku minta sesuatu?”\n" +
                    "“Apa?”\n" +
                    "“Bolehkah aku menjadi kekasihmu?” sebuah pertanyaan yang dari dulu ingin kutanyakan padanya, tapi kini pertanyaan itu seperti membunuhku\n" +
                    "“Jangan katakan itu karena kamu merasa iba padaku, aku tak apa-apa,”\n" +
                    "Gendis menatapku semakin dalam, mata coklatnya kembali menangis. Dia mengeluarkan sesuatu dari tasnya, sebuah kalung. Kalung yang kuberi sebelum dia pergi.\n" +
                    "“ingat ini? Kalung ini selalu kubawa ke manapun aku pergi, aku kembali kesini bukan hanya karena eyang ataupun kuliah, tapi juga karena kamu, tak sehari pun kulewati tanpa merindukanmu tak peduli sekarang kakimu lumpuh, bahkan jika seluruh tubuhmu yang lumpuh aku akan tetap mencintaimu.” Dunia yang dua jam lalu kupikir mati bersemi dengan seketika, semua akan mudah jika dia ada di sisiku.\n" +
                    "“Tapi setelah ini kita tak bisa berjalan di bawah hujan bersama” kataku dengan tersenyum. Dia beranjak memelukku dan berbisik\n" +
                    "“Tak apa. Kita bisa menikmatinya di teras.”\n" +
                    "\n",
            "Aku mawar, aku adalah seorang gadis yang tinggal di sebuah rumah sewaan yang terletak tidak jauh dari tempatku bekerja, aku bekerja di salah satu toko roti dan pergi bekerja pukul 12 siang dan pulang pukul 7 malam.\n" +
                    "\n" +
                    "Pada suatu malam saat aku pulang bekerja, aku melihat setangkai bunga mawar putih di kursi depan rumahku, karena penasaran aku pun mengambil mawar putih itu “wah ternyata bunganya masih segar dan sangat harum” aku berkata sambil melihat di sekitar untuk memastikan bahwa mawar putih itu tidak ada pemiliknya. Setelah yakin kemudian aku masuk ke dalam rumah dengan membawa bunganya lalu meletakkan bunga itu di dalam vas yang berisi air agar tidak layu.\n" +
                    "\n" +
                    "Keesokan harinya aku berangkat kerja seperti biasa pada siang hari tapi tidak saat pulang karena rekan kerjaku malam itu minta untuk pulang terlebih dahulu karena dia terdesak oleh urusan keluarga, jadi dua jam terakhir bekerja aku sendirian di toko itu hingga jam tutup toko tiba.\n" +
                    "\n" +
                    "\n" +
                    "Sebelum tutup ada seorang pelanggan laki-laki yang datang untuk membeli beberapa roti berselai coklat, saat dia membayar belanjaannya di kasir tercium olehku bau parfumnya yang begitu wangi lalu hatiku berkata “wah ini cowok sudah ganteng wangi lagi”, setelah membayar pelanggan itu pergi dan aku bergegas bersih-bersih lalu segera menutup toko.\n" +
                    "\n" +
                    "Aku sampai di rumah sekitar pukul 8 malam karena harus menutup toko sendirian, sesampainya di rumah aku kembali melihat setangkai mawar putih di kursi depan rumahku “kayanya ada yang sengaja meletakkan bunga ini, kenapa setiap malam ada disini” aku berkata sambil melihat di sekeliling dan mencium bunga yang memiliki wangi yang sama seperti bunga mawar putih yang ku dapat sebelumnya, tanpa mengambil pusing karena lelah bekerja, aku masuk ke dalam rumah dan membawa setangkai mawar putih lalu meletakkan di dalam vas bersamaan dengan bunga yang kudapat kemarin malam. Aku membersihkan diri, berganti pakaian dan pergi ke kamar untuk tidur.\n" +
                    "\n" +
                    "Pada hari sabtu aku tidak pergi bekerja karena mendapat jadwal off jadi aku berencana untuk pergi berjalan-jalan mengisi liburan kerja hari ini, pada siang hari aku pergi ke mall untuk menonton bioskop bersama Rina, ia adalah teman masa kecilku dan kami masih berteman akrab hingga sekarang. Setelah menonton bioskop aku dan Rina makan siang kemudian mengelilingi mall untuk menghabiskan waktu bersama.\n" +
                    "\n" +
                    "Rina bertanya “way, kamu libur kerja kok jalan sama aku? Pacarmu mana? Hehe” (way adalah panggilan Rina padaku saat masih kecil), “ih nana mah nanya nya gitu, aku mana ada punya pacar” (nana adalah panggilanku buat Rina saat masih kecil) kemudian kami tertawa bersamaan, “yuk ah, jalan” aku menggandeng Rina lalu kami berjalan kembali.\n" +
                    "\n" +
                    "Pukul 9 malam kami pulang, Rina ikut bersamaku karena ia akan menginap di rumahku malam ini, sesampainya di depan rumah lagi-lagi aku mendapat setangkai bunga mawar putih di atas kursi, masih dengan wangi yang sama, “bunga dari siapa way? Wangi banget ih. Ciee mawayyy” Rina bertanya dengan bercanda, “aku juga gak tau na, beberapa hari ini selalu ada bunga mawar putih di kursi ini setiap aku pulang kerja sama seperti hari ini” jelasku, “dari penggemarmu mungkin way, kali aja jodoh hehe” Rina kembali bercanda, sambil membawa bunga itu aku dan Rina masuk ke dalam rumah “boro-boro jodoh na, wujudnya orang yang kasih bunga aja aku gak tau?” lalu kami tertawa.\n" +
                    "\n" +
                    "Saat Rina telah terlelap tidur, aku masih di ruang tamu untuk menonton drama kesukaanku yang tayang di tv kemudian terdengar suara benda jatuh dari luar rumah lalu aku lekas berdiri dan pergi keluar untuk melihat ada apa di luar, tapi setelah tiba di luar aku tidak melihat ada satu orang pun di sana bahkan untuk orang lalu lalang pun tidak terlihat, merasa tidak menemukan apa-apa lalu aku kembali ke dalam rumah dan menonton tv hingga tertidur.\n" +
                    "\n" +
                    "Keesokan harinya Rina pulang pagi-pagi sekali karena ia harus pergi bekerja, aku mengantar Rina sampai ke jalan raya untuk mencari angkot, setelah ia pergi aku kembali ke rumah, saat hampir sampai di rumah aku terkejut melihat seorang laki-laki menaruh setangkai bunga di atas kursi depan rumahku. Tapi aku diam saja dan tidak menegur laki-laki itu karena aku tidak mau mengagetkannya dan membuatnya pergi, aku bergerak mundur sedikit dari tempatku berdiri dan bersembunyi di belakang pohon besar agar tidak terlihat olehnya, wajah laki-laki tidak jelas terlihat karena ia memakai topi dan selalu menundukkan kepala.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Setelah meletakkan bunga di kursi laki-laki itu pergi dengan cepat dari rumahku, aku bergegas menghampiri kursi lalu mengambil bunga itu “wanginya sama, ternyata laki-laki itu yang memberiku bunga setiap hari” kuucap dalam hati.\n" +
                    "\n" +
                    "Aku masuk ke dalam rumah dengan perasaan heran “kenapa dia meletakkan bunga itu di luar pada pagi hari bukan pada malam hari seperti biasanya. Kenapa?” aku pun bertanya-tanya seorang diri.\n" +
                    "\n" +
                    "Pada saat aku pulang bekerja di dalam perjalanan aku dihadang oleh sekumpulan anak muda yang nongkrong di depan gang kecil dengan beberapa botol minuman keras yang terlihat di sudut gang, mereka menghalangi jalanku, menggoda hingga berusaha menyentuhku, aku pun merasa terganggu dengan perbuatan mereka dan berkata “yaaaaa, jangan halangi jalanku! Minggir atau aku akan teriak?”, mereka bukannya berhenti menggangguku malah semakin menjadi-jadi. Lalu aku berusaha melawan mereka, disaat yang bersamaan datang seorang laki-laki mehampiriku lalu memegang tanganku dan berkata pada sekumpulan anak muda itu “kalian semua lawan aku, kalau kalian kalah aku akan laporkan kalian ke polisi karena sudah meresahkan warga dan mabuk-mabukan”, mendengar perkataannya anak-anak muda itu berlahan pergi sambil berkata-kata kasar dengan suara pelan tapi tidak dipedulikan oleh laki-laki yang telah menolongku itu, dia hanya tersenyum dan mengantarkanku hingga pulang ke rumah.\n" +
                    "\n" +
                    "“Kita sudah sampai, ini rumahku dan kamu sudah bisa melepaskan tanganku sekarang” ucapku sambil tersenyum karena memang sepanjang perjalanan pulang ia terus memegang tanganku, kemudian ia melepaskan tanganku “aku permisi ya, gak usah bilang makasih”, “hah” aku heran, ia tersenyum lalu berjalan pergi meninggalkan rumahku, sesekali dia menoleh ke belakang melambaikan tangan ke arahku dan aku membalas melambaikan tangannya dengan rasa heran.\n" +
                    "\n" +
                    "Saat aku berganti baju tidak sengaja tanganku mengenai wajahku “wangi ini?” lalu aku mencium kedua tanganku, ternyata dari tanganku ada wangi parfum yang sama seperti wangi bunga mawar putih yang sering kudapat di depan rumah “ah ini” aku langsung menghampiri vas bunga untuk memastikan bahwa wangi di tanganku dan di bunga mawar adalah wangi parfum yang sama dan itu benar.\n" +
                    "\n" +
                    "Rasa curigaku pun semakin kuat, setiap hari aku mencari laki-laki yang menolongku tempo hari, aku bertanya pada setiap orang yang kutemui tapi tidak ada satu pun yang mengenalnya. Hingga pada akhirnya tidak ada bunga mawar putih di depan rumahku lagi setelah aku bertemu dengan laki-laki penolong itu.",
            "“Kenapa sih ngeliatin aku begitu banget”, tanya Putra dengan wajah yang malu-malu dan senyuman mautnya yang menurutku itu sangatlah indah dan selalu membuatku terpaku jika melihatnya.\n" +
                    "Sedikit terkejut, “hah, ohh gak apa-apa kok”, sambil senyum tanggung.\n" +
                    "\n" +
                    "Putra, ya nama pangggilannya adalah Putra, dia pacarku sejak April 2012 lalu, tahun dimana aku akan menghadapi ujian akhir nasional di salah satu SMK swasta di Jakarta. Aku mengenalnya bukan karena dia sekolah di sekolahan yang sama ataupun bertemu di jalan ataupun dari jejaring sosial bahkan bukan juga dari tiba-tiba bertabrakan seperti di sinetron-sinetron gitu, hehehe. Aku dan dia kenal by phone, aku sih yang menghubunginya duluan karena aku mendapatkan nomor teleponnya dia dari saudara sepupuku.\n" +
                    "\n" +
                    "“Tuutt… Tuutt…” begitulah bunyi nada sambungnya ketika ku coba “misscall” nomornya. Namun segera ku matikan, bukan karena takut kehilangan pulsa, tapi karena “was-was” apakah dia akan merespon balik atau tidak panggilanku itu.\n" +
                    "\n" +
                    "\n" +
                    "“drrrttt… drrrttt..”, bergetar hp ku yang ku letakkan di meja ku. Rupanya nomor itu meresponnya by sms.\n" +
                    "“ini siapa?”, isi sms darinya.\n" +
                    "“emang ini siapa?”, jawabku balik.\n" +
                    "“ini putra, kamu?”.\n" +
                    "Aku dan dia berlanjut smsan hingga akhirnya tidak ada satu minggu kemudian kita berkenalan dan jadian. Cepat?! ya memang cepat sekali kaya gak pake “PDKT”, tapi entahlah karena aku pun sedikit penasaran saja dengannya hingga aku putuskan saja untuk jadian.\n" +
                    "\n" +
                    "13 juni 2012 di tanggal ini aku bingung tengah memikirkan sesuatu, ya, aku tengah memikirkan kado untuk ulangtahunnya yang akan jatuh pada tanggal 16 juni 2012, aku bergegas mengambil sejumlah uang yang masih tersisa di dompet tipisku karena hanya ada beberapa uang yang aku punya. Dapatlah aku sebuah jaket untuknya dari hasil uang di dompet tipisku itu. Niatku memberikan surprise untuknya, aku datang langsung ke rumahnya sebelum dia pulang dari kuliah, ku titipkan kado itu kepada wisnu, adiknya. Aku berharap dia suka dengan jaket yang sudah aku beli untuknya.\n" +
                    "\n" +
                    "Hubunganku dengannya tidaklah semudah memencet tombol on/off untuk menyalakan tv. Seringkali aku dan dia mengalami pertengkaran hebat bahkan hampir putus berkali-kali. Karena aku lebih cenderung memiliki emosi yang tidak terkontrol, namun putra adalah pacar yang cukup sabar menghadapi segala kemarahan-kemarahan ku dan aku memang mudah sekali “ngambek” jika apa yang aku mau tidak terpenuhi. Walaupun aku seperti itu, sungguh aku sangat mencintainya, meski ada yang tidak aku sukai darinya yaitu beberapa sifatnya tapi hatiku tak mampu memungkiri bahwa aku tak ingin berpisah darinya. Hanya dia, Cuma dia yang aku mau, titik gak pake koma.\n" +
                    "\n" +
                    "“sayang ke surga yuk?!”, ajakku dalam pembicaraanku by sms.\n" +
                    "“yuk sayangku kita ke surga”, jawabnya.\n" +
                    "“tapi naik apa sayang?”\n" +
                    "“naik permadani aja sayang, ku punya permadani untuk kita terbang menuju surga cinta kita”\n" +
                    "“ah kamu bisa aja”\n" +
                    "“buat kamu aku harus selalu bisa sayang”..\n" +
                    "\n" +
                    "Ya.. begitulah aku dan dia kalau smsan.. konyol? lebay? Atau norak? Hmmmm… I don’t care… karena jika aku bersama dia dunia serasa milik berdua.\n" +
                    "Semoga dengan segenap ketulusan hati dan sepenuh jiwa aku dan dia saling mencintai, semoga aku dan dia terus bersama hingga akhir hanyat nanti.",
            "Sore, senja mulai memperlihatkan keindahannya. Di sebuah bangku panjang di tepi pantai, di bawah pohon besar yang tidak pernah bosan menggugurkan daunnya, sembari kau bertanya “Apakah cinta datang disaat kenyamanan mulai hadir?”\n" +
                    "“Cinta, kenyamanan?, saat aku melihatmu pertama kali, Aku langsung jatuh cinta padamu tanpa aku mendapatkan kenyamanan dahulu” ujarku.\n" +
                    "\n" +
                    "Sejenak hening, terdiam, entah apa yang Ia pikirkan? dengan menatap lurus melihat senja yang mulai akan tengelam meninggalkan terang, mendatangkan malam.\n" +
                    "\n" +
                    "Saat itu, Aku berpikir dan bertanya pada hembusan angin pantai “apakah Cinta mempunyai banyak versi?” sebab Aku selalu menemukan perasaanku saat keadaan membawaku ke lorong waktu yang tidak pernah aku sadari.\n" +
                    "\n" +
                    "\n" +
                    "“Kamu percaya Cinta sejati?” Tanyanya dengan menatap dalam bola mataku.\n" +
                    "“Aku percaya” jawabku.\n" +
                    "“Maukah kamu berjanji untuk itu?”\n" +
                    "“Berjanji untuk apa?”\n" +
                    "“Mencintaiku dengan sempurna” ucapnya dengan nada yang parau.\n" +
                    "\n" +
                    "Menurut kalian cinta itu apa? kesetiaan, kenyamanan, kasih sayang, romantis?. Hal-hal itu yang membuat kalian cinta?\n" +
                    "“Aku tidak akan berjanji untuk itu tapi aku akan selalu berusaha untuk tetap terus bisa membuatmu tersenyum, Perkenankan aku untuk itu” ujarku.\n" +
                    "Dia menundukkan kepalanya dengan pipi yang basah.\n" +
                    "\n" +
                    "“sudah lama bahu ini vakum”\n" +
                    "“maksudmu?” tanyanya\n" +
                    "“sekarang kamu bisa mempergunakannya kembali” kataku, “sini” sambilku merangkulnya dan seka air mata itu.\n" +
                    "“aku takut, jika aku berjanji” ucapku sambil mengelus rambut panjangnya.\n" +
                    "“kenapa?”\n" +
                    "“jika janji mulai terucap, kelak aku takut kau merajutnya dengan orang lain” ucapku.\n" +
                    "\n" +
                    "Kembali dia tak berkutik oleh perkataanku, desisannya makin kencang seiring dengan angin malam menghembus helai-perlehelai Rambutnya …",
            "“Bon, besok maen ke rumah Leo yu?”, Farhan mengajakku. Bermain ke rumah Leo adalah hal yang sangat aku hindari karena menurutku rumah Leo itu berhantu. Suasana di dalam rumahnya sangat tidak nyaman, aku merasakan ada hal yang aneh di rumahnya. Sepi dan semua bangunannya nampak tua yang membuat aku tidak bisa tidur jika menginap di rumah Leo.\n" +
                    "\n" +
                    "“Ah mau ngapain maen ke rumah Leo?”, tanyaku. “Besok kan malam minggu dan kebetulan kita ada tugas kelompok bareng Leo, gimana kalo kita ngerjainnya di rumah Leo sambil nginep, kata Leo besok keluarganya gak ada”. Sebenarnya aku tidak ingin mengikuti saran Farhan untuk menginap di rumah Leo. Namun jika aku menolak tawaran Farhan dan Leo nanti mereka bisa tersinggung dengan alasanku tidak ingin menginap di rumah Leo. Ini demi tugas, aku harus menjalankannya walau terpaksa. Karena jika mereka menginap di rumahku pekerjaan kelompok tidak akan selesai karena di rumahku sangatlah ramai, begitu pula di rumah Farhan banyak sekali anak kecil. Dan rumah Leo adalah alternatif terbaik untuk mengerjakan tugas sambil bermalam minggu. Aku sempat cerita kepada Farhan tentang ketakutanku berada di rumah Leo namun Farhan tidak mempedulikannya karena ia sama sekali tidak percaya akan hal-hal yang berbau mistis.\n" +
                    "\n" +
                    "Hari Sabtu pun telah tiba, mau tidak mau aku harus mengemas barang dan bajuku untuk menginap di rumah Leo sepulang sekolah. “Bon, kamu mau kan nginep di rumahku sama Farhan?”, tanya Leo. Aku pun mengangguk tanda setuju. Sepertinya Leo sangat senang bisa mengajakku dan Faran menginap di rumahnya mengingat hari ini keluarganya akan pergi ke luar kota untuk menghadiri acara pernikahan. Dan kedua orangtua Leo menyuruh Leo untuk menjaga rumah dan mengajak teman untuk menginap di rumahnya.\n" +
                    "\n" +
                    "\n" +
                    "Sekitar jam 3 aku pun pulang dari sekolah dan langsung menuju rumah untuk berganti baju dan membawa barang-barang yang akan aku bawa ke rumah Leo. Aku dan Farhan menuju rumah Leo menggunakan sepeda motor. Leo sudah menunggu kami di rumahnya. Jam setengah lima sore aku dan Farhan baru sampai di rumah Leo. Dan benar, baru saja aku sampai di rumah Leo hatiku merasa tidak nyaman karena melihat kondisi rumah Leo yang sangat sepi karena jauh dari keramaian. Rumahnya dikelilingi pohon-pohon besar, jarak antar rumah pun cukup berjauhan. Untuk menuju warung pun butuh waktu 20 menit jika berjalan kaki dan harus melewati kuburan-kuburan tua yang terlihat begitu menyeramkan. Ah aku lupakan semua itu karena niatku kesini adalah untuk bekerja kelompok bukan untuk menguji nyaliku. Di dalam rumah, Leo sudah menyiapkan makanan untukku dan Farhan. Farhan yang doyan makan pun langsung menyerbunya dan aku pun tidak mau kalah kalau ada makanan gratis. Untuk soal makanan, Leo memang jagonya. “Bon, kenapa muka kamu kaya yang ketakutan gitu? Suasana rumahnya horror ya hahaha..”, tegur Leo. “Gak papa Le, mungkin aku cuma kecapean aja, ah kamu jangan ngomong gitu dong Le”, jawabku dengan sedikit gugup mendengar guyonan Leo. Sementara Farhan hanya tertawa melihatku yang seperti ketakutan seperti biasanya.\n" +
                    "\n" +
                    "Hari sudah semakin sore, dan langit pun sedikit mendung nampak hujan akan segera turun. Ah jika hujan turun bisa-bisa suasananya bisa semakin horror. Semoga hujan tidak turun, karena aku tidak menginginkannya. Tetapi Leo sangat senang jika suasana rumahnya semakin gelap karena ia sangat suka dengan hal mistik, dan aku pun berusaha untuk mengabaikannya. Dan benar saja hujan telah turun, semua gorden ditutup Leo rapat-rapat, penerangan pun hanya sebatas lampu yang tidak begitu terang. Ini yang membuatku tidak begitu nyaman berada di rumah Leo karena lampu rumahnya tidak begitu terang, Leo hanya menggunakan bohlam berwarna orange seperti warna lampu minyak. Sementara di rumahku sangatlah terang menggunakan lampu yang cukup mahal.\n" +
                    "\n" +
                    "Jam 7 malam kami memulai melaksanakan tugas kelompok sambil menyemil makanan. Untungnya di rumah ini ada televisi, kalau tidak aku akan semakin stress berada di rumah Leo yang cukup tua ini. Aku berinisiatif sendiri untuk menyalakan televisi karena bersama Leo dan Farhan aku sudah terbiasa bersama jadi tidak perlu izin. Tetapi ketika aku menyalakan televisi Leo malah memarahiku karena jika mengerjakan tugas sambil menonton akan mengganggu konsentrasi, Farhan pun sependapat dengan Leo. Terpaksa aku pun harus mematikan televisinya walau banyak sekali acara yang seru di malam minggu.\n" +
                    "\n" +
                    "“Wah sepertinya kita membutuhkan karton tambahan untuk menempelkan bagian yang ini, kita harus membelinya di warung, tapi salah satu dari kita harus menjaga rumah ini”, sahut Leo. Aku berdoa jangan sampai aku yang harus menunggu rumah ini. “Biarkan Farhan saja yang menunggu rumah ini, aku akan mengantarmu ke warung Le”, pintaku. Farhan tidak setuju, menurutnya aku harus menjaga rumah sambil mengerjakan tugas untuk menggambar objek karena itu merupakan keahlianku sambil menunggu mereka sampai rumah agar pekerjaan kelompok itu cepat selesai. Sepertinya Farhan hanya beralasan saja, aku yakin pasti Farhan juga takut jika harus menunggu rumah ini sendirian. Dan sialnya Leo sependapat dengan Farhan, aku pun kembali menjadi korban. Aku harus menunggu rumah itu sendirian yang dikelilingi banyak pohon dan jauh dari rumah lainnya. Mimpi apa aku semalam. Tapi aku tidak boleh takut, aku harus berani, aku harus melawan rasa takutku. Ini demi tugas. Tak lama setelah itu, Leo dan Farhan pun menuju warung dengan berjalan kaki karena jalannya masih licin jika harus menggunakan motor.\n" +
                    "\n" +
                    "Aku pun memulai tugasku untuk menggambar objek yang nantinya akan ditempel di karton yang sedang dibeli Leo dan Farhan. Untuk melawan rasa takutku, aku kembali menyalakan televisi untuk menonton acara di malam minggu ini yang seru. Awalnya aku merasa biasa-biasa saja tapi lama kelamaan aku mulai merasa merinding. Aku merasa ada suara di kamar mandi, apa itu suara hujan. Padahal hujan sudah reda dari tadi, tapi aku berusaha untuk berpikir positif dan mencoba untuk megecek ke kamar mandi kebetulan aku ingin membuang air kecil. Ternyata suara itu hanya suara air bak yang sudah terlalu penuh terisi air, ternyata dugaanku benar tidak ada yang aneh.\n" +
                    "\n" +
                    "Ketika aku kembali ke ruang tamu, aku terkejut dengan televisi yang sudah mati. Padahal aku belum mematikannya, sial siapa yang mematikan televisi Leo. Apa mungkin aku lupa, apa aku sudah mematikannya sebelum pergi ke kamar mandi. Keringat dinginku mulai mengucur, sementara Leo dan Farhan pasti masih dalam perjalanan. Aku mencoba untuk menyalakan televisi kembali. Baru lima menit menonton, televisinya sudah mati lagi. Kali ini aku yang melihatnya sendiri bahwa televisi itu mati sendiri tanpa aku mematikannya. Tapi aku berpikir jika televisi Leo sudah rusak karena sudah terlalu tua. Aku harus tetap berpikir positif.\n" +
                    "\n" +
                    "Ketika sedang asyik menggambar objek, tiba-tiba terdengar suara ketukan pintu dari luar. Aku lega, pasti Leo dan Farhan telah datang dari warung. Aku pun segera membuka pintunya, namun tidak ada siapa-siapa. Nampaknya mereka mengerjaiku, aku pun mencari Leo dan Farhan di sekitar luar rumah, namun mereka benar-benar tidak ada. Lalu siapa yang mengetuk pintu, apa mungkin itu hanya halusinasiku saja. Tubuhku sudah terlalu basah karena keringat yang semakin mengucur karena ketakutanku. Mana Leo dan Farhan belum juga datang, aku semakin tidak karuan dan tidak fokus mengerjakan tugasku. Dan tak lama kemudian mereka pun akhirnya datang juga, kali ini mereka benar-benar datang. Aku sangat lega dengan kedatangan mereka, namun aku tidak langsung menceritakan semua kejadian tadi kepada mereka takut mereka tidak percaya dan hanya akan membuat suasana menjadi tidak nyaman. Kami pun melanjutkan pekerjaan kelompok yang masih menumpuk.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Pekerjaan kelompok kami baru selesai sekitar jam satu malam karena kami kebanyakan bercanda sehingga banyak waktu yang terbuang. Setelah meyelesaikan semua tugas kelompok, kami pun segera tertidur. Leo dan Farhan sangat cepat tidurnya, sementara aku sulit sekali untuk bisa tertidur karena masih mengingat kejadian tadi yang membuatku semakin ketakutan berada di rumah ini. Jika aku pulang itu semua tidak memungkinkan mengingat waktu yang sudah semakin larut malam. Mana berani aku pulang sendirian malam-malam begini melewati banyak pepohonan.\n" +
                    "\n" +
                    "Leo dan Farhan sudah satu jam tertidur, sementara aku semakin mengeluarkan keringat dinginku ketika aku mendengar suara klakson motorku diluar. Aku menutup tubuhku dengan selimut saking terkejut dan ketakutannya aku. Aku berusaha membangunkan Leo dan Farhan, namun tidur mereka sangat nyenyak sekali sehingga aku tidak bisa membangunkannya. Aku pun mencoba untuk berdoa semampuku karena aku tidak begitu mahir dalam soal agama, namun dengan surat-surat pendek yang aku hafal walau terbata-bata semua itu bisa membuatku lebih tenang. Setelah itu aku pun bisa tertidur sekitar jam tiga dini hari.\n" +
                    "\n" +
                    "Jam 7 pagi aku baru terbangun bersama Leo dan Farhan. Saat itu pula aku menceritakan semua kejadian semalam yang aku alami kepada Leo dan Farhan. Leo hanya tersenyum dan mengatakan kepadaku bahwa hal itu adalah hal yang biasa Leo alami di rumahnya. Leo menjelaskan kepadaku bahwa mereka hanya ingin menyapaku karena aku merupakan pendatang baru di rumah Leo. Farhan pun sebenarnya pernah mengalami ini ketika menginap di rumah Leo beberapa bulan lalu, namun tidak menceritakannya kepadaku. Farhan tidak peduli dengan hal yang seperti itu. Leo menyarankan aku untuk berdoa jika merasa terganggu, dan aku pun lupa akan hal itu sampai-sampai aku baru berdoa beberapa jam kemudian setelah kejanggalan itu. Dan ini semua menjadi bahan pelajaran bagiku, itu semua cukup menantang namun cukup mengajarkanku tentang dunia berbeda dengan kita. Yang terpenting kita harus tetap berdoa dan dekat kepada Tuhan. Dan mulai saat itu juga aku tidak mau lagi menginap di rumah Leo haha, bukan karena apa-apa, tapi suasana rumahnya itu yang sangat menyeramkan haha.",
            "Saat itu jam sepuluh malam andi pergi ke rumah temannya. Dia pergi sendirian naik keretanya. Di perjalanan dia tidak merasakan hal yang aneh, tetapi pada saat melewati lorong biru yang harus dilewatinya untuk ke rumah temannya itu, dia merasakan hal yang aneh. Lampu lorong tidak ada yang hidup, kereta andi tiba-tiba mogok dan tidak ada satupun orang yang lewat disitu. Sampai akhirnya dia harus mendorong keretanya itu untuk sampai ke rumah temannya.\n" +
                    "\n" +
                    "Tak lama kemudian dia telah tiba di rumah temannya itu yang bernama irfan\n" +
                    "“kok lama an?” tanya irfan.\n" +
                    "“ya, tadi pas aku ngelewati lorong biru tiba-tiba keretaku mogok, lampu lorong mati semua dan gak ada satupun orang yang lewat, jadi aku dorong deh keretaku itu.” jawab andi.\n" +
                    "“sebenarnya lorong itu terkenal angker an, dulu katanya ada pembunuhan remaja perempuan dan mayatnya itu digeletakkan di lorong biru. Dan akhirnya warga menemukan mayat itu keesokan harinya, maka dari itu lorong biru terkenal angker dan suka ada kejadian-kejadian aneh jika melewati lorong itu.” kata irfan panjang lebar.\n" +
                    "“oooo….” kata andi\n" +
                    "\n" +
                    "Setelah cukup lama mereka berbincang-bincang, akhirnya si andi pamit untuk pulang.\n" +
                    "“irfan gue mau pulang nih soalnya udah jam setengah 12.” kata andi sambil memegang helmnya.\n" +
                    "“ya udah ni an, lo pakek aja motorku.” kata irfan sambil memberi kunci keretanya ke andi.\n" +
                    "“baiklah fan, aku pulang dulu ya.” kata andi\n" +
                    "“ya hati hati.” kata si irfan.\n" +
                    "\n" +
                    "\n" +
                    "Akhirnya si andi pulang dengan menaiki kereta si irfan yang tadi dipinjamkan. Di perjalanan si andi merasa merinding karena melewati lorong biru.\n" +
                    "\n" +
                    "Tiba-tiba saja keretanya mogok dan seketika pula ada hantu remaja perempuan memakai gaun putih dan berambut panjang di hadapannya si andi. Si andi sangat terkejut, seketika tubuh andi mulai lemas dan dia terjatuh pingsan dan seketika itu pula hantunya menghilang.\n" +
                    "\n" +
                    "Tak lama kemudian ada seorang warga yang menemukan si andi tergeletak pingsan. Di tolongnyalah si andi oleh warga tadi. Sejak saat itu masyarakat takut untuk melewati lorong itu.",
            "Jam menunjukkan pukul 11.30 dan pada malam itu hujan turun gerimis membuat suasana menjadi agak mencekam. Edo yang saat itu sedang menunggu bus jemputan mulai agak kedinginan. “Huh nih hujan gak berhenti-berhenti mana udah malem lagi.” sambil terus menggosokkan kedua telapak tangannya yang kedinginan. Tiba-tiba dari belakang ada yang menyentuh pundak Edo tangan yang begitu dingin dan karena suasana yang mencekam Edo pun mulai keringat dingin dan seluruh tubuhnya.\n" +
                    "\n" +
                    "“Mas, Mas kenapa kok jadi gelisah gitu kenapa Mas?” entah kenapa mendengar suara itu membauat Edo lega.\n" +
                    "“Gak apa-apa Mbak, oya ada apa Mba kok panggil saya.” sambil tersenyum ramah.\n" +
                    "“Enggak cuma mau bilang busnya udah dateng soalnya dari tadi Masnya bengong.” sambil membalas senyum ramah Edo. Saat bus datang Edo dan wanita yang baru ia kenal itu masuk ke dalam bus itu dan mereka duduk bersebelahan.\n" +
                    "\n" +
                    "“Mbak kalau boleh tahu namanya siapa ya?”\n" +
                    "“Nita, Mas anak kuliah ya?”\n" +
                    "“Iya, kalau Mbak sendiri?”\n" +
                    "“Em saya juga cuma saya baru semester 2 jadi masih mahasiswa baru.”\n" +
                    "“Oh, gitu.” cukup lama Edo dan Nita berbincang-bincang lalu tanpa sadar Edo ketiduran.\n" +
                    "\n" +
                    "\n" +
                    "Dia bermimpi Edo melihat sebuah bus melaju kencang dan menabrak sebuah mobil BMW hitam lalu bus itu oleng dan terjadi kecelakaan bus itu jatuh ke jurang dan terbakar habis. Karena kaget terhadap mimpinya Edo terbangun dengan tersentak. “Edo apa kamu sudah bangun, kamu sudah melihatnya bukan, kisah kami.” dengan pandangan ngeri Edo melihat Nita yang kini wajahnya berubah menyeramkan dan bus yang Edo naiki kini menjadi hangus. Bus itu pun kini melaju sangat kencang mengalami itu semua Edo hanya bisa diam mematung dengan keringatnya yang mengucur deras, jantungnya berdegup kencang dan bulu kuduknya berdiri Edo serasa ingin teriak tapi tidak bisa.\n" +
                    "\n" +
                    "“Dan kamu Edo akan mati bersama kami.” bersamaan dengan suara itu hantu lainnya mengepung Edo siap untuk menerkamnya dan BOM. “Tolong.. tolong…” teriak Edo.\n" +
                    "“Mas, Mas kenapa?” terlihat Anita membangunkan Edo, Edo yang terbangun dari tidurnya segera mendorong Nita.\n" +
                    "“Pergi kamu jangan deket-deket jangan ganggu aku!!!”\n" +
                    "“Mas, Mas kenapa sih saya cuma mau bilang udah sampe tujuan Mas mau turun gak?” melihat ini Edo menjadi kebingungan dan agak linglung.\n" +
                    "“Maaf Nita, ya udah saya turun dulu ya.” kata Edo sambil melangkah ke luar.\n" +
                    "\n" +
                    "Saat ada di luar Edo melihat ke arah bus yang dinaikinya tadi dan melirik ke arah Nita. Melihat itu Edo terperanjak kaget dia tidak melihat ada bus di sana yang ia lihat hanya kabut asap yang tebal dan saat ia melihat jamnya 11.32 jadi perjalanan yang seharusnya di tempuh 2 jam hanya ditempuh 2 menit melihat ini Edo jatuh pingsan. Tapi sebelum pingsan ia melihat Nita dengan wajah mengerikan tersenyum padanya. Saat terbangun Edo sudah di depan rumahnya dengan linglung Edo berkata, “Mulai sekarang aku tak akan naik bus malam lagi aku tak mau bertemu dengan bus setan itu lagi.”",
            "Namaku Hasan bin Novanto. Aku seorang petugas security sebuah pabrik sepatu kulit yang berada dekat dengan sawah. Belakang pabrik ini adalah tanah kosong yang amat luas. Aku telah bekerja di pabrik selama 5 tahun lebih. Sekarang umurku 38 tahun. Sering kudengar cerita-cerita horor dari para pekerja seperti suara orang menangis, arwah karyawan yang bergentanyangan, namun tak ada satupun yang terbukti benar. Menurutku itu semua hanyalah cerita untuk menjahil-jahili saja. Saat aku shift malam tak ada satupun kejanggalan terjadi sehingga itu membuatku makin tidak takut dengan cerita-cerita aneh dari para pekerja.\n" +
                    "\n" +
                    "Suatu hari listrik di pabrik mati sehingga para pekerja dipulangkan lebih awal. Aryo si bos pabrik menghampiriku “Hasan, hari ini listrik di pabrik mati, jadi saya pulangkan pekerja lebih awal.”\n" +
                    "“Baik bos.” kataku mengangguk\n" +
                    "“Oh iya. Kamu tetap jaga di sini sampai nanti sore. Kalau si Parman dah dateng kamu boleh pulang” kata bos Aryo\n" +
                    "“Baik bos. Laksanakan!” kataku hormat\n" +
                    "\n" +
                    "Langit telah berwarna kemerahan. Udara dingin menghembus menusuk kulit. “Aneh sudah jam setengah lima kok belum dateng nih si Parman? Awas ya kalo udah dateng akan kutakut takuti dia dengan cerita yang aneh aneh.” kataku agak kesal.\n" +
                    "\n" +
                    "\n" +
                    "Tiba-tiba ada bayangan seseorang dari arah barat. Aku kaget tiba-tiba orang itu menghampiriku dan bertanya padaku “Permisi nak, bolehkah kakek masuk dan nyelawat?”\n" +
                    "“Nyelawat? Tapi di sini kan tidak ada pemakaman sama sekali?” kataku kaget sekaligus heran\n" +
                    "“Tapi nak, kakek masih ingat kalau di sini itu makam ayah kakek.” kata si kakek\n" +
                    "“Aduh, nih kakek pikun banget sih! Udah jelas-jelas ini pabrik malah dibilang pemakaman.” gumamku kesal “Kek… Mungkin kakek salah tempat. Ini tuh pabrik bukan pemakaman, kakek bisa lihat sendiri kan.” kataku sambil menunjuk pabrik\n" +
                    "“Tapi nak, kakek tidak pikun dan kakek tidak buta, dan kakek masih ingat kalau ini makam ayah kakek.” kata kakek menegaskan\n" +
                    "“Keras kepala banget sih nih kakek! Mau gak mau harus diusir nih kakek, biar gak mengganggu kinerja pabrik.” gumamku “Kakek lebih baik pulang saja sekarang sudah malam.” rayuku\n" +
                    "“Tapi nak, arwah ayah kakek nanti sedih kalau tidak dikirimi do’a.” kata kakek bersikeras\n" +
                    "\n" +
                    "Setelah 10 aku mencoba merayu kakek itu, aku pun punya ide “Bagaimana kalau kakek berdo’a di sini saja, kan do’a bisa di mana saja.” kataku\n" +
                    "“Baiklah nak, kakek di sini saja.” kata kakek pasrah\n" +
                    "\n" +
                    "Akhirnya kakek itu menghamparkan anyaman tikar yang sudah dipikulnya sedari tadi dan ia mulai membaca do’a. Setelah 10 menit kakek itu pun pamit.\n" +
                    "\n" +
                    "“Aneh sekali kakek itu, padahal sudah jelas jelas ini pabrik kok dibilang pemakaman. Yahh untung niat kakek itu baik dan tak terlalu lama berdo’a nya.” gumamku\n" +
                    "\n" +
                    "Tak lama kemudian datanglah Parman dengan sepeda motor bebek miliknya. “Oi darimana saja kau? Aku nunggu kau sampai jenggotan.” kataku kesal\n" +
                    "“Wah maaf, aku tadi terjebak macet di perempatan.” katanya sambil memarkir sepedanya\n" +
                    "“Haduhh lain kali jangan sampai telat lagi. Kuadukan ke bos kau nanti.” kataku mengancam\n" +
                    "“Iya maaf gak akan kuulangi lagi deh.” kata Parman\n" +
                    "Akupun mengemas peralatanku, tiba-tiba aku teringat sesuatu “Oh iya. Kunci rumah ketinggalan di wc tadi. Bentar aku ke wc dulu buat ambil kinci.” kataku sambil bergegas ke wc pabrik\n" +
                    "“Jangan lama-lama!” seru Parman kepadaku\n" +
                    "\n" +
                    "Aku pun masuk ke wc “Aha itu dia! Untung saja ketemu, kalau hilang bisa gawat nanti.” kataku senang.\n" +
                    "Saat aku berjalan keluar, aku melihat seorang pria dengan seragam kerja warna biru “Eh pak udah malem kok belum pulang?” sapaku.\n" +
                    "Namun pria itu melewatiku begitu saja seolah tak mendengarku. Tiba-tiba langkahnya terhenti dan menoleh ke arahku “Iya bapak juga hati-hati ya.” kata pria itu dingin.\n" +
                    "Ia berjalan ke dalam salah satu ruangan dan menghilang “Aneh sekali orang itu.” kataku sambil keheranan memandang ruangan yang dimasuki pria itu.\n" +
                    "\n" +
                    "Saat aku menoleh ke depan seorang pria dengan wajah oucat pasi berada di depanku. Akupun terjatuh karena kaget “Aduh kenapa sih tiba-tiba ngagetin” teriakku sambil merasa sakit di bokongku\n" +
                    "Pria itu menjulurkan lidahnya, lidahnya makin panjang, makin panjang. Bola matanya berwarna putih. Ia mendekat ke arahku. Akupun meganyunkan pentunganku dan mengenai kepalanya. Akupun lari secepat mungkin keluar dari pabrik. Aku pun berlari ke arah Parman\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "“Ada apa kok lari-lari? ” tanya Parman\n" +
                    "“I i itu tadi ada ha ha hantu.” kataku terbata bata\n" +
                    "“Ohh kau sudah tahu rupanya.” kata Parman\n" +
                    "“Ta tahu apa?” tanyaku\n" +
                    "“Kamu bertemu dengan kakek kakek kan?” tanya Parman\n" +
                    "“I iya” kataku mengangguk\n" +
                    "“Arwah yang kamu lihat itu sebenarnya bapaknya si kakek itu, lidahnya panjang karena ia mati bunuh diri dengan cara gantung diri. Katanya si kakek itu dulu ini makamnya namun aku juga tidak tahu di mana jasadnya.” jelas Parman “Pasti kau tadi mengusir kakek itu kan?”\n" +
                    "“I iya, tadi aku menyuruhnya berdo’a di luar.” kataku\n" +
                    "“Sebaiknya jangan, awalnya aku juga kaget namun setelah diberitahu si bos aku jadi tahu mengapa kakek itu setiap hari kamis selalu datang ke sini.” kata Parman\n" +
                    "“Aneh, mengapa aku tidak diberitahu oleh bos?” tanyaku\n" +
                    "“Itu karena kamu masih baru, jadi lain kali kalau kau bertemu kakek itu jangan diusir biarkan kakek itu masuk pabrik.” kata Parman\n" +
                    "“Ohh begitu, terima kasih nasihatnya, aku akan melaksanakan perintahmu tadi.” Kataku\n" +
                    "“Sudah pulang sana matahari mau tenggelam loh.” kata Parman\n" +
                    "“Ya terima masih nasihatnya.” kataku sambil menaiki sepeda\n" +
                    "\n" +
                    "Aku pun mengayuh sepedaku menuju rumahku. Sejak saat itu aku talk lagi mengusir kakek itu, dan selalu menghirmati dan tidak meremehkan omongan orang tua.",
            "Ayam Berkokok Beserta Fajar yang mulai merangkak, menuju hamparan langit untuk menyambut pagi, pagi telah tiba, dan aku selalu suka pagi. Setiap Pagi ayah mulai menambah volume suara ketika membangunkanku, agar segera bersiap sekolah. “imaaaa, ayo nak bangun kamu belum sholat subuh nak”. Teriak ayah padaku. Aku pun tetap memejamkan mata tanpa hiraukan teriakan ayah. “imaa!!”, teriak ayah kembali yang terdengar seakan membising. Langkah ayah perlahan mendekat, aku kembali bersembunyi dibawah selimut lembutku. “anak ayah nakal!!”. Sembari dua jari telunjuk ayah menggelitikku, tak lama ayah menggendongku lalu memandikanku.\n" +
                    "\n" +
                    "Namaku Ima. Hari-hari kulalui hanya bersama ayah, ibu telah wafat sejak umurku 4 tahun karena penyakit yang dideritanya. Entah penyakit apa yang diderita ibu, setauku ibu tak lagi ada bersamaku, tak lagi menemani hari-hariku, dan tak lagi bisa menghibur laraku.\n" +
                    "\n" +
                    "Hari-hari kulalui bersama ayah, iya, hanya bersama ayah. Sejak pagi hingga petang, ayah mengurus semua keperluanku, menyiapkan perlengkapan sekolah, menyiapkan makanan, membantuku mengerjakan pr hingga mendongeng sebelum tidur, “ayah.. I love you”. Ucapku sebelum terlelap dalam mimpi. Aku bahagia bersama ayah, ayah sangat menyayangiku, ia selalu bisa membuatku tertawa, ayahku hebat ia menghafal berbagai macam cerita dan selalu ia ceritakan padaku sebelum tidur, ia mengajariku bersepeda dan menjadi pesawat terbang bagiku. Sekali lagi kuucapkan “aku sayaang ayahh”.\n" +
                    "\n" +
                    "\n" +
                    "Namun kebahagiaan itu perlahan memudar, “naina, rambutmu kok bisa diikat lucu gitu sih, gimana caranya”, tanyaku pada naina, teman sekelasku. “tanya saja mamaku, mamaku selalu bisa mengikat rambutku dengan berbagai macam model, lah kamu kokk kecil-kecil pake jilbab kan belum wajib maa?”. Aku tertunduk malu, hatiku marah, beribu pertanyaan berkelebat, adakah alasan mengapa ibu harus pergi dulu, tanpa peduli padaku, apa ia tega karena aku harus hidup tanpa ibu. “ibuu, ima butuh ibu, ima ingin seperti teman–teman ima yang memiliki ibu”. Tak terasa air mata mengalir membasahi wajah polosku, hatiku geram tak karuan, inginku berteriak memanggil-manggil ibu, agar ia kembali ke dunia ini.\n" +
                    "\n" +
                    "“imaa, lauk bekal mu kokk selalu telur dadar dan lalapan sawi sihh, apa ibumu tak bisa masak masakan yang lainnya?”. Tanya salah satu temanku dengan raut wajah meledek. “aahh, lagi-lagi semua ini terjadi karena aku tak punya ibu”. Sahutku dalam hati. Ayahku memang hebat, ia tak pernah melupakan semua kebutuhanku, ia tak pernah menyia-nyiakanku, tapi tetap saja berbeda. Karena ayah tak bisa masak berbagai macam makanan, tak bisa mendandaniku sebagaimana anak wanita lainnya. Ayah tetaplah ayah dan ibu tetaplah ibu bagiku.\n" +
                    "\n" +
                    "“Alhamdulillah, kamu lulus dengan predikat memuaskan ima”. Ucap syukur ayah penuh bangga padaku. “lalu kamu mau lanjut SMA dimana nak?”. Tanya ayah. “Ayah, ima mau mondok yah, di salah satu pondok modern di kota Malang, ayah bolehin ima kan?”. “kamu ingin mondok nak, apa sudah kamu fikirkan matang-matang, ayah akan kesepian tanpa ima di rumah, ima tega ayah sendirian di rumah?”. Aku terdiam menunduk, itulah keinginanku, aku ingin ke pesantren bukan sekedar ingin memperdalam ilmu agama, tapi karena aku sudah tak tahan lagi merindukan ibu, setiap kali melihat foto ibu, setiap melihat teman sebayaku yang menjadikan ibu mereka bagai sahabat, dan aku, aku hanya memilik ayah yang tak bisa menjadi ibu bagiku, ayah tak pernah paham bagaimana perasaan anak remaja putri yang ingin selalu bercerita kisah barunya pada sang ibu, ayah tak pernah paham bagaimana keserasian baju yang harus aku pakai, ayah tak pernah tau bagaimana menghibur anak perempuan jikalau ia bersedih “Aku sayang ayah, tapi yah, aku rindu ibu. Semua usaha ayah untuk menjadi ayah sekaligus ibu bagiku tak cukup, maafin ima yah!!”. Lirihku dalam hati, diam tak bergeming.\n" +
                    "\n" +
                    "Suasana hening, ayah berfikir keras untuk keputusan ini tanpa tau alasan sebenarnya yang kupendam dalam lubuk hatiku. “baiklah nak!, karena itu keinginan ima, ayah izinkan demi pemahamanmu pada ilmu agama yang sangat berguna untuk bekal masa depanmu esok, tapi kamu harus sering menghubungi ayah ya nak, ayah selalu rindukan ima”. Kata ayah, sambil mengelus rambutku lalu mencium keningku. “Baik ayah, ima selalu rindu ayah”. Akupun memeluk ayah dengan eratnya, air mataku tak tertahan, segera kuusap, agar ayah tak tau bahwa aku menangis.\n" +
                    "\n" +
                    "“Surga ada di bawah telapak kaki ibu”. Penjelasan ustadzah dita, membuat jantungku berdegap kencang. “maka berbaktilah pada ibu, karena ia memiliki surga, ridho allah terletak pada ridhonya”. Penjelasan lebih lanjut itu semakin menggetarkan jiwaku. “ustadzah apa ayah tak punya surga di kakinya?” Tanyaku pada ustadzah dengan keberanian yang tak biasa. Semua anak kelas menoleh lantas mereka tercengang lalu menertawakanku, “salahkah aku bertanya demikian, aku tak punya ibu namun aku ingin surga dari ayah”. protesku dalam diam, aku menunduk malu atas pertanyaan yang baru kusampaikan. Bel berbunyi, tanda pembelajaran selesai, sedangkan pertanyaanku belum terjawab.\n" +
                    "\n" +
                    "Satu tahun berlalu, aku tak lagi tinggal bersama ayah, sesekali ayah menjengukku walau hanya dua puluh menit, tapi aku yakin sedikit waktu itu tak cukup mengobati rindu ayah padaku. Ingin rasanya kuutarakan pada ayah tentang semua rasa yang mencekam hatiku akhir-akhir ini, bahwa aku sangat rindu ibu. Tapi aku tak tega, tak tega untuk berkata hal itu pada ayah, karena ku tau, selama ini ayah hanya berpura-pura tegar melalui hari-harinya tanpa ibu.\n" +
                    "\n" +
                    "Hari ini, tepat hari ulang tahunku yang ke tujuh belas, aku menanti ayah, ayah pasti datang dan mengucapkan selamat ulang tahun untukku putri semata wayangnya. Namun hingga jam menunjuk angka sembilan, hingga malam ini mengapa ayah tak kunjung datang. Apa ayah lupa bahwa hari ini, hari ulang tahunku?.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "“imaa, ada kiriman buat kamu”. Sapa mbak siti penjaga kantor hari ini. Segera ku menuju kantorlalu mengambil kiriman untukku, kiriman itu berupa kotak berukuran besar. Apa ini, mungkin kiriman ini dari ayah. Segera kubuka kotak itu, kotak yang berisi sepasang sepatu berwarna merah dan dua surat dengan amplop yang berbeda.\n" +
                    "\n" +
                    "“Selamat ulang tahun putri ayah, semoga allah selalu membimbing setiap langkahmu, surat yang satunya adalah surat dari ibumu nak, surat itu, surat yang sengaja ibumu tulis untuk ulang tahunmu yang ke 17 selamat membaca sayang, maaf ayah tak bisa mengucapkan langsung nak, karena ada pekerjaan yang harus ayah selesaikan hari ini”. Surat ayah sangat singkat, namun aku sangat bahagia, karena ayah tak pernah lupa hari ulang tahunku, iya, ayah tak pernah lupa, walaupun sepasang sepatu pemberian ayah tak sesuai dengan seleraku, tapi aku tetap bersyukur. “syukron yaahh”. Ucapku dalam hati dengan penuh rasa syukur. Sudah tak sabar lagi, ingin segera kubuka surat dari ibu yang beramplop cokelat, kubuka perlahan surat itu, lalu rinduku kembali menyeruak, hatiku kembali berteriak bahwa aku rindu ibu. Surat itu, surat dari ibu. Kubaca perlahan surat itu.\n" +
                    "\n" +
                    "Teruntuk putri ibu yang cantik, fatimah az zahra.\n" +
                    "Nak, kini kau telah beranjak dewasa, umurmu telah mencapai 17 tahun. Surat ini sengaja ibu tulis karena ibu rasa, ibu tak bisa merawatmu hingga dewasa, sakit ibu tak kunjung sembuh dan ibu takut allah segera memanggil ibu sebelum ibu bisa berbincang sempurna denganmu, sebelum ibu bisa menasihati beberapa tuturan kata yang berguna. Maafkan ibu, ibu tak bisa menjadi sahabat sejati dalam harimu, maafkan ibu, ibu tak bisa menemanimu ke sekolah, maafkan ibu, ibu tak bisa memasak masakan yang lezat untukmu, tapi kau tak perlu marah nak, kau tak perlu takut menjalani hari tanpa ibu, karena kita punya allah. Allah yang akan selalu menghibur sedihmu, menjaga bahayamu, dan membimbing langkahmu nak.\n" +
                    "Putri ibu yang shaliha, ibu menyayangimu nak, ibu menunggumu di surga, ibu menyayangimu sebagaimana ayahmu menyayangimu.. Cinta ayah dan ibu bersatu untuk mencintaimu sepenuh hati, dulu ketika kau baru lahir, kami, ayah dan ibumu sangat bahagia akan kehadiran buah cinta kami yaitu kamu. Kamu buah cinta ayah dan ibu. Dan kami sangat mencintaimu melebihi cinta kami pada diri kami sendiri. Kami sematkan nama Fatimah az zahra padamu agar kau dapat menjadi Fatimah az zahra untuk kami.\n" +
                    "Harap kami kau akan tumbuh menjadi wanita sholiha yang mengalahkan bidadari surga, wanita yang mencintai allah dan rasulnya, selalu berpegang teguh pada agama, serta membela bangsa dan berbakti pada orang tua.\n" +
                    "Anakku, karena ibu telah pergi mendahului kalian (ayah dan kamu) cintai ayahmu,!! Sebagaimana cinta Fatimah pada Rasulullah, Muhammad SAW, karena fatimah bisa menjadi putri yang bersahabat bahkan ibu bagi muhammad. Fatimah adalah wanita surga yang dicintai allah karena ia sangat berbakti pada ayahnya, ia selalu membela ayahnya, menghibur lara ayahnya, dan mengasihi ayahnya.\n" +
                    "Anakku, fatimah tetaplah menjadi Fatimah Az Zahra bagi ayah dan ibu, yakinlah kami mencintaimu sangat-sangat mencintaimu. Jalani kehidupan penuh cinta jangan sampai ada bara kebencian di hatimu pada siapapun. Insyaallah dengan segala kuasannya kita, kamu, ayah juga ibu kembali bersua dan bercanda tawa di alam keabadiaan. Menikmati segala nikmat di firdausNya yang tak akan pernah sirna.\n" +
                    "surabaya, 25 oktober 2003\n" +
                    "\n" +
                    "Bulir air mataku mengalir deras tanpa henti, kedua tanganku bergetar memeluk surat ibu, rinduku semakin memuncak dan bertumpuk, rindu yang tak mungkin tersampaikan. Namun hadirnya surat ini, kurasakan kehangatan, kurasakan kesejatian cinta dari ibu yang selama ini kurindukan, aku sadar, selama ini, aku sungguh kurang bersyukur akan hadirnya seorang ayah disisiku, aku tak pernah membuka lebar mata dan hatiku akan kasih sayang ayah padaku. Dan hari ini, aku paham, aku sadar bahwa ayah tak pernah membiarkanku menangis, tak pernah menyia-nyiakanku, putri semata wayangnya. Ayah selalu mendorong semua prestasiku, ayah selalu ada di barisan depan untuk mendukungku menuju masa depan yang cerah, bahkan ayah rela mengorbankan apapun demi aku, putri semata wayangnya. “ayah, ima sayang ayah, ayah adalah ayah terbaik di dunia bagi ima. Semoga allah selalu melindungi ayah”.",
            "Ayu terjaga dari tidurnya ketika ia mendengar ada suara berisik dari arah dapur. Tangannya bergerak mencari hp di meja di samping tempat tidurnya. Ayu menatap layar hp nya. “Oh, God, I’m late again…” Waktu seakan sangat tidak bersahabat. Rasanya baru lima menit yang lalu Ayu memejamkan mata dan terbuai dalam indahnya alam bawah sadar, tiba-tiba semuanya menghilang karena teriakan ibunya.\n" +
                    "“Ayu, kamu ngapain lagi di kamar? cepet mandi, udah jam setengah tujuh nih! Awas aja yah, kalau mama sampai dipanggil lagi sama walikelasmu, uang jajanmu tidak akan mama kasih lagi. Uang angkot juga, terserah kamu mau jalan kaki ke sekolah sampai kakimu pincang tidak akan mama kasih lagi uang jajanmu! Ayuuu, dengar tidak omongan mama?”\n" +
                    "\n" +
                    "Dengan langkah santai Ayu keluar dari kamar dan menuju kamar mandi. Ayu santai karena bukan hal baru lagi baginya mendengar semua teriakan mama di setiap pagi. Hampir setiap pagi, eh, bukan hampir tapi selalu di setiap paginya di buka dengan teriakan sang mama. Maklum ia anak satu-satunya yang punya kebiasaan setia dengan tidur alias selalu ketiduran.\n" +
                    "\n" +
                    "Ayu dan ibunya tinggal sendiri di rumah sejak ayahnya meninggal akibat kecelakaan ketika Ayu masih kelas empat SD. Ayu sangat dekat dengan sang Ayah, sehingga kehilangan sosok ayah dengan tiba-tiba membuat Ayu terpukul saat itu. Rumah yang sepi tanpa iringan piano sang ayah ketika Ayu bernyanyi, sungguh merupakan hal terberat baginya. Terlalu besar perubahan yang Ayu rasakan. Tetapi ia bersyukur mamanya adalah tipe perempuan tegar dan cerdas. Terbukti dengan cepat mamanya, yang biasa disapa ibu Ningrum, berhasil mendapat kan pekerjaan dengan posisi baik di kantornya. Sebagai lulusan S2 Teknik Geodesi mama berhasil mendapat kedudukan manager di perusahaan alat Survei. Setelah menikah Ibu Ningrum memilih tidak bekerja karena ingin sepenuhnya mengurus keluarga, tetapi kenyataan berbicara lain dan membuat beliau harus kembali bekerja agar bisa membiayai kebutuhan mereka, apalagi tinggal di kota besar seperti Bandung bukan lah hal yang mudah. Meskipun Ibu Ningrum berusaha untuk membagi waktu dengan baik antara pekerjaan dan rumah, Ayu tetap saja merasa ada yang hilang yakni tidak ada lagi yang menemaninya bernyanyi seperti Ayah dulu.\n" +
                    "\n" +
                    "\n" +
                    "Bel tanda pelajaran terakhir usai pun berbunyi. Semua siswa bergegas membereskan buku dan keluar kelas, begitupun dua sahabat Ayu dan Intan yang berbaur bersama siswa lainnya menuju gerbang depan sekolah. Tiba-tiba hp Intan berbunyi, “Ayu, nih Arga sms katanya ada yang mau dibicarakan sama kamu tuh, penting katanya, kamu disuruh ke…” Belum selesai Intan berbicara Ayu memotongnya, “loh, kenapa Arga gak langsung nelpon atau sms aku?” Ayu mengeluarkan hp dari tasnya, “yah… pantas hp ku mati. Arga mau ketemu dimana katanya?”\n" +
                    "“Makanya neng kalau orang belum selesai bicara jangan dipotong dulu, kebiasaan sih, sahut Intan gusar. Arga tungguin kamu di tempat parkiran motor.”\n" +
                    "“Yah, maaf atuh neng, jangan marah dong, hehe… ya udah aku balik duluan yah” Ayu berjalan meninggalkan Intan yang masih memandangnya.\n" +
                    "\n" +
                    "Arga adalah pacar Ayu yang super baik dan pengertian. Arga dan Ayu cukup lama berpacaran, sejak mereka berdua masih kelas tiga SMP sampai saat ini mereka duduk di kelas tiga SMA. Gaya berpacaran mereka unik tidak seperti remaja lainnya yang selalu mengisi hubungan dengan kencan, ‘sayang-sayangan’ di sms-BBM atau saat telpon, Ayu dan Arga justru memilih untuk tidak melakukan itu semua. Mereka memiliki tipe yang sama yakni tidak suka diperhatikan bukan berarti tidak saling memperhatikan sama sekali, tetapi lebih menciptakan ruang bebas bagi mereka sendiri. Hal ini sangat membantu mereka untuk tetap berprestasi. Arga adalah ketua OSIS sedangkan Ayu juara umum.\n" +
                    "“Hai Ga, lama yah nungguin? Maaf yah” Ayu menyapa Arga yang menunggunya di motor Vixion hitam kesayangan Arga.\n" +
                    "“Aduh, yang susah dihubungin, udah datang yah, iya nih, lama nungguin kamu, gantinya kamu harus penuhin permintaan aku, gak pake nolak”\n" +
                    "“Wah ada yang marah nih, ya udah, mau minta apa? Ditraktir atau dibeliin ice cream?” tanya Ayu manja sambil mencubit pipi Arga.\n" +
                    "“Bukan itu, aku cuma minta, karena ini hari sabtu dan besok libur, aku mau main di rumah kamu malam ini, boleh kan?”\n" +
                    "Ayu terdiam mendengar permintaan ini. Bukan Ayu tidak suka, hal ini karena Ibunya baru saja meletakkan pialanya dulu ketika SD menjuarai lomba penyanyi solo cilik seJawa Barat dan Ayu tidak ingin Arga melihatnya. Ayu tidak ingin ada yang memintanya bernyanyi lagi sebab sejak sang Ayah meninggal Ayu tidak pernah bernyanyi lagi. Baginya bernyanyi hanya bisa terasa menyenangkan jika bersama sang Ayah yang mengiringi, tanpa sang Ayah menyanyi adalah suatu hal yang sangat tidak menyenangkan.\n" +
                    "“Hei, Yu, jangan diam aja, pokoknya nanti malam jam 7 aku ke rumah,” Arga berkata dengan nada suara yang tidak mengisyaratkan Ayu untuk mencegah. Ayu yang masih terdiam hanya bisa mengangguk dan langsung meminta Arga mengantarnya pulang.\n" +
                    "“Ayu, ada Arga, Nak” ibu Ayu memanggil Ayu sembari mempersilahkan Arga masuk ke ruang keluarga. “Arga, tante tinggalin yah, lagi banyak kerjaan, kalau mau minum, ambil saja, jangan malu.”\n" +
                    "“Iya tante, ini saya bawain brownies, lumayan buat temenin tante kerja” Arga memberikan brownies yang dibawanya pada Ibu Ayu, tante Ningrum.\n" +
                    "“Wah, ada yang cari perhatian nih, kok pacarnya gak dibawain apa-apa?” Ayu yang baru keluar dari kamarnya langsung menggoda Arga.\n" +
                    "“Kamu ini, Yu, tuh tidak lihat di tangan Arga ada coklat, masih kurang? Awas loh, gendut, ya sudah, mama masuk dulu. Arga tante masuk yah, terimakasih cakenya, lain kali jangan repot-repot, nanti ada yang marah” sambil melihat ke arah Ayu dan tersenyum.\n" +
                    "\n" +
                    "Ketika Ayu sedang membuat minuman, Arga yang menunggu di ruang keluarga memanggil Ayu. “Ayu, kok selama ini aku main kesini baru lihat ada piala juara lomba nyanyi milikmu?”\n" +
                    "“Iya, baru saja ditaruh mama, katanya sayang disimpan di lemari, gak bakal beranak.”\n" +
                    "“Kalau begitu kamu bisa dong nyanyi, kok gak pernah nyanyi sih, ya udah kamu nyanyi yah, kebetulan aku bisa main piano”\n" +
                    "Prang… gelas yang dipegang Ayu jatuh ke lantai dan pecah, ketika Ayu melihat Arga bersiap bermain piano.\n" +
                    "“Kenapa, Yu, aku gak boleh main piano ini ya? awas jangan bergerak, aku beresin dulu pecahan gelasnya”.\n" +
                    "\n" +
                    "Ibu Ningrum keluar dari kamar ketika mendengar suara pecahan gelas. Ibu Ningrum yang melihat reaksi Ayu berada di depan piano langsung memahami perasaan Ayu. Ibu Ningrum menghampiri Arga di dapur yang sedang membuang pecahan gelas. Ibu Ningrum mengajak Arga berbicara sebentar. Setelah Arga mendengar penjelasan Ibu Ningrum, Arga menghampiri Ayu. Namun Ayu sudah terlebih dahulu masuk ke kamar dan menolak untuk bertemu Arga dan ibunya.\n" +
                    "\n" +
                    "Satu minggu sudah Arga dan Ayu tidak saling berbicaara. Berbagai cara Arga tempuh agar Ayu mau memaafkannya. Bahkan berteriak minta maaf di di depan kelas Ayu ketika jam pelajaran, sampai-sampai Arga harus berhadapan dengan kepala sekolah, karena dianggap tidak memberika contoh yang baik sebagai Ketua OSIS, tetap saja Ayu tidak bersedia berbicara dengan Arga. Di rumah pun Ayu memilih untuk diam di dalam kamar. Intan sahabatnya dan Ibu Ningrum, tidak tega melihat Ayu seperti ini. Akhirnya setelah berdiskusi, Ibu Ningrum menyetujui saran Intan agar piano itu dimasukkan ke gudang. Dibantu Arga, piano itu pun dimasukkan ke gudang. Namun belum sempat dipindahkan Ayu menangis dan memarahi Ibunya, Intan, dan Arga yang dianggap tidak memahami dirinya.\n" +
                    "“Kenapa ma, kenapa piano ayah dimasukin ke gudang?” tanya Ayu sambil menagis\n" +
                    "“Iya, Yu, biar kamu tidak ingat terus sama masa lalu kamu,” Intan yang menjawab.\n" +
                    "“Diam kamu Tan, kamu yang usulin ide gila ini? Punya hak apa kamu?” Ayu yang tak pernah marah, kali ini membuat semua terdiam.\n" +
                    "“Bukan itu masudku, Yu, aku cuma tidak ingin karena piano ini kamu terbayang terus sama masa lalu, sama ayah kamu…”\n" +
                    "Prak, Ayu menampar pipi Intan, “maksud kamu apa, Tan, biar aku gak kebayang ayahku? Itu Ayah ku Tan, ada hak apa kamu melarang aku mengingatnya, jawab!!! Aku pikir kamu sahabat yang mengerti, percuma aku selalu cerita sama kamu, kamu gak pernah ngerti.”\n" +
                    "“Kamu yang berhenti, Yu” Arga menimpali dan menarik Ayu menjauh dari Intan yang masih memegangi pipinya. “Dewasa Yu, apa kamu pikir ayah mu senang kamu kayak gini? Cuma bisa diam melihat pianonya, tanpa berbuat sesuatu? Apa dengan menampar Intan, Ayahmu akan bangga?” Arga memegang kedua pipi Ayu dan berusaha membuat Ayu mentapnya, “Lihat aku Yu, lihat mataku, kamu itu hebat ada atau tanpa adanya Ayahmu, tapi kamu sendiri gak akan pernah tahu, tanpa kamu mencoba.\n" +
                    "“Kamu juga Arga, tau apa kamu soal ayah, dari mana kamu tahu rasa bangga ayahku?” Ayu menghardik Arga dengan tatapan tajam, “Bukan berarti kamu pacar aku, kamu berhak ikut campur semua masalahku, apalagi tentang ayah”, Ayu melepaskan tangan Arga dari kedua pipinya.\n" +
                    "\n" +
                    "Melihat Ayu yang di luar kendali, Ibu Ningrum menghampiri Ayu dan memeluknya. Beliau membenarkan perkataan Arga tentunya dengan kalimat yang lebih halus. Intan yang meskipun masih merasa sakit karena ditampar Ayu, dengan tulus menghampiri Ayu dan membisikan “Aku tahu sahabatku ini hebat, nyanyi lagi Yu, ayahmu pasti bangga, we love you”\n" +
                    "Ayu yang mendengar bisikan Intan spontan langsung memeluk Intan, dan menangis lalu meminta maaf. Bergantian dipeluknya sang Ibu dan Arga. Setelah cukup lama dalam pelukan Arga, Ayu memecah keheningan”Terimakasih buat semuanya, ma, Intan, Arga, bukannya Ayu gak mau nyanyi lagi, Ayu butuh waktu sendiri sekarang buat nenangin diri, tapi Ayu janji gak bakal buat kecewa kalian semua, terutama Ayah”, kemudian Ayu pamit masuk ke dalam kamar.\n" +
                    "\n" +
                    "Satu minggu setelah hari itu, tepatnya hari Sabtu, Ayu meminta Intan dan Arga ke rumahnya. Setelah Ibunya, Arga dan Intan duduk di ruang keluarga Ayu menghampiri piano sang Ayah dan meminta Arga memainkannya untuk mengiringnya bernyanyi. Ibu Ningrum spontan bangkit dari tempat duduknya dan mencium Ayu. Intan dan Arga bertepuk tangan bersama melihat Ayu yang sudah bersemangat lagi. Arga bergegas menuju tempat piano dan mencoba memainkannya sesuai lagu Ayu. Sungguh, suara Ayu sangat bagus, apalagi lagu yang dinyanyikan lagu Ayah yang dipopulerkan Ada Band. Intan dan Ibu Ningrum tak kuasa menahan air mata. Ayu mencoba tetap tersenyum dan bernyanyio meskipun air mata juga membasahi pipinya. Satu kecupan dari Arga mendarat di pipi Ayu setelah Ayu selesai bernyanyi, “Sayang, kamu luar biasa”. Kata sayang pertama yang diucapkan Arga untuk Ayu. Dipeluknya Ayu sesaat, seakan dalam pelukan itu tergambar rasa bahagia dan bangga Arga untuk Ayu. Ayu pun merasa ada kehangatan lain dalam pelukan Arga, kehangatan yang selama ini hilang darinya, kali ini Ayu sadar cinta Arga tulus untuknya, cinta Arga bagaikan kasih ayahnya yang hilang. “Terimakasih, Ga”, Ayu melepas pelukan Arga dan menuju ke kamarnya bukan untuk berdiam diri lagi, Ayu membawa sesuatu dari kamarnya. Ternyata formulir audisi ajang pencarian bakat.\n" +
                    "“Semuanya, Ayu udah mutusin mau buat Ayah bangga, jadi Ayu ikut ajang pencarian bakat ini, doain yah, biar Ayu berhasil. Arga, gantiin papa yah, temenin aku latihan”.\n" +
                    "“Pasti, Yu, justru aku bangga kamu anggap aku sosok yang sama seperti Ayahmu”, Arga menimpali.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Ibu Ningrum dan Intan yang mengerti dengan situasi ini, segera menghampiri Ayu dan memberi semangat lalu memilih menuju ke ruang makan meninggalkan Ayu dan Arga. Arga mengajak Ayu ke teras depan rumah. Terdiam keduanya memandang langit malam yang bertaburan bintang. Arga memegang tangan Ayu, lalu berkata “Yu, tau kan aku gak bisa romantis? Tau, Ga, makannya kita gak pernah rayain Valentine pake coklat, pake bunga, kayak yang lain, kita cuma ngabisin waktu ngobrol berdua, gak jelas, hehehe”, Ayu tertawa geli.\n" +
                    "“Maaf, Yu, mungkin kamu merasa aku aneh, atau mungkin kamu ngerasa bosan sama aku, tapi jujur, Yu, aku sayang sama kamu.”\n" +
                    "Ayu menempelkan jari telunjuknya ke bibir Arga, “Ssst, gak boleh ngomong gitu, justru itu yang buat aku suka dan sayang sama kamu. Kamu kan tau aku juga gak suka cowok romantis. Bagiku kamu yang sekarang sudah Arga yang sempurna”\n" +
                    "“Thank you, Yu, tapi kali ini aku juga mau seperti cowok lain,” Arga menatap mata Ayu dengan pandangan yang tidak seperti biasanya. Yu, ijinkan aku jadi cowok kedua terhebat dalam hidupmu seperti Ayahmu, yah, aku janji gak akan ninggalin kamu, aku mau bareng-bareng sama kamu, mengiringi kamu nyanyi dengan piano ayah kamu. Mudah-mudahan dengan kita latihan terus, aku bisa bantu kamu juara”, Arga mengusap lembut pipi Ayu.\n" +
                    "\n" +
                    "Ayu yang tidak biasa dengan sikap mesra Arga mencoba untuk tidak menghancurkan suasana malam itu, “Janji, ya Ga, gak bakal ninggalin aku sendiri sama piano itu kayak ayah, Aku sayang kamu Ga,” Ayu dengan tanpa ragu merebahkan kepalanya di dada Arga.\n" +
                    "Arga mengiyakan permintaan Ayu dan membalas memeluk Ayu.\n" +
                    "“Terimakasih Ayah, udah mau hadir lagi dalam Arga” Ayu yang masih dalam pelukan Arga berkata dalam hatinya.\n" +
                    "Malam itu di bawah bintang yang bertaburan, janji Arga terpatri dalam hati Ayu.",
            "Dia masih terbaring tak sadarkan diri. Sudah seharian penuh ia harus menelan obat itu. Obat yang sebenarnya tak pernah ia bayangkan untuk ditelannya bulat-bulat. Aku hanya mampu menatap wajah kuyunya dari balik kaca. Merasakan betapa berat hembusan napasnya. Dalam interval tiga jam, dia akan terbangun. Meronta, terpekik, dan dengan panik perawat berseragam putih akan masuk ke ruangannya. Memberinya obat sebesar kuku jari dan suntikan. Dia menjerit, dia berusaha untuk menghalau setiap obat atau suntikan apa pun yang diberikan perawat. Namun, tangan-tangan kekar dua orang perawat pria membetotnya, mencengkeramnya kuat-kuat. Dan akhirnya dia tertidur lagi.\n" +
                    "\n" +
                    "Lihatlah, rambutnya yang dulu panjang berkilau menjadi kusut dan berantakan. Jarinya yang dulu lentik sekarang mulai terlihat kurus kering dan kaku. Tangannya yang lembut, sekarang penuh dengan bekas suntikan. Kerutan di dahinya memanipulasi umur mudanya Dan wajahnya lelah. Tak pernah aku membayangkan semua ini akan terjadi kepadanya. Kepada seseorang yang dulu sangat ku iri. Kepada kakak perempuanku.\n" +
                    "\n" +
                    "\n" +
                    "Setiap kali melihatnya pulang sekolah dengan sejuta prestasi, aku selalu iri. Dia selalu mendapatkan apa yang dia inginkan. Nilai, prestasi dan ketenaran semua ada pada dirinya. Namun, aku tak pernah tahu yang sesungguhnya terjadi. Rentang usia di antara kita, yang membuatku hanya mampu mengenalinya sebagai sosok siswa SMA yang menjadi idaman keluarga. Sementara aku, hanya anak kecil berusia 6 tahun yang masih lugu.\n" +
                    "\n" +
                    "Seperti hari itu, ketika aku sedang bermain boneka di serambi rumah. Dia pulang setelah beberapa hari tak ada di rumah. Dia pulang dengan membawa sebuah piala. Nyaris tak ada senyum yang berkibar di wajahnya. Dia hanya mengucapkan salam, menyerahkan piala dan sebuah amplop kepada ibu dan langsung mengurung diri di kamar. Dan malam harinya, ibu akan memasakkan kami 5 menu masakan yang enak-enak. Lagi-lagi, dia dengan wajah menyebalkan ke luar dari kamar. Nyaris tanpa ekspresi. Dia menyantap makanan cepat sekali dan tanpa basa-basi kembali lagi mengurung diri di kamar. Dia seolah memiliki dunia sendiri dan tak menganggap kami yang berada di rumah ini adalah makhluk hidup.\n" +
                    "\n" +
                    "Setiap kali para siswa libur semester, ibu selalu mengajak kami pergi ke Bogor. Aku membawa semua mainanku, sementara dia membawa semua bukunya. Nyaris tak ada waktu baginya untuk sekedar mengajakku bermain. Waktunya hanya untuk buku dan buku. Dan kami tak seperti adik kakak pada umumnya. Dia terlalu pendiam bagiku, tak ada percakapan apa pun di antara kami. Bahkan kepada ibu pun, dia terlihat kaku. Bisa dihitung dia hanya berbicara berapa kali sehari, itu pun hanya hal-hal penting saja, dan bagiku dia adalah robot bertubuh manusia. Dia tak punya emosi sama sekali. Ekspresinya selalu datar, tak pernah dia tertawa atau tersenyum sekali pun.\n" +
                    "\n" +
                    "“Ayo semuanya turun. kita sudah sampai di Bogor.” ujar ibu kepada kami.\n" +
                    "Kami semua turun dari mobil dan menuju ke villa milik pribadi. Namun, rasanya ada yang tertinggal. Kakakku. Dia tak beranjak sedikit pun dari mobil, pandangannya kosong menatap kaca depan mobil. Tak mengindahkan perintah ibu untuk turun. Ada apa dengannya? Kenapa selama bertahun-tahun dia tak pernah mengajakku berbicara, bergurau, bercanda, bermain layaknya seorang kakak kepada adik?\n" +
                    "\n" +
                    "“Ibu, ada apa dengan Kakak sebenarnya? Dia aneh,” kataku kepada ibu.\n" +
                    "“Tak ada yang aneh kok. Dia hanya berusaha untuk menjadi yang terbaik. Dia harus belajar,” jawab ibu kepadaku dengan jawaban yang sebenarnya kurang memuaskanku.\n" +
                    "\n" +
                    "Mungkin bukan dia yang harus memulai, mungkin aku yang harus memulai. Kurasa aku harus mengajaknya berbicara dan bercanda. Meleburkan suasana. Aku memutuskan untuk menemuinya di mobil dengan membawa sebuah boneka. Namun, tatkala aku sampai di depan mobil. Mobil terlihat kosong. Tak ada seorang pun. Aku bergerak ke kanan dan kiri mobil, tak ada bayangannya sekali pun. Namun, aku harus tetap mencarinya. Kesempatan liburan ini harus dimanfaatkan sebaik-baiknya. Aku akan mengatakan kepadanya bahwa dia harus bisa membuka diri dengan lingkungan yang ada. Jangan membuat dunianya sendiri.\n" +
                    "\n" +
                    "“Aaaarrrggghh. Kenapa? Kenapa?” sebuah suara terdengar olehku. Kemudian disusul dengan isakan tangis.\n" +
                    "Aku berlari mencari di mana suara itu berasal. Dia berlutut. Kedua tangannya memegang telinga. Dia menunduk dan menggeleng-gelengkan kepalanya. Sesekali dia memukul-mukul tanah kosong di hadapannya dengan kedua tangannya. “Apa kau butuh ini? Aku tidak butuh lagi! Aku tidak mau lagi!” Dia meraih satu per satu buku yang berada di sebelahnya dan kemudian melemparkannya ke sembarang arah.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Bruk!\n" +
                    "Bruk!\n" +
                    "Bruk!\n" +
                    "\n" +
                    "Satu per satu buku terjatuh bergelatakan di tanah.\n" +
                    "\n" +
                    "“Kapan kalian mengerti? Apa sikapku selama ini belum jelas? Kenapa kalian tidak peka? Aku sudah lama menahan semua rasa. Selama ini aku hanya robot kalian!” Dia kembali berteriak. Menggumamkan kata demi kata yang sulit ku cerna. Untuk pertama kalinya aku melihat wajahnya penuh emosi. Tidak datar seperti yang ku tahu selama ini. Kini dia bersimpuh. Tertunduk. Tangannya mengepal dan menekan paha. Dia menangis.\n" +
                    "\n" +
                    "“Kakak..” kataku menghampirinya.\n" +
                    "Dia terkejut. Matanya membesar menatapku yang telah berdiri di sampingnya.\n" +
                    "“Kakak tidak apa-apa kan?” Namun, aku tak mendengar jawaban apa pun darinya. Dia hanya mencoba untuk bangun. Memberesi buku-bukunya yang tadi sempat dia lemparkan dan aku sama sekali tak dianggapnya ada. Dia berdiri, memunguti bukunya, lantas beranjak pergi. Menyisakan aku dengan sebuah tanda tanya.\n" +
                    "\n" +
                    "Esok harinya, aku menemukan kakakku sudah ada di ruang tamu bersama seorang laki-laki paruh baya. Kepalanya botak dan memakai kacamata kalung. Sepertinya dia adalah guru les privat yang sering dibicarakan ibu. Seseorang yang berprestasi yang terus menelurkan siswa-siswa didikannya menjadi peraih medali di ajang bergengsi. Dia tengah mengajari kakak materi sekolah.\n" +
                    "\n" +
                    "Kakak terlihat menyimaknya. Matanya menatap buku yang sedang dicoret-coret oleh laki-laki tersebut. Namun, dari sudut yang berbeda, aku menangkap sesuatu yang lain. Kakak tidak sedang memperhatikan laki-laki tersebut. Tatapannya bukan kepada buku yang sedang dicoret-coret tersebut, tetapi kepada hal lain. Jiwanya seperti tengah mengembara. Dia seperti tidak berada di ruang tamu tersebut.\n" +
                    "\n" +
                    "“Bagaimana sudah paham?” tanya laki-laki paruh baya kepada kakak.\n" +
                    "“Iya, Pak,” jawabnya mengangguk.\n" +
                    "“Baiklah karena saya ada urusan, pertemuan kita kali ini cukup sampai di sini ya. Tolong kerjakan soal di halaman 204, besok kita bahas.”\n" +
                    "\n" +
                    "Kakak mengangguk. Laki-laki paruh baya berpamitan kepada ibu dan pergi menuju urusannya yang lain, sedangkan kakak masih terpaku di ruang tamu. Berhadapan dengan buku dan sebuah kertas. Kemudian, dia menutup bukunya dan mengeluarkan sebuah pensil. Dia mulai menuliskan sesuatu di secarik kertas. Selang setengah jam, dia meninggalkan semua bukunya di ruang tamu dan dia pergi entah ke mana. Ku kira ia pergi ke kamar mandi, tapi ku rasa cukup lama jika ia menghabiskan waktu di kamar mandi. Mungkin saja dia tertidur di kamarnya. Sebenarnya aku ingin menanyakan perihal pekerjaan rumahku kepadanya, tapi aku tidak mau mengganggunya. Lagi pula dia selama ini bersikap dingin terhadapku.\n" +
                    "\n" +
                    "“Yaah. Pensilku kok nggak ada sih?” keluhku ketika mendapati pensilku menghilang.\n" +
                    "\n" +
                    "Aku berinisiatif untuk meminjam pensil kakak. Kakak pasti punya banyak pensil yang menganggur, terlebih dia sendiri tak juga kembali. Buku-buku kakak banyak sekali dan memenuhi satu meja besar di ruang tamu. Banyak sekali coretan-coretan angka, kata, dan simbol apalah yang tak ku pahami sama sekali. Di mana aku bisa menemukan pensil? Di tumpukan buku-buku tersebut tak ada sama sekali kotak pensil. Namun, bukan berarti tak ada pensil di sini. Tadi aku lihat kakak sedang menulis menggunakan pensil.\n" +
                    "\n" +
                    "Akhirnya setelah mencarinya dengan teliti, aku menemukan sebuah buku yang menggelembung dan ketika ku tekan seperti ada pensil di dalamnya. Aku membukanya tepat di halaman tempat pensil itu berada. Pensil yang ujungnya patah. Aku kecewa, ternyata kakak menggunakan pensil patah ini untuk menulis. Sebelum aku beranjak pergi, aku menemukan secarik kertas yang sudah terisi dengan barisan kata-kata. Namun, tulisannya berdebu, sepertinya ditulis dengan pensil yang patah itu. Bahkan aku bisa menemukan debu-debu pensil berserakan di atas catatan itu.\n" +
                    "\n" +
                    "“Bukan niatku untuk memborong semua piala itu. Bukan keinginanku untuk menjadikan rumah ini sepi tanpa candaanku. Bukan pula kehendakku untuk membawa buku pelajaran ke mana pun. Aku mungkin seperti robot yang hanya tahu apa yang diperintahkan kepadanya. Namun, di sisi lain aku manusia. Aku masih bisa merasakan apa yang selama ini ku sembunyikan.\n" +
                    "Mereka menyiksaku perlahan-lahan. Memasukkanku di kelas akselerasi yang ku benci. Menjadikanku lulusan terbaik sekaligus termuda. Menjadikanku peraih kejuaraan terbanyak di sekolah. Dan lengkap membuatku dijauhi semua teman-temanku.”\n" +
                    "\n" +
                    "“Obsesi mereka adalah menjadikanku nomor satu, tanpa memikirkan bagaimana pendapatku dengan semua keputusan mereka. Mereka mengatur hidupku. Mereka menolak mentah-mentah hobiku dan memaksaku untuk beralih ke hal lain yang aku benci. Aku adalah robot mereka yang tak sanggup apa-apa. Mungkin aku diciptakan hanya untuk memuaskan keinginan mereka. Hanya saja, mereka tak tahu bahwa suatu saat nanti robot itu akan rusak.”\n" +
                    "\n" +
                    "“Aku ingin mengatakan kepada mereka untuk menyudahi semua ini. Mengembalikkanku ke dunia normal. Bukan dunia robot yang harus ku hadapi saat ini. Namun, aku tak tahu caranya. Lidahku sudah kelu untuk berbicara dengan mereka. Aku memilih diam saja. Mungkin dengan diam, mereka akan peka. Namun, ternyata dugaanku keliru. Kediamanku justru membuat mereka menggila. Ajang olimpiade internasional di depan mata dan aku diminta menyiapkan segalanya, walaupun harus mengorbankan liburanku untuk mempelajari materi olimpiade. Aku lelah, Ayah, Ibu. Maafkan aku tak mampu memuaskan obsesimu hingga akhir usia.”\n" +
                    "\n" +
                    "“Brrrraaaaakkkk! Pyyaaaaarr!!!”\n" +
                    "\n" +
                    "Terdengar bunyi seperti kaca pecah. Ibu yang sedang bercengkerama dengan ayah di serambi langsung terkejut dan segera masuk ke dalam villa. Aku meletakkan kertas itu dan pergi mencari bunyi tadi. Satu per satu tempat aku cari. Tak ada kaca atau apa pun yang pecah. Hingga aku sampai di depan kamar kakak. Bukan lagi bunyi kaca pecah yang terdengar, melainkan beberapa barang sepertinya dibanting.\n" +
                    "\n" +
                    "Kemudian, terdengar pekikan seseorang disusul tawa yang keras sekali setelah itu dilanjutkan dengan rintihan tangis seseorang. Ayah dan ibu seketika datang. Kami langsung menangkap ada gelagat tidak beres dengan kakak. Tanpa babibu, ayah menggedor-gedor pintu kamar kakak. Namun, kakak seolah tak mendengar apa pun. Hanya tawa tanpa makna saja yang terdengar. Tak sabar, ayah mendobraknya paksa. Dan terbongkarlah apa yang terjadi.\n" +
                    "\n" +
                    "Kamar kakak seperti kapal pecah. Barang-barang tercecer di lantai. Serpihan kaca lemari yang tadi pecah berserakan di lantai bahkan sempat melukai telapak kakiku. Kapas dari bantal tercabut dan beterbangan memenuhi ruangan. Menyambut penampilan buruk dari kakak. Rambut kakak berantakan seperti tak pernah disisir satu minggu. Dan lihatlah ekspresinya.\n" +
                    "“Siapa kalian?” dia bertanya dengan nada bicara seperti seseorang yang tengah terganggu jiwanya.\n" +
                    "\n" +
                    "Dan sejak saat itu, aku memahami satu hal bahwa kakak telah berubah dari sebelumnya. Kakak telah menunjukkan apa yang selama ini disembunyikannya. Dan sejak saat itu, dia harus berpisah dengan kami. Tekanan batin yang selama ini ditahannya, telah ia keluarkan. Aku menatapnya sekali lagi dari balik kaca rumah sakit jiwa. Adakah sudut riang masih tertinggal di wajahnya? Adakah kebahagiaan masa remaja masih menemani hidupnya kini? Pensil yang dulu bisa melakukan apa pun kini telah rapuh di tengah usia.",
            "Hi, aku Arina. Arina Sakti. Aku mempunyai sahabat namanya Melody. Sayang dia sudah pergi jauh ke Italia. Hanya tertinggal sebuah surat dari Melody. Namun ada yang aneh dari surat tersebut.\n" +
                    "\n" +
                    "KRING..\n" +
                    "Jam wekerku membangunkanku pukul 5.30. Aku mengambil air wudhu lalu shalat subuh. Aku mandi lalu mengenakan pakaian. Karena hari ini Jum’at, seragam di sekolah bebas. Aku mengenakan baju biru polos, blazer coklat, celana jeans, dan jilbab pashmina hitam yang kutata di kepalaku dengan sangat indah. Aku mengambil tasku. Aku turun dari kamarku menuju meja makan. Kuteguk susu coklat hangat sedikit demi sedikit. Lalu mengambil sepatu hitamku lalu berangkat sekolah.\n" +
                    "\n" +
                    "Di sekolah aku masih memikirkan surat itu. Sampai aku tidak memerhatikan Bu Kanya yang sedang mengajar.\n" +
                    "\n" +
                    "\n" +
                    "TING… TONG…\n" +
                    "Bel istirahat yang sangat kunantikan pun datang. Namun, aku tetap melamun.\n" +
                    "“Na, ke kantin yuk” ujar Yummy teman sebangkuku. Aku tidak merespon. Yummy menggerakan tanganya di depan wajahku.\n" +
                    "“ARINA!!”\n" +
                    "“Ha? Yummy? Kenapa?”\n" +
                    "“Kamu melamun? Kenapa?”\n" +
                    "“Jelasinnya di kantin aja ya!” Yummy yang masih bingung langsung aku tarik.\n" +
                    "\n" +
                    "“Mbak, nasgor seafood pedas sama es teh satu!” pesanku.\n" +
                    "“Mie ayam pedaaas sama air mineral dingin satu!” Yummy juga memesan. Setelah pesanan datang, aku mulai bercerita.\n" +
                    "“Jadi aku termenung tadi gara gara surat Melody, ingat?”\n" +
                    "“Melody teman kita dulu”\n" +
                    "“Iya, suratnya itu menanamkan misteri. Kamu ingat, saat dia masih di Indonesia, dia bercerita tentang benda rahasia. Nah dari surat itu, dia memberi tahu clue pertamanya” ceritaku panjang.\n" +
                    "“Ooh gitu…”\n" +
                    "“Mau bantu nyariin tuh benda gak?”\n" +
                    "“Mau, kalau ditemenin ama Rizka”\n" +
                    "“Siiip…” kami menghabiskan makanan masing-masing.\n" +
                    "“Pulang sekolah, ya” ujarku pada Yummy.\n" +
                    "\n" +
                    "Teet…\n" +
                    "Aku membukakan pintu. Ternyata itu Yummy dan Rizka.\n" +
                    "“Hai, gimana? Liat suratnya dulu!” ujar Rizka. Aku mengeluarkan suratnya. Isinya:\n" +
                    "\n" +
                    "Dear, Arina.\n" +
                    "Hi, Arina. Maaf ya aku baru kasih taunya sekarang. Aku harus pergi ke Sidney. Maaf banget. Kamu ingat kalau aku pernah menceritakan tentang benda rahasia. Terakhir aku mau kasih tau ke kamau kalau benda rahasia itu tertanam di rumah seseorang yang sangat kusayangi. Di dekat sebuah taman. Dan di sudut kanan sebuah pohon. Sampai sini dulu.\n" +
                    "\n" +
                    "Salam,\n" +
                    "Melody.\n" +
                    "\n" +
                    "Yummy dan Rizka mulai berfikir.\n" +
                    "“Kalau rumah, mungkin rumah bibi, paman, kakak, nenek, kakek” Yummy mengira-ngira.\n" +
                    "“Bibi dan paman semuanya tinggal di Jepang. Nenek dan kakek sudah tiada. Berarti tinggal kakaknya” Rizka memperjelas.\n" +
                    "“Yap! Tapi siapa kakaknya Melody yang masih di sini?” tanyaku.\n" +
                    "“Mungkin bukan kakak kandung mungkin sepupu” Rizka mengira-ngira.\n" +
                    "“Ah, aku mengerti. Di rumah seseorang yang kusayangi, maksudnya rumah kakak sepupunya Melody. Mbak Nada. Kalau tak salah dia juga mempunyai taman” jelas Yummy.\n" +
                    "“Mbak Nada? Aku kenal tetangga rumahku!” Rizka mencerna perkataan Yummy tadi.\n" +
                    "Kami semua saling tatap lalu berdiri dan langsung ke luar rumahku. Tak lupa aku menyambar jilbabku.\n" +
                    "\n" +
                    "Setelah sampai…\n" +
                    "“Assalamualaikum, Mbak Nada!” salam Rizka.\n" +
                    "“Waalaikumsalam, ada apa Riz?”\n" +
                    "“Lihat taman, boleh?”\n" +
                    "“Boleh, jangan dipetik ya!”\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Kami bertiga berlari menuju taman milik Mbak Nada.\n" +
                    "“Oke kita mulai. Ini ada taman. Kecil sih. Terus di sudut kanan sebuah pohon. Aha, itu. Pohon rambutan. Buah rambutan kesukaan Melody. Ayo kita gali!”\n" +
                    "“Siip…” Yummy dan Rizka hanya meng-koor.\n" +
                    "Aku mengarahkan Yummy yang menggali. Terlihat sebuah kotak.\n" +
                    "“Hanya kotak?” Yummy semakin bingung. Aku memerhatikan ada sebuah lubang. Aku memerhatikannya lekat-lekat.\n" +
                    "“Ooh…” aku ber-oh. Lalu menunjukkan cincin dari Melody. Cincin itu melambangkan nada. Kulepas cincin itu dan memasukkannya ke lubang kunci itu. Kotak itu bisa terbuka.\n" +
                    "Isinya sebuah surat, rekaman, dan kotak kalung.\n" +
                    "Aku membuka suratnya dan membacanya.\n" +
                    "\n" +
                    "Dear, Arina.\n" +
                    "Selamat!! Kamu telah menemukan benda rahasiaku. Jagalah benda ini. Satu hal, aku ke Sidney untuk terakhir kalinya. Karena aku sudah akan pergi duluan. Pergi ke tempat abadi. Aku terserang penyakit leukumia. Maaf kuucapkan.\n" +
                    "\n" +
                    "Salam hangat,\n" +
                    "Melody.\n" +
                    "\n" +
                    "Lalu kubuka kotak kalung itu. Kalung itu berbandul yang berbentuk love. Kubuka love itu. Itu fotoku dengan Melody di kebun raya bogor.\n" +
                    "Terakhir sebuah rekaman. Ada tulisannya.\n" +
                    "MY MUSIC FOR ARINA. Aku terkejut. Aku tak bisa menahan tangisku. Tangisku pecah saat itu juga.\n" +
                    "“Sabar, Na. Tuhan punya banyak rencana. Mungkin ini jalan terbaiknya” hibur Yummy.\n" +
                    "“O… hiks.. ke.. hiks.. oke..”\n" +
                    "“Denger lagunya, dooong…” pinta Rizka.\n" +
                    "“Tak boleeh. Ini rahasiaku dan Melody. Titik gak pake koma!” Rizka hanya cemberut.",
            "“Best Friend Forever”\n" +
                    "Seorang gadis menggumamkan kalimat itu saat memandangi sebuah foto yang terbingkai cantik dalam sebuah frame berwarna coklat muda. Ia adalah Nana, seorang gadis kelas 2 SMA yang merasa kesepian. Ya… sebetulnya ia punya banyak teman, bahkan sahabat. Seperti yang ada dalam foto dalam frame yang saat ini ia genggam. Ia punya tujuh, ya tujuh sahabat yang selalu menemaninya dulu. Nayla, Sasa, Dannisa, Sekar, Laila, Wanda, dan Yola adalah sahabat-sahabat Nana semenjak ia masuk SMA. Bagi Nana memang cukup sulit untuk menyatukan pribadi dari dirinya dan masing-masing dari mereka untuk bisa membaur satu sama lain. Karena mereka berdelapan, hal tersebut bukanlah hal yang mudah.\n" +
                    "\n" +
                    "Seperti yang ia alami sekarang, ia merasa hubungan persahabatan mereka sudah renggang. Mereka sibuk dengan urusannya masing-masing. Nayla, Sasa, Sekar, dan Wanda sibuk dengan urusan mereka di OSIS. Laila dan Yola sibuk dengan kegiatannya di pramuka. Yang terakhir ada Dannisa yang sibuk latihan menyanyi, ia mengikuti ekstra musik dan ia menjadi penyanyi utama dalam band sekolah. Sedangkan Nana sendiri, ia sebenarnya anggota tim basket putri. Sayangnya, untuk saat ini ia tidak bisa bergabung dengan tim basket karena ia cedera. Baik pelatih maupun orangtua Nana tidak mengizinkannya untuk latihan basket sementara waktu ini.\n" +
                    "\n" +
                    "“Gue tau gengs, kalian orang-orang sibuk. So, ngga perlu mempedulikan persahabatan kita” gumam Nana dengan senyum miris. Ia lalu meletakkan frame foto tersebut di meja belajarnya, lalu ia membaringkan tubuhnya.\n" +
                    "“Gue harus lekas tidur, besok bisa jadi hari yang berat” gumamnya sekali lagi sebelum tidur.\n" +
                    "\n" +
                    "\n" +
                    "Pagi hari seperti biasanya, Nana berangkat sekolah dengan sepeda legendarisnya. Tak lupa ia memakai helm mungil pemberian Pamannya. Ia menyapa setiap orang yang ia jumpai selama perjalanan ke sekolah. Begitulah Nana, ia adalah gadis tomboy yang ramah dan pemberani. Pelajaran pertama yang harus ia tempuh bersama yang lainnya adalah Fisika. Sebenarnya Nana malas datang ke sekolah. Bukan karena guru Fisika yang killer, tapi karena sahabatnya yang sibuk dengan urusan mereka masing-masing. Nana sengaja datang terlambat untuk menghindari sahabat-sahabatnya. Setidaknya sebelum guru Fisika masuk, Nana sudah duduk manis di kelas.\n" +
                    "\n" +
                    "Tanpa terasa, kegiatan di sekolah sudah hampir usai. Nana sudah berniat untuk pulang, karena ia tahu bahwa sahabat-sahabatnya akan langsung pergi dengan urusannya masing-masing tanpa mempedulikannya.\n" +
                    "“Na.. mau kemana?” tanya Sekar yang tiba-tiba menghampiri Nana.\n" +
                    "“Baliklah, emang gue kayak lo lo pada” jawab Nana ketus, lalu pergi.\n" +
                    "\n" +
                    "Melihat ekspresi Nana yang begitu kesal, Sekar merasa bersalah dan ia langsung menghampiri yang lainnya. Dan dari kejauhan mereka melihat Nana sedang bersama seorang anak laki-laki.\n" +
                    "“Itu bukannya Andy ya?” tanya Wanda kepada yang lainnya.\n" +
                    "“Iya, itu Andy anak basket” jawab Yola yakin.\n" +
                    "“Lho katanya mau balik? Tapi kok malah berduaan sama Andy? Dasar penipu!” Dannisa tampak sangat emosi melihat Nana dan Andy jalan bersama.\n" +
                    "“Lo ngga cemburu kan Dan?” tanya Sasa polos.\n" +
                    "“Ih apaan si! Ya enggalah! Udah ah, gue mau latihan” jawab Dannisa, lalu pergi.\n" +
                    "\n" +
                    "Ternyata Nana dan Andy melihat anak basket putri latihan. Nana tampak gusar, tapi ia tak bisa menyembunyikan raut wajah senangnya.\n" +
                    "“Kan gue udah bilang, gue pantang buat ke lapangan basket. Kalo bukan buat ambil nilai, gue ngga mau ke sini. Apalagi jadi penonton. OGAH!”\n" +
                    "“Na.. gue tau lo pengen banget paling engga liat tim lo main. Lo emang egois sama diri lo sendiri. Lo ngga mau jadi penonton padahal lo juga pengen tau perkembangan tim lo. Lo cuman mau denger dari pemain? Tanpa liat sendiri? Dan lo percaya?” Andy mulai menggebu-gebu.\n" +
                    "“Lo ngga usah sok peduli” jawab Nana ketus.\n" +
                    "“Gue tau Na, lo kesepian. Lo butuh temen. Di saat kayak gini, sahabat-sahabat lo justru sibuk sendiri-sendiri. Gue juga tau lo butuh support. Gue nemenin lo bukan karena… ya lo tau, bukan karena gue suka sama lo, tapi juga bukan karena gue kasian sama lo. Tapi karena gue peduli sama lo Na. Gue tau, lo punya mimpi punya persahabatan yang keren di masa putih abu-abu ini”\n" +
                    "“Lo tau dari mana?” tanya Nana curiga.\n" +
                    "“Kita sama-sama anak basket. Inget itu. Udah pokoknya lo liat temen-temen satu tim lo main. Lo liat sendiri perkembangannya. Trus kita selesain masalah lo sama sahabat-sahabat lo” ucap Andy lalu meninggalkan Nana dengan kebingungannya.\n" +
                    "\n" +
                    "“Gue masih ngga habis pikir sama sikap lo. Sepeduli itu kah? Atau ada maksud lain?” tanya Nana saat ia berjalan dengan Andy menuju kantin. Karena hari ini hari Senin, maka kantin akan buka hingga pukul 17.00. Sedangkan hari biasanya hanya buka hingga pukul 15.00.\n" +
                    "“Hmm, iya ada, ada maksud lain” ucap Andy menggantung.\n" +
                    "“So, what???” tanya Nana penasaran.\n" +
                    "“Itu mereka lagi kumpul. Pas banget. Sana omongin baik-baik” Andy menunjuk ke arah remaja-remaja putri yang sedang berkumpul. Tapi Nana langsung membalikkan badan, bermaksud untuk pergi. Tapi Andy mencegahnya dan menarik tangannya.\n" +
                    "\n" +
                    "“Ahhh.. sakit Andy! Lepasin!” Nana mengerang kesakitan.\n" +
                    "“Nih gengs, ada yang mau gabung sama kalian. Gue balik dulu ya” Andy langsung pergi dan meninggalkan Nana dengan wajah kesalnya.\n" +
                    "“Awas lo ANDY!!! ABIS LO SAMA GUE NANTI” gumam Nana pelan.\n" +
                    "“Abis pacaran ya? Trus diputusin? Gimana? Sakit? Trus kalo udah ngersain sakitnya dikhianatin cowok langsung balik ke kita gitu?” tanya Dannisa ketus.\n" +
                    "“Dan.. jaga emosi, please” ucap Nayla mencoba menenangkan.\n" +
                    "“Ngga masalah Nay, dia mau emosi kayak apa juga. Gue ngga takut, karena apa yang dia omongin ngga bener” ucap Nana dengan nada bicara setenang mungkin.\n" +
                    "“Gue tegasin ya. Gue sama Andy ngga pacaran, emang selama ini kita deket. Ya karena dia peduli sama gue. Dannisa bilang gue udah ngerasain sakitnya dikhinatin cowok, itu salah besar. Gue justru ngerasain dikhianatin sahabat gue sendiri” tanpa terasa air mata Nana sudah menetes membasahi pipinya.\n" +
                    "\n" +
                    "Suasana lengang dan Nana menarik napas dalam.\n" +
                    "“Sesak rasanya. Saat gue cedera, kalian kemana? Kalian sibuk dengan urusan kalian masing-masing! Asal kalian tau, tiap malem gue selalu mikirin kalian yang entah mikirin gue atau engga. Gue masih berharap banget kalian setidaknya tanya kondisi gue. Ya gue hargai usaha kalian yang kadang peka kalo gue lagi sendiri. Tapi sorry banget, kalian bukan sahabat yang gue harapkan kalo kalian beigini terus”\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "“Gue paham banget kalian sibuk. Tapi gue pengen banget setidaknya kalian mikirin kapan kita punya quality time bareng. Ngga terpecah-pecah kayak sekarang. Kita nyatu karena kita punya satu tujuan, punya persahabatan yang keren, yang sampe kita tua nanti ngga bakalan putus tali persahabatan ini. So, kita mau gini terus?” tanya Nana. Tiba-tiba Laila memeluk Nana.\n" +
                    "“Maafin kita Na. Maaf banget kita ngga pengertian sama kondisi lo dan sibuk sendiri-sendiri” ucap Laila yang tak dapat menahan tangisnya. Begitupun yang lainnya, semua menangis. Hingga akhirnya mereka semua berdiri dan saling berpelukan.\n" +
                    "\n" +
                    "Tanpa mereka sadari, dua pasang mata melihat mereka sambil tersenyum manis.\n" +
                    "“Alasan gue peduli karena gue juga punya harapan yang sama. Tapi bedanya, gue ngga bisa mewujudkan hal itu. Gue ngga mau, kalian bernasib sama kayak gue” gumamnya, lalu pergi.",
            "Siang ini kelas XI – Mipa 4 ramai sekali, kelasku itu hampir mirip dengan pasar ikan jika guru mata pelajaran berhalangan masuk. Seperti saat ini, pelajaran matematika sedang kosong, bisa dilihat di setiap sudut kelas ada saja segerombolan siswa siswi yang asik sendiri.\n" +
                    "\n" +
                    "“Ra, ke kantin yuk. Mumpung jam kosong nih.” Seorang temanku, Lia, mengajakku mengisi perut di kantin.\n" +
                    "“Ayo.” Dengan senang hati Aku mengikutinya ke kantin sekolah.\n" +
                    "\n" +
                    "Di jam-jam seperti ini kantin cenderung sepi, karena semua kelas masih KBM*. Aku berencana membeli roti bakar dan air mineral saja, kalau Lia, dia ingin membeli nasi kuning dan susu cokelat.\n" +
                    "\n" +
                    "\n" +
                    "“Bu, beli nasi kuning satu sama susu coklat satu.” Ujar Lia memesan pada Ibu kantin sesampainya kami di sana. Seraya Lia memesan, Aku mengambil air mineral yang berada di rak sebelah kanan meja jualan Ibu kantin.\n" +
                    "\n" +
                    "“Ra, udah belum?” tanya Lia dengan menenteng pesanan miliknya.\n" +
                    "“Sebentar, Aku mau ambil roti bakar di sana.” Jawabku dengan menunjuk tempat roti bakar berada.\n" +
                    "\n" +
                    "Berbeda dengan letak air mineral, letak roti bakar berada di rak sebelah kiri meja Ibu kantin. Kulangkahkan kakiku ke sisi meja sebelah kiri, di rak hanya tertinggal satu roti bakar dan kebetulan roti bakar itu rasa cokelat, my favorite.\n" +
                    "Kuayunkan tanganku untuk mengambilnya, namun hanya satu sisi saja yang berhasil dicapai tanganku. Di sisi yang satunya ada sebuah tangan berbeda yang menarik roti bakar itu.\n" +
                    "\n" +
                    "“Hei!, ini roti bakar milikku. Aku dulu yang memegangnya.” Ujarku protes, Dia adalah siswa laki laki yang sepertinya juga kelas XI.\n" +
                    "“Aku juga memegangnya dulu. Sebaiknya kau saja yang mengalah.”\n" +
                    "“Tidak mau.”\n" +
                    "\n" +
                    "Karena menunggu terlalu lama, Lia menegururku. Kutolehkan kepalaku menghadap Lia, tiba tiba Dia menarik paksa Roti bakar itu dari peganganku. Karena tidak fokus, roti bakar rasa coklat itu jatuh ke tangannya.\n" +
                    "\n" +
                    "“KAU.” Teriakku kaget.\n" +
                    "“Maaf, aku yang mendapatkan roti bakar ini. Sampai jumpa.” Ujar Dia dengan senyuman mengejek, tanpa menunggu terlalu lama Dia segera membayar roti bakar rasa coklat kesukaanku itu kemudian melenggang pergi dari kantin.\n" +
                    "\n" +
                    "“Ra, kok lama sih?. Aku nunggu dari tadi di depan kantin loh.” Tanya Lia yang menghampiriku.\n" +
                    "“Maaf ya Li, Ayo balik ke kelas.” Ajakku, dengan berat hati aku mengikhlaskan Roti bakar rasa coklat itu untuk siswa laki laki yang sombong dan menyebalkan itu.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "“Katanya beli Roti bakar Ra, kok kamu Cuma bawa air doang. Gak jadi beli?”\n" +
                    "“Nggak, roti bakarnya udah diambil setan!” jawabku emosi.",
            "Siang ini Maura lagi di taman, dia sedang mikirin sesuatu lalu mengambil buku harian yang ada di dalam tasnya. “Dear diary, hari ini gue nemuin tempat yang romantis banget, pengen deh ngajak pacar gue kesini, pasti sweet banget. Kapan ya dia ngajakin gue ngedate.. Tuhan gue berharap banget”. Kata Maura dalam hati sambil nulis di buku hariannya. Maura sering banget bayangin, kapan gitu cowoknya ngajakin dia ngedate sekali aja. Kadang juga Maura sering senyum-senyum sendiri gara-gara mikirin Levin cowoknya itu.\n" +
                    "\n" +
                    "“Eh tunggu, bukanya itu Levin ya, kok dia sama cewek, siapa cewek itu?” gumam Maura dalam hati. Karena penasaran Maura menegur Levin “Levin! Apa-apaan sih lo, dia siapa?!” “Apaan sih! Gak usah ganggu gue lagi! Mulai sekarang kita putus!” jawab Levin dengan nada kasar. “Putus? Kenapa putus? Padahal gue udah berkorban buat lo, udah ngerjain tugas-tugas lo, udah ngerjain semua yang lo suruh, terus kenapa lo putusin gue?” Maura heran dengan levin. “Kenapa? Hah! Nyadar dong lo tuh udah jelek, cupu lagi! Masih ada cewek yang lebih pantes buat gue.” Jawab levin tanpa rasa bersalah, Maura seketika langsung lari pergi ninggalin Levin dan cewek barunya itu.\n" +
                    "\n" +
                    "“Levin kenapa sih lo jahat banget sama gue, kenapa lo putusin gue kayak gini, sakit tau vin” gerutu Maura di sudut kamarnya. Tiba-tiba saja Reyna dateng “OMG Maura! lo kenapa sih buang-buang tissu kayak begini, bikin kotor tau!!” “Reyna… lo apaan sih sahabat lagi nangis juga malah diceramahin soal lingkungan!” “Ya lagian lo nangisin apaan sih?” tanya reyna penasaran, “Itu Levin, dia.. dia mutusin gue Rey!” “lo putus? Haha, syukurlah kalo lo putus sama Levin.” “Ih, Reyna apaan sih sahabat lagi sedih malah bersyukur!” pekik Maura kesal. “Maura.. gimana gue gak bersyukur coba lo putus sama dia, kan dari awal gue udah bilang Levin pacaran sama lo tuh cuma buat manfaatin lo doang.” Jelas reyna.\n" +
                    "“Tapi Rey, gue sayang banget sama dia, gue gak bisa lupain dia, dia itu cinta pertama gue.” Sambung Maura sambil nangis. “Maura sayang, coba deh gue tanya sama lo, pernah gak lo diajak ngedate sama dia, hah?” “Selama pacaran gue gak pernah diajak jalan sama Levin, hiks. Selalu aja digagalin.” “Hello, Maura! Udah gue bilang kan? Levin playboy tuh cuma manfaatin lo doang, udah deh pokoknya lo harus move on! Inget ya, masih banyak cowok yang lebih baik dari dia, oke! Pokoknya lo harus move on!!” “Apaan sih Rey, bilang move on sih gampang! Tapi gue yang ngelakuin tuh susah!” jawab Maura jengkel. “Gue gak peduli pokoknya lo haru move on!” pinta Reyna.\n" +
                    "\n" +
                    "\n" +
                    "Maura lagi jalan di koridor sekolah gak sengaja nabrak seorang cowok “Aduuuhh maaf-maaf gue gak sengaja, lo gak papa kan?” kata cowok itu, “Iya gak papa kok.” Sahut Maura. “Eh, Maura?!” “Em, Bryan! Kok lo bisa ada disini?” Maura penasaran. “Gue kan juga sekolah disini.” jawab Bryan. “Loh!! Eh sejak kapan?” “Emm, udah dulu ya gue mau ke kantor.” Kata Bryan buru-buru lalu ninggalin Maura.\n" +
                    "\n" +
                    "“Liat tuh vin, Maura udah sama cowok lain!” kata temen Levin. “Mana mungkin Maura bisa lupain gue, gue gak yakin dia bisa move on dari gue, haha padahal kan gue cuma manfaatin pinternya dia buat ngerjain tugas sekolah gue, bodohnya dia mau sama gue. Ah udah lah, yok ke kelas” jawab Levin, “oh, ya oke!” mereka berdua pun masuk ke kelas.\n" +
                    "\n" +
                    "Saat di kelas Maura melamun karena cemburu lihat Levin sama cewek barunya lagi mesra-mesraan di depanya. Tiba-tiba Guru masuk di kelas, Maura kaget dan sadar dari lamunannya. “Anak-anak ibu mau ngenalin anak baru di kelas ini, silahkan masuk nak!” perintah Guru “Hay, semua. Perkenalkan nama gue Bryan, gue pindahan dari SMA Garuda.” “Hay, Bryan!!” sapa semua siswa. Bryan kemudian menyapa Maura “Hay, Maura.” “Hay, Bryan!” sahut Maura. “Eh, lo kenal dia Ra?” tanya Reyna pada Maura karena penasaran, “Iyalah kenal, dia kan temen SMP gue!!” jawab Maura. “Hah? Jadi lo udah kenal dia lama??” tanya Reyna lagi lalu Maura mengangguk.\n" +
                    "\n" +
                    "Ketika pulang sekolah Maura menuju taman belakang sekolah dia nangis karena masih mikirin Levin, tiba-tiba Bryan dateng lalu memberikan sapu tangan ke Maura. “Aduhhh zaman sekarang masih nangis, ngapain sih galau segala! Gara-gara cowok lagi. Sayang air mata lo kebuang sia-sia gitu.” Kata Bryan. “Eh, loh kok lo bisa tau?” tanya Maura, “Taulah, status lo di sosmed aja kayak gini semua, galau mulu. Agghhr” Maura makin nangis dengan perhatian Bryan mengusap air mata Maura.\n" +
                    "“Ra, lo tuh udah diduain sama Levin, tapi ngapain sih lo masih berharap!! Dia tuh udah kurang ajar sama sama lo, lo tuh mestinya buktiin kalo lo tuh bisa tanpa dia!” kata Bryan, “Tapi gue sayang banget sama dia, dia itu cinta pertama gue, gue gak bisa lupain dia tau gak!” “Maura.. gue gak mau lo kayak gini terus, waktu liat lo sedih gue langsung bertindak, biar lo gak sedih, Cuma cowok bodoh yang nyia-nyiain cewek seistimewa kaya lo.” Jelas Bryan. “ Makasih ya, untung lo dateng lagi, jadi gue ada temen curhat.” “Sama-sama Maura cantikk.” Bryan mengelus rambut Maura.\n" +
                    "\n" +
                    "Reyna main kerumah Maura buat ngasih saran biar Maura cepet moveon dari Levin “Caranya lo tuh harus nunjukkin kalo lo itu bisa tanpa dia, dan lo harus rubah penampilan lo, soal itu serahin ke gue!” “Hah? Rubah penampilan gue?” “Pokoknya, lo harus rubah penampilan lo, dan lo harus buktiin kalo lo bisa dapetin cowok lebih baik dari Levin.” Reyna tak henti-hentinya menyemangati Maura.\n" +
                    "\n" +
                    "Maura melepas kegalauannya dengan cara joging di taman sambil nyanyi “Tuhan kirimkanlah aku, kekasih yang baik hati yang mencintai akuu apa adanya.” Dan gak sengaja Maura ketemu dengan Bryan “Mungkin gue jodoh yang dikirim Tuhan buat lo!” kata Bryan. Maura bertanya “Loh kok lo bisa ada disini?” “Tadi gue lagi main basket, gak sengaja liat lo ya udah gue samperin” jawab Bryan. “Ohh, Oke!” “Ada yang beda nih dari muka lo, emmm gue tau lo udah bisa move on kan?” “Hahaha, iya sih, ini salah satu cara gue buat move on dari mantan gue.” Ujar Maura. “Nah gitu, jangan galau mulu, sekarang lo kelihatan lebih cantik, manis kaya bidadari..” kata Bryan sambil ketawa.\n" +
                    "\n" +
                    "Hari ini Maura merubah tampilannya, dia sekarang menjadi cewek paling cantik di sekolahnya, dan gak sengaja Levin melihat perubahan maura “Maura?” sapa Levin. Tiba-tiba Bryan dateng lalu menarik tangan Maura agar menjauh dari Levin. “Denger kata gue, lo tuh harus cuekin dia, bikin dia nyesel!!” perintah Bryan, lalu Maura mengangguk kemudian meninggalkan Bryan.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Ketika Levin masuk kelas dia kembali menyapa Mara “Hay, Maura!” “Ngapain lagi lo?” Sahut Reyna sambil gedor meja. “Gue mau sama Maura!” “gak, lo gak liat gue lagi ngomong sama Maura? Hah!” “Gak!” “Ehh udah stop!!” lerai Maura “Mau ngomong apa sih lo?” “Kamu makin cantik Maura!!!” jawab Levin, “Oh, udah sana lo balik aja!”\n" +
                    "\n" +
                    "“Maura… lo harus inget, lo harus bikin Levin nyesel udah mutusin lo!” pekik Reyna “Maura, gue bingung deh sebenernya lo tuh mau move on apa mau balikan sama mantan lo?” sambung Bryan. “Gak-gak gue gak setuju kalo lo balikan sama dia, lo jangan terlena gara-gara Levin deketin lo lagi. Justru lo harus bikin dia baper!” Jelas Reyna. “Hah! Gimana?” “Ya lo haus punya pacar baru lah.” “Hah? Pacar baru?” “Iya pacar baru, ah iya Bryan, lo mau mau kan jadi pacar pura-puranya Maura?” Bryan sontak kaget “Eh, gue?” “Apa? Gak lah Bryan kan sahabat gue gak lebih, gak mungkinlah jadi pacar gue.” Jawab Maura kesal. Hati Bryan terasa hancur saat Maura ngomong seperti itu.\n" +
                    "\n" +
                    "Sebelum tidur Maura dapet sms dari Levin, Maura mau diajak ketemuan sama Levin di Kafe tapi Maura bingung mau jawab apa. Lalu keesokan harinya Maura bertemu Levin “Kenapa sms gue semalem gak lo bales?, gue nungguin balesan lo tau!” Tanya Levin. Kebetulan Bryan dateng lalu mukul Levin dan bilang “lo inget ya, gak usah deket Maura lagi, dia cewek gue!!” ujar Bryan. “Cewek lo? Hah! Gak mungkin.” “Terserah lo, percaya atau gak! Penting lo jangan ganggu Maura lagi.” Kata Bryan lalu menggandeng Maura yang kebingungan pergi ninggalin Levin.\n" +
                    "\n" +
                    "“Gue gak butuh pacar pura-pura!! kalo lo sahabat gue harusnya lo seneng kalo liat gue seneng!” bentak Maura, “Jadi gue ganggu hidup lo?, gue tanya lagi sebenerya lo mau move on dari mantan lo apa mau balikan? lo liat diri lo sekarang, lo kaya begini biar move on dari dia!!” jawab Bryan dengan nada tinggi. “Apaan sih lo! Kok marah-marah kayak gini?!” “Cowok kaya dia tuh gak mungkin bisa berubah!” “Kenapa gak mungkin?” “Karena itu udah bawaan dari lahir! Dan gue gak bisa liat lo disakitin lagi.” “Gue yakin Levin bisa berubah, gue bakal nunggu sampe dia berubah!” “Gak, gak mungkin dia berubah!” “Apaan sih lo, kok segitunya sama gue?!” “Kenapa?? Karena gue suka sama lo! Gue suka lo apa adanya, dan tanpa lo harus berubah jadi orang lain. Ra, sebenernya gue suka sama lo tuh udah lama, sampe gue pindah sekolah, karena gue makin yakin sama perasaan gue.” Ungkap Bryan pada Maura. “Jadi lo bantu gue buat move on cuma buat misi lo deketin gue? Sama aja tau gak lo kayak Levin Cuma manfaatin gue doang!!!” jawab Maura kesal. “Gak, gak gitu lo salah paham!!” “Udah deh semua cowok sama aja, gue kecewa sama lo!” Maura pergi ninggalin Bryan.\n" +
                    "\n" +
                    "Beberapa hari setelah kejadian itu, Maura diajak ngedate sama Levin di Kafe, “Kamu cantik banget, Ra!” kata Levin “Eh iyaa, makasih Vin.” Jawab Maura “Semenjak kita putus lo berubah kayak gini.” “Emang dulu gue kayak gimana?” “Yaa.. ya lo dulu tuh norak, cupu, beda gak kaya sekarang. Dulu gue gak suka sama lo, makanya gue males ngajak lo ngedate. Coba lo kaya gini dari dulu pasti gue gak bakalan mutusin lo.” Ungkap Levin, “Jadi.. lo suka sama penampilan gue yang sekarang?” “Suka, sukaaa banget, lo itu kayak bidadari sekarang!!” denger ucapan Levin itu Maura langsung inget Bryan. “Hey Maura… Gue mau balikan sama lo, karena lo sekarang udah berubah! Gue janji gak bakal ninggalin lo.” “Jadi lo mau balikan sama gue cuma gara-gara penampilan gue udah berubah?” Levin mengangguk, lalu Maura bekata “lo salah Vin, gue yang dulu sama sekarang gak berubah!, gue juga gak nyesel putus sama orang yang gak punya perasaan kayak lo!!” Kata Maura lalu pegi ninggalin Levin dengan perasaan marah.\n" +
                    "\n" +
                    "Dalam perjalan pulang, Reyna menelepon dan bilang katanya Bryan lagi sekarat gara-gara dipukulin sama Levin. Karena sejak tadi Maura kepikian Bryan terus, dia langsung begegas menuju umah Bryan. Maura terkeju saat masuk di kamar Bryan banyak sekali koleksi foto Maura. “Maura… Ra, sorry ya gue gak bemaksud apa-apa, gue nyimpen foto lo karena gue udah seka lo sejak lama, dan gue selalu merjuangin cinta gue dan sorry banget gue juga gak bermaksud manfaatin lo saat lo lagi galau putus sama Levin.” Ungkap Bryan pada Maura, “Yan, maafin gue, gue gak tau kalo lo bener-bener tulus sayang sama gue dan maafin gue gara-gara gue lo jadi bermasalah sama Levin. Padahal lo udah bantuin gue move on, tapi gue malah nuduh lo yang nggak-nggak!” jawab Maura sambil nangis.\n" +
                    "\n" +
                    "“Udah gapapa, jangan sedih gitu dong!” “Bryan, gue baru sadar kalo gue juga suka sama lo! Gue kepikiran lo terus, cuma sama lo gue bisa bahagia, lo udah nerima gue apa adanya dan lo bisa bikin gue jadi diri sendiri, Bryan gue gak mau kehilangan lo!!!!” kata Maura lalu meluk Bryan. “Maura, I Love You!!” “Love You Too, Yan.” Jawab Maura. Akhirnya, Maura benar-benar bisa move on dan dia bisa dapetin orang yang lebih baik dari Levin. Sekarang, Maura dan Bryan jadi pasangan yang bahagia dan saling melengkapi.",
            "Disebuah sekolah yang cukup megah, tepatnya Seoul Internasional High School. Terlihat Dua orang dengan senyum yang terpampang di wajahnya memasuki gerbang sekolah tersebut, sesekali keduanya tertawa dengan riangnya ditengah obrolan mereka. Mereka bahkan tak mempedulikan siswa-siswi lain yang tengah memandang aneh keduanya.\n" +
                    "\n" +
                    "Kedua orang tersebut adalah Kim Seul Mi dan Baek Jun Ki, mereka adalah sepasang sahabat sejak kecil. Mungkin sebagian orang akan berpikir mereka adalah sepasang kekasih, karena sifat mereka yang tak malu mengumbar keharmonisan hubungan persahabatan mereka kepada orang lain. Alasan itu membuat orang-orang tak percaya mereka hanya menjalin sebuah persahabatan. Baik Seul Mi maupun Jun Ki, keduanya begitu nyaman dengan hubungan yang sudah lama terjalin tersebut.\n" +
                    "\n" +
                    "Bunyi nyaring bel tanda pelajaran telah usai membuat siswa-siswi berhamburan keluar kelas, beberapa dari mereka masih berada di dalam kelas untuk sekedar menunggu temannya atau karena masih ada kegiatan yang harus mereka lakukan. Seperti halnya Baek Jun Ki, ia tengah menunggu di depan pintu sebuah kelas. Yah… semua orang pasti tau alasannya, apalagi kalau bukan menunggu sahabat kecilnya, Kim Seul Mi.\n" +
                    "\n" +
                    "\n" +
                    "“Jun Ki, ma’af aku lama. Sekarang aku udah selesai, ayo pulang”. Suara lembut milik Seul Mi membuat Jun Ki tersadar dalam diamnya. Tak lama pria tersebut mengembangkan senyum untuk gadis di hadapannya itu. “Tak apa Seul Mi, aku tak masalah jika harus menunggumu. Hmm… ya udah ayo pulang”. ucap Jun Ki yang masih menampakan senyumnya, Seul Mi juga membalas senyum pria itu dengan tak kalah manisnya.\n" +
                    "\n" +
                    "PLUK, Sebuah telapak tangan mendarat halus di kepala sang gadis. Sang gadis dapat merasakan telapak tangan itu membelai lembut rambut panjangnya. “Ayo…!!”.\n" +
                    "\n" +
                    "“Seul Mi, aku ingin bicara sesuatu padamu”. Ucapan yang terdengar serius di telinganya tersebut membuat Seul Mi heran. Ia berhenti melangkah, begitupun dengan Jun Ki.\n" +
                    "“Bicara saja Jun Ki, kau ini aneh sekali, biasanya juga kau bicara tanpa izin dulu padaku. Hahahahaha”. Ucap Seul Mi diikuti oleh tawa hambarnya, ini ia lakukan untuk untuk mengurangi rasa canggung di antara mereka. Jujur saja, ia benar-benar canggung sekarang. Jun Ki memandangnya begitu serius, itu membuatnya tidak nyaman. “Aku serius Seul Mi, aku mohon dengarkan aku”. Ucap Jun Ki\n" +
                    "“Bicaralah…” suruh Seul Mi yang sebenarnya masih heran dengan sahabatnya itu.\n" +
                    "\n" +
                    "Seul Mi merasakan tangannya kini digenggam erat oleh seseorang, ia semakin heran sekarang. Tapi segera ia hilangkan keheranannya saat Jun Ki mulai bicara.\n" +
                    "“Seul Mi, kali ini aku akan jujur padamu. Aku tak bisa menahannya lagi, aku akan mengatakan semuanya padamu. Jadi jangan menyelanya, oke”. Seul Mi hanya menganggukan kepalanya. “Seul Mi sebenarnya aku lelah dengan hubungan ini, ya persahabatan ini. Sebenarnya aku ingin lebih dari ini, aku menyukaimu Seul Mi. Aku mencintaimu. Aku tau ini membuatmu terkejut, tapi aku hanya ingin membuat hatiku lega. Aku tak ingin lagi menyimpan perasaan ini Seul Mi. Sekarang yang aku pikirkan adalah apa kau juga merasakan hal yang sama sepertiku..?”.\n" +
                    "\n" +
                    "“Ak-kku…”. Seul Mi tergagap dalam ucapannya. Benar, ia sangat kaget akan pengakuan Jun Ki saat ini. Ia mecoba bersikap tenang menghadapinya walau sulit.\n" +
                    "“Maaf aku tak bisa Jun Ki, aku memang menyayangimu, menyukaimu, bahkan mungkin aku juga mencintaimu. Tapi aku tak bisa, aku tak ingin kita jauh karena perasaan kita sendiri. Aku tak menginginkan hubungan itu, karena dalam hubungan itu ada sebuah akhir yang menyakitkan. Aku tak ingin itu terjadi, cinta memberikanmu kebencian yang teramat dalam. Bukankah persahabatan adalah hubungan terbaik untuk kita, tak ada kata benci, tak ada juga perpisahan. Itu lebih baik bagiku”. Seul Mi kini tak bisa lagi membendung air matanya, ia akui dirinya memang menyukai pria di hadapannya itu.\n" +
                    "\n" +
                    "“Apa tak bisa kau perti…”. Ucapan Jun Ki terpotong karena Seul Mi menyelanya. “Kumohon jangan paksa aku, Jun Ki”.\n" +
                    "“Baiklah aku terima keputusanmu. Tapi kuharap kau jangan canggung ketika aku memperlakukanmu beda”. Ucap Jun Ki\n" +
                    "Ucapan Jun Ki membuat Seul Mi kembali tersenyum, ia menghapus sisa air matanya lalu segera menghambur kepelukan Jun Ki, dengan senang hati Jun Ki membalasnya. “Terima kasih, Tapi kau takkan menghindariku kan?”. Jun Ki tersenyum, “Tentu saja tidak, aku tidak bisa jauh darimu”. Seul Mi ikut tersenyum. “Ayo pulang”.\n" +
                    "\n" +
                    "Tak peduli orang lain mengatakan berpacaran sangat indah, tapi bagi mereka berdua PERSAHABATAN mereka jauh lebih indah. Dalam persahabatan ini, mereka mendapatkan banyak hal yang tak bisa didapatkan dalam berpacaran.",
                "Setelah berhasil lari dari massa, ketiga pria tua berjas hitam dan berdasi itu menatap satu sama lain dan tertawa puas.\n" +
                        "Salah seorang dari mereka adalah seorang pejabat negara yang juga merupakan seorang koruptor gila, dia membawa 2 koper besar yang dipenuhi oleh uang-uang hasil curiannya bersama kedua rekan kerjanya.\n" +
                        "Kini ketiganya melarikan diri dengan helikopter pribadi milik pak pejabat.\n" +
                        "\n" +
                        "“Kita berhasil” kata pak pejabat itu meletakkan dua koper di sebelahnya.\n" +
                        "“Tidak temanku, ini belum berakhir..” timpal salah satu rekan kerjanya.\n" +
                        "“Apa maksudmu?” tanyanya bingung.\n" +
                        "“Aku tau kamu akan kabur tanpa membayar kami, jadi ada 2 pilihan. Kau mau membayar kami atau…”\n" +
                        "Kedua rekannya mengeluarkan senjata pistol dari kantong, dan menodongnya.\n" +
                        "“Kutembak kau bersama semua uangmu”\n" +
                        "Dengan rasa terkejut dan bingung, pak pejabat mengangkat kedua tangannya.\n" +
                        "\n" +
                        "“Teman-temanku, tenanglah. Ayo kita bicarakan ini baik-baik, aku akan membayarmu dengan satu syarat…” ucap pak pejabat.\n" +
                        "“Kenapa kau tidak melanjutkan bicaramu? Apa syaratnya?” timpal salah seorang rekannya segera.\n" +
                        "“Jaga rahasia ini baik-baik”\n" +
                        "“Dari dulu, rahasiamu aman bersamaku, hingga kita terpojok seperti sekarang ini”\n" +
                        "Pak pejabat itu tertawa lagi.\n" +
                        "“Benarkah? Kalau rahasiaku aman, kita tidak akan terpojok seperti sekarang. Ini semua adalah ulah kalian berdua” ucap pak pejabat.\n" +
                        "“Jika kau bicara lagi, aku akan menembakmu dan juga orang yang mengendalikan helikopter ini!”\n" +
                        "Kedua rekannya itu memiliki senjata dan bersiap untuk menarik pelatuk suatu waktu pak pejabat melawan lagi.\n" +
                        "“Baiklah, aku menyerah, ambil saja semua uangku dan pergilah”\n" +
                        "Kedua rekannya itu hanya tersenyum.\n" +
                        "“Semudah itukah?” tanya salah satunya.\n" +
                        "Pak pejabat melempar koper-kopernya kearah mereka.\n" +
                        "“Ambillah”\n" +
                        "Kedua rekannya itu langsung menjatuhkan pistol mereka dan mulai mengambil uang-uang yang berada dalam 2 koper besar.\n" +
                        "\n" +
                        "\n" +
                        "Tanpa mereka sadari, pak pejabat mengambil pistol mereka dan menembak mereka, namun salah satu dari mereka masih punya pistol cadangan di dalam jas. Sehingga terjadilah aksi tembak menembak, sang pilot helikopter pun ikut menjadi sasaran peluru yang berhambur tanpa arah tujuan yang jelas.\n" +
                        "\n" +
                        "—\n" +
                        "\n" +
                        "“Ya ampun, kapan gue punya duit ya? Sepatu gue udah buluk banget, mesti di lembiru, lempar beli baru”\n" +
                        "Awan di langit seolah-olah membentuk gambar sepasang sepatu, gadis muda itu terus termenung di balkon sekolah menatap awan tersebut.\n" +
                        "\n" +
                        "“Lisa! Lo kenapa sih? Daritadi cemberuuut… aja, cerita dong” suara herni, sobat lisa.\n" +
                        "Dia tiba-tiba datang dengan menepuk pelan pundak lisa.\n" +
                        "“Apalagi yang bisa bikin gue cemberut kaya gini kalo bukan gara-gara sepatu, yang gue butuhin sekarang cuma sepatu baru” ungkap lisa melihat ke bawah, tepatnya melihat sepasang sepatu yang dikenakannya terlihat sudah buluk dan bolong-bolong pinggirannya.\n" +
                        "\n" +
                        "“Seandainya, turun hujan duit…”\n" +
                        "“Plis deh, lo gak usah ngayal berlebihan, mana mungkin ada hujan duit” timpal herna terkekeh.\n" +
                        "“Ayo balik ke kelas” lanjut herna mengajak lisa kembali ke kelas.\n" +
                        "Mereka membalikkan badan dan melangkah menuju kelas, tapi setelah beberapa langkah, sebuah jeritan gembira salah seorang murid membuat mereka terhenti dan menoleh.\n" +
                        "\n" +
                        "“Ujan duit! Ujan duit!”\n" +
                        "Teriak seorang murid yang berlari menuruni tangga.\n" +
                        "\n" +
                        "“Hah? Ujan duit?” lisa dan herna mengernyitkan keningnya bingung, mereka pun segera berlari turun ke lapangan.\n" +
                        "“Hujan duit! Ini beneran ujan duit! Seratus ribuan lagi” ucap herna lompat-lompat gembira.\n" +
                        "“Kumpulin her, buat beli sepatu sama jajan kita”\n" +
                        "Seketika itu juga mereka berebutan uang bersama murid-murid dan guru-guru lain yang berada di lapangan.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Setelah hampir setengah jam, semua duit sudah tersapu bersih tanpa ada selembar pun yang tersisa di lapangan dan selokan.\n" +
                        "“Tapi, setelah kupikir-pikir, darimana semua duit ini berasal? Apakah ini tanda-tanda hari akhir?”\n" +
                        "“Liat! Helikopter itu mendarat. Mau mendarat kemana?”\n" +
                        "\n" +
                        "—\n" +
                        "\n" +
                        "Ini bukan tanda-tanda hari akhir, semua duit ini berasal dalam helikopter pak pejabat.\n" +
                        "“Jangan bergerak! Jika kamu bergerak sedikit saja, kamu akan mati!” teriak salah seorang staff yang berhasil merebut satu pistol dari tangan pak pejabat dan menahan jari telunjuknya di dekat pelatuk.\n" +
                        "“Jika aku mati, dan kalian hidup. Maka kalian akan masuk penjara”\n" +
                        "Pak pejabat menembakkan pistolnya ke arah seseorang yang mengendalikan helikopter kemudian menembak koper-kopernya dan melemparnya keluar.\n" +
                        "“Mari kita mati bersama”",
                "Malam yang hening seperti biasa, seketika perutku lapar dan turunlah aku ke lantai bawah mencari makanan yang berada di kulkas dan tidak ada apa-apa. Kebetulan ada roti yang masih utuh di meja makan kumakan dengan lahap untuk memuaskan nafsu laparku malam ini. Lapar pun teratasi dan muncullah rasa haus dan aku mengambil cangkir dan kuisi dengan air putih dari dispenser.\n" +
                        "\n" +
                        "Sudah kebiasaanku ketika sehabis minum aku pasti ingin kencing. Ketika aku masuk WC aku merasakan hal aneh.\n" +
                        "“ah.. paling cuman perasaanku saja”. Dan seketika ketika aku keluar dari WC rumahku.\n" +
                        "“eh!! Ini dimana?”,\n" +
                        "“loh! ..kok? berubah..”\n" +
                        "“ini pasti mimpi kan?”\n" +
                        "\n" +
                        "Tiba-tiba aku berada di ruangan gelap yang aneh dimana tidak ada seorang pun di dalamnya dan aku pun melihat pintu yang bersinar.\n" +
                        "“kayaknya gak ada pilihan lain deh .. huh…”. dengan keberanian aku membuka pintu tersebut dan aku pun terkejut seketika hari sudah siang dan banyak hal aneh yang kutemui. Setelah ku keluar dari ruangan tersebut, seketika pintu yang kulewati menghilang.\n" +
                        "\n" +
                        "\n" +
                        "“et.. dah.. masalah apa lagi ini hedeh…”. aku pun mencoba berkeliling, ternyata aku berada di daerah yang sangat asing bagiku dengan orang-orang yang cukup aneh dari segi rupa, karena banyak sekali dari mereka yang memiliki rupa setengah hewan setengah manusia bahkan ada yang memiliki kuping runcing dan membawa-bawa kitab entah kitab apa itu dan anehnya mereka semua memakai bahasa Indonesia “apa beneran ini di Indonesia?” dalam pikirku.\n" +
                        "“Festival kah?”\n" +
                        "“Real banget dah.. apalagi elf tadi gila keren banget”\n" +
                        "\n" +
                        "Saat aku memasuki sebuah gang-gang sempit tak sengaja dihadapanku sendiri aku melihat ada seorang gadis memakai pakaian aneh seperti pakaian maid-maid yang selama ini aku lihat di anime-anime yang pernah aku tonton sedang berusaha menarik tasnya yang ingin diambil oleh orang yang memakai pakaian serba hitam dan orang itu pun berhasil mengambil tas dari gadis tersebut. Karena keadaannya berada di tempat yang sepi aku pun langsung lari mengejar lelaki tersebut untuk menolong gadis tersebut. Setelah berlari kami pun sampai di sebuah jalan buntu dan aku pun terpaksa melawan orang ini, jujur aku belum pernah sekalipun belajar beladiri maupun berkelahi. Dengan wajah tersenyum orang itu mengeluarkan benda tajam yaitu sebuah pisau lipat.\n" +
                        "\n" +
                        "“habis aku”. Aku pun mencari akal kebetulan ada tempat sampah yang terdapat 2 kantung plastik berwarna hitam dengan isi yang berbeda yang pertama berisi botol-botol plastik dan yang kedua botol-botol kaca, tanpa pikir panjang aku dengan cepat aku melemparkan sampah yang berisi botol-botol plastik untuk mengecoh orang tersebut. Lemparan pertama dengan mudah dihindari sebenarnya meskipun aku gak bisa bela diri aku bisa bermain basket jadi mudah bagiku melempar tepat sasaran, dan langsung saja kulempar kantong sampah yang kedua saat orang tersebut lengah aku langsung melemparkan dengan akurasi yang cukup tinggi. Dan benar saja saat lemparan kedua botol-botol itu mengenai tepat di dadanya ia pun tersungkur kesakitan dengan cepat aku menerjangnya. Karena penasaran aku membuka penutup kepala dan aku sangat terkejut karena orang tersebut hanya lelaki paruh baya yang bau alkohol. Karena dia dalam keadaan terdesak ia pun mencoba untuk berontak dengan cara memukul-mukul dengan brutal. Karena itu aku langsung menghajarnya hingga dia pingsan\n" +
                        "\n" +
                        "“selamat dah ane. Yap ini dia tasnya” dengan santai aku mengembalikan tas kepada gadis itu.\n" +
                        "“Terima kasih karena menolongku”\n" +
                        "“ya sama-sama, aku kebetulan lewat disini”\n" +
                        "“dari pakaianmu kamu bukan berasal dari negara ini ya?”\n" +
                        "“eh.. iya aku bukan dari sini”\n" +
                        "“ehm.. dari timur? atau tenggara?”\n" +
                        "“aku juga kurang tau tiba-tiba langsung kesini”\n" +
                        "“sihir teleportasi kah?”\n" +
                        "“sihir? gak ilmiah banget.”\n" +
                        "“haha.. gak ilmiah apaan bukannya sudah biasa dengan kata “sihir” kamu aneh”\n" +
                        "“eh… iya”\n" +
                        "\n" +
                        "“oh iya ngomong-ngomong namamu siapa? kita belum kenalan. aku Kassandra kamu bisa memanggilku Sandra”\n" +
                        "“Panggil aja aku Ari”\n" +
                        "“Ari yah? hmm baiklah”\n" +
                        "“Yup”\n" +
                        "“oke Ari jadi kamu mau kemana?”\n" +
                        "“nah belum tau sih”\n" +
                        "\n" +
                        "“sebagai balasan yang tadi gimana kalau kamu ikut aku, pekerja di mansion tuanku lagi kurang yaitu sebagai tukang kebun. Tukang kebun yang sebelumnya sudah tua dan dia sekarang menjadi kepala tukang kebun”\n" +
                        "“hmm.. kerja yah.. boleh lah daripada aku luntang-lantung gak jelas”.\n" +
                        "\n" +
                        "Aku pun bersama Sandra pergi ke tempatnya bekerja. Mansion yang sangat besar dimana pohon yang berjejer dengan rapi tidak ada yang ketinggian dan kependekkan sangat rapi untuk seukuran rumah megah ini. Mansion besar dengan 3 lantai, halaman yang luas dan pagar yang tinggi membentuk lingkaran. Aku pun langsung dibawa Sandra menuju tempat kepala tukang kebun yang tadi disebutkan olehnya.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "“pak ini saya membawakan pekerja baru”\n" +
                        "“jadi kamu mau melamar kerja disini” tanya pria tua itu\n" +
                        "“i i iya pak saya mau melamar kerja disini” jawabku dengan gugup\n" +
                        "“kenalkan saya Locko” sambil mengulurkan tangan\n" +
                        "“Nama saya Ari, pak Locko” sambil menyambut tangan pak Locko\n" +
                        "\n" +
                        "“sebelumnya gimana kalu saya test dulu?”\n" +
                        "“Baik pak!!” sahutku dengan langsung\n" +
                        "“kamu bisa sihir?”\n" +
                        "“sihir? maaf pak saya tidak bisa menggunakan sihir”\n" +
                        "“waduh bakalan susah ini. Meskipun sihir simpel seperti ini?” bapak itu mengambil rumput panjang dan melemparnya seketika dari rumput panjang itu menjadi rumput cincang dalam sekejap.\n" +
                        "“loh!! bagaimana bisa?”\n" +
                        "“kayak apa yah.. masalahnya kamu liat kan halaman mansion ini. Sangat luas kalau kamu gak bisa pakai sihir bakalan susah karena kamu bakalan sangat kelelahan”\n" +
                        "“maaf pak tapi emang gak ada pekerja yang lain?”\n" +
                        "“sejauh ini sih gak ada, karena pekerjaannya yang sangat berat. Jadi kamu masih yakin kerja disini?”\n" +
                        "“hmm.. saya yakin soalnya saya tidak punya tempat tinggal, jadi saya harus terima”\n" +
                        "“baiklah kalau begitu. Sandra kamu antarkan dia ke kamarnya dan beri dia seragam disini”\n" +
                        "“siap pak” jawab sandra sambil mengantarkanku “ayo lewat sini”\n" +
                        "\n" +
                        "Sesampainya aku di kamar, aku kaget karena untuk seorang tukang kebun kamarnya cukup luas.\n" +
                        "“ini kamarku?” tanyaku\n" +
                        "“yup ini kamarmu” jawabnya sambil memberikan kemeja berwarna putih dengan celana panjang berwarna hitam.\n" +
                        "“wah… keren banget seragamnya” Sandra hanya tersenyum mendengar ucapanku.\n" +
                        "\n" +
                        "Setelah mengganti pakaian aku kembali ke tempat pak Locko. Untuk mengetahui apa saja yang kukerjakan. Sandra pun kembali ke dapur untuk mengerjakan tugasnya\n" +
                        "“Pak saya sudah siap kerja” kataku\n" +
                        "“Terlihat cocok sekali” pujinya tentang pakaian yang kukenakan\n" +
                        "“terima kasih pak”\n" +
                        "\n" +
                        "“sebelum saya beri kamu tugas kamu harus mengetahui tempat tempat yang kamu kerjakan. Ada 4 daerah di mansion ini 1. Bagian timur itu ada di sebelah kiri dari gerbang isinya pohon-pohon rindang biasa dipakai tuan rumah untuk bersantai sambil membaca bukunya, jangan pernah sekali-kali kamu menggangu tuan ketika dia sedang bersantai nanti dia bisa marah besar. 2. Bagian selatan itu berada di sebelah kanan isinya pohon-pohon buah yang dipanen 1 tahun sekali 3. Bagian barat itu berada di belakangnya bagian timur disana tempat bercocok tanam biasa dipakai orang dapur untuk menanam sayur-sayuran. Terakhir 4. Bagian utara di belakang bagian selatan disana biasa dipakai untuk latihan dari seni pedang sampai uji coba sihir. Sudah jelas tempat-tempat kerjamu?”\n" +
                        "“sudah pak”\n" +
                        "“baik selanjutnya ini adalah tugasmu” sambil menyerahkan buku catatan yang bertuliskan ‘tugas’\n" +
                        "“terima kasih pak” ucapku sambil mengambil buku tersebut.\n" +
                        "“baik kamu bisa kerja sekarang semua jadwal telah tercatat disitu”\n" +
                        "“baik pak” aku pun berbalik sambil membuka catatan tersebut dan benar tugas-tugasnya sangat berat dan sudah ada ketentuan waktunya\n" +
                        "\n" +
                        "“kerja keras aku ini… huh.. Semangat!” aku pun berjalan untuk menyelesaikan tugas-tugas yang telah tercatat di buku tersebut. Aku mengerjakan banyak hal dari menyapu memotong ranting sampai memanen buah, sampai jam istirahat tiba tercatat bahwa aku harus ke dapur untuk mengambil makan. Sesampai aku di dapur aku bertemu Sandra dan pak Locko yang sedang ngobrol dan aku mengahampiri mereka.\n" +
                        "\n" +
                        "“lagi bicarain apa ini?” tanyaku menyela pembicaraan mereka.\n" +
                        "“Ari nanti habis ini jangan kerja langsung ke bagian utara untuk latihan berpedang bersamaku” ucap pak Locko tanpa menjawab pertanyaanku.\n" +
                        "“Eh.. emang ada apa sih?” tanyaku denagn bingung.\n" +
                        "“nanti saya jelaskan pas kita belajar berpedang” jawab pak Locko.\n" +
                        "\n" +
                        "Setelah istirahat aku langsung ke bagian sesuai perintah pak Locko. Sesampai di sana aku melihat seorang pemuda mengeluarkan api besar berbentuk bola dari tangannya. Aku langsung dihampiri pak Locko\n" +
                        "“ayo kita kesini jangan di daerah situ berbahaya nanti kena sihir tuan muda” sambil menarik tanganku\n" +
                        "“tuan muda? berarti tuan kita sudah punya anak yah?” tanyaku\n" +
                        "“iya kamu benar tuan besar sudah punya anak itu salah satunya Namanya Ain Van Houte. Meskipun dia masih berumur 14 tahun dia sudah menguasai 3 elemen dasar dan dapat memodifikasinya dengan sempurna. Seperti namanya tuan muda sangat baik terhadap pelayan seperti kita tapi jika sudah melawan musuh kata ‘belas kasih’ itu hilang dalam sekejap” jelasnya\n" +
                        "“hah? musuh? musuh apa pak?” tanyaku sambil kebingungan\n" +
                        "“oh.. iya kamu belum kuberiahu malam ini akan ada penyerangan di mansion ini dan kita semua harus melindungi mansion ini karena di dalam mansion ini ada sebuah orb yang sangat berharga dan sampai sekarang belum ada yang dapat menggunakannya karena kekuatannya yang sangat besar.”\n" +
                        "“apa!! jadi apa yang harus saya lakukan saya belum pernah belajar beladiri sama sekali” jawabku dengan panik\n" +
                        "“maka dari itu saya Locko akan mengajarkanmu teknik berpedang karena kamu tidak bisa memakai sihir. Ambil pedang kayu itu dan kita langsung latihan”\n" +
                        "“BAIK” jawabku dengan serius.\n" +
                        "\n" +
                        "Kami pun berlatih hingga sore. Akhirnya bisa teknik dasar berpedang dengan memakai pedang panjang. Malam pun tiba aku sengaja ditempatkan di bagian yang aman karena aku masih amatir. Benar saat bulan mulai muncul datang sekelompok orang berpakaian hitan memakai pedang dan pemimpinnya menunggang kuda dan menggunakan tombak. Aku langsung memberi sinyal bahwa musuh sudah memasuki bagian timur dan selatan. Pak Locko langsung membantai pasukan yang ada di bagian timur dan tuan muda benar seperti kata pak Locko dalam sekejap pasukan di bagian selatan habis terbakar.\n" +
                        "\n" +
                        "“heh cuman segini? buang-buang mana aja” ucap tuan muda\n" +
                        "“Gila cuman 2 orang dan semuanya beres” ucapku sambil menggelengkan kepala. Ternyata dua pasukan di depan hanya pancingan pasukan yang sebenarnya menyerang bagian barat. Dengan sigap Sandra yang kusangka akan ditempatkan sama sepertiku dia malahan maju untuk membuat sigil pelindung, dengan mengucapkan mantra pelindung perlahan-lahan menutupi rumah. Aku pun langsung memberi sinyal terhadap paka Locko dan tuan muda.\n" +
                        "\n" +
                        "Dalam sekejap tuan muda sudah sampai dan bertarung melawan pemimpin pasukan yang ternyata selain seorang lancea dia juga seorang penyihir pertarungan pun tak terelakkan lagi pertama tuan muda memncing dengan 3 bola api, dengan mudahnya dihindari dan ternyata tuan muda telah menyiapkan perangkap agar pemimpin pasukan tersebut terkena. Bukannya terkena malahan ia menghancurkan jebakan yang berupa bom sihir dimana saat pengendali dapat meledakkannya hanya dengan pikiran.\n" +
                        "\n" +
                        "Sementara itu, pak Locko sudah habis membantai pasukan tadi karena merasa kurang jumlah pemimpin pasukan tadi mundur dengan pasukkan yang tersisa. Pertarungan pun selesai saat bulan tepat berada di atas kepala.",
                "‘SORRY’ kata itulah yang tertulis di sebuah kertas kecil yang ada di atas mejaku, dengan emoticon senyum. Aku mengulum senyum. Ini adalah salah satu kebiasaannya bila berbuat salah yang berhubungan denganku. Mengucapkan maaf secara tidak langsung. Aku membalik kertas tadi ‘Can you return my book?’. Aku menggelengkan kepala.\n" +
                        "\n" +
                        "Kulangkahkan kaki menuju kelasnya dengan sebuah buku tulis di tanganku. Sejak awal ku tahu dia sangat membutuhkan buku ini, soalnya ini adalah buku pr nya. Aku jadi teringat pertama kali aku mengenalnya, dengan cara yang sama hanya masalah yang berbeda. Dan saat itulah aku menemukan seorang sahabat.\n" +
                        "\n" +
                        "“Aduh!!” suara yang dikeluarkannya ketika kupukul pelan kepalanya dengan buku tadi. Dia berbalik dan langsung merebut buku yang ada di tanganku dengan senyuman di wajahnya lalu memeluknya erat, bagai seorang anak kecil yang baru saja mendapatkan mainan favoritnya.\n" +
                        "\n" +
                        "\n" +
                        "Tiba-tiba ia menarik tanganku keluar kelas. Breakfast time. Ya, ini adalah saatnya untukku sarapan, karena aku tidak terbiasa sarapan di bawah jam 7, dan dia sangat tahu akan hal itu.\n" +
                        "\n" +
                        "Sesampainya di kantin, dia langsung memesan sarapanku dan juga dia. Dan yang pasti kutahu, dia tidak akan pernah meninggalkan sarapan paginya sebelum pergi ke sekolah. Dan sekarang dia pasti akan makan lagi, seperti biasa tanpa takut dengan bayang-bayang kegemukan menghantuinya nanti. Ya, hampir semua orang mengatakan dia seorang perfect girl, dan harus kuakui itu. Gadis cantik dan manis, berkulit putih, berambut hitam panjang nan indah, dan berpostur tubuh yang ideal serta berasal dari keluarga super kaya. Sifatnya pun mendukung, pintar, friendly, aktif, dan juga multi talent. Dan aku, sahabatnya, hampir sama dengannya. Perfect boy, itulah yang dikatakan orang-orang tentangku. Wajah tampan, tubuh sixpack dan perfectionist, kulit putih dan juga seorang pewaris perusahaan interior besar. Bedanya aku dengannya adalah aku sedikit pendiam. Dan kesamaan kami, kami sama-sama menghindari perhatian orang lain.\n" +
                        "\n" +
                        "Kami bersahabat sejak kecil, sejak kami masih menggunakan popok dan juga dodot akibat dari adanya hubungan erat antara kedua orangtua kami. Kalian pasti berpikir bahwa hubungan sahabat antara laki-laki dan seorang perempuan akan berakhir dengan kisah cinta, bukan? Tapi jangan berpikir hal itu akan terjadi pada kami, saat ini. Kami benar-benar sahabat tanpa rasa cinta diantara kami, kenapa? Karena kami sama-sama menyukai orang lain.\n" +
                        "\n" +
                        "Aku menunggunya selesai menghabiskan sarapan keduanya itu, lalu kamipun kembali ke kelas. Dia akan bercerita panjang lebar tentang hari-hari yang telah dilaluinya, dan aku akan merespon bila dibutuhkan. Dia berisik, tapi aku tidak mempermasalahkannya, aku nyaman dengan semuanya, mungkin karena sudah terbiasa ya. Tiba-tiba dia berhenti di depan mading, melihat sesuatu yang sepertinya sangat menarik, akupun mengikuti arah pandangnya, ‘Festival Seni Sekolah’ itulah yang tertulis.\n" +
                        "\n" +
                        "Aku melihat jam tanganku, pantas saja, sebentar lagi musim semi. Dia menatapku dengan mata yang berbinar, dan aku tahu maksudnya. Aku menggelengkan kepala tegas, aku nggak mau menjadi pusat perhatian banyak orang, walau sudah menjadi pusat perhatian sih. Tapi matanya itu tidak berubah sedikitpun, akupun menaikkan sebelah alis, bertanya, tapi dia malah menundukkan kepalanya dan memainkan jarinya, lihatlah pipinya bersemu merah. Ahhh, aku teringat, inikan tahun terakhir kakak itu di sini. Pantas saja, dia mau memberikan sesuatu yang spesial untuk orang yang disukainya itu, di tahun terakhirnya. Aku menghela napas berat, akupun menganggukkan kepalaku pelan. Melihat reaksiku itu, senyumnya merekah lebar hingga menyipitkan matanya, menggemgam tanganku erat. Akupun ikut tersenyum.\n" +
                        "\n" +
                        "Kurebahkan tubuhku di atas rumput hijau di pinggir danau, dengan seorang gadis duduk di sampingku. Matanya terpejam, menikmati embusan angin, rambut indahnya melambai-lambai mengikuti tarian angin. Akupun memejamkan mata, ikut menikmati tarian dan juga nyanyian alam, sang angin.\n" +
                        "\n" +
                        "“kita… udah lama bersahabat, bukan?” tanyanya tiba-tiba, memecah keheningan alam tadi.\n" +
                        "“apa… kamu gak bosan, tiap hari kita selalu bersama, kemana-mana selalu bersama” sambungnya\n" +
                        "“jangan bilang kalau kamu suka amaku” jawabku asal\n" +
                        "“jangan harap!” aku tersenyum begitu juga dia.\n" +
                        "“apa kamu gak bosan dengan hidup kita ini…” dia bercerita, mengingatkanku bahwa setiap kelebihan itu pasti ada kekurangan. Setiap kegembiraan pasti ada kesedihan dan setiap kecerahan pasti ada kegelapan.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Aku sedang berlari bersamanya ditemani oleh hujan sore. Aku menggunakan jaketku untuk menutupi kepala kami dari sang hujan, tapi sepertinya tidak ada gunanya, karena tubuh kami tetap juga basah. Kami berlari kecil melewati sebuah gang gelap, dan tiba-tiba ada sepuluh, bukan bahkan lima belas orang menghadang kami. Menggunakan jaket hitam, wajah mereka terlihat menyeramkan ditimpa oleh sang hujan. Refleks aku memasang kuda-kuda, begitu juga dia, kuda-kuda kuat dan tangguh. Mereka mengeluarkan senjata, senjata yang hanya mengeluarkan kesedihan dari orang yang dikenainya. Dia sudah menggemgam pisau kecil andalannya, begitu juga aku, kulempar jaketku sembarang dan mempersiapkan kepalan tangan yang kuat. Dan setelah ini terjadilah bertarungan yang ditemani oleh merahnya darah, diiringi oleh teriakan kesakitan dan juga di sinari oleh kegelapan sang rembulan.\n" +
                        "\n" +
                        "“… kita hidup bagaikan memiliki dua kepribadian..” aku teringat dengan perkataannya tadi, di danau. “ketika cerahnya mentari, kita hidup dengan tawa dan juga senyuman, penuh kebaikan dan juga keberuntungan… di gelapnya malam, kita hidup dengan tangis dan juga kemurungan, penuh kekerasan dan juga keburukan… di siang hari kita bertemu dengan orang yang hidup dengan sejuta perasaan, dan di malam hari kita bertemu dengan orang yang tidak berperasaan…”\n" +
                        "\n" +
                        "Ya, dia benar. Kami tidak sebaik yang teman-teman kami pikirkan, tidak seberuntung yang teman-teman kami pikirkan dan juga tidak sesempurna yang teman-teman kami pikirkan. Kami hidup bagaikan malaikat dengan kebaikan dan keberuntungan di siang hari dan di malam hari, kami bagaikan malaikat maut dengan segala keburukan dan kejahatan.\n" +
                        "\n" +
                        "Inilah kami, kami anak dan anggota dari dua keluarga kriminal kelas kakap yang membentuk suatu kerajaan besar dunia. Tidak takut akan apapun, hidup di dalam kegelapan malam dan berkamuflase sebagai manusia sempurna di cerahnya mentari. Kami tidak terlihat tapi tersebar hampir di seluruh dunia, memegang kuasa kuat dan kokoh yang sulit dihancurkan. Inilah kami yang sebenarnya, hidup di dua alam yang sangat berbeda. Kami secerah cahaya dalam keceriaan mentari dan kami juga segelap bayangan dalam kesedihan dan kengerian sang rembulan.",
                "Ayam Berkokok Beserta Fajar yang mulai merangkak, menuju hamparan langit untuk menyambut pagi, pagi telah tiba, dan aku selalu suka pagi. Setiap Pagi ayah mulai menambah volume suara ketika membangunkanku, agar segera bersiap sekolah. “imaaaa, ayo nak bangun kamu belum sholat subuh nak”. Teriak ayah padaku. Aku pun tetap memejamkan mata tanpa hiraukan teriakan ayah. “imaa!!”, teriak ayah kembali yang terdengar seakan membising. Langkah ayah perlahan mendekat, aku kembali bersembunyi dibawah selimut lembutku. “anak ayah nakal!!”. Sembari dua jari telunjuk ayah menggelitikku, tak lama ayah menggendongku lalu memandikanku.\n" +
                        "\n" +
                        "Namaku Ima. Hari-hari kulalui hanya bersama ayah, ibu telah wafat sejak umurku 4 tahun karena penyakit yang dideritanya. Entah penyakit apa yang diderita ibu, setauku ibu tak lagi ada bersamaku, tak lagi menemani hari-hariku, dan tak lagi bisa menghibur laraku.\n" +
                        "\n" +
                        "Hari-hari kulalui bersama ayah, iya, hanya bersama ayah. Sejak pagi hingga petang, ayah mengurus semua keperluanku, menyiapkan perlengkapan sekolah, menyiapkan makanan, membantuku mengerjakan pr hingga mendongeng sebelum tidur, “ayah.. I love you”. Ucapku sebelum terlelap dalam mimpi. Aku bahagia bersama ayah, ayah sangat menyayangiku, ia selalu bisa membuatku tertawa, ayahku hebat ia menghafal berbagai macam cerita dan selalu ia ceritakan padaku sebelum tidur, ia mengajariku bersepeda dan menjadi pesawat terbang bagiku. Sekali lagi kuucapkan “aku sayaang ayahh”.\n" +
                        "\n" +
                        "\n" +
                        "Namun kebahagiaan itu perlahan memudar, “naina, rambutmu kok bisa diikat lucu gitu sih, gimana caranya”, tanyaku pada naina, teman sekelasku. “tanya saja mamaku, mamaku selalu bisa mengikat rambutku dengan berbagai macam model, lah kamu kokk kecil-kecil pake jilbab kan belum wajib maa?”. Aku tertunduk malu, hatiku marah, beribu pertanyaan berkelebat, adakah alasan mengapa ibu harus pergi dulu, tanpa peduli padaku, apa ia tega karena aku harus hidup tanpa ibu. “ibuu, ima butuh ibu, ima ingin seperti teman–teman ima yang memiliki ibu”. Tak terasa air mata mengalir membasahi wajah polosku, hatiku geram tak karuan, inginku berteriak memanggil-manggil ibu, agar ia kembali ke dunia ini.\n" +
                        "\n" +
                        "“imaa, lauk bekal mu kokk selalu telur dadar dan lalapan sawi sihh, apa ibumu tak bisa masak masakan yang lainnya?”. Tanya salah satu temanku dengan raut wajah meledek. “aahh, lagi-lagi semua ini terjadi karena aku tak punya ibu”. Sahutku dalam hati. Ayahku memang hebat, ia tak pernah melupakan semua kebutuhanku, ia tak pernah menyia-nyiakanku, tapi tetap saja berbeda. Karena ayah tak bisa masak berbagai macam makanan, tak bisa mendandaniku sebagaimana anak wanita lainnya. Ayah tetaplah ayah dan ibu tetaplah ibu bagiku.\n" +
                        "\n" +
                        "“Alhamdulillah, kamu lulus dengan predikat memuaskan ima”. Ucap syukur ayah penuh bangga padaku. “lalu kamu mau lanjut SMA dimana nak?”. Tanya ayah. “Ayah, ima mau mondok yah, di salah satu pondok modern di kota Malang, ayah bolehin ima kan?”. “kamu ingin mondok nak, apa sudah kamu fikirkan matang-matang, ayah akan kesepian tanpa ima di rumah, ima tega ayah sendirian di rumah?”. Aku terdiam menunduk, itulah keinginanku, aku ingin ke pesantren bukan sekedar ingin memperdalam ilmu agama, tapi karena aku sudah tak tahan lagi merindukan ibu, setiap kali melihat foto ibu, setiap melihat teman sebayaku yang menjadikan ibu mereka bagai sahabat, dan aku, aku hanya memilik ayah yang tak bisa menjadi ibu bagiku, ayah tak pernah paham bagaimana perasaan anak remaja putri yang ingin selalu bercerita kisah barunya pada sang ibu, ayah tak pernah paham bagaimana keserasian baju yang harus aku pakai, ayah tak pernah tau bagaimana menghibur anak perempuan jikalau ia bersedih “Aku sayang ayah, tapi yah, aku rindu ibu. Semua usaha ayah untuk menjadi ayah sekaligus ibu bagiku tak cukup, maafin ima yah!!”. Lirihku dalam hati, diam tak bergeming.\n" +
                        "\n" +
                        "Suasana hening, ayah berfikir keras untuk keputusan ini tanpa tau alasan sebenarnya yang kupendam dalam lubuk hatiku. “baiklah nak!, karena itu keinginan ima, ayah izinkan demi pemahamanmu pada ilmu agama yang sangat berguna untuk bekal masa depanmu esok, tapi kamu harus sering menghubungi ayah ya nak, ayah selalu rindukan ima”. Kata ayah, sambil mengelus rambutku lalu mencium keningku. “Baik ayah, ima selalu rindu ayah”. Akupun memeluk ayah dengan eratnya, air mataku tak tertahan, segera kuusap, agar ayah tak tau bahwa aku menangis.\n" +
                        "\n" +
                        "“Surga ada di bawah telapak kaki ibu”. Penjelasan ustadzah dita, membuat jantungku berdegap kencang. “maka berbaktilah pada ibu, karena ia memiliki surga, ridho allah terletak pada ridhonya”. Penjelasan lebih lanjut itu semakin menggetarkan jiwaku. “ustadzah apa ayah tak punya surga di kakinya?” Tanyaku pada ustadzah dengan keberanian yang tak biasa. Semua anak kelas menoleh lantas mereka tercengang lalu menertawakanku, “salahkah aku bertanya demikian, aku tak punya ibu namun aku ingin surga dari ayah”. protesku dalam diam, aku menunduk malu atas pertanyaan yang baru kusampaikan. Bel berbunyi, tanda pembelajaran selesai, sedangkan pertanyaanku belum terjawab.\n" +
                        "\n" +
                        "Satu tahun berlalu, aku tak lagi tinggal bersama ayah, sesekali ayah menjengukku walau hanya dua puluh menit, tapi aku yakin sedikit waktu itu tak cukup mengobati rindu ayah padaku. Ingin rasanya kuutarakan pada ayah tentang semua rasa yang mencekam hatiku akhir-akhir ini, bahwa aku sangat rindu ibu. Tapi aku tak tega, tak tega untuk berkata hal itu pada ayah, karena ku tau, selama ini ayah hanya berpura-pura tegar melalui hari-harinya tanpa ibu.\n" +
                        "\n" +
                        "Hari ini, tepat hari ulang tahunku yang ke tujuh belas, aku menanti ayah, ayah pasti datang dan mengucapkan selamat ulang tahun untukku putri semata wayangnya. Namun hingga jam menunjuk angka sembilan, hingga malam ini mengapa ayah tak kunjung datang. Apa ayah lupa bahwa hari ini, hari ulang tahunku?.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "“imaa, ada kiriman buat kamu”. Sapa mbak siti penjaga kantor hari ini. Segera ku menuju kantorlalu mengambil kiriman untukku, kiriman itu berupa kotak berukuran besar. Apa ini, mungkin kiriman ini dari ayah. Segera kubuka kotak itu, kotak yang berisi sepasang sepatu berwarna merah dan dua surat dengan amplop yang berbeda.\n" +
                        "\n" +
                        "“Selamat ulang tahun putri ayah, semoga allah selalu membimbing setiap langkahmu, surat yang satunya adalah surat dari ibumu nak, surat itu, surat yang sengaja ibumu tulis untuk ulang tahunmu yang ke 17 selamat membaca sayang, maaf ayah tak bisa mengucapkan langsung nak, karena ada pekerjaan yang harus ayah selesaikan hari ini”. Surat ayah sangat singkat, namun aku sangat bahagia, karena ayah tak pernah lupa hari ulang tahunku, iya, ayah tak pernah lupa, walaupun sepasang sepatu pemberian ayah tak sesuai dengan seleraku, tapi aku tetap bersyukur. “syukron yaahh”. Ucapku dalam hati dengan penuh rasa syukur. Sudah tak sabar lagi, ingin segera kubuka surat dari ibu yang beramplop cokelat, kubuka perlahan surat itu, lalu rinduku kembali menyeruak, hatiku kembali berteriak bahwa aku rindu ibu. Surat itu, surat dari ibu. Kubaca perlahan surat itu.\n" +
                        "\n" +
                        "Teruntuk putri ibu yang cantik, fatimah az zahra.\n" +
                        "Nak, kini kau telah beranjak dewasa, umurmu telah mencapai 17 tahun. Surat ini sengaja ibu tulis karena ibu rasa, ibu tak bisa merawatmu hingga dewasa, sakit ibu tak kunjung sembuh dan ibu takut allah segera memanggil ibu sebelum ibu bisa berbincang sempurna denganmu, sebelum ibu bisa menasihati beberapa tuturan kata yang berguna. Maafkan ibu, ibu tak bisa menjadi sahabat sejati dalam harimu, maafkan ibu, ibu tak bisa menemanimu ke sekolah, maafkan ibu, ibu tak bisa memasak masakan yang lezat untukmu, tapi kau tak perlu marah nak, kau tak perlu takut menjalani hari tanpa ibu, karena kita punya allah. Allah yang akan selalu menghibur sedihmu, menjaga bahayamu, dan membimbing langkahmu nak.\n" +
                        "Putri ibu yang shaliha, ibu menyayangimu nak, ibu menunggumu di surga, ibu menyayangimu sebagaimana ayahmu menyayangimu.. Cinta ayah dan ibu bersatu untuk mencintaimu sepenuh hati, dulu ketika kau baru lahir, kami, ayah dan ibumu sangat bahagia akan kehadiran buah cinta kami yaitu kamu. Kamu buah cinta ayah dan ibu. Dan kami sangat mencintaimu melebihi cinta kami pada diri kami sendiri. Kami sematkan nama Fatimah az zahra padamu agar kau dapat menjadi Fatimah az zahra untuk kami.\n" +
                        "Harap kami kau akan tumbuh menjadi wanita sholiha yang mengalahkan bidadari surga, wanita yang mencintai allah dan rasulnya, selalu berpegang teguh pada agama, serta membela bangsa dan berbakti pada orang tua.\n" +
                        "Anakku, karena ibu telah pergi mendahului kalian (ayah dan kamu) cintai ayahmu,!! Sebagaimana cinta Fatimah pada Rasulullah, Muhammad SAW, karena fatimah bisa menjadi putri yang bersahabat bahkan ibu bagi muhammad. Fatimah adalah wanita surga yang dicintai allah karena ia sangat berbakti pada ayahnya, ia selalu membela ayahnya, menghibur lara ayahnya, dan mengasihi ayahnya.\n" +
                        "Anakku, fatimah tetaplah menjadi Fatimah Az Zahra bagi ayah dan ibu, yakinlah kami mencintaimu sangat-sangat mencintaimu. Jalani kehidupan penuh cinta jangan sampai ada bara kebencian di hatimu pada siapapun. Insyaallah dengan segala kuasannya kita, kamu, ayah juga ibu kembali bersua dan bercanda tawa di alam keabadiaan. Menikmati segala nikmat di firdausNya yang tak akan pernah sirna.\n" +
                        "surabaya, 25 oktober 2003\n" +
                        "\n" +
                        "Bulir air mataku mengalir deras tanpa henti, kedua tanganku bergetar memeluk surat ibu, rinduku semakin memuncak dan bertumpuk, rindu yang tak mungkin tersampaikan. Namun hadirnya surat ini, kurasakan kehangatan, kurasakan kesejatian cinta dari ibu yang selama ini kurindukan, aku sadar, selama ini, aku sungguh kurang bersyukur akan hadirnya seorang ayah disisiku, aku tak pernah membuka lebar mata dan hatiku akan kasih sayang ayah padaku. Dan hari ini, aku paham, aku sadar bahwa ayah tak pernah membiarkanku menangis, tak pernah menyia-nyiakanku, putri semata wayangnya. Ayah selalu mendorong semua prestasiku, ayah selalu ada di barisan depan untuk mendukungku menuju masa depan yang cerah, bahkan ayah rela mengorbankan apapun demi aku, putri semata wayangnya. “ayah, ima sayang ayah, ayah adalah ayah terbaik di dunia bagi ima. Semoga allah selalu melindungi ayah”.",
                "Warna merah merona memancar di ufuk timur, semilir angin bernuansa sejuk berhembus. Mangrove kecil mulai menampakkan tunasnya. Dentuman ombak bertabuh ditengah gemercik suara aliran air. Aroma khas garam menyebar bersamaan dengan hilir mudiknnya urmang serta populasi kepiting kecil. Sedikit mendung mewarnai hari ini.\n" +
                        "\n" +
                        "Sayup-sayup kudengar kicauan burung bersahutan, membentuk sebuah rahasia lingkaran alam pagi yang masih belum aku mengerti maknanya. Semuanya seakan bergantian menyapaku. Aku berdiri mematung selama beberapa menit diatas tumpukan sampah karang yang tergeletak sedemikian rupa seperti sebuah tumpeng namun besar. Sisa-sisa manusia purba yang telah hidup menetap di pinggir pantai itulah kjodkmiker. Kata-kata Ayah selalu mengiang di telingaku. Ayah yang hanya lulusan madrasah aliyah senantiasa membagi sajak pengetahuannya. Tak pernah sedikitpun kikir akan ilmu.\n" +
                        "\n" +
                        "Aku terus melangkah menuju sebongkah karang besar yang menjorok di tepi pantai. Rasa sakit akibat menginjak serpihan karang sudah biasa kurasakan.\n" +
                        "Aku segera duduk diantara beberapa bongkahan karang besar. Pikiran tentang masa kecil kembali melintas dibenakku. Bayang bayang tentang keluarga kecil nan bahagia berkelebat tanpa perlu komando.\n" +
                        "“Ahh seandainya saja”, gumamku. Secara refleks aku berharap adanya master pengubah waktu dan alangkah inginnya aku kembali dalam lingkar teduh kehangatan keluarga—meninggalkan semua hirup pikuk kepenatan yang saat ini terbungkus rapi dalam hati. Sesaat aku tersadar semuanya tak lagi sama. Kepergian ayahku beberapa tahun silam mengharuskanku untuk senantiasa bekerja keras dan berjuang menghadapi nasib. Kini, nenek dan ibulah yang selalu ada dalam setiap perkembanganku. Aku memiliki seorang adik perempuan. Kami besar di tepian Pantai Gili Madura. Hanya beberapa meter, disitulah terdapat gubuk kecil sederhana tempatku mengaup dikala hujan dan menepi disaat panas, bersandar dalam bahu keluarga. Keluarga miskin sederhana.\n" +
                        "\n" +
                        "\n" +
                        "Dahulu ayahku adalah seorang pelaut ulung. Hampir seluruh waktunya ia habiskan ditengah laut. Terkadang aku ingin mekasih sayang seorang ayah, tetapi aku belajar memahami keadaan bahwa ayahku harus bekerja keras. Ayahku sangat supel, sehingga disukai banyak orang. Alisnya yang tebal berpadu dengan mata elangnya menjadi daya tarik tersendiri bagi setiap orang yang melihat. Tubuhnya tegap dengan tangan besar memberikan rasa nyaman bagiku. Banyak hal yang telah aku pelajari dari ayahku. Suatu hal yang sangat berkesan dan masih membekas dalam ingatan ialah pengalamanku pergi berlayar bersama ayah. Usiaku saat itu sekitar tujuh tahun. Ayah mengajakku pergi berlayar. Perahu khas nelayan membentangkan sayapnya, deru mesin mengatur kelajuan, perlahan berangkat meninggalkan bibir pantai. Aku merasakan kesenangan yang tak terperi. Namun dalam sekajap suasana berganti, kedatangan ombak besar secara beruntun membuatku gemetar hebat, seluruh tubuhku rasanya lemas. Perutku terasa terkoyak-koyak. Aku ketakutan dan bibirku kelu. Ayah melihatku dalam kedaan pucat.\n" +
                        "\n" +
                        "“Ayah bagaimana kalau perahunya terbalik? ombak itu dan anginnya… aku takut ayah.” Saat itu nampak kekhawatiran dalam diri ayah. “Anakku, jangan sampai ketakutan mengalahkan keberanianmu Nak, tenanglah Nak.. ombak akan segera berhenti…” Ayah membiusku dengan pil semangat dan perlahan memulihkan keberanianku. Aku memilih untuk tidak melanjutkan perjalanan. Namun semangatku tidak kendor. Alhasil aku dan ayah mampu mengarungi lautan. Ayah berkata, bahwasanya kunci keberhasilan pelaut adalah kemampuan memahami alam. “Pahamilah alam! bintang dan angin adalah senjata bagi setiap orang yang ingin mengarungi lautan, bintang ialah misteri sedangkan angin menjadi pertanda peruntungan nasibmu, pandai-pandailah kau memahaminya. Ingat! saat kau berlayar teguhkanlah hatimu, bertawakkallah dan bersabarlah.” kenangan yang manis. Ketidakmampuan membuat ayahku memilih berlayar dengan mencarter perahu orang. Hasil yang ia dapatkan harus dibagi dua. Begitu mirisnya. Akan tetapi, ayah sangat pandai memutar siklus pendapatan meski itu semua hanya cukup untuk kebutuhan hidup sehari-hari. Bercermin dari keadaan perekonomian keluargaku, aku semakin bertekad menjadi orang sukses.\n" +
                        "\n" +
                        "Ayunan kecil di samping rumah terlihat dari kejauhan, bergoyang goyang diterpa angin. Matahari mulai merangkak naik.\n" +
                        "“Asror…, lekas balik, antarkan pepes ikan ini ke pasar!”\n" +
                        "Suara serak khas keibuan memanggilku dari kejahuan, aku beranjak dari pantai dan bergegas mengambil pepes ikan yang telah disiapkan oleh ibuku. Aku harus bergerak cepat. Kukayuh sepeda ontelku menuju Pasar Senewen. Ikan pepes yang akan dijual kutitipkan pada Mak Leha. Aku bergegas pulang.\n" +
                        "\n" +
                        "Sesampainya di rumah, aku membantu memasukkan keperluan ibuku. Sebentar lagi ibu harus berangkat menjual gorengan. Apapun yang bisa kubantu sebisa mungkin aku kerjakan. Adikku masih terlalu kecil untuk melakukannya. Aku tak ingin menjadi beban bagi ibuku. Aku memasukkan beberapa gorengan ke dalam plastik kecil, kain gendongan kuikatkan pada bahu ibu. Sebuah senyum tulus mengembang dari wajahnya. Pagi hari selalu mebuatnya semangat. Dengan mengucapkan bismillah dan doa membawa pulang banyak rezeki, ibuku berangkat.\n" +
                        "\n" +
                        "Kulirik jam kotak tuaku, 15 menit lagi aku harus tiba di sekolah. Aku berpamitan pada nenek. Secepat kilat aku menggunakan seragam sekolah. Penampilan bukan suatu keharusan bagiku. Tempatku menuntut ilmu lumayan jauh, jalan berkelak-kelok harus kutempuh. aku terus mengayuh tanpa memedulikan kondisi sekitarku. Semangatku untuk tidak terlambat kian menggebu. Suara nyaring klakson membuatku tak fokus, nyaris sepedaku meluncur masuk kesungai Santex. Beruntung aku tidak terlambat. Delapan jam berlalu dengan menyenangkan. Dua hari lagi akan ada ujian maraton untuk kelas 12 SMA. Ujian akhir yang harus kutempuh.\n" +
                        "\n" +
                        "Sepulang sekolah aku bekerja menjadi kuli panggul di stasiun bus dekat rumah. Sore harinya, aku membantu para nelayan menjualkan hasil tangkapan ikan. Setelah itu, kuhabiskan waktuku bersama majid di pantai sambil menuliskan semua angan dalam sebuah botol dan melemparkannya ketika matahari tenggelam. Aku ingin menjadi pengusaha ikan yang sukses. Rangkaian kalimat sederhana dengan ribuan harapan.\n" +
                        "\n" +
                        "Tiba di rumah aku terkejut ketika melihat ibuku terbaring lemah tak berdaya. Rona wajahnya nampak pucat. Mulutku terbungkam seketika. Kening ibuku dingin. Tanpa pikir panjang aku segera membopong ibuku menuju klinik desa. Keterbatasan peralatan mengharuskan ibuku untuk dirawat di RSUD.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Ibuku mengidap penyakit kanker darah putih. Dokter menyarankan ibuku untuk segera melakukan operasi. Maksimal dua minggu dari hari ini. Biaya operasi cukup mahal. Mungkin sakit yang diderita ibuku disebakan karena kerasnya ibu bekerja, aku menebak-nebak.\n" +
                        "\n" +
                        "Aku kebingungan mencari biaya operasi ibu. Tabungan nenekku tak seberapa. Sebagai anak sulung, aku merasa bertanggung jawab atas semuanya. Aku memeras otak memikirkan hal itu. Dua hari lagi aku akan mengikuti ujian sekolah. Aku harus belajar serta harus mencari uang untuk ibuku. Haruskah impianku berakhir dengan masalah ini?\n" +
                        "\n" +
                        "Aku mencari pinjaman kepada tetangga, namun nihil yang kuperoleh. Aku tak menyerah. Aku semakin giat bekerja. Upah yang kuperoleh masih juga belum cukup. Kondisi nenek dan adik tak memungkinkan untuk menghasilkan uang.\n" +
                        "Usaha keras telah kukerahkan. Besok aku harus mengukuti ujian sekolah. Aku membagi waktuku secara merata. Alhamdulillah, aku bisa melalui ujian sekolah hingga akhir.\n" +
                        "\n" +
                        "Beberapa hari kemudian…\n" +
                        "Kondisi ibu semakin kritis. Hari ini dokter menyarankan ibu untuk operasi. Terlambat sedikit akan berakibat fatal. Fikiranku kalut, aku tidak bisa berfikir jernih. Aku mengikuti saran temanku untuk bekerja sebagai kurir narkoba. Hasutan setan telah merasuk dalam jiwa. Meski usiaku tergolong muda -aku berani mengambil resiko berat. Hari itu juga aku mendaftar sebagai kurir narkoba. Aku sudah masuk kedalam lubang hitam. Pekerjaan yang hina dan kotor.\n" +
                        "\n" +
                        "Narkoba jenis shabu-shabu sebesar 2 kg adalah pekerjaan pertamaku. Aku mengantarkannya pada seorang bandar narkoba. Rasa bersalah selalu membayangiku. Uang yang kudapatkan langsung bertumpuk. Uang haram yang tak berkah.\n" +
                        "Segera aku melunasi biaya operasi ibu. Tak bisa kubayangkan apa yang akan terjadi selanjutnya. Melihat latar belakang agama ibuku, aku merasa takut. Pendirian ibuku sangat kuat. Semua hal yang bertentangan dengan agama akan ia luruskan. Tak peduli meski harus mengiris serta menyanyat perasaan.\n" +
                        "\n" +
                        "Keadaan ibuku berangsur membaik setelah dilakukan operasi. Saat sadar, ibu langsung bertanya padaku mengenai biaya operasi. “Aku memperolehnya dari kerja keras setiap hari.”. Aku berucap tanpa melihat sorot mata ibuku, akan sangat mudah bagi ibu menebakku dalam keadaan berbohong. Ibu memelukku dengan haru sementara adikku tersenyum lega. Semuanya larut dalam kebahagiaan.\n" +
                        "\n" +
                        "Beberapa hari kemudian..\n" +
                        "bersamaan dengan hari kelulusan, Kondisi ibuku pulih total., aku dan majid lulus. Langit mendung tak bersahabat dengan hati setiap insan yang bergembira. Impianku menjadi pengusaha ikan sukses semakin dahsyat.\n" +
                        "\n" +
                        "Saat itu juga kebahagiananku sirna. Kabar buruk muncul dari sebuah radio kecil milik nenek, ketua pengedar narkoba sekaligus bosku tertangkap polisi saat sedang melakukan transkasi jual beli obat terlarang. Tim intel Satlantas Narkoba sangat jeli. Seluruh orang yang terlibat didalamnya akan segera ditangkap. Remuk sudah kebahagianku. Tanpa menunggu lama, majid berkunjung ke rumah. Majid ialah satu satunya orang yang tahu siapa sebenarnya diriku. Tanpa kusadari semua percakapanku dengan majid terdengar oleh ibu. Ibu langsung menjerit histeris Rentetan bom pertayaan meledak dari mulut ibu.\n" +
                        "“Mengapa kau melakukan semuanya Nak? bukankah ibu telah mengajarimu agama. Itu pekerjaan haram, uang yang mengalir di darah ibu sekarang ini… untuk apa ilmu yang kau miliki Nak.., sungguh tega dan biadab kau…”\n" +
                        "Aku mencoba menjelaskan pada ibu. Ibu tetap memandangku salah. Niat membantu ibu menjadi petaka bagiku. Semua impianku rasanya berakhir hari itu. Masa depanku diujung tanduk.\n" +
                        "\n" +
                        "Ibu langsung membawaku ke kantor polisi terdekat tanpa bernegoisasi terlebih dahulu. Beliau sendiri yang menjebloskanku dalam penjara. Pengedar narkoba seharusnya ditangkap, kata ibu. Hukuman penjara selama 1 tahun harus kujalani. Selama dipenjara ibu tak pernah menengokku.\n" +
                        "\n" +
                        "Semua kerja kerasku sia-sia. Ibu tidak menghargai pengorbananku. Rasa dendam pada ibu tumbuh subur dalam hati. Aku berubah 180, Asror yang patuh dan baik kini berubah menjadi brutal. Rasa jenuh di penjara mengantarkanku pada perubahan buruk.\n" +
                        "\n" +
                        "1 tahun berlalu\n" +
                        "Ibu menyambut kedatanganku dengan ramah. Tapi, aku menanggapinya dengan jawaban ketus. Petang mulut sempat terjadi. Entah setan apa yang merasuki fikiranku, Aku membunuh ibuku sendiri. Pisau kutancapkan dalam tubuh ibu. Denyut nadi ibu terhenti. Diikuti keluarnya darah yang memgalir cepat. Nenek dan adikku berteriak histeris. Warga desa berdatangan. Aku tertawa bahagia. Kenangan ibuku melintas, dan sesaat aku sadar, aku telah berdosa. Aku menangis meraung raung. Ibuku telah tiada dan tanganku sendiri yang membunuhnya.\n" +
                        "\n" +
                        "Aku kembali merasakan pahitnya kehidupan penjara. Rasa sesal membuatku ingin berubah. Semua program rehabilitasi aku ikuti, tapi, jiwaku tetap berguncang. Kiai Mukin, penceramah penjara menasehatiku agar berubah. Perlahan aku kembali melaksanakan kewajibanku pada tuhan. Dan fikiranku terbuka ketika Kia mukin menjelaskan ayat, tentang Allah maha pemaaf apabila hambanya memang bersungguh sunghuh bertobat. Semangatku kembali ada. Aku kembali memperdalam agama.\n" +
                        "\n" +
                        "Bebas dari penjara, aku langsung meminta maaf pada nenekku dan adikku. Aku mengakui semua kesalahanku dan berjanji untuk berubah. Mereka memaafkanku. Aku berziarah ke makam ibuku dan mendoakannya. Kata maaf tak akan pernah kudengar dari ibuku. Biarlah Allah yang mengetahui semuanya.\n" +
                        "\n" +
                        "Semenjak hari itu aku berdamai dengn kehidupan. Takdir Allah membawaku menemui pekerjaan mulia.",
                "Pagi ini cuaca tampak kurang bersahabat. Awan mendung berjejer menghiasi langit. Jam sudah menunjukkan pukul 6.30 dan itu menandakan gerbang sekolah akan ditutup 30 menit lagi. Salha beranjak dari tempat tidurnya menuju kamar mandi dengan tergesa-gesa. Telat mungkin sudah menjadi kebiasaan baru bagi gadis itu. Semenjak kepergian ibunya, Salha menjadi kurang terurus. Gadis itu sekarang tinggal bersama ayahnya, namun ayahnya jarang pulang ke rumah karena urusan pekerjaan. Mau tidak mau mereka harus menyewa pembantu untuk mengurus rumah dan pekerjaan lainnya.\n" +
                        "\n" +
                        "Setelah berpakain rapi gadis itu segera berangkat ke sekolah menggunakan taksi. Entah apa yang dibawanya di dalam tas, yang jelas tas yang kini dikenakannya tampak sedikit lusuh. Bulan lalu, ayah Salha sudah membelikannya tas baru yang bisa terbilang bagus dan bermerek. Namun, gadis itu enggan menggunakan tas pemberian dari ayahnya dan lebih memilih meggunakan tas lusuhnya itu. Meskipun lusuh, namun menurut Salha tas ini sangatlah berharga karena merupakan hadiah terakhir dari ibunya.\n" +
                        "\n" +
                        "Beberapa saat kemudian, gadis itu sudah berdiri di depan gerbang bercat merah gelap. Gadis itu berdiri sambil berkacak pinggang. Sesekali ia menatap ke arah jam tangan yang sedang dikenakannya.\n" +
                        "“Telat 20 menit. Seharusya gue tadi nggak perlu buru-buru” cetus gadis itu malas. Berbeda dengan siswa-siswi pada umumnya, keterlambatan bagi salha bukanlah sesuatu yang menakutkan atau sejenisnya. Siswa yang terlambat seharusnya tidak boleh dihukum, mereka terlambat karena pak satpam terlalu cepat menutup gerbang. Setidaknya itulah pendapat Salha.\n" +
                        "\n" +
                        "\n" +
                        "Beberapa saat kemudian seorang pria paruh baya menghampiri Salha yang masih berdiri di depan gerbang. Pria itu lalu membukakan gerbang untuk Salha. Sesekali ia mendengus kesal.\n" +
                        "“Salha, kamu tau ini jam berapa? ini sudah yang ke sekian kalinya. Kamu tidak boleh seenaknya datang terlambat seperti ini. Sekarang kamu langsung ke ruangan bapak”\n" +
                        "Salha sama sekali tidak mengubris omelan dari guru BK nya itu. Gadis itu hanya diam membisu. Tanpa aba-aba gadis itu segera melangkahkan kakinya menuju ruang BK.\n" +
                        "\n" +
                        "Setelah sampai di dalam ruangan tersebut. Salha duduk di salah satu kursi yang terletak tidak jauh dari meja guru. Gadis itu sesekali mendengus kesal ketika beberapa orang siswi memberikan tatapan tidak suka. Di sekolah, Salha terkenal sebagai anak yang menyebalkan dan selalu membuat masalah. Tidak jarang gadis itu mendapatkan skorsing atau bahkan hukuman dari pihak sekolah.\n" +
                        "\n" +
                        "“Salha, sejujurnya bapak sudah tidak tau harus berbuat apa lagi agar kamu jera. Telat, bukanlah kebiasaan yang baik, terutama bagi seorang pelajar. Orangtua kamu pasti benar-benar kecewa. Sekarang bapak sudah membuat keputusan. Ini adalah surat panggilan untuk orangtua kamu. Jadi-”\n" +
                        "“Orang tua saya nggak bisa dateng” sahut Salha cepat. Sontak hal tersebut membuat pak puji sedikit terkejut. pria paruh baya itu memperhatikan wajah Salha, gadis itu terlihat seperti menyembunyikan sesuatu. Di wajahnya tergambar jelas perasaan benci, kecewa, dan amarah yang hampir meluap. Air muka Salha mulai berubah sejak pak puji menyebut kata orangtua.\n" +
                        "\n" +
                        "“Salha. Apa kamu punya mimpi?”\n" +
                        "Salha hanya diam mematung dan tidak mengubris pertanyaan dari gurunya itu. Ia merasa tidak perlu menjawab pertanyaan tersebut karena guru itu pasti sudah tau jawabannya.\n" +
                        "\n" +
                        "Mimpi, satu kata yang terdengar asing bagi Salha. semenjak kepergian ibunya. Seluruh dunianya terasa hancur. Seluruh mimpi yang dulu pernah dibangunnya kini sudah sirna dan yang tersisa sekarang hanyalah rasa benci dan putus asa. Mata salha mulai berkaca-kaca. Gadis itu sesekali mengusap air matanya yang mulai terjatuh. Dengan sigap ia mengambil surat di atas meja tersebut dan berjalan keluar.\n" +
                        "\n" +
                        "Setelah bel pulang berbunyi, gadis itu lebih memilih segera pulang ke rumah karena hari ini perasaanya benar-benar kacau dan tidak karuan.\n" +
                        "Sesampainya di rumah, Salha langsung membaringkan badannya di atas ranjang. Semua permasalahan ini membuat kepalanya pusing. Perlahan rasa kantuk mulai menghinggapi gadis itu dan beberapa saat kemudian ia sudah memasuki alam mimpinya.\n" +
                        "\n" +
                        "Seberkas sinar menyilaukan mata Salha, perlahan gadis itu membuka matanya dan mendapati hari sudah sore. Gadis itu bangkit dari tempat tidurnya dan berjalan ke dapur karena perutnya mulai meronta-ronta minta diisi. Setelah mengambil beberapa makanan gadis itu berjalan menuju ruang TV.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Untuk beberapa saat gadis itu sempat terkejut ketika mendapati seorang pria dengan wajah familiar sedang duduk di sofa. Pria itu menyadari kehadiran Salha, ia lalu menyambut putrinya itu dengan senyuman manis.\n" +
                        "“Salha, duduk sini nak. Ayah mau bicara”\n" +
                        "“Ayah ngapain disini? bukannya ayah sibuk kerja, yang aku tau ayah nggak punya waktu untuk ngelakuin hal-hal nggak berguna kayak gini”\n" +
                        "Reza tidak bisa membela diri, pria paruh baya itu sudah memaklumi sikap dingin putrinya itu. Ia lalu bangkit dari sofa dan menarik tangan Salha untuk duduk di dekatnya. Salha bukannya ingin menerima, tapi jujur di lubuk hatinya yang paling dalam gadis itu merasa benar-benar merindukan sosok ayahnya itu.\n" +
                        "\n" +
                        "Reza tiba-tiba mengambil sesuatu dari tasnya. Sebuah kotak kecil berwarna putih dan selembar kertas kosong. Ia lalu menyodorkan benda tersebut pada Salha. Gadis itu tampak kebingungan\n" +
                        "“Apa ini?” tanyanya dengan nada datar\n" +
                        "“Kamu lihat kotak ini, ini adalah peninggalan terakhir dari mama kamu dan kertas ini, ayah mau kamu menuliskan cita-cita atau mimpi kamu di atas kertas ini”\n" +
                        "\n" +
                        "Seketika ucapan Reza membuat luka di hati Salha kembali menganga. Seberkas memori lama kembali bermunculan di benak Gadis itu. Memori yang membuat hidupnya seperti ini, kenangan buruk tentang dia dan orangtuanya.\n" +
                        "“Semua ini gak berguna. Buat apa ayah bawa semua ini. Buat apa ayah tiba-tiba peduli sama aku. Acuhin aja aku. Sama kayak yang ayah lakuin sama mama”\n" +
                        "\n" +
                        "PLAKKK\n" +
                        "Sebuah tamparan mendarat di pipi kanan Salha. Gadis itu tampak tidak percaya dengan semua yang terjadi, begitu juga Reza. Pria paruh baya itu tampak menyesali perbuatannya.\n" +
                        "\n" +
                        "“Ayah udah puas. Kalo ayah belum puas, bunuh aku. Karena dengan begitu aku bisa ketemu sama mama dan nggak akan pernah ngeliat wajah ayah untuk selamnya. Satu hal yang perlu ayah tau, ayah nggak perlu lagi ngurusin hidup aku. Aku benci ayah, karna disaat-saat terkahir mama, ayah malah ngacuhin mama dan lebih milih wanita jal*ng itu. Nikmatin hidup ayah sendiri dan jangan pernah campurin hidup aku lagi”\n" +
                        "Dengan langkah cepat Salha kembali ke kamarnya. Reza hanya bisa menatap punggung putrinya yang perlahan mulai menghilang. Tiba-tiba reza memegang dadanya dan meringis kesakitan, pria paruh baya itu segera mengambil sebuah botol dari dalam tasnya dan menyikat habis pil yang ada di dalamnya. Dalam hatinya pria itu menangis. Andaikata Salha tahu kenyataan yang sebenarnya. Mungkin ia akan sangat menyesal.\n" +
                        "\n" +
                        "Keesokan harinya, seperti biasa Salha berangkat ke sekolah menggunakan taksi. Namun kali ini ada yang berbeda. Gadis itu sudah berangkat pagi-pagi sekali. Hal ini dilakukannnya untuk menghindari Reza. Kejadian kemarin masih membekas di kepala dan hati Salha. Hal itu membuat mood Salha hari ini benar-benar buruk.\n" +
                        "\n" +
                        "Sesampainya di sekolah, Salha langsung menuju ruang kelasnya. Gadis itu masih duduk mematung di bangkunya. Seakan-akan jiwanya sedang tidak ada di tempat.\n" +
                        "\n" +
                        "Setelah jam istirahat tiba, Salha segera berjalan menuju taman belakang, salah satu tempat favorit yang sering dikunjunginya jika ia sedang banyak masalah. Entah kenapa rasanya ada yang aneh. Kenapa perasaan Salha sejak tadi pagi tidak tenang. Seakan-akan sesuatu yang buruk akan terjadi. Sebuah sentakan kecil tiba-tiba menyadarkan gadis itu dari lamunannya.\n" +
                        "\n" +
                        "“Sal… Lo lagi mikirin apaan sih? Kok dari tadi bengong mulu?”\n" +
                        "“Leon? Lo ngapain disini? Pergi sana. Gue lagi pengen sendiri”\n" +
                        "“Sal, kalo lo punya masalah cerita aja sama gue. Yaaa… Siapa tau gue bisa bantuin elo, apa ini masalah bokap lo lagi?”\n" +
                        "“Leon. Nggak usah sok tau deh. Emangnya lo tau apa soal gue. Nggak usah sok peduli”\n" +
                        "“Sal, gue sahabat lo sejak kecil, gue tau semua tentang elo. Sekarang gue cuma mau ngasi tau elo aja sebelum terlambat. Lo harus jangain bokap lo, cuma dia keluarga lo satu-satunya. Terkadang apa yang kita ucapin nggak sama dengan apa yang sebenarnya kita rasain. Gue rasa lo ngerti maksud gue”\n" +
                        "Mendengar ucapan Leon membuat celah di hati Salha mulai terbuka. Gadis itu kini mulai kebingungan dengan jalan fikirannya sendiri. Dalam hati ia mulai bertanya, apa ia benar-benar membenci ayahnya?\n" +
                        "\n" +
                        "Tiba-tiba ponsel Salha berbunyi dan kembali menyadarkannya dari lamunan singkat, dengan sigap gadis itu langsung mereject panggilan tersebut. Selang beberapa saat ponsel itu kembali berbunyi dan membuat Salha menjadi sedikit geram. Gadis itu lalu menonaktifkan ponselnya.\n" +
                        "\n" +
                        "Salha memutuskan untuk kembali ke kelas dari pada berlama-lama di taman, terlebih lagi ada Leon di dekatnya. Semua itu semakin membuat mood Salha jelek. Selang beberapa saat setelah Salha sampai di kelas. Leon tiba-tiba berlari dan menghampirinya, ekspresi pria itu terlihat sedikit cemas.\n" +
                        "“Sal… Lo kenapa nggak angkat telfon bokap lo? Barusan bik Minah nelfon gue, katanya bokap lo masuk rumah sakit dan bentar lagi dia bakal dioperasi”\n" +
                        "Rasanya tubuh Salha baru saja disambar petir. Entah mengapa kalimat yang diucapkan Leon membuat sendi Salha lemas seketika. Dengan tergesa-gesa gadis itu berlari keluar dari ruang kelasnya menuju rumah sakit untuk menghampiri ayahnya.\n" +
                        "\n" +
                        "Salha sedari tadi berlari kecil sembari menunggu taksi. Namun hari ini ia sedang sial, tidak ada satupun taksi yang berhenti. Leon tiba-tiba menghentikan mobilnya dan membukakan pintu untuk Salha\n" +
                        "“Cepet naik, gue anterin” cetus pria itu pada Salha\n" +
                        "Tanpa pikir panjang, Salha segera masuk ke dalam mobil.\n" +
                        "\n" +
                        "Jalanan di Jakarta benar-benar macet. Perjalanan dari sekolah ke RS Permata bisa memakan waktu satu jam jika jalanan sedang macet. Selama perjalanan perasaan Salha tidak tenang. Gadis itu benar-benar gelisah. Sesekali ia melirik jam di pergelangan tangannya.\n" +
                        "“Ayah maafin Salha” gadis itu mulai menangis. Ia sudah tidak sanggup lagi menahan beban hatinya. Leon mengenggam tangan Salha, mencoba menenangkan gadis itu dari rasa cemasnya.\n" +
                        "\n" +
                        "Setelah hampir satu jam berkendara. Mereka akhirnya tiba di RS Pelita. Tanpa diberi aba-aba Salha segera turun dari mobil dan berlari masuk. Gadis itu seperti orang yang kehilangan arah, tidak tahu harus melangkah kemana. Leon tiba-tiba menarik tangan Salha.\n" +
                        "“Lo mau kemana? ruangannya di sebelah sini”\n" +
                        "\n" +
                        "Setelah sampai di ruang oprasi. Salha melihat seorang wanita paruh baya sedang duduk di salah satu kursi tunggu. Begitu menyadari kehadiran Salha, wanita itu segera bangkit dan mengampiri Salha\n" +
                        "“non, maafin bibik. Maafin bibik”\n" +
                        "“Ayah gimana bik? Ayah baik-baik aja kan?” tanya Salha dengan nada cemas.\n" +
                        "\n" +
                        "Beberapa saat kemudian seorang pria jangkung keluar dari ruangan tersebut, ekspresi pria itu terlihat musam dan wajahnya ditekuk.\n" +
                        "“Kami minta maaf, kami sudah melakukan yang terbaik. Tapi pasien tidak bisa diselamatkan, waktu kematian pukul 11.15”\n" +
                        "“Waktu kematian, waktu kematian, waktu…” otak Salha rasanya sulit untuk mencerna kalimat yang diucapkan dokter tersebut. Seketika dunianya terasa kosong, semuanya berubah menjadi gelap dan kini Salha sudah tidak sadarkan diri.\n" +
                        "\n" +
                        "Selang beberapa minggu setelah kematian ayahnya. Salha memberanikan diri untuk masuk ke kamar ayahnya. Sungguh, gadis itu kini benar-benar merindukan sosok ayahnya itu. Sesal, perasaan itulah yang kini setia menemani gadis itu.\n" +
                        "\n" +
                        "Salha perlahan berjalan menuju meja kerja ayahnya. Ketika ia membukan laci meja tersebut, ia mendapati sebuah kotak kecil dan selembar kertas yang tampak tidak asing. Gadis itu mengambil kotak tersebut dan membuka penutupnya. Di dalamnya terdapat sebuah pena dan sebuah buku diary. Salha membaca isi buku tersebut dan perlahan butiran air mata mulai membasahi pipinya.\n" +
                        "\n" +
                        "Ternyata seluruh misteri tentang kematian ibunya kini telah terpecahkan dan yang lebih menyakitkan kan lagi, ternyata ayah yang selama ini dibencinya telah mengorbankan nyawanya dengan mendonorkan sebelah ginjalnya bagi istri kesayangannya, meskipun semua itu tidak berhasil.\n" +
                        "Kini rasanya hati Salha benar-benar hancur, hancur-sehancur hancurnya. Gadis itu menangis histeris, bahkan disaat-saat terakhir ayahnya, ia tidak bisa menyampaikan kata maaf.\n" +
                        "\n" +
                        "Tangan gadis itu perlahan mengambil kertas kosong yang masih tergeletak di dalam laci itu, ia teringat bahwa ayahnya pernah menyuruh Salha untuk menuliskan mimpinya di atas kertas tersebut. Kini semuanya sudah jelas. Salha tidak ingin terus menerus larut dalam kesedihan. Untuk menebus rasa bersalahnya, gadis itu melaksanakan perintah terakhir ayahnya. Di atas kertas tersebut ia menulis kalimat yang berbunyi “aku ingin menjadi orang hebat seperti ayah” dengan begitu, kini Salha mempunyai motivasi untuk berubah.\n" +
                        "\n" +
                        "Selang beberapa tahun, gadis itu berhasil mewujudkan mimpinya, yaitu menjadi seorang pembisinis hebat seperti ayahnya, karena sejujurnya di dalam darahnya mengalir darah seorang pembisnis hebat yang berambisi. Ternyata di balik nasib buruknya terdapat rencana tuhan yang tidak pernah ia bayangkan sebelumnya. Sungguh, saat ini Salha benar-benar berterima kasih kepada ayahnya dan juga selembar kertas yang menyimpan memori serta kenangannya bersama ayah. Selembar kertas yang telah mengubah hidupnya.",
                "Aku adalah seorang gadis manja, pemalas, benci matematika dan tomboy yang duduk di kelas 1 SMA. Dalam hidupku aku memiliki seorang lelaki yang sudah menemaniku selama dua tahun, dia bernama Farly dia sekarang duduk di kelas 2 SMA, dia adalah sosok lelaki yang baik, rajin dan juga manis. Satu hal yang membuatku begitu menyayanginya yaitu kesabarannya, dia orang yang paling sabar dalam menghadapi semua sifatku.\n" +
                        "\n" +
                        "Tapi suatu hari aku tidak sengaja bertemu dengan laki-laki yang menurutku orang itu sangat mirip dengannya, dan hal itu sering terjadi dan bahkan setiap hari ketika pulang sekolah aku selalu bertemu dengan orang itu. Dan pada akhhirnya akupun mulai penasaran dengan hal itu “siapakah nama orang itu” pertanyaan itu terus saja mengahantuiku, hingga akhirnya aku memutuskan untuk mencari tahu jawaban akan pertanyaan itu.\n" +
                        "\n" +
                        "Suatu hari ketika sekolah aku membuka facebook di jam kosong, dan hal yang tak pernah kuduga-duga kini telah terjadi di kehidupanku. Yups laki-laki itu mengirim pesan via facebook kepadaku, dan dengan girangnya tanpa berpikir dua kali aku membalas pesan darinya. Dan kamipun mulai akrab dan terus berbincang-bincang tentang banyak hal seperti orang yang sudah saling mengenal sejak lama.\n" +
                        "\n" +
                        "\n" +
                        "Pada hari ketujuh setelah perkenalan kami, aku memintanya untuk mengajariku tugas kimia dan kebetulan dia jago dalam bidang kimia. Ia mengajakku keluar untuk mengerjakan tugas itu bersama dan akupun menerima ajakan darinya. Selepas shalat magrib kami memutuskan untuk bertemu dan ini merupakan pertemuan pertama kami setelah kami saling mengenal.\n" +
                        "\n" +
                        "Pada malam itu dia terlihat begitu tampan dan kurasa aku mulai menyukainya, aku terus memadangi dirinya dengan terus tersenyum melihatnya yang pada akhirnya senyumanku terhenti ketika dia melontarkan satu pertanyaan pertama dari mulutnya “kita ngerjain tugasnya dimana, di Perpusatakaan?” dan tanpa berpikir panjang akupun mengiyakan pertanyaannya itu.\n" +
                        "\n" +
                        "Sesampai di Perpustakaan kami mencari tempat duduk yang ternyata sudah dipenuhi oleh pelajar-pelajar lainnya. Yang tersisa hanyalah tempat sepi dan gelap tanpa kursi. Kurasa kami tidak akan mungkin belajar di tempat gelap seperti ini, dan akupun ingin mengatakan hal itu kepadanya namun ia lebih dulu mengatakan hal itu “kita tidak akan mungkin belajar di tempat gelap seperti ini”, dalam benak ku berkata “woww dia alim benar” dan rasa sukaku semakin besar kepadanya, kurasa aku mulai menaruh hati padanya. Namun aku salah, dia bukan orang alim seperti yang aku bayangkan, pada malam itu dia mengajakku untuk pergi jalan-jalan karena aku rasa dia orang yang baik maka aku mengiyakan ajakannya dan ketika sampai di suatu tempat duduk dia mengajarkanku menyelesaikan tugasku, namun selepas itu dia mengecup keningku dengan sengaja dan akupun terdiam dan terkejut dengan hal itu, aku mencoba untuk menghindar namun tak bisa hingga akhirnya aku terdiam lagi.\n" +
                        "\n" +
                        "Sungguh hal yang tidak pernah terbersit di pikiranku akan terjadi secara tiba-tiba seperti ini, dan kejadian itu menghadirkan harapan yang besar. Harapan yang akan membuat kami bersama dalam ikatan pacaran. Namun harapan itu kurasa sia-sia dan kini menjelma menjadi rasa sakit yang teramat dalam, karena setelah kejadian itu dia menghilang tanpa kabar dan aku terus mengharapkan kedatangannya yang tak kunjung datang.\n" +
                        "\n" +
                        "Harapan itu terus mengahantuiku yang membuatku semakin merasa sakit dan gila. Dan akhirnya aku putuskan untuk berhenti berharap dan kembali serius menjalin hubungan bersama Farly.\n" +
                        "\n" +
                        "Hari demi hari aku lalui bersama Farly dengan rasa sakit yang masih membeku di hati. Dan rasa sakit itu membuat ku menjadi seorang malaikat berhati iblis. Dan hal itu membuatku kehilangan orang yang aku sayangi sejak dulu, aku melepaskan dia karena aku tidak tahan dan kasian kepadanya jika ia terus-terusan aku sakiti yang bahkan dia tidak tahu kesalahan apa yang telah ia lakukan sehinggan aku memutuskan untuk berhenti bersamanya.\n" +
                        "\n" +
                        "Namun dia tidak menerima keputusanku, dia terus bersikeras untuk tetap bertahan bersamaku walaupun ia terus aku sakiti, tapi aku rasa aku sudah tidak bisa lagi melanjutkan hubungan ini aku ingin menyendiri untuk menghilangkan rasa sakit ini tanpa ada seorang lelaki yang menemaniku. Dan iapun mengalah karena ia tidak mau membuatku terluka dengan tidak menuruti keinginanku.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "6 bulan kemudian…\n" +
                        "Lama sudah aku menyendiri tapi rasa sakit itu masih saja menghantui, banyak lelaki yang datang menghampiri namun tidak ada satupun yang bisa memikat hati. Aku rasa aku sudah mati rasa karena sakit ini sudah menguasaiku selalu menjadi racun di pikiranku, hingga seorang lelaki berbadan tinggi yang terkenal pintar matematika datang lagi di kehidupanku dan sungguh ia menjadi obat penawar bagi segala rasa pilu, laki-laki itu bernama Asri.\n" +
                        "\n" +
                        "Dia laki-laki berbadan tinggi yang satu tahun lebih tua dariku dan dia laki-laki yang di segani banyak perempuan seumuran aku dan bahkan yang lebih tua darinya. Awalyna dia laki-laki biasa menurutku walaupun dia pintar dan disegani banyak perempuan tapi di mataku dia biasa-biasa saja, karena pada saat itu aku masih dikusai rasa sakit hingga pada akhirnya dia mampu memikat hatiku lagi dengan kesederhanaannya itu.\n" +
                        "Tapi aku tidak mau menaruh hati pada orang yang salah lagi dan aku berpikir untuk membuang jauh jauh rasa yang mulai timbul lagi di hatiku.\n" +
                        "\n" +
                        "Aku menjalani hari-hariku seperti biasanya, sekolah, pulang sekolah main HP, tidur makan shalat itu saja terus karena memang aku sangat malas. Sore itu tepat di hari jum’at Asri megajakku untuk bertemu yang kebetulan pada sore itu aku hendak pergi kerumah Nana teman kelasku sejak SMP dan akupun mengiyakan ajakannya, dan sore itu menjadi pertemuan pertama kami.\n" +
                        "\n" +
                        "Pertemuan itu membuatku terus saja memikirkannya sambil senyum-senyum sendiri seperti orang gila, mungkinkah aku jatuh cinta lagi setalah sekian lama dari kejadian itu? Dan aku rasa ya, aku jatuh cinta padanya. Aku suka dia yang sederhana.\n" +
                        "\n" +
                        "Pada sore minggu aku mendapatkan pesan dari sahabatku yang tempatku curhat segala macam tentang kisahku termasuk tentang perasaanku yang mulai timbul kepada Asri. Dan isi pesan itu bagaikan berita duka bagiku. Pesan itu membuat diriku terpukul untuk yang kedua kalinya, pesan itu berisi tentang kabar Asri jadian bersama teman sekolahku. Sungguh aku mulai enggan dengan semua kisah pilu dalam hidupku.\n" +
                        "\n" +
                        "Malamnya aku mencoba untuk menghubungi Asri untuk memastikan bahwa berita itu salah, dan harapanku salah lagi berita itu memang benar adanya. Dan akupun mengucapkan selamat kepadanya seakan-akan tidak terjadi apa-apa padahal di dalam hati terbersit luka yang pasti.\n" +
                        "\n" +
                        "Mungkin salahku juga yang tidak ingin mengakui kalau aku suka padanya, karena aku takut aku terluka lagi dan benar memang saat ini aku merasa terluka lagi, tapi kali ini karena salahku sendiri yang tidak ingin mengakui kalau aku jatuh cinta kepadanya, dan aku kembali menyendiri dengan angan-angan yang tak pasti.\n" +
                        "\n" +
                        "Hari ini ada yang tidak beres ada hal yang membuatku tersenyum simpul dan hampir bahagia. Aku melihat timeline mereka kalau mereka sedang berantem dan entah mengapa hal itu membuaku tersenyum. Ehh dasar aku ini memang malaikat berhati iblis bisa-bisanya aku bahagia di atas penderitaan orang lain, tapi terserahlah yang penting aku bahagia.\n" +
                        "\n" +
                        "Entah sejak kapan aku menjadi stalker handal, setiap hari aku selalu saja menstalking timeline mereka seakan-akan itu adalah sumber kebahagiaanku, melihat mereka berantem setiap hari bagaikan alasan dibalik senyumanku. Tapi aku kasihan juga melihat Asri yang berantem terus dengan pacar barunya dan akhirnya aku memutuskan untuk menghubunginya menanyakan kabarnya dan sesekali menanyakan tentang pacar barunya.\n" +
                        "Sejak saat itu aku menjadi pendengar baiknya, dia selalu bercerita tentang hubungannya yang kurang harmonis tanpa dia tahu kalau aku ingin sekali menggantikan posisi wanita itu di hatinya.\n" +
                        "\n" +
                        "Malam minggu, malam yang sangat ditunggu-tunggu oleh orang yang memiliki pacar nggak kayak aku yang kerjaanya cuma tidur sambil dengar musik di kamar. Musik Hpku terhenti dan aku hendak pergi untuk mengecasnya tapi ternyata itu bukan karena bateraiku yang low-bat tapi karena ada sebuah pesan, dan akupun segera membuka pesan itu karena tumben-tumbenan aku dapat pesan di malam minggu yang mengatakan “malam ini sibuk nggak, bisa temenin nonton basket?” dan orang yang mengirim pesan itu tak lain lagi selain Asri. Dan akupun membalas pesan darinya “nggak kok, bisa kalau mau langsung aja jemput”.\n" +
                        "\n" +
                        "Dan malam itu adalah malam minggu pertamaku bersamanya. Dia laki-laki yang sederhana dan juga romantis dari caranya memperlakukanku membuat perasaanku semakin tumbuh kepadanya. Tapi aku sadar aku hanya sekedar teman curhat dan bahkan adik baginya, namun pola pikirku diubah oleh satu kalimat yang terlontar di mulutnya ketika kami sedang makan “sayang mau kakak suapin?” dan sungguh kata itu membuatku mabuk kepayang dan aku menjawab “boleh” dan iapun menyuapiku makanan itu.\n" +
                        "Hatiku semakin berdegup kencang dibuat olehnya, di sisi lain aku terus berkata dalam hati “sadar, sadar aku hanya teman nggak lebih”. Apalah dayaku yang suka ke pacar orang.\n" +
                        "\n" +
                        "Jam sudah menunjukkan 21:00 yang menandakan kami harus segera pulang. Sesampai di rumah aku langsung beristirahat.\n" +
                        "04:45 I promise any tell you call me it’s matter where i’am… (panggilan masuk)\n" +
                        "“Halo ada apa?” dengan suara orang baru bangun tidur\n" +
                        "“bangun sayang shalat subuh supaya nggak telat terus berangkat sekolahnya”\n" +
                        "“iya..” sambil menekan tombol merah untnuk mematikan panggilan\n" +
                        "\n" +
                        "Kayak ada yang nggak beres, kok barusan kayak ada yang manggil sayang (sambil memeriksa HP melihat panggilan masuk) dan ternyata yang barusan nelepon adalah Asri. Mataku langsung melotot dan semua rasa ngantukku telah hilang dan akhirnya aku langsung mengambil air wudhu dan segera shalat. Sejak saat itu aku mulai rajin bangun pagi untuk shalat subuh dan bahkan shalat tengah malam dan tidak telat berangkat sekolah lagi karena setiap pagi dia selalu nelpon untuk shalat.\n" +
                        "\n" +
                        "Sejak saat itu aku mulai merasa banyak perubahan pada diriku, dan satu lagi perasaanku semakin besar kepadanya. Tepat di tanggal 20 mei aku mendapatkan pesan yang aneh darinya yang baru pertama kali kulihat.\n" +
                        "“Jujur, aku sayang sama kamu sejak lama, dan jika aku mengajakmu pacaran, apakah kamu mau?”\n" +
                        "“Aku juga sayang sama kamu, sudah sangat lama sejak pertemuan pertama kita. Namun aku pendam dan akhirnya kamu jadian sama teman sekolahku”\n" +
                        "“Iya sudah kalau begitu tunggu aku”\n" +
                        "Dan akhirnya aku memutuskan untuk menunggunya karena aku benar-benar menyayanginya.\n" +
                        "\n" +
                        "Lama sudah dari kejadian itu, tapi orang yang kutunggu-tunggu tak kunjung datang walaupun ia sudah lama berhenti dengan pacarnya. Dan pada saat itu aku hampir menyerah, karena dibalik menunggu ada rasa takut, takut kalau itu semua cuma perkataan saja dan berakhir sia-sia.\n" +
                        "\n" +
                        "Namun semua itu salah, dia benar-benar datang padaku dan menyatakan semua perasaannya padaku. Sungguh hari yang kutunggu-tunggu kini sudah datang menghampiriku, ini semua terasa mimpi bagiku.\n" +
                        "\n" +
                        "Dan dia benar-benar laki-laki yang kutunggu-tunggu. Laki-laki yang mampu merubah perempuan malas bangun pagi jadi rajin bangun pagi, laki-laki yang mampu merubah perempuan yang benci dan bahkan tidak bisa matematika jadi suka dan bisa matematika karena dia yang langsung mengajariku dan bagiku dia adalah guru private matematikaku, laki-laki yang mampu merubah perempuan tomboy menjadi perempuan islami. Aku mengalami banyak perubahan semenjak ia datang ke kehidupanku, gadis yang terkenal malas menjadi sering ikut lomba di dalam sekolah maupun diluar sekolah dan tak jarang aku memenangkan lomba-lomba itu, hingga akhirnya aku diberi penghargaan sebagai siswi berprestasi. Karena memang aku menjadi sangat rajin semenjak dia hadir dan merubah hidupku. Dan sungguh dialah lelaki yang ku nanti.",
                "“Pagi anak-anak” sapa Pak Udin dengan suara lantang.\n" +
                        "“Pagi, Pakkkk…!!!”\n" +
                        "“Sebelum pelajaran dimulai, hari ini di kelas kita kedatangan murid baru. Silahkan masuk nak.” Perintah Pak Udin. “Silahkan perkenalkan diri kamu”.\n" +
                        "\n" +
                        "“Selamat pagi teman-teman, kenalin nama gue Rino, gue pindahan dari SMA Nusa Bangsa”.\n" +
                        "Mendadak suasana kelas ricuh karna kedatangan Rino si murid baru yang super ganteng.\n" +
                        "\n" +
                        "“Rino ganteng banget sih, kayak Justin bieber. Duduk sebelah gue aja Rin, sebelah gue kosong kok” ucap Dara sambil mengedipkan mata.\n" +
                        "“Ih, centil amat lo Dar” ucap Dina teman sebangku gue.\n" +
                        "\n" +
                        "\n" +
                        "“Sudah-sudah, Rino kamu duduk di depan Mita dan Dina, sebangku sama Budi.”\n" +
                        "“Terima kasih pak” ucap Rino sembari menganggukkan kepala.\n" +
                        "\n" +
                        "Saat jam istirahat gue memilih duduk di teras kelas sambil lihat pertandingan basket. “Eh lihat din, itu kan Rino. Emang ganteng abis tuh anak, udah ganteng jago basket lagi”.\n" +
                        "“Hati-hati mit, ntar lo naksir lagi”.\n" +
                        "“Biarin naksir, naksir sama cowok gak masalah lagi. Itu tandanya gue masih normal. Bola matanya din berwarna biru muda. Persis kayak bule-bule gitu.”\n" +
                        "“Dia emang blesteran kali, yang gue denger-denger dari Budi sih gitu. Katanya nyokapnya orang indo kalo bokapnya orang Prancis.”\n" +
                        "\n" +
                        "“Din, gue mau Tanya nih. Lo percaya cinta pandangan pertama?” Tanya Mita antusias.\n" +
                        "“Gue percaya kok, karna gue pernah ngalami sendiri waktu gue masih SMP. Udahlah ayo masuk kelas. Lama-lama lo bakal ngiler kelamaan nglihatin Rino. Hahaha” Mereka berdua masuk ke kelas bersamaan.\n" +
                        "\n" +
                        "Malam ini, hujan kembali turun. Menyisakkan genangan-genangan di sepanjang jalan. Membuat kebanyakan orang enggan untuk keluar rumah. Seperti aku salah satunya, lebih memilih duduk di balkon ditemani secangkir coklat panas. Kulihat di sepanjang jalan tak ada orang yang berlalu-lalang, padahal jam masih menunjukkan pukul 20:00. Entah mengapa sedari tadi ada yang mengganggu fikiranku. Sejak kehadiran Rino anak baru di kelasku yang tak sengaja duduk tepat di depanku, aku terus memikirkannya.\n" +
                        "\n" +
                        "Apa aku menyukainya ya? Apa ini yang orang bilang love at the first sight, cinta pada pandangan pertama. Aku mengambil selembar kertas dan menulis sesuatu.\n" +
                        "\n" +
                        "Maaf aku menyukaimu dalam diam. Mencuri-curi waktu untuk menatap mata indahmu. Maaf karena Aku tak punya banyak keberanian tuk bertegur sapa denganmu. Sebab melihatmu saja sudah menjadi candu bagiku. Secret Admirer\n" +
                        "\n" +
                        "Aku melipat kertas yang kutulis tadi dan kumasukkan kedalam tas. Aku berniat datang ke sekolah lebih awal untuk meletakkan surat ini di loker Rino. Semoga saja dia membacanya.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Pagi hari yang dinanti Mita dengan tidak sabar akhirnya datang juga. Semalaman ia hampir tak bisa tidur karena teringat Rino, si murid baru. Mita lekas mandi, mempersiapkan diri dan keluar kamar. Saat hendak membuka pintu kamar, Mita dikejutkan dengan kehadiran mamanya yang mungkin hendak membangunkannya.\n" +
                        "\n" +
                        "“Tumben anak mama jam segini udah siap, gak salah nih?” tegur mama Mita.\n" +
                        "“Eh mama, ngagetin aja. Ada tugas mendadak di sekolah ma, jadi Mita berangkat lebih awal. Mita sarapan di sekolah aja ma. Mita berangkat dulu” pamitnya. Tanpa basa basi Mita pun langsung melesat ke motornya.\n" +
                        "\n" +
                        "Tiba di sekolah, kelas masih sepi, Dina pun belum terlihat batang hidungnya. Tak perlu waktu lama Mita langsung menuju ke jejeran loker kelas XII IPA 1. Dicarinya nomor 25, tepat loker milik Rino. Diselipkannya kertas yang ia tulis semalam. Dan bergegas menuju tempat duduknya kembali. Berharap tak ada yang melihatnya.\n" +
                        "\n" +
                        "Semoga lo baca tulisan gue Rin, meski gak gue kasih nama sih. Tapi suatu saat kalo gue punya kesempatan, gue bakal ngungkapin kalo selama ini lo punya pengagum rahasia. Dan itu gue.",
                "Lembaran-lembaran kertas binder dan sebuah buku tebal tergeletak berantakan di atas meja. Lembaran kertas itu berisi materi Kimia Unsur yang tertulis rapi dengan 3 warna pulpen berbeda dan 5 warna stabilo berbeda.\n" +
                        "\n" +
                        "Aku duduk di atas kursiku sambil melipat kedua tangan di depan dada. Mataku tertuju pada lembaran-lembaran kertas di hadapanku. Dalam hitungan menit, kelasku akan memulai kuis kimia dan dan aku belum siap sama sekali dengan materi ‘Alkali dan Alkali Tanah’.\n" +
                        "“Ahk!” Aku melempar tabel periodik ke atas meja. Aku sudah lelah dan sangat lelah.\n" +
                        "\n" +
                        "Minggu ini adalah Pekan Kesenian dan Olahraga Siswa ‘PKOS’, tapi guru kimia kami memaksa tetap akan melanjutkan kuis. Di saat kelas lain sibuk heboh di lapangan menonton pertandingan basket antar kelas, apa seluruh kelas XII IPA harus diam di kelas karena kuis kimia?\n" +
                        "\n" +
                        "\n" +
                        "Aku melihat sekelilingku. Di kelas hanya tersisa sekitar 12 orang yang berusaha tetap teguh untuk belajar. Sisa yang lainnya sudah tidak kuat dan memilih meninggalkan kelas.\n" +
                        "\n" +
                        "“Almirah.” Ruby melemparku dengan remasan kertas.\n" +
                        "“Apa By?” Aku berbalik. Ruby duduk dua meja di belakangku.\n" +
                        "“Rumus obat maag?”\n" +
                        "Aku mendengus pelan, mengambil buku tulis dan membuka lembaran kosongnya. ‘Mg(OH)2’ aku menulis rumus yang Ruby maksud.\n" +
                        "“Terima kasih.”\n" +
                        "\n" +
                        "Aku mengambil jaket dari dalam tasku setelah melihat jam dinding. Masih ada sepuluh menit. Setidaknya lumayan untuk memimpikan calon imam nun jauh di sana.\n" +
                        "“WOOOOOO!”\n" +
                        "“MANTAAAAB!”\n" +
                        "Baru saja aku ingin memejamkan mata, sisa satu kelas di sini ribut tak karuan. Aku kembali mengangkat kepalaku dan melihat mereka.\n" +
                        "\n" +
                        "“By, kenapa?” Aku melempar Ruby dengan sampah kertas yang tadi.\n" +
                        "“Cek grup.”\n" +
                        "\n" +
                        "Aku segera meraih smartphoneku untuk melihat apa yang Ruby maksud. Grup dengan nama ‘Scient4stic’ itu dipenuhi komentar dengan caps lock. Aku scroll ke atas hingga muncul penyebabnya.\n" +
                        "“Finally.” Aku menghela napas lega setelah membaca info dari Raisa.\n" +
                        "\n" +
                        "Teman sekelas kami yang baru saja pergi ke ruang guru dan bertanya perihal kuis kimia pada guru kami dan memberi kabar bahwa kuis hari ini dibatalkan dan dipindah ke minggu depan.\n" +
                        "Aku menutup buku paket kimia dan memasukan kertas-kertas binder ke tempatnya. Mejaku sudah rapi dan siap untuk tidur siang.\n" +
                        "\n" +
                        "“Almirah.”\n" +
                        "Asli. Aku benar-benar ingin tidur saat ini.\n" +
                        "“Ayo kita nonton.” Shafa menarik tanganku. “Sebentar lagi kelasnya ‘Imam Idaman’ main.”\n" +
                        "Aku tersenyum untuk menuruti Shafa. Gadis ini menarikku keluar kelas, bahkan saking semangatnya, Shafa rela mengambilkan sepatuku dan meletakkannya di hadapanku.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "“Kita kantin dulu, yuk!” Aku manarik lengan Wulan.\n" +
                        "“Butuh asupan makanan.” Tambah Tiara.\n" +
                        "“Ihk…, buruan!” Shafa yang paling bersemangat untuk nonton pertandingan ‘Imam Idaman’ mereka.\n" +
                        "“Yaudah sih, kayak ‘Imam Idaman’ bakal main aja.” Tiara menjulurkan lidahnya pada Shafa, lalu berlari menghindar.\n" +
                        "Kantin sepi karena mungkin semua murid berkumpul di lapangan. Kami segera membagi tugas. Siapa yang akan membeli minum, gorengan, makanan manis dan asin. Aku segera mengambil sebungkus wafer vanilla dan cokelat. Setelah Tiara membeli minum, Wulan membeli gorengan dan Shafa membeli keripik singkong, kami segera ditarik Shafa ke lapangan.\n" +
                        "\n" +
                        "“Terlihat ingin hujan.” Kata Tiara.\n" +
                        "“Cari spot yang bagus.” Tambah Shafa.\n" +
                        "“Di sana, depan kelas sebelas IPS.” Aku menunjuk ke lorong sebelas IPS. Jelas menghadap langsung ke arah lapangan, tetapi tidak terkena hujan dan tidak akan tertimpuk bola karena jarring pembatas.\n" +
                        "\n" +
                        "Kami duduk di sana dan melihat pertandingan kelas XII IPA 3 dan X IPS 1. Bahkan kami ikut berteriak seperti yang lainnya. Tentu saja mereka tidak meneriaki ‘Imam Idaman’ secara terang-terangan. Mana mungkin mereka berani melakukan itu.\n" +
                        "\n" +
                        "Pertandingan tadi dimenangi oleh kelas XII IPA 3.\n" +
                        "“Idaman banget, ya Allah.” Ucap Shafa setelah pertandingan selesai.\n" +
                        "“Shaf, itu ada ‘Segiempat’.” Wulan menepuk paha Shafa heboh.\n" +
                        "Aku tidak mengerti kenapa kami membuat banyak nama samaran untuk orang-orang. Terutama orang-orang ganteng sekolah bahkan guru-guru dan OB sekalipun.\n" +
                        "“Mana sih yang namanya ‘Segiempat’ itu?” Aku menoleh ke belakang. Mencari seseorang yang mereka sebut.\n" +
                        "Shafa menarikku hingga sangat dekat dengannya. “Bediri samping kamu!” Bisiknya penuh tekanan.\n" +
                        "Aku dengan ragu melirik ke sampingku dan harus mendongak karena aku duduk. Ganteng? Pada umumnya, selera Wulan dan Shafa berbeda dengan aku dan Tiara. Sampai terkadang, aku dan Tiara meremehkan selera mereka berdua.\n" +
                        "“Terlihat kalem.” Komentar Tiara.\n" +
                        "“Iyalah, kalem!” Shafa menelan sisa gorengan di mulutnya, “mana ada cowok pecicilan nulis essai.”\n" +
                        "“HAH?!” Aku tanpa peduli berteriak. “Dia ikut lomba essai?”\n" +
                        "Wulan dan Shafa mengangguk bersama. Aku tersentuh mendengarnya.\n" +
                        "\n" +
                        "Pertandingan berikutnya aku tidak terlalu memperhatikan karena tidak ada yang aku kenal di sana. Wulan dan Tiara masih heboh berteriak sedangkan Shafa sibuk main smartphone dan makan wafer.\n" +
                        "\n" +
                        "Aku mengitari pandanganku. Lorong ini penuh dengan anak-anak yang menonton, hingga pandanganku berhenti di sebuah gerombolan kelas XI yang tak jauh dari tempatku duduk. Mereka mengeluarkan kursi kelas mereka untuk menonton. Aku melihat seorang anak yang duduk di pinggir lapangan, wajahnya familiar tapi aku tidak kenal.\n" +
                        "\n" +
                        "Hingga pertandingan berikutnya. Anak yang tadi aku lihat, bermain bersama teman sekelasnya, XI IPS ? -Aku tidak mendengar IPS berapa-. Ia menggunakan jersey kelas, berwarna abu-abu dengan aksen biru, di belakang punggungnya ada angka 32 dan nama kelasnya, tetapi tidak ada nama pemain.\n" +
                        "\n" +
                        "“Ti.”\n" +
                        "Tiara menoleh padaku, alisnya terangkat untuk bertanya.\n" +
                        "“Itu, anak kelas sebelas yang berdiri paling deket sama ring, nomor tiga puluh dua,” aku menunjuk anak itu sambil menjelaskan ciri-cirinya pada Tiara.\n" +
                        "“Hm?”\n" +
                        "“Dia anak paskib bukan, sih?” Ya, aku baru ingat kenapa wajahnya familiar.\n" +
                        "“Oh, iya, iya.” Jawab Tiara.\n" +
                        "“Siapa namanya?”\n" +
                        "“Reyha Niko.” Jawab Tiara sambil menyuap gorengan. “Biasanya dipanggil Haniko”\n" +
                        "“Imut.”\n" +
                        "Tiara tertawa pelan. “Mukanya lucu, kecil.” Tambah Tiara sambil tertawa.\n" +
                        "“Dia ganteng.”\n" +
                        "\n" +
                        "Tanpa aku tahu, satu kalimat sederhana yang biasa aku ucapkan untuk banyak orang secara sembarangan, tidak pernah lepas dari pikiranku. Sungguh, aku tidak bisa melupakan orang sekaligus kalimatnya.\n" +
                        "\n" +
                        "Anak itu. Anak kelas XI IPS itu tidak pernah pergi dari pikiranku hingga berhari-hari dan minggu berikutnya.\n" +
                        "Sepele. Sederhana.\n" +
                        "Tapi sungguh menggangu.\n" +
                        "\n" +
                        "25 Oktober 2017\n" +
                        "Pagi ini, saat aku sampai sekolah, ada dua bus kecil terparkir depan gerbang. Rumornya, hari ini dan besok LDKS, itu artinya akan banyak guru yang tidak masuk, terutama kelas XII yang rata-rata diajar Wakil Kepala Sekolah.\n" +
                        "\n" +
                        "“Hari ini berangkat LDKS?” Seno sampai di sampingku sambil berusaha melepas jaketnya.\n" +
                        "“Mungkin.”\n" +
                        "\n" +
                        "Aku dan Seno jalan beriringan memasuki sekolah, melewati lorong menuju lapangan, kami memilih mengabaikan antrian finger print dan terus jalan. Seno berbelok duluan dan memilih jalan belakang dari pada lewat tengah lapangan. Di depan tiang bendera, petinggi OSIS dan MPS yang baru berbaris dituntun senior mereka.\n" +
                        "\n" +
                        "“Mirah!” Vika, teman sekelasku, salah satu petinggi OSIS angkatan kami tidak sengaja melihatku dan menjulurkan lidahnya tidak peduli ia sedang mengatur adik-adik kelasnya.\n" +
                        "Aku membalas Vika dengan acungan jari manisku. Vika bahkan tertawa tanpa peduli posisinya hingga kami menjadi perhatian para petinggi OSIS/MPS yang baru.\n" +
                        "\n" +
                        "Saat aku akan berpaling dari Vika, aku melihatnya. Aku lihat dia berdiri di paling depan barisan laki-laki. Matanya juga terarah padaku, sisa melihat atraksiku dengan Vika.\n" +
                        "“Ekhm.” Aku berdeham sebelum berlari menyusul Seno.\n" +
                        "\n" +
                        "Sudah 6 hari dia di pikiranku. Selama 6 hari itu aku bertahan untuk mengabaikannya. Kenapa di hari ketujuh aku kembali melihatnya? Bisa makin kacau pikiranku.\n" +
                        "\n" +
                        "Sungguh, seharian itu, aku tidak bisa membiarkan diriku kosong barang sedetik pun. Jika aku bengong sedikit saja, wajahnya muncul di ingatanku bahkan jantungku terasa sakit ketika mengingatnya. Masalahnya, aku tidak ingat nama yang diucapkan Tiara dan aku bersumpah tidak akan pernah menanyakan kembali nama itu.",
    };

    private static int[] bookCovers = {
            R.drawable.hujan,
            R.drawable.mawar_putih,
            R.drawable.kamu_titik,
            R.drawable.senja,
            R.drawable.rumah_leo,
            R.drawable.lorong_biru,
            R.drawable.bus_malam,
            R.drawable.makam,
            R.drawable.ayah,
            R.drawable.arga,
            R.drawable.pensil,
            R.drawable.surat,
            R.drawable.persahabatan,
            R.drawable.roti_coklat,
            R.drawable.move_on,
            R.drawable.keep_friends,
            R.drawable.hujan_duit,
            R.drawable.waktu,
            R.drawable.dark_life,
            R.drawable.ayah,
            R.drawable.penyesalan,
            R.drawable.kertas,
            R.drawable.lelaki,
            R.drawable.pengagum_rahasia,
            R.drawable.salam,
    };

    static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < authorNames.length; position++) {
            Book book = new Book();
            book.setAuthor(authorNames[position]);
            book.setTitle(bookTitles[position]);
            book.setThumbnail(bookCovers[position]);
            book.setDescription(isiBuku[position]);
            book.setCategory(categories[position]);
            list.add(book);
        }
        return list;
    }

}
