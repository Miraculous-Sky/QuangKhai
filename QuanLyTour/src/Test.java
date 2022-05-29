public class Test {
    public static void main(String[] args) {
        Tour tour1 = new DomesticTour("DLat", "Đà lạt", 3, 550000);
        Tour tour2 = new DomesticTour("NTrang", "Nha trang", 4, 900000);
        Tour tour3 = new DomesticTour("PQ", "Phú Quốc", 4, 1250000);
        Tour tour4 = new OverseasTour("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000, "Thailand", 500000);

        System.out.println(tour1.price());
        System.out.println(tour2.price());
        System.out.println(tour3.price());
        System.out.println(tour4.price());
    }
}
