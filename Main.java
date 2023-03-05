import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Set-Küme
        HashSet
        Aynı elemanlar tekrar bulunamaz
        Çıkışın girişle aynı sırayı verme garantisi yoktur
        Diziler gibi boyut vermemiz gerekmez. Dinamik olarak genişler
        Null değer verilebilir
        Iterator ile küme-liste içinde gezme işlemi sağlanabilir
        Linked hashsetlerde ise çıkış girişle aynı sırayı garanti eder
        */

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(12);
        hashSet.add(1);
        hashSet.add(20);
        hashSet.add(23);
        hashSet.add(15);

        for (int num: hashSet) {
            System.out.println(num);
        }
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(23));
        System.out.println("------------------");

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("---------------");
        /* TreeSet
         Veri kümesine konulan elemanları verilen sıraya göre sıralar
         Comparator sınıfı ile sıralama işlemi yapılır
         Sınıftaki return değeri + ise ilki büyük - ise ilki küçük (int sıralamada)
        */

        // Nota göre sıralama
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator() );
        students.add(new Student("Ali", 88));
        students.add(new Student("Veli", 82));
        students.add(new Student("Ceren", 65));
        students.add(new Student("Kerem", 98));
        students.add(new Student("Büşra", 92));

        for (Student student: students){
            System.out.println(student.getName());
        }


        System.out.println("------------");

        // İsme göre sıralama
        TreeSet<Student> students2 = new TreeSet<>(new OrderNameComparator() );
        students2.add(new Student("Ali", 88));
        students2.add(new Student("Veli", 82));
        students2.add(new Student("Ceren", 65));
        students2.add(new Student("Kerem", 98));
        students2.add(new Student("Büşra", 92));

        for (Student student: students2){
            System.out.println(student.getName());
        }


        /* Listeler
         ArrayList
         Veri işlemede sık kullanılır
         Arraylar gibi indislere göre sıralanır
         Girilen sıra ile çıkarlar
         Başlangıç kapasiteleri 10dur ihtiyaca göre katlanarak artar
        */

        System.out.println("-------------");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(35);
        list.add(2);
        list.add(12);
        list.add(26);
        list.add(16);

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println(list);
        //araya bir değer ekleyip gerisine kaydırma işlemi yapılabilir
        //elemanı direkt değiştirmek isteniyorsa set kullanılır
        list.add(2,14);
        System.out.println(list);

        System.out.println("------------");

        /* LinkedList
         listenin başına ve sonuna eleman eklenip çıkarılabilir.
         eleman silme veya araya eleman ekleme işleminde kaydırma işlemi olmaz
        */

        List<String> list1 = new LinkedList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ceren");
        list1.add("Büşra");

        Iterator<String> iterator2 = list1.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        /* Queue LinkedList
        FIFO yapısındadır ancak metotlar ile LIFO yapısına dönüştürülebilir

        element() -> Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
        poll() -> Kuyruğun başındaki elemanı kuyruktan çıkartır.
        offer() -> kuyruğa eleman ekler
        */

        Queue<String> queue = new LinkedList<>();
        queue.add("Ali");
        queue.add("Veli");
        queue.add("Ceren");
        queue.offer("Kerem");
        System.out.println(queue);


        /* Map
        key-value ilişkisiyle çalışır
        HashMap - LinkedHashMap - TreeMap
        Sadece Linked girilen sırayla çıkış sırasını garanti eder.

        put (Object key, Object value) -> Anahtar — değer ikilisini kayıt eder.
        get (Object key) -> Anahtara karşılık gelen objeyi döndürür.
        */

        Map<String, String> countries = new HashMap<>();
        countries.put("TR", "Türkiye");
        countries.put("US", "United States");
        countries.put("EN", "England");

        System.out.println(countries.get("TR"));

    }
}