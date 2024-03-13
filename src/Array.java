import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 54, 15, 6, 5, 7, 5, 9};
        int[] list2 = {1, 2, 3, 54, 15, 6, 5, 7, 5, 9,10,45};
        int[] list3 = {1, 2, 3, 54, 15, 6, 5, 7, 5, 9};


        // bu da diziyi sıralıyor yorum hailne getirdim equals false veriyor yoksa
       // Arrays.sort(list);
        System.out.println(list);
        // diziyi yazdırır
        System.out.println((Arrays.toString(list)));

        // dizide ki elemanın kaçıncı indiste olduğunu gözsteriri
        System.out.println(Arrays.binarySearch(list, 9));

        // copyOf----> yazılan elemna kadar sıralar 4 yazdık 3.indexe kadar sıralar ama4.elemanakadar yazar
        // birde biz yukarıda diziyi sıraladığımız için  Arrays.sort(list); bu metadla
        // [1, 2, 3, 5, 5, 6, 7, 9, 15, 54] sıralanmış şek,lde 4.elemana kadar yazdırır
        // o da [1, 2, 3, 5]
        int[] copyList = Arrays.copyOf(list, 4);
        System.out.println(Arrays.toString(copyList));

        // 2 ile 5 arasındaki değerleri yazdırır 2 dahil 5 değil ama [3, 5, 5]
        int[] copyList2 = Arrays.copyOfRange(list, 2, 5);
        System.out.println(Arrays.toString(copyList2));

        // Arrays.equals iki dizinin eşitliğini kontrol eder
        System.out.println(Arrays.equals(list,list2));//false
        System.out.println(Arrays.equals(list,list3));//true

    }


}

