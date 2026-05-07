Otopark Yönetim Sistemi 
Bu proje, Java üzerinde Nesne Yönelimli Programlama (OOP) prensiplerini kullanarak bir otopark yönetim mantığını simüle eder. Projenin ana odağı, kod tekrarını önleyen ve genişletilebilir bir mimari kurmaktır.

Teknik Yapı ve OOP Uygulamaları
Proje geliştirilirken aşağıdaki mimari yaklaşımlar tercih edilmiştir:

Inheritance (Kalıtım): Vehicle sınıfı temel (base) sınıf olarak kurgulanmıştır. Car ve Motorcycle sınıfları bu sınıftan türetilerek ortak özelliklerin (plaka, marka, model, kilometre) tek bir merkezden yönetilmesi sağlanmıştır.

Encapsulation (Kapsülleme): Tüm değişkenler erişim belirleyicileri (protected, private) ile korunmuştur. Veri girişleri Getter/Setter metotları üzerinden yapılarak, örneğin kilometrenin negatif değer almaması gibi mantıksal kontroller sisteme entegre edilmiştir.

Method Overriding: showInfos metodu her araç türü için özelleştirilmiştir. Bu sayede araç türüne özgü (kapı sayısı, sepet durumu vb.) verilerin doğru şekilde gösterilmesi sağlanmıştır.

İşleyiş Mantığı
Hareket Kontrolü: Araçların move fonksiyonu, isMotorRunning boolean değişkenine bağlıdır. Motor kapalıyken hareket işlemi sistem tarafından engellenir.

Veri Yönetimi: Araçların anlık konumu, giriş saati ve kat bilgisi gibi veriler dinamik olarak güncellenebilir yapıdadır.

Kullanım
Proje herhangi bir Java IDE'si üzerinden Main.java dosyasının çalıştırılmasıyla test edilebilir. Konsol çıktısı üzerinden araçların durum değişimleri takip edilebilir.
